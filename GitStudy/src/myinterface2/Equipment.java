package myinterface2;

import myobj.key.DumpTruck;
import myobj.key.Excavators;

public class Equipment {

	public static void main(String[] args) {
		test(new DumpTruck());
		test(new Excavators());
	}
	
	public static void test(HeavyEquipment heavyEquipment) {
		heavyEquipment.start();
		heavyEquipment.up(1);
		heavyEquipment.down(1);
		heavyEquipment.drive("go");
		heavyEquipment.reverse("back");
		
	}
}

