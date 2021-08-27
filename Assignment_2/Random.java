import java.util.*;

public class Random {

    public static void main(String[] args) {
        
        List<String> argList = Arrays.asList(args);
        Collections.shuffle(argList); //To generate in random order we use shuffle method

        // Print out the elements using JDK 8 Streams
        argList.stream()

        //Using Lambda Expression 
        .forEach(e->System.out.format("%s ",e));

        // Print out the elements using for-each
        for (String arg: argList) {
            System.out.format("%s ", arg);
        }

        System.out.println();
    }
}
