package com.industrialtech.registry;

import com.industrialtech.IndustrialTech;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Registries.ITEM, IndustrialTech.MODID);

    public static final DeferredHolder<Item, Item> RUBBER_LOG = ITEMS.register("rubber_log",
            () -> new BlockItem(ModBlocks.RUBBER_LOG.get(), new Item.Properties()));

    public static final DeferredHolder<Item, Item> RUBBER_LEAVES = ITEMS.register("rubber_leaves",
            () -> new BlockItem(ModBlocks.RUBBER_LEAVES.get(), new Item.Properties()));

    public static final DeferredHolder<Item, Item> RUBBER_SAPLING = ITEMS.register("rubber_sapling",
            () -> new BlockItem(ModBlocks.RUBBER_SAPLING.get(), new Item.Properties()));
}
