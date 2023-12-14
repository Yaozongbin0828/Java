package Generics;

import java.util.*;

public class Example13_4 {
    public static void main(String[] args) {
        LinkedList mylist = new LinkedList();
        mylist.add("你");
        mylist.add("好");
        int number = mylist.size();
        for (int i = 0; i < number; i++) {
            String temp = (String)mylist.get(i);
        }
    }
}
