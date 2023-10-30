import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//
//        // Dezavantaje: Marimea este fixa
//        // Nu stim exact cate elemente se pastreaza
//        // Trebuie sa ducem cont de pozitia pe care aduagam elemente
//        // Nu are metode utile
//
//        String[] names = new String[3];
//        names[0] = "Ion";
//        names[1] = "Vasile";
//        names[2] = "Andrei";
//
//        String[] names2 = new String[3];
//
//        int count = 0;
//        for (String name : names) {
//            if(name.contains("a")) {
//                names2[count] = name;
//            }
//
//            count++;
//        }
//
//        for (int i = 0; i < names2.length; i++) {
//            if (names2[i] != null) {
//                System.out.println(names2[i]);
//            }
//        }
//
//
//        String a = "Andrei";
//        a.contains("A");
//        a.length();
//        a.endsWith("ei");
//        a =  a.toUpperCase();


        // List

        List<Integer> list2 = new ArrayList<>();

        List<Person> people = new ArrayList<>();

        List<String> names2 = new ArrayList<>();
        names2.add("Andrei"); // 0
        names2.add("Vasile"); // 1
        names2.add("Ion");    // 2
        System.out.println(names2);

        names2.remove(1);

        names2.clear();

        names2.size(); // 0

        for(String name: names2) {
            System.out.println(name);
        }

        for (int i = 0; i < names2.size(); i++) {
            System.out.println(names2.get(i));
        }

       boolean contine = names2.contains("Vasile"); // true

        List<String> namesList = new ArrayList<>();
        namesList.addAll(names2);

        String[] names = new String[3];
        names[0] = "Ion";
        names[1] = "Vasile";
        names[2] = "Andrei";

        String[] namesArray = new String[3];

        int count = 0;
        for (String name : names) {
            namesArray[count] = name;
            count++;
        }

        for (String name : names) {
            if(name.equals("Vasile")) {
                System.out.println("True");
            }
        }



        //


//        String a = "Ion";
//        String b = "IoN";
//
//        System.out.println(a.toLowerCase());
//        System.out.println(b.toLowerCase());
//        System.out.println(a.toUpperCase().equals(b.toUpperCase()));


    }
}