package tak.dimmcraft.items.stack;

import java.lang.reflect.Field;

import net.minecraft.src.Item;

public class SignStack {

	public static void setMaxStack () {
		
		Class sign = net.minecraft.src.Item.class;
		
		Field f = sign.getDeclaredField("maxStackSize");
		
	}
}
