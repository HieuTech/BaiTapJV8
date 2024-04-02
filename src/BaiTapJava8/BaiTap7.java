package BaiTapJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BaiTap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so x");
        byte x = Byte.parseByte(scanner.nextLine());
        System.out.println("Nhap so y");
        byte y = Byte.parseByte(scanner.nextLine());

        if(x < y){
            IntStream.range(x,y + 1).forEach(System.out::println);

        }else{
            IntStream.range(y, x + 1).forEach(System.out::println);
        }
    }
}
