package module06.PSingltone;

/**
 * Created by tetya on 07.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        //звернення до нашого синглтону HistoryList.getHistoryList()
        HistoryList.getInstance().addHistory("start of our history");
        HistoryList.getInstance().addHistory("new action");
        HistoryList.getInstance().addHistory("interesting");
        HistoryList.getInstance().addHistory("that's all");

        HistoryList.getInstance().showHistory();
    }
}
