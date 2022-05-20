package com.sqcode.mutagenic.data.tags;

import com.sqcode.mutagenic.Mutagenic;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider
{
    public ModBlockTagsProvider(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(generator, Mutagenic.MOD_ID, existingFileHelper);
    }

    @Override
    public void addTags()
    {

    }
}
