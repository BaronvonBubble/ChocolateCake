package me.baronvonbubble.chocolate;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Chocolate.MODID, version = Chocolate.VERSION)

public class Chocolate {
	
    public static final String MODID = "chocolate";
    public static final String VERSION = "0.01a";
    
    public static Block chocolateCake;
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	
    	chocolateCake = new ChocolateCake(Material.cake);
    	GameRegistry.registerBlock(chocolateCake, "chocolateCake");
    	}
    
}
