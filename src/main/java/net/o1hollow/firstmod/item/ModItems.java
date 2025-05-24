package net.o1hollow.firstmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.o1hollow.firstmod.FirstMod;

import java.rmi.registry.Registry;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    public static final RegistryObject<Item> VIBRANIUM = ITEMS.register("vibranium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_VIBRANIUM = ITEMS.register("raw_vibranium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JOSH = ITEMS.register("josh",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
