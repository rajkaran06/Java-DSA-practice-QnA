import java.util.ArrayList;
public class first2DarrayList{
    public static void main(String [] args){
        ArrayList<Integer> a =new ArrayList<>();
        a.add(3);a.add(13);a.add(36);a.add(132);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);b.add(2);b.add(3);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);arr.add(b);
        
        System.out.println(arr);
    }
}