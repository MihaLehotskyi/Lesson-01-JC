package ua.lviv.lgs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Methods {
	public static void Serialization(File file,Serializable object) throws Exception{
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(object);
		oos.close();
	}
	public static Serializable DeSerialization(File file) throws Exception{
		InputStream is = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(is);
		Serializable object = (Serializable)ois.readObject();
		ois.close();
		is.close();
		
		return object;
	}	
	public static void main(String[] args) throws Exception {
		Employee emp = new Employee("Andrew",20,25);
		File file = new File("Employee.txt");
		Serialization(file,emp);
		System.out.println(DeSerialization(file));
		Collection<Employee> empColl = new ArrayList<>();
		empColl.add(emp);
		empColl.add(new Employee("Sara",30,25));
		empColl.add(new Employee("Alex",23,25));
		Serialization(file,empColl.toString());
		System.out.println(DeSerialization(file));
	}
}
