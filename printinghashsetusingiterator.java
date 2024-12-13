import java.util.*;
class printinghashsetusingiterator{
    public static void main(String args[]){
        HashSet<String> a=new HashSet<>();
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