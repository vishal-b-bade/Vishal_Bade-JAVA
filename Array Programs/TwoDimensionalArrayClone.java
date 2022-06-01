


public class TwoDimensionalArrayClone {
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
        
        System.out.println("");
        System.out.println("____________________________");
        System.out.println("");
        
        int arrOrg1[]={5,4,3,6,9,4,5,5};
        int arrClon1[]=arrOrg1.clone();
        
        for(int i=0; i<arrOrg1.length; i++){
            System.out.print(arrOrg1[i] + " ");
        

        }
        
        System.out.println(arrOrg1==arrClon1);
        System.out.println(arrOrg1==arrOrg1);
        System.out.println(arrClon1==arrClon1);
        System.out.println("");
        
        for(int i=0; i<arrClon1.length; i++){
            System.out.print(arrClon1[i] + " ");
            
        }
    }
}

