package com.example.examplemod.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Iteminit {
    public static final String MODID = "examplemod";
    public static final DeferredRegister<Item> items = DeferredRegister.create(ForgeRegistries.ITEMS,MODID);
    public static final RegistryObject<Item> my_useless = items.register("item_regggggggggggggg",() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> my_useless_2 = items.register("items",() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

}
