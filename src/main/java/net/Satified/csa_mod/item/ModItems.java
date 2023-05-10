package net.Satified.csa_mod.item;

import net.Satified.csa_mod.CSA_Mod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CSA_Mod.MOD_ID);

    public static final RegistryObject<Item> COPPERIRONUPGRADE = ITEMS.register("copperironupgrade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Csa_Tab)));
    public static final RegistryObject<Item> COPPERSILVERUPGRADE = ITEMS.register("coppersilverupgrade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Csa_Tab)));
    public static final RegistryObject<Item> DIAMONDCRYSTALUPGRADE = ITEMS.register("diamondcrystalupgrade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Csa_Tab)));
    public static final RegistryObject<Item> DIAMONDOBSIDIANUPGRADE = ITEMS.register("diamondobsidianupgrade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Csa_Tab)));
    public static final RegistryObject<Item> GOLDDIAMONDUPGRADE = ITEMS.register("golddiamondupgrade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Csa_Tab)));
    public static final RegistryObject<Item> IRONGOLDUPGRADE = ITEMS.register("irongoldupgrade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Csa_Tab)));
    public static final RegistryObject<Item> SILVERGOLDUPGRADE = ITEMS.register("silvergoldupgrade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Csa_Tab)));
    public static final RegistryObject<Item> WOODCOPPERUPGRADE = ITEMS.register("woodcopperupgrade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Csa_Tab)));
    public static final RegistryObject<Item> WOODIRONUPGRADE = ITEMS.register("woodironupgrade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Csa_Tab)));
    public static final RegistryObject<Item> OBSDIANGALAXYUPGRADE = ITEMS.register("obsidiangalaxyupgrade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Csa_Tab)));
    public static final RegistryObject<Item> DIAMONDEMERALDUPGRADE = ITEMS.register("diamondemeraldupgrade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Csa_Tab)));
    public static final RegistryObject<Item> EMERALDSMARTUPGRADE = ITEMS.register("emeraldsmartupgrade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Csa_Tab)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
