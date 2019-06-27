# README

## Log4J Setup

### Configuration File

- /resources/log4j2.xml

### Log4J Libraries

Add the required libraries to the project class path in Eclipse.

With Log4J 2 you need:

- log4j-core-2.x.x
- log4j-api-2.x.x
- log4j-web-2.x.x (in some cases)

For this project I used:

- /opt/java/lib/log4j-api-2.11.1.jar
- /opt/java/lib/log4j-core-2.11.1.jar

## Java Usage

```java
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public static final Logger LOGGER = LogManager.getLogger(Log4jDemo.class.getName());

LOGGER.debug("Debug Message Logged !!!");
```
