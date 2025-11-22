package com.industrialtech.registry;

import com.industrialtech.IndustrialTech;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IndustrialTech.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> INDUSTRIALTECH_TAB =
            TABS.register("industrialtech_tab",
                    () -> CreativeModeTab.builder()
                            .title(Component.literal("IndustrialTech"))
                            .icon(() -> new ItemStack(ModBlocks.RUBBER_LOG.get()))
                            .displayItems((params, output) -> {
                                output.accept(ModBlocks.RUBBER_LOG.get());
                                output.accept(ModBlocks.RUBBER_LEAVES.get());
                                output.accept(ModBlocks.RUBBER_SAPLING.get());
                            })
                            .build());
}
