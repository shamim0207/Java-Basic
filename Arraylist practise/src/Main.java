import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> name=new ArrayList<>();
        ArrayList<Double> height=new ArrayList<>();

        name.add("shamim");
        name.add("tamim");
        name.add("shakib");
        name.add("rakib");
        name.add("tanim");
        height.add(5.6);
        height.add(5.7);
        height.add(5.8);
        height.add(5.9);
        height.add(5.5);
        sort(height);
        System.out.println(height);
        Collections.sort(height,Collections.reverseOrder());

        System.out.println("after descending oder: "+height);

}
}
