package test;

import model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MainTest {
    public static void main(String[] args) {




        List<Integer> list = generateInt(0, 30);
        // 0,1,2,3,4,5,6,7,8,9 .............
        System.out.println(list);
//
//        List<Integer> result = list.stream().filter(object -> object >20 ).collect(Collectors.toList());
//        // 5 -> (5)
//        //  (0), (1), (2)
//        List<String> resultString = list.stream().map(o -> "(" + o + ")").collect(Collectors.toList());
//
//        list.stream().forEach(o -> System.out.println(o));

        System.out.println("---------------------------------------------------------------------------------");

        List<String> list2 = list.stream().filter(obj -> obj > 10 && obj < 15).map(o -> "(" + o + ")").collect(Collectors.toList());

        System.out.println(list2);

//        System.out.println(resultString);
////        Function<Integer ,String>
//        System.out.println(result);
    }
    //   |otwarcie\ modyfikacje \ modyfikacje \ ...... \ | zakonczyc



    public static List<Integer> generateInt(int min, int max) {
        List<Integer> result = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            result.add(i);
        }
        return result;
    }
// filtrowac tylko parzyste liczby
    public static List<Integer>evensFilter(List<Integer> list){
        return null;
    }

// filtrowac tylko nie parzyste liczby
    public static List<Integer>odsFilter(List<Integer> list){
        return null;
    }

    // dorobic metode pomocniczą boolean isPrime(Integer obj);
    public static List<Integer>primeFilter(List<Integer> list){
        return null;
    }

    // zwraca liste losowych intów od min do max w ilości quantity
    public static List<Integer> generateRandom(int min, int max, int quantity){
        return null;
    }

    // filtruje liste list w zakresie od min do max
    public static List<Integer> cut(int min, int max, List<Integer> list){
        return null;
    }
}
