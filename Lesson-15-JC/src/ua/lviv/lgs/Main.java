package ua.lviv.lgs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class an = Animal.class;
		
		//get name
		String NameOfClass = an.getSimpleName();
		System.out.println("Name of Class = "+NameOfClass);
		
		//get modifier
		int modifier = an.getModifiers();
		String mod = Modifier.toString(modifier);
		System.out.println("Class modifier = "+mod);
		
		//get package
		Package pack = an.getPackage();
		System.out.println("Package of this Class is = "+pack);
		
		//get superclasses
		Class superclass = an.getSuperclass();
		System.out.println("Super class = "+superclass);
		
		//get interfsces
		Class[] interfaces = an.getInterfaces();
		for (int i = 0; i < interfaces.length; i++) {
			System.out.println("Interfaces = "+interfaces[i]);
		}
		
		//get constructor
		Constructor<Animal>[] cons = an.getConstructors();
		for (int i = 0; i < cons.length; i++) {
			System.out.println("Constructors = "+cons[i]);
		}
		Constructor<Animal> singleconst = an.getConstructor(String.class,int.class);
		Animal newInstance = singleconst.newInstance("Cat",5);
		System.out.println("Reflection add object = "+newInstance);
		
		//get fields
		Field [] fields = an.getFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println("Field = "+field);
		}
		fields = an.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println("Field = "+field);
		}
		Field typeField = an.getField("type");
		typeField.set(newInstance, "Dog");
		System.out.println("Reflection object value change = "+newInstance);
		Field privateField = fields[2];
		privateField.setAccessible(true);
		System.out.println("Private field value = "+privateField.get(newInstance));
		
		//get methods
		Method[] m = an.getMethods();
		for (int i = 0; i < m.length; i++) {
			System.out.println("Method = "+m[i]);
		}
		System.out.println("");
		m[7].invoke(newInstance, "meow");
		System.out.println("");
		m[8].invoke(newInstance,"woof",5);
	} 
}
