import java.util.*;
import java.util.stream.Collectors;

public class NthHighestSalary {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap();
        map1.put("aish", 2000);
        map1.put("kiran", 500);
        map1.put("radhesham", 4000);
        map1.put("jyoti", 10000);
        map1.put("raghuram", 20000);
        map1.put("ashif", 15000);
        //sort
        //collect
        //get
        Map.Entry<String, Integer> stringIntegerEntry = getNthHighestSalary(map1);
        System.out.println("2nd HS:" + stringIntegerEntry);
        System.out.println("---------------------------------------");
        //second approtch
        Map.Entry<String, Integer> stringIntegerEntry2 = getNthHighestSalary2(4, map1);
        System.out.println("fourth highest salary :: " + stringIntegerEntry2);
        System.out.println("----------------------------------------");
        //what if entry get duplicated
        //group it first

        Map<String, Integer> map2 = new HashMap();
        map2.put("aish", 2000);
        map2.put("aish2", 20000);
        map2.put("kiran", 500);
        map2.put("radhesham", 4000);
        map2.put("radhesham2", 4000);
        map2.put("jyoti", 10000);
        map2.put("raghuram", 20000);
        map2.put("raghuram2", 20000);
        map2.put("ashif", 15000);

        //Map.Entry<String, Integer> nthHighSalaryWthDuplicate = getNthHighSalaryWthDuplicate(2, map2);
        // System.out.println(nthHighSalaryWthDuplicate);

        getNthHighSalaryWthDuplicate(2, map2);
        Map.Entry<Integer, List<String>> result = getNthHighSalaryWthDuplicate2(4, map2);
        System.out.println(result);
    }

    private static Map.Entry<Integer, List<String>> getNthHighSalaryWthDuplicate2(int i, Map<String, Integer> map2) {
        return   map2.entrySet().stream().collect(Collectors.
                groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                //second half
                .entrySet().stream().
                sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).
                collect(Collectors.toList()).get(i-1);

    }

    private static Map.Entry<String, Integer> getNthHighestSalary2(int num, Map<String, Integer> map1) {
        return map1.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(num - 1);
    }

    public static Map.Entry<String, Integer> getNthHighestSalary(Map<String, Integer> map1) {
        return map1.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(1);

    }

    //considering the key as name and value as the salary which will bbe duplicated
    //
    private static void getNthHighSalaryWthDuplicate(int num, Map<String, Integer> map2) {
        System.out.println(map2.entrySet()
                .stream()
                //group by the values
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList()))));

    }

}
