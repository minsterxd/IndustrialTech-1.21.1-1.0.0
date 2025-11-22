package com.industrialtech.industrialtech.world;

import com.industrialtech.industrialtech.IndustrialTech;
import com.industrialtech.industrialtech.registry.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforged.registries.RegistryObject;

public class ModConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED =
            DeferredRegister.create(Registries.CONFIGURED_FEATURE, IndustrialTech.MODID);

    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBBER_TREE_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE,
                    new ResourceLocation(IndustrialTech.MODID, "rubber_tree"));

    public static final RegistryObject<ConfiguredFeature<?, ?>> RUBBER_TREE =
            CONFIGURED.register("rubber_tree", () ->
                    new ConfiguredFeature<>(Feature.TREE,
                            new TreeConfiguration.TreeConfigurationBuilder(
                                    BlockStateProvider.simple(ModBlocks.RUBBER_LOG.get().defaultBlockState()),
                                    new StraightTrunkPlacer(5, 2, 1),
                                    BlockStateProvider.simple(ModBlocks.RUBBER_LEAVES.get().defaultBlockState()),
                                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                                    new TwoLayersFeatureSize(1, 0, 2)
                            ).ignoreVines().build()
                    )
            );
}
