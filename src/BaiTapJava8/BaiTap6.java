package BaiTapJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BaiTap6 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,23,6,346,135,43);

        System.out.println(list.stream().anyMatch(numb -> numb % 2 == 0));

        List<String> list1 = Arrays.asList("s","w","sd");

        System.out.println(list1.stream().map(String::toUpperCase).collect(Collectors.toList()));



    }
}
