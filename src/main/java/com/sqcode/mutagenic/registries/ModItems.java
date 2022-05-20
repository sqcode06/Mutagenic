package com.sqcode.mutagenic.registries;

import com.sqcode.mutagenic.ModCreativeModTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final RegistryObject<Item> CRYSTALLIZED_MUTAGEN = Registries.ITEMS.register("crystallized_mutagen", () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MUTAGENIC_TAB)));

    public static void register() {}
}
