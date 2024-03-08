package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Blockinit {
    public static final String MODID = "examplemod";
    public static final DeferredRegister<Block> blocks = DeferredRegister.create(ForgeRegistries.BLOCKS,MODID);
    public static final RegistryObject<Block> ullash_block_p = blocks.register("ullash_block",() -> new Block(BlockBehaviour.Properties.of(Material.S)));


}