package BaiTapJava8;

import java.util.*;
import java.util.stream.Collectors;

public class BaiTap4 {
    public static void main(String[] args) {

        List<String> str = Arrays.asList("a","b","e","z","y","x","k","l");

        System.out.println(str.stream().sorted().collect(Collectors.toList()));

        str.sort(Comparator.comparing(String::valueOf));
        System.out.println(str);

        List<String> str1 = Arrays.asList("a","b","e","z","y","x","k","l");

        Collections.sort(str1);
        str1.sort(Comparator.comparing(String::valueOf).reversed());
        System.out.println(str1);
    }
}
