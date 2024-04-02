package BaiTapJava8.LocalDate;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class BaiTap1 {
    public static void main(String[] args) {
        ZoneId asiaTokyoZone = ZoneId.of("Asia/Tokyo");
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zone = ZonedDateTime.of(localDateTime, asiaTokyoZone);
        System.out.println(zone);


    }
}
