package com.industrialtech.industrialtech.world;

import com.industrialtech.industrialtech.IndustrialTech;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.neoforged.neoforged.registries.DeferredRegister;
import net.neoforged.neoforged.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED =
            DeferredRegister.create(Registries.PLACED_FEATURE, IndustrialTech.MODID);

    public static final RegistryObject<PlacedFeature> RUBBER_TREE_PLACED =
            PLACED.register("rubber_tree_placed", () ->
                    new PlacedFeature(
                            ModConfiguredFeatures.RUBBER_TREE.getHolder().orElseThrow(),
                            List.of(
                                    VegetationPlacements.treePlacement(
                                            PlacementUtils.countExtra(1, 0.05f, 1)
                                    )
                            )
                    )
            );
}
