## ANTLRを使用した構文解析器の生成
antlr4 -package parser -o antlr-generated -no-listener parser/TinyPi*

## コンパイル
javac -classpath /usr/local/Cellar/antlr/4.7/antlr-4.7-complete.jar -d bin antlr-generated/parser/TinyPi*Lexer.java antlr-generated/parser/TinyPi*Parser.java

## 解析木をGUIで表示する
grun parser.TinyPiE expr -gui
