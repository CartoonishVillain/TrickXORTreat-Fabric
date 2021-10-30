package com.cartoonishvillain.trickxortreat.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "trickxortreat")
public class TrickXORConfig implements ConfigData {
    @ConfigEntry.Gui.CollapsibleObject
    public TreatOptions trickxortreatoptions = new TreatOptions();

    public static class TreatOptions{
        public int level1TrickEffectChance = 5;
        public int level1TreatEffectChance = 5;
    }
}
