package module06.PSingltone;

/**
 * Created by tetya on 07.07.2017.
 */
public class HistoryList {
    private static HistoryList instance = new HistoryList();
    private String list;
    private  HistoryList(){ }
    public static HistoryList getInstance (){
         return instance;
    }

    //!!!lazy initialization
    //private static HistoryList instance;
   // public static synchronized HistoryList getInstance (){
   //    if (instance == null) {instance = new HistoryList();
   //     return instance;
   // }

    public void addHistory(String str){
        list +=  str + "\n";
    }

    public void showHistory(){
        System.out.println(list);
    }

}
