package com.industrialtech;

import com.industrialtech.registry.ModBlocks;
import com.industrialtech.registry.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(IndustrialTech.MODID)
public class IndustrialTech {
    public static final String MODID = "industrialtech";

    public IndustrialTech() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Registrar DeferredRegister (bloques/items)
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
    }
}
