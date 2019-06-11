
BASE=.

TextArt.class Main.class Methods.class InputMethods.class: ${BASE}/Main.java ${BASE}/Methods.java ${BASE}/TextArt.java ${BASE}/InputMethods.java
	rm -f *.class && javac -d . ${BASE}/Main.java ${BASE}/TextArt.java ${BASE}/Methods.java ${BASE}/InputMethods.java

run: TextArt.class
	java Main

clean: FRC
	rm -f *.class

FRC:
