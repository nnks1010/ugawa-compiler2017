MANIFEST=manifest.mf

all: interpreter.jar

interpreter.jar: src $(MANIFEST)
	jar cvfm $@ $(MANIFEST) -C bin .

clean:
	rm -r ./bin
	rm interpreter.jar
