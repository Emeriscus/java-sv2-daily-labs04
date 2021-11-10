package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stock {
    private List<Double> stock = new ArrayList<>();

    public Stock(List<Double> stock) {
        this.stock = stock;
    }

    public double maxProfit() {
        double maxProfit = 0;
        for (int i = 0; i < stock.size(); i++) {
            for (int j = 1; j < stock.size(); j++) {
                if (maxProfit < stock.get(j) - stock.get(i)) {
                    maxProfit = stock.get(j) - stock.get(i);
                }
            }
        }
        return maxProfit;
    }
}
