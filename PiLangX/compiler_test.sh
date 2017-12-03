#!/bin/bash

for i in test/*.pi
do
    name=${i##*/}
    echo "java -jar compiler.jar < $i"
    java -jar compiler.jar < $i > results/${name%.pi}.s
done

echo docker run -it -v ~/workspace/raspberry/pilang/PiLangX/:/pilang/ pilang /bin/bash -c
docker run -it -v ~/workspace/raspberry/pilang/PiLangX/:/pilang/ pilang /bin/bash -c '
echo cd pilang
cd pilang
printf execute
for i in results/*.s
do
    printf .
    as ${i} -o ${i%.s}.o
    ld ${i%.s}.o -o a.out
    ./a.out > ${i%.s}.ans
    echo $? >> ${i%.s}.ans
done
printf "done\n"

echo rm -f results/*.o a.out
rm -f results/*.o a.out
echo docker exit
exit
'

for i in test/*.ans
do
    echo diff ${i} results/${i##*/}
    diff ${i} results/${i##*/}
done
