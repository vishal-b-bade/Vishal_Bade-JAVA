
import java.util.ArrayList;
        
public class WraperAutoBoxing {
    public static void main(String[] args) {
        char a='v';
        int b=15;
        String str="Vishal";
        
        Character ch=a;
        System.out.println(ch);
        
        Integer in=b;
        System.out.println(in);
        
        String st=str;
        System.out.println(st);
        
        
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(20);
        System.out.println(arrayList.get(0));
    }
}
