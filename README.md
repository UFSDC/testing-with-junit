#Testing with JUnit

This is part of a larger tutorial, available [here](http://ufsdc.github.io/articles/2015/04/06/software-testing/).

##Run the Tests

###Compile and Link

```bash

	javac -cp "jar/*" *.java
```

###Run

```bash

	java -cp "jar/*" org.junit.runner.JUnitCore trivials
	java -cp "jar/*" org.junit.runner.JUnitCore mmmTest
```
