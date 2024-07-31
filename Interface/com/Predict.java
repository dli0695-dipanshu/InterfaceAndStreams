package Interface.com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Predict {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("asdf","dsfgfd","msdfg","shfgefuev");

        Predicate<String> pre= str->(str.length()<=5);
        Predicate<String> pre1= str->(str.contains("fg"));
      List<String> ad= list.stream().filter(pre .and(pre1)).collect(Collectors.toList());


        System.out.println(ad);
    }
}
