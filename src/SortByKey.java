import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SortByKey {

    public static void main(String[] args) {

        HashMap<String,Integer> hm=new HashMap();
        hm.put("poonam",12);
        hm.put("aish",9);
        hm.put("sweety",8);
        hm.put("varsha",7);

        hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                forEach((x)-> System.out.println(x.getKey()+" "+x.getValue()));
        System.out.println("===========================================");
        hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).
                forEach((x)-> System.out.println(x.getKey()+" "+x.getValue()));


    }
}
