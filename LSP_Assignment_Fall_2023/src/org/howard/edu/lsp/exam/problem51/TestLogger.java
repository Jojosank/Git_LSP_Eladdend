package org.howard.edu.lsp.exam.problem51;


//TestLogger.java
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class TestLogger {

 @Test
 public void testDisplayLog() {
     Logger logger = Logger.getInstance();
     logger.logMessage("Test log message");
     assertEquals("Log:\nTest log message\n", logger.displayLog());
 }

 @Test
 public void testLoggerInstances() {
     Logger logger1 = Logger.getInstance();
     Logger logger2 = Logger.getInstance();
     assertSame("Logger instances should be the same", logger1, logger2);
 }
}
