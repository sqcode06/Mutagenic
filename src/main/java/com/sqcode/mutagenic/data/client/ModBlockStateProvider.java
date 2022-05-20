package com.sqcode.mutagenic.data.client;

import com.sqcode.mutagenic.Mutagenic;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider
{
    public ModBlockStateProvider(DataGenerator generator, ExistingFileHelper exFileHelper)
    {
        super(generator, Mutagenic.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {

    }
}
