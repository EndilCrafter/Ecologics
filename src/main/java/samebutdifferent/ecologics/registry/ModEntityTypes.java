package samebutdifferent.ecologics.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import samebutdifferent.ecologics.Ecologics;
import samebutdifferent.ecologics.entity.*;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Ecologics.MOD_ID);

    public static final RegistryObject<EntityType<CoconutCrab>> COCONUT_CRAB = ENTITY_TYPES.register("coconut_crab", () -> EntityType.Builder.of(CoconutCrab::new, MobCategory.CREATURE).sized(1.0F, 1.0F).clientTrackingRange(10).build(new ResourceLocation(Ecologics.MOD_ID, "coconut_crab").toString()));
    public static final RegistryObject<EntityType<Camel>> CAMEL = ENTITY_TYPES.register("camel", () -> EntityType.Builder.of(Camel::new, MobCategory.CREATURE).sized(1.6F, 2.1F).clientTrackingRange(10).build(new ResourceLocation(Ecologics.MOD_ID, "camel").toString()));
    public static final RegistryObject<EntityType<ModBoat>> BOAT = ENTITY_TYPES.register("boat", () -> EntityType.Builder.<ModBoat>of(ModBoat::new, MobCategory.MISC).sized(1.375F, 0.5625F).clientTrackingRange(10).build(new ResourceLocation(Ecologics.MOD_ID, "boat").toString()));
    public static final RegistryObject<EntityType<ModChestBoat>> CHEST_BOAT = ENTITY_TYPES.register("chest_boat", () -> EntityType.Builder.<ModChestBoat>of(ModChestBoat::new, MobCategory.MISC).sized(1.375F, 0.5625F).clientTrackingRange(10).build(new ResourceLocation(Ecologics.MOD_ID, "chest_boat").toString()));
    public static final RegistryObject<EntityType<Penguin>> PENGUIN = ENTITY_TYPES.register("penguin", () -> EntityType.Builder.of(Penguin::new, MobCategory.CREATURE).sized(0.7F, 0.9F).clientTrackingRange(10).build(new ResourceLocation(Ecologics.MOD_ID, "penguin").toString()));
    public static final RegistryObject<EntityType<Squirrel>> SQUIRREL = ENTITY_TYPES.register("squirrel", () -> EntityType.Builder.of(Squirrel::new, MobCategory.CREATURE).sized(0.6F, 0.8F).clientTrackingRange(8).build(new ResourceLocation(Ecologics.MOD_ID, "squirrel").toString()));
}
