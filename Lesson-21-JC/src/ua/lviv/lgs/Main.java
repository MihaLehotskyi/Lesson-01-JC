package ua.lviv.lgs;

public class Main {
	public static void main(String[] args) {
		voice frog = () -> "I am frog";
		voice cat = () -> "I am cat";
		voice dog = () -> "I am dog";
		
		System.out.println(makeVoice(frog));
		System.out.println(makeVoice(cat));
		System.out.println(makeVoice(dog));
	}
	
	
	private static String makeVoice(voice v) {
		return v.voice();
	}
}

 interface voice {
	 String voice();
}