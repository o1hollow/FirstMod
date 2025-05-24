package net.o1hollow.firstmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.o1hollow.firstmod.FirstMod;
import net.o1hollow.firstmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> VIBRANIUM_ITEMS_TAB = CREATIVE_MOD_TABS.register("vibranium_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.JOSH.get()))
                    .title(Component.translatable("creativetab.firstmod.vibranium_items"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.VIBRANIUM.get());
                        output.accept(ModItems.RAW_VIBRANIUM.get());
                        output.accept(ModItems.JOSH.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> VIBRANIUM_BLOCKS_TAB = CREATIVE_MOD_TABS.register("vibranium_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.VIBRANIUM_BLOCK.get()))
                    .withTabsBefore(VIBRANIUM_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.firstmod.vibranium_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModBlocks.VIBRANIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_VIBRANIUM_BLOCK.get());
                        output.accept(ModBlocks.JOSH_BLOCK.get());

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
