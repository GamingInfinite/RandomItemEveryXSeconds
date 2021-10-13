package com.ginfinity.rnditemxsec;

import me.shedaniel.clothconfig2.api.ConfigBuilder;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loom.util.Constants;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.screen.NamedScreenHandlerFactory;
import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RNDItemXSec implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("rnditemxsec");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("RandomItemGiver Initializing...");
		for (int i = 0; i < ; i++) {
			LOGGER.info(Item.BLOCK_ITEMS.get(i));
		}


	}
}
