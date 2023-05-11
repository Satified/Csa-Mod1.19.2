package net.Satified.csa_mod.block;

import net.Satified.csa_mod.CSA_Mod;
import net.Satified.csa_mod.item.ModCreativeModeTab;
import net.Satified.csa_mod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.sql.Ref;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
                DeferredRegister.create(ForgeRegistries.BLOCKS, CSA_Mod.MOD_ID);

    public static final  RegistryObject<Block> DIAMOND_CHEST = registerBlock("diamond_chest",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.Csa_Tab);
    public static final  RegistryObject<Block> COPPER_CHEST = registerBlock("copper_chest",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.Csa_Tab);
    public static final  RegistryObject<Block> EMERALD_CHEST = registerBlock("emerald_chest",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.Csa_Tab);
    public static final  RegistryObject<Block> GALAXY_CHEST = registerBlock("galaxy_chest",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.Csa_Tab);
    public static final  RegistryObject<Block> SMART_CHEST = registerBlock("smart_chest",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.Csa_Tab);
    public static final  RegistryObject<Block> GOLD_CHEST = registerBlock("gold_chest",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.Csa_Tab);
    public static final  RegistryObject<Block> IRON_CHEST = registerBlock("iron_chest",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.Csa_Tab);
    public static final  RegistryObject<Block> OBSIDIANCHEST=registerBlock("obsidian_chest",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.Csa_Tab);
    public static final  RegistryObject<Block> DIRT_CHEST = registerBlock("dirt_chest",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.Csa_Tab);
    public static final  RegistryObject<Block> SILVER_CHEST = registerBlock("silver_chest",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.Csa_Tab);
    public static final  RegistryObject<Block> CRYSTAL_CHEST = registerBlock("crystal_chest",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.Csa_Tab);









    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);

        return toReturn;
    }

        private static  <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){

            return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));

    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
