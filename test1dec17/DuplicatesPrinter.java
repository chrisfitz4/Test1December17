package com.example.test1.test;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesPrinter {


    //print out strings that are repeated in a list
    //if a value is listed more than twice, it will be listed more than one
    public void findDuplicates(List<String> strings){
        String repeats = "";
        int n = 0;
        while(n<strings.size()){
            String nthString = strings.get(n);
            int m = n+1;
            while(m<strings.size()){
                if(nthString.equals(strings.get(m))){
                    System.out.println(strings.get(m));
                    strings.remove(m);
                }
                m++;
            }
            n++;
        }
    }

    public static void main(String[] args){
        List<String> strings = new ArrayList<>();
        strings.add("example");
        strings.add("test");
        strings.add("example");
        strings.add("unicycle");
        strings.add("hello");
        strings.add("hello");
        strings.add("project");
        strings.add("example");
        strings.add("test");

        DuplicatesPrinter dupPrinter = new DuplicatesPrinter();
        dupPrinter.findDuplicates(strings);

    }

}
