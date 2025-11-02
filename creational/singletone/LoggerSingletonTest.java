// javac LoggerSingletonTest.java
// java LoggerSingletonTest 

public class LoggerSingletonTest {
   public static void main(String[] args) {
       LoggerSingleton logger1 = LoggerSingleton.getInstance();
       LoggerSingleton logger2 = LoggerSingleton.getInstance();

       logger1.log(" Application started");
       logger2.log(" User logged in");


       System.out.println("Same instance? "+ (logger1 == logger2));


   }
}