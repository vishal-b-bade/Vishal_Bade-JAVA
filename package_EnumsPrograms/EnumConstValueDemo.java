package package_EnumsPrograms;

public class EnumConstValueDemo {
    public enum Weekday{Monday(5), Tuesday(10), Wednesday(15), Thrusday(20);
        private int v;
        private Weekday(int v){
            this.v=v;
        }
    }
    public static void main(String[] args) {
        for(Weekday w: Weekday.values()){
            System.out.println(w + " " + w.v);
        }
    }
    
}
