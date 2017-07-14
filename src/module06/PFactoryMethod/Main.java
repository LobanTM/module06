package module06.PFactoryMethod;

/**
 * Created by tetya on 09.07.2017.
 */
public class Main {
    public static void main(String[] args){
        log(">Start test for Factory pattern");
        //тут будут вызываться тесты

        Factory f =new Factory();
        Client client = f.getClient("win");
        if (client != null)
            {log(client.getTargetOS());}
        else {log("no client");}

        client = f.getClient("linux");
        if (client != null)
        {log(client.getTargetOS());}
        else {log("no client");}

    }

    public static void log(String msg){ //А это для вывода сообщений в консоль, для удобства
        if(msg==null) msg = "null";
        System.out.println(msg);
    }
}
