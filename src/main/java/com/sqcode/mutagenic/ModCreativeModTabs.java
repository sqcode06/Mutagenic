package com.sqcode.mutagenic;

import com.sqcode.mutagenic.registries.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModTabs
{
    public static final CreativeModeTab MUTAGENIC_TAB = new CreativeModeTab(Mutagenic.MOD_ID)
    {
        @Override
        public @NotNull ItemStack makeIcon()
        {
            return ModItems.CRYSTALLIZED_MUTAGEN.get().getDefaultInstance();
        }
    };
}