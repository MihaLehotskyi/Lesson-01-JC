package ua.lviv.lgs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		getAnnotation(Person.class);
	}

	public static void getAnnotation(Class<?> chosenclass) throws Exception {
		Field[] fields = chosenclass.getDeclaredFields();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			if (field.getAnnotation(MyFirstAnnotation.class) instanceof MyFirstAnnotation) {
				String data = field.getName() + " <----> " + field.getAnnotation(MyFirstAnnotation.class).params();
				list.add(data);
			}
		}
		File file = new File("AnnotationData.txt");
		OutputStream os = new FileOutputStream(file);
		for (int i = 0; i < list.size(); i++) {
			os.write((list.get(i).toString()+"  ").getBytes());
		}
		os.close();
	}
}
