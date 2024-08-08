package net.hogswallop.the_scorched_lands.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hogswallop.the_scorched_lands.TheScorchedLands;
import net.hogswallop.the_scorched_lands.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup THE_SCORCHED_LANDS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheScorchedLands.MOD_ID, "the_scorched_lands"),
            FabricItemGroup.builder().displayName(Text.translatable("The Scorched Lands"))
                    .icon(() -> new ItemStack(ModBlocks.SCORCHED_GRASS_BLOCK)).entries((displayContext, entries) -> {

                       entries.add(ModBlocks.SCORCHED_GRASS_BLOCK);
                       entries.add(ModBlocks.SCORCHED_DIRT);
                       entries.add(ModBlocks.SCORCHED_STONE);
                        entries.add(ModBlocks.SCORCHED_LEAVES);

                    }).build());

    public static void registerItemGroups() {
        TheScorchedLands.LOGGER.info("Registering Item Groups for " + TheScorchedLands.MOD_ID);
    }
}
