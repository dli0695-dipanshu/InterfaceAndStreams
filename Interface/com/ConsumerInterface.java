package Interface.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//@FunctionalInterface
//interface consumer{
//
//    String display(String a);
//
//}
public class ConsumerInterface {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Abhf","Bhudt","jkh","hgfdd","kltur");

        Consumer<String> uppserCase = s->System.out.println(s.toUpperCase());
     //   list.forEach(uppserCase);
     list.stream().forEach(str->System.out.println(str.toUpperCase()));


    }
}
