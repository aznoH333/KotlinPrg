import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class JabaLambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get input
        String[] temp = sc.nextLine().split(" ");
        Double[] inputs = new Double[temp.length];
        for (int i = 0; i < temp.length; i++) {
            inputs[i] = Double.parseDouble(temp[i]);
        }

        //yaba daba doo
        System.out.println(filter(inputs, i -> i%11 == 0));

    }


    public static ArrayList<Double> filter(Double[] input, Predicate<Double> f){
        ArrayList<Double> output = new ArrayList<>();
        for (double i: input) {
            if(f.test(i)) output.add(i);
        }
        return output;
    }
}

