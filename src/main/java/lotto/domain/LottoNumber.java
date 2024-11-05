package lotto.domain;

import java.util.Objects;

public class LottoNumber implements Comparable<LottoNumber>{
    public static final int MIN = 1;
    public static final int MAX = 45;
    private final int value;

    public LottoNumber(int value) {
        if (value < MIN || value > MAX) {
            throw new IllegalArgumentException();
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoNumber that = (LottoNumber) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public int compareTo(LottoNumber o) {
        if (this.value < o.getValue()) {
            return -1;
        }

        if (this.value > o.getValue()) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
