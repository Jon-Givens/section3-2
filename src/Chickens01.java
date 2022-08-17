public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        int chickenCount = 8;
        int eggsPerChicken = 4;
        int totalEggs;

        //Monday
        totalEggs = chickenCount * eggsPerChicken;
        //Tuesday
        chickenCount += 1;
        totalEggs += chickenCount * eggsPerChicken;
        //Wednesday
        chickenCount /= 2;
        totalEggs += chickenCount * eggsPerChicken;
        
        System.out.println(totalEggs);
    }   
}
