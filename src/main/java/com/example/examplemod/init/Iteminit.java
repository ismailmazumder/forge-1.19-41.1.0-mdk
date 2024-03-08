package com.example.examplemod.init;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
// file import
import com.example.examplemod.init.Blockinit;

public class Iteminit {
    public static final String MODID = "examplemod";
    public static final DeferredRegister<Item> items = DeferredRegister.create(ForgeRegistries.ITEMS,MODID);
    public static final RegistryObject<Item> my_useless = items.register("my_useless",() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> my_useless_2 = items.register("my_useless_2",() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
//    public static final RegistryObject<BlockItem> ullash_block = items.register("ullash_block",() -> Blockinit.ullash_block_p,new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<BlockItem> ullash_block = items.register("ullash_block",() -> new BlockItem(Blockinit.ullash_block_p.get(),new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}