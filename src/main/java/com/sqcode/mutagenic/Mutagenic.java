package com.sqcode.mutagenic;

import com.sqcode.mutagenic.registries.Registries;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Mutagenic.MOD_ID)
public class Mutagenic
{
    public static final String MOD_ID = "mutagenic";

    public Mutagenic()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        Registries.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {}
}
