package Week_1;

public class FinancialForecasting {
    static double calculateFutureValue(double amount,double rate,int year){
        if(year==0){
            return amount;
        }
        return calculateFutureValue(amount*(1+rate),rate,year-1);
    }

    public static void main(String[] args) {
        double amount=10000;
        double growthRate=0.10;
        int years=3;
        double result=calculateFutureValue(amount,growthRate,years);

        System.out.println("Current Value: "+amount);
        System.out.println("Growth Rate: "+(growthRate*100)+"%");
        System.out.println("Years: "+years);
        System.out.println("Future Value: "+result);
    }
}