package com.sqcode.mutagenic.data;

import com.sqcode.mutagenic.Mutagenic;
import com.sqcode.mutagenic.data.client.ModBlockStateProvider;
import com.sqcode.mutagenic.data.client.ModItemModelProvider;
import com.sqcode.mutagenic.data.client.ModLanguageProvider;
import com.sqcode.mutagenic.data.loot.ModLootTableProvider;
import com.sqcode.mutagenic.data.tags.ModBlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Mutagenic.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        generator.addProvider(new ModBlockStateProvider(generator, helper));
        generator.addProvider(new ModItemModelProvider(generator, helper));
        generator.addProvider(new ModLanguageProvider(generator));

        generator.addProvider(new ModRecipeProvider(generator));
        generator.addProvider(new ModBlockTagsProvider(generator, helper));
        generator.addProvider(new ModLootTableProvider(generator));
    }
}
