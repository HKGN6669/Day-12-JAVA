import java.util.*;
class printingusingiterator{
    public static void main(String args[]){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("Student");
        a.add("Tayyiba");
        a.add("Student");
        //printing using iterator
        Iterator itr=a.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }
}        