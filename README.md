## ANTLRを使用した構文解析器の生成
antlr4 -package parser -o antlr-generated -no-listener parser/*.g4

## コンパイル
mkdir bin
javac -classpath /path/to/antlr-4.7-complete.jar -d bin antlr-generated/parser/*Lexer.java antlr-generated/parser/*Parser.java

## 解析木をGUIで表示する
grun parser.TinyPiE expr -gui

## test用dockerの準備
docker build -t pilang .
