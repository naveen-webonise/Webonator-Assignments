package com.webonise.ListIterator;

/**
 * Hello world!
 *
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class ListIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			ArrayHash iteratorObject = new ArrayHash();
			System.out.println("Array list:");
			iteratorObject.arrayListIterator();
			System.out.println("HashMap:");
			iteratorObject.hashMapIterator();


	}

}
class ArrayHash{
	void arrayListIterator(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("cat");
		Iterator<String> pointer = list.iterator();
		while(pointer.hasNext()){
			System.out.println(pointer.next());
		}
	}
	void hashMapIterator(){
		HashMap<Integer,String> hashList = new HashMap<Integer,String>();
		hashList.put(1,"apple");
		hashList.put(2,"banana");
		hashList.put(3, "cat");
		Set<Integer> hashSet =  hashList.keySet();
		for(Integer list: hashSet){
            System.out.println(hashList.get(list));
        }
		
	}
}