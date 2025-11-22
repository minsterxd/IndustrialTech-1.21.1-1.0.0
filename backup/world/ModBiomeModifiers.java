package com.industrialtech.industrialtech.world;

import com.industrialtech.industrialtech.IndustrialTech;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.level.BiomeLoadingEvent;

@Mod.EventBusSubscriber(modid = IndustrialTech.MODID)
public class ModBiomeModifiers {

    @SubscribeEvent
    public static void onBiomeLoad(BiomeLoadingEvent event) {
        // Solo bosques
        if (event.getCategory() == Biome.BiomeCategory.FOREST ||
                event.getCategory() == Biome.BiomeCategory.JUNGLE) {

            event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION)
                    .add(ModPlacedFeatures.RUBBER_TREE_PLACED.getHolder().get());
        }
    }
}
