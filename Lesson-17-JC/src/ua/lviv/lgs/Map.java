package ua.lviv.lgs;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Map<K,V> {
	
	List<MyEntry<K,V>> myEntries;
	
	public Map(List<MyEntry<K, V>> myEntries) {
		super();
		this.myEntries = myEntries;
	}
	public void add(K key,V val) {
		MyEntry<K,V> entry= new MyEntry<>();
		entry.setKey(key);
		entry.setVal(val);
		myEntries.add(entry);
	}
	public void deleteByKey(K key) {
		for (int i = 0; i < myEntries.size(); i++) {
			if(key == myEntries.get(i).getKey()) {
				int index = myEntries.indexOf(myEntries.get(i));
				myEntries.remove(index);
			}
		}
	}
	public void deleteByVal(V val) {
		for (int i = 0; i < myEntries.size(); i++) {
			if(val.equals(myEntries.get(i).getVal())) {
				int index = myEntries.indexOf(myEntries.get(i));
				myEntries.remove(index);
			} 
		}
	}
	public void showKeys() {
		HashSet<K> keys = new HashSet<K>();
		for (int i = 0; i < myEntries.size(); i++) {
			keys.add(myEntries.get(i).getKey());
		}
		System.out.println(keys);
	}
	public void showValues() {
		List<V> values = new ArrayList<V>();
		for (int i = 0; i < myEntries.size(); i++) {
			values.add(myEntries.get(i).getVal());
		}
		System.out.println(values);
	}
	public void show() {
		System.out.println(myEntries.toString());
	}
	
}
