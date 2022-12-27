package OPP_P2.Collection;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class hashSet {
    public static void main(String[] args) {
        HashSet<String> strHashSet = new HashSet<>();
        strHashSet.add("KN");
        strHashSet.add("KD");
        strHashSet.add("DK");
        strHashSet.add("TT");
        strHashSet.add("AH");
        strHashSet.add("KN");

        System.out.println(strHashSet);
        List<String> strList = new ArrayList<>(strHashSet);
        Collections.sort(strList);
        System.out.println(strList);



    }
}
