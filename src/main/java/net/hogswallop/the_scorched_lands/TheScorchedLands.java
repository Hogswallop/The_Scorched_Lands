package net.hogswallop.the_scorched_lands;

import net.fabricmc.api.ModInitializer;

import net.hogswallop.the_scorched_lands.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheScorchedLands implements ModInitializer {
	public static final String MOD_ID = "the_scorched_lands";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}