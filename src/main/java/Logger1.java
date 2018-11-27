import java.io.IOException;
import java.util.logging.*;

//测试logger功能
public class Logger1 {

    public static void main(String[] args) throws SecurityException, IOException{
        Logger logger=Logger.getLogger("Chapter");
        FileHandler fileHandler=new FileHandler("/Users/tianyu/IoTDB_src/javaLearn/src/test.txt");
        LogRecord lr=new LogRecord(Level.INFO,"this is a log");
        SimpleFormatter sf=new SimpleFormatter();
        fileHandler.setFormatter(sf);
        logger.addHandler(fileHandler);
        logger.log(lr);
    }
}
