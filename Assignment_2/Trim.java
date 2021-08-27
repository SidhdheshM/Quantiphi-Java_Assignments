import java.util.*;

public class Trim {
    static void listTrim(List<String> strings) {
        for (ListIterator<String> lit = strings.listIterator(); lit.hasNext(); ) {
            lit.set(lit.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> t = Arrays.asList("Sid", "Mansi", "RakshaBanndhan");
        listTrim(t);
        for (String s : t) {
            System.out.format("\"%s\"%n", t);
        }
    }
}
