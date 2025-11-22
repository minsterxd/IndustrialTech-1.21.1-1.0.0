package com.industrialtech.industrialtech.world;

import com.industrialtech.industrialtech.IndustrialTech;
import net.minecraft.world.level.biome.Biome;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforged.event.level.BiomeLoadingEvent;

@Mod.EventBusSubscriber(modid = IndustrialTech.MODID)
public class ModBiomeLoaders {

    @SubscribeEvent
    public static void biomeLoad(BiomeLoadingEvent event) {

        if (event.getCategory() == Biome.BiomeCategory.FOREST ||
                event.getCategory() == Biome.BiomeCategory.JUNGLE) {

            event.getGeneration()
                    .getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION)
                    .add(ModPlacedFeatures.RUBBER_TREE_PLACED.getHolder().get());
        }
    }
}
