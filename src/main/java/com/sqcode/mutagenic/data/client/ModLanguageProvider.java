package com.sqcode.mutagenic.data.client;

import com.sqcode.mutagenic.Mutagenic;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider
{
    public ModLanguageProvider(DataGenerator generator)
    {
        super(generator, Mutagenic.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations()
    {

    }
}
