package ua.lviv.lgs;

public class Main {
public static void main(String[] args) {
	Number[] array = {4,3,8,5,4,104,104,104,104,104,104,104, 8, 8, 4 ,0 , 2, 4};
	
	Collection c = new Collection(array);
	//Iterator i = c.getForward();
	//Iterator i1 = c.getBackward();
	Iterator anonymus = c.anonymus();
	Iterator e5 = c.each5();
	Iterator Comp = Collection.createstatic();
	//while(i.HasNext()) {
	//	System.out.println(i.Next());
	//}
	//while(anonymus.HasNext()) {
		//System.out.println(anonymus.Next());
	//}
	//while(e5.HasNext()) {
		//System.out.println(e5.Next());
	//}
	while(Comp.HasNext()) {
		System.out.println(Comp.Next());
	}
}
}
