package BaiTapJava8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BaiTap2 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,23,32,325,234,2,342,34);

//        Predicate<Integer> number = numb -> numb % 2 == 0;

        list.stream().filter(number -> number % 2 ==0).forEach(System.out::println);


    }
}
