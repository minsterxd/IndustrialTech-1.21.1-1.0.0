package com.industrialtech;

import com.industrialtech.registry.ModBlocks;
import com.industrialtech.registry.ModCreativeTabs;
import com.industrialtech.registry.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(IndustrialTech.MODID)
public class IndustrialTech {

    public static final String MODID = "industrialtech";

    public IndustrialTech(IEventBus modEventBus) {

        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.TABS.register(modEventBus);
    }

    // Si añadimos características de mundo:
        // ModConfiguredFeatures.CONFIGURED.register(modEventBus);
        // ModPlacedFeatures.PLACED.register(modEventBus)
}
