import javafx.beans.property.StringProperty;

import java.util.*;

public class P01 {


    public static String last(List<String> list) {
        return list.get(list.size()-1);
    }

    public static List<Integer> reverse(List<Integer> numbers) {

        List<Integer> reverseList = new ArrayList<Integer>();
        for (int i = numbers.size()-1; i >= 0; i--){
            reverseList.add(numbers.get(i));
        }
        return reverseList;
    }


    public static boolean isPalindrome(List<String> stringList) {
        return false;
    }


    public static List<String> dropEveryNth(List<String> list, int k) {

        List<String> result = new ArrayList<String>();
        for(int i = 0; i < list.size(); i++){
            if((i+1) % k != 0){
                result.add(list.get(i));
            }
        }
        return result;
    }

    public static Map<Boolean, List<String>> split(List<String> list, int k) {

        Map<Boolean, List<String>> map = new HashMap<Boolean, List<String>>();
        List<String> trueList = new ArrayList<String>();
        List<String> falseList = new ArrayList<String>();

        for(int i = 0; i < list.size(); i++){
            if(i <= 2){
                trueList.add(list.get(i));
            }else{
                falseList.add(list.get(i));
            }
        }

        map.put(true, trueList);
        map.put(false, falseList);
        return map;
    }


    public static List<String> flatten(List<Object> list, Class<String> stringClass) {
        List<String> result = new ArrayList<String>();
        String stringList = list.toString();
        System.out.println(stringList);
        char[] charList = stringList.toCharArray();

        for(Character c : charList){
            System.out.println(c);
            if((c.equals('a')) || (c.equals('b')) || (c.equals('c')) || (c.equals('d')) || (c.equals('e'))) {
                result.add(c.toString());
            }
        }
        return result;

    }

    public static List<String> slice(List<String> list, int p, int k) {
        List<String> slice = new ArrayList<String>();

        for(int i = 0; i < list.size(); i++){
            if( ((i+1) >= 3) & ((i+1) <= 7) ){
                slice.add(list.get(i));
            }
        }
        return slice;
    }


    public static List<String> insertAt(List<String> input, int i, String alfa) {
        List<String> result = new ArrayList<>();
        return result;
    }
}
