public class Investment {
    public static void main(String[] arguments){
        double investment = 14000;


        //first year of investment
        investment = investment * 1.40;
        System.out.println("Total investment after first year " + investment);

        //second year of investment
        investment = investment - 1500;
        System.out.println("Total investment after second year " + investment);

        //third year of investment
        investment = investment * 1.12;
        System.out.println("Total investment after third year " + investment);
    }
}
