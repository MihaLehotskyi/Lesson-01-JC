package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		Map<Integer,String> map = new Map(new ArrayList());
		map.add(1, "Andrew");
		map.add(2, "Carl");
		map.add(3, "Peter");
		map.showKeys();
		map.showValues();
		map.show();
		map.deleteByKey(1);
		map.show();
		map.deleteByVal("Carl");
		map.show();
		map.showKeys();
		map.showValues();
	}

}
