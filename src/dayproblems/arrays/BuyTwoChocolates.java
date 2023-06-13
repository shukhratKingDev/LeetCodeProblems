package dayproblems.arrays;

import java.util.Arrays;

public class BuyTwoChocolates {

    public static void main(String[] args) {
        int[] prices = {1, 2, 2};
        int money = 3;
        System.out.println(buyChoco(prices, money));
    }

    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        return (prices[0] + prices[1]) > money ? money : money - (prices[0] + prices[1]);
    }
}
