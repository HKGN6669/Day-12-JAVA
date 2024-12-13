import java.util.*;
class iterator{
    public static void main(String args[]){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("Student");
        a.add("Tayyiba");
        a.add("Student");
        //Iterator
        for(String s:a)
        {
            System.out.print(s+" ");
        }
    }
}