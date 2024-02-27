
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cyberneticraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.cyberneticraft.item.TestItem;
import net.mcreator.cyberneticraft.CyberneticraftMod;

public class CyberneticraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CyberneticraftMod.MODID);
	public static final RegistryObject<Item> TEST = REGISTRY.register("test", () -> new TestItem());
}
