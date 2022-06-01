class Bicycle{
        int gear;
        int speed;
        
        public Bicycle(int gear , int speed){
            this.gear=gear;
            this.speed=speed;
        }
        
        public void applyBrake(int decrement){
            speed=speed-decrement;
            
        }
        
        public void speedUp(int increment){
            speed=speed+increment;
           
        }
        
        public String toString(){
            return("No. of Gears are " + gear + "," + " Speed of Bicycle is " + speed +",");
            
        }

}

class MountainBike extends Bicycle {
    int seatHeight;
    
    public MountainBike(int gear, int speed, int seatHeight){
        super(gear, speed);
        this.seatHeight=seatHeight;
        
    }
    
    public void setHeight(int newValue){
        seatHeight=newValue;
        
    }
    
    @Override public String toString(){
        return (super.toString()+ " Seat height is " + seatHeight + ".");
    }
    
}

public class Singleinheritance {
    public static void main (String[] args){
        Bicycle b=new Bicycle (3, 60);
        MountainBike mb=new MountainBike(5, 80, 10);
        System.out.println(b.toString());
        System.out.println(mb.toString());
        
    }
    
}
