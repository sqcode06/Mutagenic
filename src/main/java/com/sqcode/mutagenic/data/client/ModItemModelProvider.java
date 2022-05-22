package com.sqcode.mutagenic.data.client;

import com.sqcode.mutagenic.Mutagenic;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider
{
    private final ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        super(generator, Mutagenic.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        getBuilder("geneticist_journal").parent(itemGenerated).texture("layer0", "item/geneticist_journal");

        getBuilder("crystallized_mutagen").parent(itemGenerated).texture("layer0", "item/crystallized_mutagen");
    }
}
