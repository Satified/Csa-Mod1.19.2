package net.Satified.csa_mod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class ModCreativeModeTab {
    public static final CreativeModeTab Csa_Tab =new CreativeModeTab("CSATAB") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COPPERIRONUPGRADE.get());
        }
    };
}
