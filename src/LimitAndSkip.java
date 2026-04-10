import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class LimitAndSkip {

    public static void main(String[] args) throws IOException {
        //skip and limit are not workid on the index based
        //it will skip the starting element
        //process the further element where it limited
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().skip(2).limit(7).forEach(System.out::print);

        System.out.println("==========================================");
        List<String> fileData=Files.readAllLines(Paths.get("data.txt"));
        fileData.forEach(System.out::println);


    }
}
