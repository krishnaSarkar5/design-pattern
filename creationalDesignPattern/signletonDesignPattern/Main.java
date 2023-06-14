package creationalDesignPattern.signletonDesignPattern;

public class Main {

    public static void main(String[] args) {
      WaterTank wt1 =  WaterTank.getInstance();
      WaterTank wt2 =  WaterTank.getInstance();
      System.out.println(wt1);
      System.out.println(wt2);
    }
    
}
