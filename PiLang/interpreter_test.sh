#!/bin/bash

for i in test/*.pi
do
    echo ===========${i}===========
    java -jar interpreter.jar < $i | diff - ${i%.pi}.ans
done
