package net.maya.maychenone.item;

import net.maya.maychenone.MayChenOne;
import net.maya.maychenone.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MayChenOne.MODID);

    public static final RegistryObject<CreativeModeTab> MAYCHENONE_TAB = CREATIVE_MODE_TABS.register("maychennone_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COOKED_CHOUFLEUR.get()))
                    .title(Component.translatable("creativetab.maychennone_tab"))
                    .displayItems((itemDisplayParameters, pOutput) -> {
                        pOutput.accept(ModItems.CAULIFLOWER.get());
                        pOutput.accept(ModItems.COOKED_CHOUFLEUR.get());

                        pOutput.accept(ModBlocks.COOKED_CHOUFLEUR_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}