package com.cartoonishvillain.trickxortreat;

import com.cartoonishvillain.trickxortreat.config.TrickXORConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import samebutdifferent.trickortreat.registry.ModItems;

import java.util.ArrayList;
import java.util.List;

public class TrickXORTreat implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("trickxortreat");

	public static ArrayList<SoundEvent> tricksounds = new ArrayList<SoundEvent>(List.of(SoundEvents.ZOMBIE_VILLAGER_CURE, SoundEvents.ZOMBIE_VILLAGER_AMBIENT, SoundEvents.BELL_RESONATE, SoundEvents.PARROT_IMITATE_ENDER_DRAGON, SoundEvents.PHANTOM_AMBIENT, SoundEvents.VEX_CHARGE, SoundEvents.TOTEM_USE));
	public static ArrayList<MobEffect> trickeffects = new ArrayList<MobEffect>(List.of(MobEffects.LEVITATION, MobEffects.WEAKNESS, MobEffects.MOVEMENT_SLOWDOWN, MobEffects.UNLUCK, MobEffects.BLINDNESS, MobEffects.CONFUSION));
	public static ArrayList<Item> candies;

	public static TrickXORConfig config;

	public static boolean isTrickOrTreatLoaded;

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		AutoConfig.register(TrickXORConfig.class, GsonConfigSerializer::new);
		config = AutoConfig.getConfigHolder(TrickXORConfig.class).getConfig();

		Register.register();

		isTrickOrTreatLoaded = FabricLoader.getInstance().isModLoaded("trickortreat") && config.trickxortreatoptions.trickOrTreatCompat;
		candies = new ArrayList<Item>(List.of(Register.CREEPERCHOCOLATE, Register.FLAMINGDOTS, Register.SUGARBONE, Register.CLOUDCANDY, Register.DOLPHINCRUNCH, Register.HEROICBAR, Register.PIGMENCOIN, Register.RABBITCANDY, Register.CREEPERCHOCOLATE, Register.FLAMINGDOTS, Register.SUGARBONE, Register.CLOUDCANDY, Register.DOLPHINCRUNCH, Register.HEROICBAR, Register.PIGMENCOIN, Register.RABBITCANDY, Register.PRISMATICFLESH));

		if(isTrickOrTreatLoaded){
			//Add another pile of entries for my own candies to artificially make the next ones more rare, since it isn't my mod.
			candies = new ArrayList<Item>(List.of(Register.CREEPERCHOCOLATE, Register.FLAMINGDOTS, Register.SUGARBONE, Register.CLOUDCANDY, Register.DOLPHINCRUNCH, Register.HEROICBAR, Register.PIGMENCOIN, Register.RABBITCANDY, Register.CREEPERCHOCOLATE, Register.FLAMINGDOTS, Register.SUGARBONE, Register.CLOUDCANDY, Register.DOLPHINCRUNCH, Register.HEROICBAR, Register.PIGMENCOIN, Register.RABBITCANDY, Register.PRISMATICFLESH));
			candies = new ArrayList<Item>(List.of(Register.CREEPERCHOCOLATE, Register.FLAMINGDOTS, Register.SUGARBONE, Register.CLOUDCANDY, Register.DOLPHINCRUNCH, Register.HEROICBAR, Register.PIGMENCOIN, Register.RABBITCANDY, Register.CREEPERCHOCOLATE, Register.FLAMINGDOTS, Register.SUGARBONE, Register.CLOUDCANDY, Register.DOLPHINCRUNCH, Register.HEROICBAR, Register.PIGMENCOIN, Register.RABBITCANDY, Register.PRISMATICFLESH));

			//additional modded candy
			candies.addAll(List.of(ModItems.FIREFINGERS, ModItems.FIZZLERS, ModItems.DEADISH_FISH, ModItems.PEARL_POP, ModItems.SCREAMBURSTS, ModItems.EYECE_CREAM, ModItems.MEMBRANE_BUTTER_CUPS, ModItems.BONEBREAKER, ModItems.SLIME_GUM, ModItems.CHOCOLATE_SPIDER_EYE, ModItems.SOUR_PATCH_ZOMBIES));
		}
	}
}
