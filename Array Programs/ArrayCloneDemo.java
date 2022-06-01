// Array Clone Program



public class ArrayCloneDemo {
    public static void main(String[] args) {
        int arrOrg[]={2,3,4,5,6,8,7,9};
        int arrClon[]=arrOrg.clone();
        
        for(int i=0; i<arrOrg.length; i++){
            System.out.print(arrOrg[i] + " ");
            
        }
        
        System.out.println(arrOrg==arrClon);
        System.out.println(arrOrg==arrOrg);
        System.out.println(arrClon==arrClon);
        System.out.println("");
        
        for(int i=0; i<arrClon.length; i++){
            System.out.print(arrClon[i] + " ");
            
        }
        
    }
}
