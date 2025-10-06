
public class buynsellStocks {

    public static int buysellStocks(int price[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        // sellPrice = price[i];
        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) {
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = price[i]; // buyPrice = sellPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int price[] = {7, 2, 1, 0};
        System.out.println("Max Profit: " + buysellStocks(price));
    }
}
