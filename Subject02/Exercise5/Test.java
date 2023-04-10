package Exercise5;
import java.util.*;

@FunctionalInterface
interface Transform<T, R> {
    R apply(T arg);
}
class StrToInt implements Transform<String, Integer> {


    @Override
    public Integer apply(String value) {

        return value.length();
    }
}

public class Test {

    private static <T, R>
    void transform(T[] in, R[] out, Transform<T, R> trans) {

        for (int i = 0; i < in.length; i++) {
            out[i] = trans.apply(in[i]);
        }
    }

        public static void main (String[]args){

            String[] sin = {"Alice", "Sue", "Janet", "Bea"};
            System.out.println(Arrays.toString(sin) + '\n');

            Integer[] iout = new Integer[sin.length];
            transform(sin, iout,new StrToInt());
            System.out.println(Arrays.toString(iout));

            Character[] cout = new Character[sin.length];
            transform(sin, cout, s -> s.charAt(0));
            System.out.println(Arrays.toString(cout));

            String[] sout = new String[sin.length];
            transform(sin, sout, s -> s.toUpperCase());
            System.out.println(Arrays.toString(sout));

        }

    }
