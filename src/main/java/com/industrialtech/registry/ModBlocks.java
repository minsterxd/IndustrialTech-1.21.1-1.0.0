package com.industrialtech.registry;

import com.industrialtech.IndustrialTech;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(Registries.BLOCK, IndustrialTech.MODID);

    public static final DeferredHolder<Block, Block> RUBBER_LOG = BLOCKS.register("rubber_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(2.0F)
                    .mapColor(MapColor.COLOR_BROWN)
                    .sound(SoundType.WOOD)));

    public static final DeferredHolder<Block, Block> RUBBER_LEAVES = BLOCKS.register("rubber_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of()
                    .strength(0.2F)
                    .noOcclusion()
                    .sound(SoundType.GRASS)));

    public static final DeferredHolder<Block, Block> RUBBER_SAPLING = BLOCKS.register("rubber_sapling",
            () -> new SaplingBlock(
                    new TreeGrower("rubber",
                            // Árbol pequeño
                            java.util.Optional.empty(),
                            // Árbol grande
                            java.util.Optional.empty(),
                            java.util.Optional.empty()
                    ),
                    BlockBehaviour.Properties.of()
                            .strength(0.0F)
                            .noCollission()
                            .sound(SoundType.GRASS)));
}
