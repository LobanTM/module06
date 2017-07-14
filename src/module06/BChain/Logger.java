package module06.BChain;

/**
 * Created by tetya on 11.07.2017.
 *
 * Отримувач та опрацьовувач повідомлення
 */
public interface Logger {
    void writeMessage(String message, int level);
}
