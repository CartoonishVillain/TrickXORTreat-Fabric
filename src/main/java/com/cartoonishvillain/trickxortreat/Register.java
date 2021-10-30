package com.cartoonishvillain.trickxortreat;

import com.cartoonishvillain.trickxortreat.enchantments.Treat;
import com.cartoonishvillain.trickxortreat.enchantments.Trick;
import com.cartoonishvillain.trickxortreat.items.Candy;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

import java.util.ArrayList;
import java.util.Arrays;

public class Register {

    public static final Item CLOUDCANDY = new Candy(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.5f).fast().effect(new MobEffectInstance(MobEffects.LEVITATION, 20*15, 0), 1.0f).effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 20*30, 0), 1f).alwaysEat().build()), new ArrayList<>(Arrays.asList(new MobEffectInstance(MobEffects.LEVITATION, 20*15, 0), new MobEffectInstance(MobEffects.SLOW_FALLING, 20*30, 0))), new ArrayList<>(Arrays.asList(ChatFormatting.BLUE, ChatFormatting.BLUE, ChatFormatting.RESET)), new ArrayList<>(Arrays.asList("It's almost as light as the air...")));
    public static final Item CREEPERCHOCOLATE = new Candy(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.5f).fast().effect( new MobEffectInstance(MobEffects.INVISIBILITY, 20*15, 0), 1.0f).effect( new MobEffectInstance(MobEffects.NIGHT_VISION, 20*15, 0), 1f).alwaysEat().build()), new ArrayList<>(Arrays.asList(new MobEffectInstance(MobEffects.INVISIBILITY, 20*15, 0), new MobEffectInstance(MobEffects.NIGHT_VISION, 20*15, 0))), new ArrayList<>(Arrays.asList(ChatFormatting.BLUE, ChatFormatting.BLUE, ChatFormatting.GREEN)), new ArrayList<>(Arrays.asList("Made with creepers, by creepers, for creepers!")));
    public static final Item HEROICBAR = new Candy(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.5f).fast().effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20*15, 0), 1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20*15, 0), 1f).alwaysEat().build()), new ArrayList<>(Arrays.asList(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20*15, 0), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20*15, 0))), new ArrayList<>(Arrays.asList(ChatFormatting.BLUE, ChatFormatting.BLUE, ChatFormatting.RED)), new ArrayList<>(Arrays.asList("Fight well!")));
    public static final Item PIGMENCOIN = new Candy(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.5f).fast().effect( new MobEffectInstance(MobEffects.DIG_SPEED, 20*15, 0), 1.0f).effect( new MobEffectInstance(MobEffects.LUCK, 20*15, 0), 1f).alwaysEat().build()), new ArrayList<>(Arrays.asList(new MobEffectInstance(MobEffects.DIG_SPEED, 20*15, 0), new MobEffectInstance(MobEffects.LUCK, 20*15, 0))), new ArrayList<>(Arrays.asList(ChatFormatting.BLUE, ChatFormatting.BLUE, ChatFormatting.YELLOW)), new ArrayList<>(Arrays.asList("It may not be gold, but it's still good luck!")));
    public static final Item SUGARBONE = new Candy(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.5f).fast().effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20*15, 0), 1.0f).alwaysEat().build()), new ArrayList<>(Arrays.asList(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20*15, 0))), new ArrayList<>(Arrays.asList(ChatFormatting.BLUE, ChatFormatting.RESET)), new ArrayList<>(Arrays.asList("Notice: Do not feed this to dogs.")));
    public static final Item RABBITCANDY = new Candy(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.5f).fast().effect(new MobEffectInstance(MobEffects.JUMP, 20*15, 1), 1.0f).alwaysEat().build()), new ArrayList<>(Arrays.asList(new MobEffectInstance(MobEffects.JUMP, 20*15, 1))), new ArrayList<>(Arrays.asList(ChatFormatting.BLUE, ChatFormatting.GREEN)), new ArrayList<>(Arrays.asList("Reach the skies! No rabbits were harmed in the making of this product.")));
    public static final Item PRISMATICFLESH = new Candy(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.5f).fast().effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20*15, 0), 1f).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20*15, 0), 1f).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20*15, 0), 1f).effect(new MobEffectInstance(MobEffects.JUMP, 20*15, 0), 1f).effect(new MobEffectInstance(MobEffects.DIG_SPEED, 20*15, 0), 1f).effect(new MobEffectInstance(MobEffects.CONFUSION, 20*25, 0), 1f).alwaysEat().build()), new ArrayList<>(Arrays.asList(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20*15, 0), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20*15, 0), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20*15, 0), new MobEffectInstance(MobEffects.JUMP, 20*15, 0), new MobEffectInstance(MobEffects.DIG_SPEED, 20*15, 0), new MobEffectInstance(MobEffects.CONFUSION, 20*25, 0))), new ArrayList<>(Arrays.asList(ChatFormatting.BLUE, ChatFormatting.BLUE, ChatFormatting.BLUE, ChatFormatting.BLUE, ChatFormatting.BLUE, ChatFormatting.RED, ChatFormatting.RED)), new ArrayList<>(Arrays.asList("It's sweet. Maybe a bit too sweet.")));
    public static final Item FLAMINGDOTS = new Candy(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.5f).fast().effect( new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20*20, 0), 1.0f).alwaysEat().build()), new ArrayList<>(Arrays.asList(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20*20, 0))), new ArrayList<>(Arrays.asList(ChatFormatting.BLUE, ChatFormatting.GOLD)), new ArrayList<>(Arrays.asList("Blaze Co. holds no responsibility for personal injury while consuming this product.")));
    public static final Item DOLPHINCRUNCH = new Candy(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.5f).fast().effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 20*5, 0), 1.0f).effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 20*10, 0), 1).alwaysEat().build()), new ArrayList<>(Arrays.asList(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 20*5, 0), new MobEffectInstance(MobEffects.WATER_BREATHING, 20*10, 0))), new ArrayList<>(Arrays.asList(ChatFormatting.BLUE, ChatFormatting.BLUE, ChatFormatting.AQUA)), new ArrayList<>(Arrays.asList("Made with real dolphin fins!")));

    public static final Enchantment TREAT = new Treat(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.WEAPON,  new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    public static final Enchantment TRICK = new Trick(Enchantment.Rarity.COMMON, EnchantmentCategory.WEAPON,  new EquipmentSlot[]{EquipmentSlot.MAINHAND});

    public static void register(){
        Registry.register(Registry.ITEM, new ResourceLocation("trickxortreat", "cloud_candy"), CLOUDCANDY);
        Registry.register(Registry.ITEM, new ResourceLocation("trickxortreat", "creeper_chocolate"), CREEPERCHOCOLATE);
        Registry.register(Registry.ITEM, new ResourceLocation("trickxortreat", "heroic_bar"), HEROICBAR);
        Registry.register(Registry.ITEM, new ResourceLocation("trickxortreat", "pigmen_gold"), PIGMENCOIN);
        Registry.register(Registry.ITEM, new ResourceLocation("trickxortreat", "sugar_bone"), SUGARBONE);
        Registry.register(Registry.ITEM, new ResourceLocation("trickxortreat", "candy_rabbit"), RABBITCANDY);
        Registry.register(Registry.ITEM, new ResourceLocation("trickxortreat", "prismatic_flesh"), PRISMATICFLESH);
        Registry.register(Registry.ITEM, new ResourceLocation("trickxortreat", "flaming_dots"), FLAMINGDOTS);
        Registry.register(Registry.ITEM, new ResourceLocation("trickxortreat", "dolphin_crunch"), DOLPHINCRUNCH);

        Registry.register(Registry.ENCHANTMENT, new ResourceLocation("trickxortreat", "trick"), TRICK);
        Registry.register(Registry.ENCHANTMENT, new ResourceLocation("trickxortreat", "treat"), TREAT);
    }
}

