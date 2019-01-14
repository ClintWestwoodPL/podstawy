package _zadania;

import java.util.Comparator;

public class Komparator implements Comparator<Lista3>
{

    @Override
    public int compare(Lista3 p1, Lista3 p2) {
        if(p2 == null) return -1;
        if(p1.getCena() > p2.getCena()) return 1;
        else if(p1.getCena() < p2.getCena()) return -1;
        else return 0;
    }
}
