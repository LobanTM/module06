package module06.BChain;

/**
 * Created by tetya on 11.07.2017.
 */
public class FileLogger implements Logger{
    int priority; //приоритет опрацювання повідомлення

    public FileLogger(int priority) {
        this.priority = priority;
    }
    Logger next;

    public void setNext(Logger next) {
        this.next = next;
    }

    @Override
    public void writeMessage(String message, int level) {
        if (level<= priority){
            System.out.println("File:" + message);
        }
        if (next != null){ next.writeMessage(message, level);}
    }
}
