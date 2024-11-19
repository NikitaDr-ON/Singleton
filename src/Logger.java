import java.time.LocalDate;

public class Logger {

    private static Logger logger;

    private Logger(){}

    public static Logger getLogger(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }

    public void classLog(Object object, String info){
        LocalDate localDate = LocalDate.now();
        System.out.println("Log info: " + localDate + " - " + object.getClass() + " - " + info);
    }

}
