package module06.BChain;

/**
 * Created by tetya on 11.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        String sER = "Error in System";
        String sDeb = "in processing...";
        String sInf = "New program";

        SMSLogger loggerSMS = new SMSLogger(LevelPriority.INFO);
        loggerSMS.writeMessage(sInf, 3);
        loggerSMS.writeMessage(sDeb, 2);
        loggerSMS.writeMessage(sER, 1);

        FileLogger loggerFile = new FileLogger(LevelPriority.DEBUG);
        loggerFile.writeMessage(sInf, 3);
        loggerFile.writeMessage(sDeb, 2);
        loggerFile.writeMessage(sER, 1);

        EmailLogger loggerEmail = new EmailLogger(LevelPriority.ERROR);
        loggerEmail.writeMessage(sInf, 3);
        loggerEmail.writeMessage(sDeb, 2);
        loggerEmail.writeMessage(sER, 1);
    }
}
