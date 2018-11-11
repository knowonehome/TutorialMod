package com.knowonehome.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import com.knowonehome.tutorialmod.items.ItemBase;
import com.knowonehome.tutorialmod.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//MATERIALS
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 250, 8.0F, 3.0F, 10);
	
	
	//ITEMS
	public static final Item RUBY = new ItemBase("ruby");
	
	//TOOLS
	
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	
	
}
