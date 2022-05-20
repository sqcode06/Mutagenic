package com.sqcode.mutagenic.data.loot;

import com.sqcode.mutagenic.registries.Registries;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

public class ModBlockLootTable extends BlockLoot
{
    @Override
    protected void addTables()
    {

    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks()
    {
        return Registries.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
