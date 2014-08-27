package mw.furniture;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="FerrumwoodFurniture", name="FerrumwoodFurniture", version="1.0.0")
public class ModFurniture {
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
    	Configuration Config = new Configuration(new File("config/FerrumwoodFurnitureMod.cfg"));
    	Config.load();
	}
	
	public static String getModId() {
		return "Furniture";
	}
}
