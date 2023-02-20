import java.util.*;
class CollectionsFramework{
    public static void main(String[] args) {
      ArrayList<Integer>list=new ArrayList<Integer>();
      ArrayList <String>stringList=new ArrayList<String>();
       list.add(89);
       list.add(90);
       list.add(100);
       //get elemets
       int element=list.get(0);
       System.out.println(element);
       //add element in between
       list.add(1, 1);
       System.out.println(list);
       //set element
       list.set(0,5);
       System.out.println(list);

       //remove
       list.remove(3);
       System.out.println(list);

       //size
       int size=list.size();
       System.out.println("The size of arrayList"+size);

       //loopes
       for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
       }
       System.out.println();
       //sorting
       Collections.sort(list);
       System.out.println("Sorted List"+list);
    }
}