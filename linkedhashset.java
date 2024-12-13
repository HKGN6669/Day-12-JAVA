import java.util.*;
class linkedhashset{
    public static void main(String args[]){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("Student");
        a.add("Tayyiba");
        a.add("Student");
        System.out.println(a);
        a.remove("Tayyiba");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}