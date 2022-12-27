package OPP_P2.Collection;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class sortedSet {
    public static void main(String[] args) {
        SortedSet<String> strSortedSet = new TreeSet<>() {};
        strSortedSet.add("KN");
        strSortedSet.add("KD");
        strSortedSet.add("DK");
        strSortedSet.add("TT");
        strSortedSet.add("AH");
        strSortedSet.add("KN");

        System.out.println(strSortedSet);
    }
}
