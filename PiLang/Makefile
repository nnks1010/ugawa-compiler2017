INTERPRETER_MF=interpreter.mf
COMPILER_MF=compiler.mf

all: interpreter.jar compiler.jar

interpreter.jar: src $(INTERPRETER_MF)
	jar cvfm $@ $(INTERPRETER_MF) -C bin .

compiler.jar: src $(COMPILER_MF)
	jar cvfm $@ $(COMPILER_MF) -C bin .

clean:
	rm -r ./bin
	rm interpreter.jar
