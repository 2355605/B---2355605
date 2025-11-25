public class Main {
    public static void main(String[] args) {
        final int purchaseCost = 1_015_000;   // 매입원가
        final double profitRate = 0.30;       // 이익율
        final double taxRate = 0.10;          // 세율

        double sellingPrice;  // 정가
        double salesTax;      // 매출세액
        double purchaseTax;   // 매입세액
        double taxToPay;      // 납부세액


        sellingPrice = purchaseCost * (1 + profitRate);
        salesTax = sellingPrice * taxRate;
        purchaseTax = purchaseCost * taxRate;
        taxToPay = salesTax - purchaseTax;


        System.out.printf("매입원가 : %,d원\n", purchaseCost);
        System.out.printf("정가(판매가) : %,.0f원\n", sellingPrice);
        System.out.printf("매출세액 : %,.0f원\n", salesTax);
        System.out.printf("매입세액 : %,.0f원\n", purchaseTax);
        System.out.printf("납부세액 : %,.0f원\n", taxToPay);
    }
}
