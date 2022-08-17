public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        double dailyAverage;
        double monthlyAverage;
        double monthlyProfit = 0;

        dailyAverage = 100 + 121 + 117;
        dailyAverage /= 3.0;

        monthlyAverage = dailyAverage * 30.0;



        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
