package BaiTapJava8;

import java.util.Arrays;
import java.util.List;

public class BaiTap3 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,31,23,123,12,31,23,1);


        System.out.println(list.stream().reduce(1,Integer::sum));
    }
}
