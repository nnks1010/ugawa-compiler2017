#!/bin/bash

for i in test/*.pi
do
    name=${i##*/}
    echo "java -jar compiler.jar < $i"
    java -jar compiler.jar < $i > results/${name%.pi}.s
done

docker run -it -v ~/workspace/raspberry/pilang/PiLang/:/pilang/ pilang /bin/bash -c '
cd pilang
printf execute...
for i in results/*.s
do
    as ${i} -o ${i%.s}.o
    ld ${i%.s}.o -o a.out
    ./a.out
    echo $? > ${i%.s}.ans
done
printf done\n

rm -f results/*.o a.out
exit
'

for i in test/*.ans
do
    echo diff ${i} results/${i##*/}
    diff ${i} results/${i##*/}
done
