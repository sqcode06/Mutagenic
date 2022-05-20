package com.sqcode.mutagenic.data.client;

import com.sqcode.mutagenic.Mutagenic;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider
{
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        super(generator, Mutagenic.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {

    }
}
