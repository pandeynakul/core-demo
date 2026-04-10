import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestPatient {

    public static void main(String[] args) {

        Patient p1 = new Patient("p1", 20, "corona", 18000);
        Patient p2 = new Patient("p2", 26, "corona", 8000);
        Patient p3 = new Patient("p3", 29, "fever", 8000);
        Patient p4 = new Patient("p4", 23, "corona", 12000);
        //select only corona patient
        //create list for patient and add the object
        List<Patient> liPatient = new ArrayList();
        liPatient.add(p1);
        liPatient.add(p2);
        liPatient.add(p3);
        liPatient.add(p4);

        //
        liPatient.stream().filter(p -> p.getDisease().equals("corona")).forEach(System.out::println);
        System.out.println("------------------------------");
        liPatient.stream().filter(p -> p.getDisease().equals("corona") && p.getAge() <= 23).forEach(System.out::println);
        System.out.println("------------------------------");
        //avarage bill paid by corona patient
        Double avgKharch = liPatient.stream().filter(p -> p.getDisease().equals("corona"))
                .collect(Collectors.averagingDouble(Patient::getAmount));
        System.out.println(avgKharch);




    }
}
