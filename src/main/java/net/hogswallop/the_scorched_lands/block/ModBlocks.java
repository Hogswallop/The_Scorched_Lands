package net.hogswallop.the_scorched_lands.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hogswallop.the_scorched_lands.TheScorchedLands;
import net.hogswallop.the_scorched_lands.block.custom.ScorchedBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SCORCHED_GRASS = registerBlock("scorched_grass_block",
            new ScorchedBlock(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TheScorchedLands.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TheScorchedLands.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TheScorchedLands.LOGGER.info("Registering ModBlocks for " + TheScorchedLands.MOD_ID);
    }
}
