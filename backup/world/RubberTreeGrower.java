package com.industrialtech.industrialtech.world.trees;

import com.industrialtech.industrialtech.world.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;
import org.jetbrains.annotations.Nullable;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import java.util.Optional;

public class RubberTreeGrower extends TreeGrower {
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature() {
        return ModConfiguredFeatures.RUBBER_TREE_KEY;
    }
}
