package me.baronvonbubble.chocolate;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ChocolateCake extends Block {
	
	protected ChocolateCake(Material material ){
		super(material);
		
		setBlockName("chocolateCake");
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName(Chocolate.MODID + ":" + "chocolateCake");
	}
}