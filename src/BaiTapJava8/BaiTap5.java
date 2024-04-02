package BaiTapJava8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BaiTap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so bat ki");
        byte choice = scanner.nextByte();

        List<Integer> list = Arrays.asList(4,12,123,13,1,23,53,6,34);

        list.stream().filter(numb -> numb >= choice).forEach(System.out::println);



    }
}
