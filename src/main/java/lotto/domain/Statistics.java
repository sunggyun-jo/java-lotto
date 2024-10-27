package lotto.domain;

import java.util.HashMap;
import java.util.Map;

public class Statistics {
    private final Map<WinningRule, Integer> statistics;

    public Statistics() {
        this.statistics = new HashMap<>(Map.of(
                WinningRule.THREE, 0,
                WinningRule.FOUR, 0,
                WinningRule.FIVE, 0,
                WinningRule.SIX, 0
        ));
    }

    public int get(int key) {
        return statistics.get(WinningRule.findByValue(key));
    }

    public int get(WinningRule key) {
        return statistics.get(key);
    }

    public void put(int key, int value) {
        this.statistics.put(WinningRule.findByValue(key), value);
    }
}
