MarkdownParseTest.class: MarkdownParseTest.java
	javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
	java MarkdownParse.java

.PHONY: test
test: MarkdownParseTest.class MarkdownParseTest
	java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest


	