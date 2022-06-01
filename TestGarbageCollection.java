


public class TestGarbageCollection {
        public void finalize(){
        System.out.println("Object is Garbage Collector.. ");
    }
    
    public static void main(String[] args) {
        TestGarbageCollection s1=new TestGarbageCollection();
        TestGarbageCollection s2=new TestGarbageCollection();
        TestGarbageCollection s3=new TestGarbageCollection();
        s1=null;
        s2=null;
        s3=s2;
        System.gc();
    }
}