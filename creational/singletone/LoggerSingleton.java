import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;


public class LoggerSingleton {
    private static volatile LoggerSingleton instance;
    private FileWriter writer;

    private LoggerSingleton(){
        try {
            writer = new FileWriter("log.txt", true);
        }catch (IOException e){
            throw new RuntimeException("Unable to open log file.", e);
        }
    }

    public static LoggerSingleton getInstance() {
        if(instance == null){
            synchronized (LoggerSingleton.class){
                if(instance == null){
                    instance = new LoggerSingleton();
                }
            }
        }
        return instance;
    }

    public void log(String message){
        String logEntry = "[" + LocalDateTime.now() + "]" + message + "\n";
        System.out.print(logEntry);
        try {
            writer.write(logEntry);
            writer.flush();
        }catch (IOException e){
            System.err.println("Unable to write to log file"+ e.getMessage());
        }
    }
}