import java.util.Arrays;

public class IntegerSetImpl implements IntegerSet {

    int[] numbers;

    @Override
    public void add(int x) {
       if (!contains(x)){
           numbers.
       }
    }

    @Override
    public void remove(int x) {

    }

    @Override
    public boolean contains(int x) {
        boolean contains=false;
        for (int number : numbers) {
            if (number == x) {
                contains = true;
            }

        }
        return contains;
    }

    @Override
    public int size() {
        return numbers.length;
    }
}
