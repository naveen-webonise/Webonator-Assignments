package com.webonise.RemoveDuplicates;

/**
 * Hello world!
 *
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		String string = "I came I saw I conquered I went";

        String[] word = string.split(" ");
        for (String list : word) {
            arrayList.add(list);
        }      
        for (int i=0; i< arrayList.size(); i++)  
        {  
          System.out.println(arrayList.get(i));
        } 
        
        Set<String> list=new TreeSet<String>();
        list.addAll(arrayList);
        
        Iterator listIterator=list.iterator();
        while (listIterator.hasNext())  
        {  
          System.out.println(listIterator.next());
        } 

	}

}