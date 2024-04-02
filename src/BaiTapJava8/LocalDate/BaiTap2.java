package BaiTapJava8.LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        //bai tap 2
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);


        //bai tap 3

        Scanner scanner = new Scanner(System.in);
      try{
          System.out.println("Nhap vao ngay thu 1");
          String firstDay= scanner.nextLine();

          System.out.println("Nhap vao ngay thu 2");
          String lastDay= scanner.nextLine();

          DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd");
          LocalDate day1 = LocalDate.parse(firstDay, DTF);
          LocalDate day2 = LocalDate.parse(lastDay, DTF);

          System.out.println(Period.between(day1,day2));
      }catch (DateTimeParseException e){
          System.out.println("Ko dung dinh dang ");
      }


    }

}
