import java.util.*;
public class removekeyvalueinhashmap{
    public static void main(String args[]){
        HashMap<String,String> a=new HashMap<>();
        a.put("SNO","01");
        a.put("SName","Yasmin");
        a.put("City","Chennai");
        System.out.println(a);
        //removing key value in HashMap
        a.remove("SName");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}        
