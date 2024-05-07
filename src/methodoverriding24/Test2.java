package methodoverriding24;

public class Test2 {
    public static void main(String args[]){
        Sbi s=new Sbi();
        Icici i=new Icici();
        Axis a =new Axis();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}


