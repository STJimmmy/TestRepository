package org.example;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        Multimap<String, String> multimap = ArrayListMultimap.create();
        multimap.put("1","1a");
        multimap.put("1","1b");
        multimap.put("1","1c");
        multimap.put("2","2a");
        multimap.replaceValues("2", Arrays.asList(new String[]{"a", "b"}));

        System.out.println(multimap.get("1"));
        System.out.println(multimap.get("2"));
    }
}
