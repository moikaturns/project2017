package com.tutorial.project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int count = (new Count(args[0])).getCount();
        System.out.println(String.format("word [%s] has %s different characters",args[0],count));
    }
}
