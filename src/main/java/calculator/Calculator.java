package calculator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Calculator {

    private final Queue<Operator> operators;
    private final Deque<Integer> operand;

    public Calculator(String text) {
        this.operators = new ArrayDeque<>();
        this.operand = new ArrayDeque<>();
        parse(text);
    }

    public int calculate() {
        return calculate(this.operand.poll());
    }


    private void parse(String text) {

        if (isEmpty(text)) {
            throw new IllegalArgumentException();
        }

        String[] candidates = text.split(" ");

        List<Integer> operands = IntStream.range(0, candidates.length)
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> Integer.parseInt(candidates[i]))
                .collect(Collectors.toList());

        List<Operator> operators = IntStream.range(0, candidates.length)
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> Operators.getOperator(candidates[i]))
                .collect(Collectors.toList());

        this.operand.addAll(operands);
        this.operators.addAll(operators);
    }

    private static boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }

    private int calculate(Integer left) {

        if (operators.isEmpty()) {
            return left;
        }

        Operator operator = operators.poll();
        Integer right = operand.poll();
        return calculate(operator.operate(left, right));
    }
}
