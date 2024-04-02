package BaiTapJava8;

import java.util.Arrays;
import java.util.List;

public class BaiTap8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(324,23,4,346,23,4623);
        System.out.println(list.stream().anyMatch(item -> item % 2 == 0));
    }
}
