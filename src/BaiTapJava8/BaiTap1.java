package BaiTapJava8;

import java.util.*;

public class BaiTap1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(100);
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(1000) + 1);
        }
        System.out.println(list);

        System.out.println(list.stream().max(Comparator.comparing(Integer::valueOf)).get());


    }
}
