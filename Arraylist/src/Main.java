import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        System.out.println("size of arraylist: "+number.size());
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        System.out.println("arraylist: "+number);
        System.out.println("size of arraylist: "+number.size());
        int position=number.indexOf(40);
        System.out.println("the position of 40 is: "+position);
        number.set(2,50);
        System.out.println("after replace the value of index 2: "+number);
      int x=  number.get(1);
        System.out.println("finding the value of index 1: "+x);

      boolean check=number.isEmpty();
        System.out.println("ArrayList is empty: "+check);
        boolean contain=number.contains(30);
        System.out.println("30 is in the list: "+contain);
        number.remove(2);
        System.out.println("after removing 30 from arraylist: "+number);
        boolean contain2=number.contains(30);
        System.out.println("30 is in the list: "+contain2);
        number.clear();
        System.out.println(" after clear arraylist: "+number);
        System.out.println(number.size());
        boolean check2=number.isEmpty();
        System.out.println("ArrayList is empty: "+check2);
        
        
        
        
        
        
        ArrayList<String> person=new ArrayList<>();
        ArrayList<String>person2=new ArrayList<>();
        ArrayList<String>person3=new ArrayList<>();
        person.add(0,"Shamim");
        person.add(1,"tamim");
        System.out.println("Arraylist of person: "+person);

        person2.add(0,"Shakib");
        person2.add(1,"Naim");
        System.out.println("Arraylist of person2: "+person2);

        person.addAll(person2);
        System.out.println("Arraylist of person2 after addall method: "+person2);
//         addall er kaj holo replace er moto...set use kore arraylist er jei kono ekta index er value replace kora jay r addall use kore full arraylist er value change kora jay
        boolean check3=person.equals(person2);
        System.out.println(" equality check: "+check3);





        ArrayList<Integer>short1=new ArrayList<>();
        ArrayList<Integer>short2=new ArrayList<>();
        ArrayList<Integer>short3=new ArrayList<>();
        short1.add(10);
        short1.add(50);
        short1.add(14);
        short1.add(19);
        short1.add(31);
        short1.add(100);
        short1.add(-3);
        short1.add(-10);
        System.out.println("arraylist before sorting: "+short1);
        Collections.sort(short1);
        System.out.println("after sorting in ascending: "+short1);
        Collections.sort(short1,Collections.reverseOrder());
        System.out.println("after sorting in descending: "+short1);




    }
}