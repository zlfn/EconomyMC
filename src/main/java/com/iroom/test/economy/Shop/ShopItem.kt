package com.iroom.test.economy.Shop

import org.bukkit.Material

class ShopItem(var material: Material, var price: Int) {
    var change: Float
    var isCanBuy: Boolean

    init {
        change = 0.005f
        isCanBuy = false
    }

    constructor(material:Material, price:Int, change:Float) : this(material,price) {
        this.change = change
    }
    constructor(material:Material,price:Int,iscan:Boolean):this(material,price)
    {
        this.isCanBuy = iscan
    }

    fun getSellPrice():Int
    {
        if(!isCanBuy)
        {
            return (price*(0.8)*2).toInt()
        }
        return (price*(0.8)).toInt()
    }
    fun getBuyPrice():Int
    {
        if(isCanBuy)
        {
            return (price*(1.2)).toInt()
        }
        else return -1
    }
    fun mutPrice(mut:Int):Boolean
    {
        if(price>=(-mut))
        {
            price = price+mut
            return true
        }
        return false
    }

    companion object
    {
        val NumberOfBuildingBlock = 101
        val NumberOfDecorationBlock = 108
        val NumberOfRedStoneBlock = 31
        val NumberOfTransportaionBlock = 12
        val NumberOfMiscellaneousBlock = 93
        val NumberOfFoodBlock = 37
        val NumberOfToolBlock = 70
        val NumberOfBrewingBlock = 11
        var ItemList = emptyList<ShopItem>().toMutableList()
        fun initItemList()
        {
            //가격: 다이아 10000을 기준으로 알아서 잘 결정
            //주의: 희귀도 == 가격이 아님, 수요와 공급이 일치하는 지점을 예상.
            //첫 판매는 2배의 가격으로 팔리고, 첫 판매 이후부터 구입이 가능함.
            //변화율 템플릿
            //val(상수) 이용할 것을 권장
            //노가다 가능, 아주 많이 얻을 수 있음(흙 등) -> 0.0005
            //5분에 한세트(석탄 등) -> 0.001
            //15분에 한세트(철, 금 등) -> 0.005
            //한시간에 한세트(다이아몬드 등) -> 0.01
            //한시간에 10개 정도(네더라이트, 겉날개 등) -> 0.05
            //아이템 순서는 나무위키를 따랐음.
            //건축블록
            ItemList.add(ShopItem(Material.OAK_LOG,15,0.001f))
            ItemList.add(ShopItem(Material.SPRUCE_LOG,0))
            ItemList.add(ShopItem(Material.BIRCH_LOG,0))
            ItemList.add(ShopItem(Material.JUNGLE_LOG,0))
            ItemList.add(ShopItem(Material.ACACIA_LOG,0))
            ItemList.add(ShopItem(Material.DARK_OAK_LOG,0))
            ItemList.add(ShopItem(Material.CRIMSON_STEM,0))
            ItemList.add(ShopItem(Material.WARPED_STEM,0))
            ItemList.add(ShopItem(Material.OAK_PLANKS,0))
            ItemList.add(ShopItem(Material.SPRUCE_PLANKS,0))
            ItemList.add(ShopItem(Material.BIRCH_PLANKS,0))
            ItemList.add(ShopItem(Material.JUNGLE_PLANKS,0))
            ItemList.add(ShopItem(Material.ACACIA_PLANKS,0))
            ItemList.add(ShopItem(Material.DARK_OAK_PLANKS,0))
            ItemList.add(ShopItem(Material.CRIMSON_PLANKS,0))
            ItemList.add(ShopItem(Material.WARPED_PLANKS,0))
            ItemList.add(ShopItem(Material.STONE,0))
            ItemList.add(ShopItem(Material.COBBLESTONE,0))
            ItemList.add(ShopItem(Material.MOSSY_COBBLESTONE,0))
            ItemList.add(ShopItem(Material.STONE_BRICKS,0))
            ItemList.add(ShopItem(Material.MOSSY_STONE_BRICKS,0))
            ItemList.add(ShopItem(Material.CRACKED_STONE_BRICKS,0))
            ItemList.add(ShopItem(Material.CHISELED_STONE_BRICKS,0))
            ItemList.add(ShopItem(Material.SMOOTH_STONE,0))
            ItemList.add(ShopItem(Material.SANDSTONE,0))
            ItemList.add(ShopItem(Material.RED_SANDSTONE,0))
            ItemList.add(ShopItem(Material.GRANITE,0))
            ItemList.add(ShopItem(Material.POLISHED_GRANITE,0))
            ItemList.add(ShopItem(Material.ANDESITE,0))
            ItemList.add(ShopItem(Material.POLISHED_ANDESITE,0))
            ItemList.add(ShopItem(Material.DIORITE,0))
            ItemList.add(ShopItem(Material.POLISHED_DIORITE,0))
            ItemList.add(ShopItem(Material.BRICKS,0))
            ItemList.add(ShopItem(Material.PRISMARINE,0))
            ItemList.add(ShopItem(Material.PRISMARINE_BRICKS,0))
            ItemList.add(ShopItem(Material.DARK_PRISMARINE,0))
            ItemList.add(ShopItem(Material.QUARTZ_BLOCK,0))
            ItemList.add(ShopItem(Material.NETHER_BRICKS,0))
            ItemList.add(ShopItem(Material.RED_NETHER_BRICKS,0))
            ItemList.add(ShopItem(Material.BLACKSTONE,0))
            ItemList.add(ShopItem(Material.POLISHED_BLACKSTONE,0))
            ItemList.add(ShopItem(Material.BASALT,0))
            ItemList.add(ShopItem(Material.POLISHED_BASALT,0))
            ItemList.add(ShopItem(Material.END_STONE,0))
            ItemList.add(ShopItem(Material.PURPUR_BLOCK,0))
            ItemList.add(ShopItem(Material.DIRT,0))
            ItemList.add(ShopItem(Material.COARSE_DIRT,0))
            ItemList.add(ShopItem(Material.GRASS_BLOCK,0))
            ItemList.add(ShopItem(Material.MYCELIUM,0))
            ItemList.add(ShopItem(Material.PODZOL,0))
            ItemList.add(ShopItem(Material.SAND,0))
            ItemList.add(ShopItem(Material.RED_SAND,0))
            ItemList.add(ShopItem(Material.GRAVEL,0))
            ItemList.add(ShopItem(Material.COAL_ORE,0))
            ItemList.add(ShopItem(Material.IRON_ORE,0))
            ItemList.add(ShopItem(Material.GOLD_ORE,0))
            ItemList.add(ShopItem(Material.NETHER_GOLD_ORE,0))
            ItemList.add(ShopItem(Material.DIAMOND_ORE,0))
            ItemList.add(ShopItem(Material.REDSTONE_ORE,0))
            ItemList.add(ShopItem(Material.LAPIS_ORE,0))
            ItemList.add(ShopItem(Material.EMERALD_ORE,0))
            ItemList.add(ShopItem(Material.NETHER_QUARTZ_ORE,0))
            ItemList.add(ShopItem(Material.ANCIENT_DEBRIS,0))
            ItemList.add(ShopItem(Material.COAL_BLOCK,0))
            ItemList.add(ShopItem(Material.IRON_BLOCK,0))
            ItemList.add(ShopItem(Material.GOLD_BLOCK,0))
            ItemList.add(ShopItem(Material.DIAMOND_BLOCK,0))
            ItemList.add(ShopItem(Material.NETHERITE_BLOCK,0))
            ItemList.add(ShopItem(Material.EMERALD_BLOCK,0))
            ItemList.add(ShopItem(Material.LAPIS_BLOCK,0))
            ItemList.add(ShopItem(Material.NETHERRACK,0))
            ItemList.add(ShopItem(Material.CRIMSON_NYLIUM,0))
            ItemList.add(ShopItem(Material.WARPED_NYLIUM,0))
            ItemList.add(ShopItem(Material.SOUL_SAND,0))
            ItemList.add(ShopItem(Material.SOUL_SOIL,0))
            ItemList.add(ShopItem(Material.MAGMA_BLOCK,0))
            ItemList.add(ShopItem(Material.GLOWSTONE,0))
            ItemList.add(ShopItem(Material.NETHER_WART_BLOCK,0))
            ItemList.add(ShopItem(Material.WARPED_WART_BLOCK,0))
            ItemList.add(ShopItem(Material.GILDED_BLACKSTONE,0))
            ItemList.add(ShopItem(Material.GLASS,0))
            ItemList.add(ShopItem(Material.ICE,0))
            ItemList.add(ShopItem(Material.PACKED_ICE,0))
            ItemList.add(ShopItem(Material.BLUE_ICE,0))
            ItemList.add(ShopItem(Material.CLAY,0))
            ItemList.add(ShopItem(Material.TERRACOTTA,0))
            ItemList.add(ShopItem(Material.PUMPKIN,0))
            ItemList.add(ShopItem(Material.CARVED_PUMPKIN,0))
            ItemList.add(ShopItem(Material.MELON,0))
            ItemList.add(ShopItem(Material.JACK_O_LANTERN,0))
            ItemList.add(ShopItem(Material.HAY_BLOCK,0))
            ItemList.add(ShopItem(Material.DRIED_KELP_BLOCK,0))
            ItemList.add(ShopItem(Material.WHITE_WOOL,0))
            ItemList.add(ShopItem(Material.BONE_BLOCK,0))
            ItemList.add(ShopItem(Material.BOOKSHELF,0))
            ItemList.add(ShopItem(Material.SPONGE,0))
            ItemList.add(ShopItem(Material.WET_SPONGE,0))
            ItemList.add(ShopItem(Material.SEA_LANTERN,0))
            ItemList.add(ShopItem(Material.OBSIDIAN,0))
            ItemList.add(ShopItem(Material.CRYING_OBSIDIAN,0))
            ItemList.add(ShopItem(Material.SNOW_BLOCK,0))
            //////////////////////////////////////////////////////
            //장식블록
            ItemList.add(ShopItem(Material.OAK_SAPLING,0))
            ItemList.add(ShopItem(Material.DARK_OAK_SAPLING,0))
            ItemList.add(ShopItem(Material.ACACIA_SAPLING,0))
            ItemList.add(ShopItem(Material.JUNGLE_SAPLING,0))
            ItemList.add(ShopItem(Material.BIRCH_SAPLING,0))
            ItemList.add(ShopItem(Material.SPRUCE_SAPLING,0))
            ItemList.add(ShopItem(Material.OAK_LEAVES,0))
            ItemList.add(ShopItem(Material.DARK_OAK_LEAVES,0))
            ItemList.add(ShopItem(Material.ACACIA_LEAVES,0))
            ItemList.add(ShopItem(Material.JUNGLE_LEAVES,0))
            ItemList.add(ShopItem(Material.BIRCH_LEAVES,0))
            ItemList.add(ShopItem(Material.SPRUCE_LEAVES,0))
            ItemList.add(ShopItem(Material.CRIMSON_FUNGUS,0))
            ItemList.add(ShopItem(Material.WARPED_FUNGUS,0))
            ItemList.add(ShopItem(Material.SHROOMLIGHT,0))
            ItemList.add(ShopItem(Material.RED_MUSHROOM,0))
            ItemList.add(ShopItem(Material.BROWN_MUSHROOM,0))
            ItemList.add(ShopItem(Material.RED_MUSHROOM_BLOCK,0))
            ItemList.add(ShopItem(Material.BROWN_MUSHROOM_BLOCK,0))
            ItemList.add(ShopItem(Material.MUSHROOM_STEM,0))
            ItemList.add(ShopItem(Material.POPPY,0))
            ItemList.add(ShopItem(Material.DANDELION,0))
            ItemList.add(ShopItem(Material.BLUE_ORCHID,0))
            ItemList.add(ShopItem(Material.ALLIUM,0))
            ItemList.add(ShopItem(Material.AZURE_BLUET,0))
            ItemList.add(ShopItem(Material.RED_TULIP,0))
            ItemList.add(ShopItem(Material.ORANGE_TULIP,0))
            ItemList.add(ShopItem(Material.WHITE_TULIP,0))
            ItemList.add(ShopItem(Material.PINK_TULIP,0))
            ItemList.add(ShopItem(Material.OXEYE_DAISY,0))
            ItemList.add(ShopItem(Material.LILY_OF_THE_VALLEY,0))
            ItemList.add(ShopItem(Material.CORNFLOWER,0))
            ItemList.add(ShopItem(Material.WITHER_ROSE,0))
            ItemList.add(ShopItem(Material.SUNFLOWER,0))
            ItemList.add(ShopItem(Material.LILAC,0))
            ItemList.add(ShopItem(Material.ROSE_BUSH,0))
            ItemList.add(ShopItem(Material.PEONY,0))
            ItemList.add(ShopItem(Material.GRASS,0))
            ItemList.add(ShopItem(Material.TALL_GRASS,0))
            ItemList.add(ShopItem(Material.FERN,0))
            ItemList.add(ShopItem(Material.LARGE_FERN,0))
            ItemList.add(ShopItem(Material.DEAD_BUSH,0))
            ItemList.add(ShopItem(Material.VINE,0))
            ItemList.add(ShopItem(Material.SUGAR_CANE,0))
            ItemList.add(ShopItem(Material.CACTUS,0))
            ItemList.add(ShopItem(Material.BAMBOO,0))
            ItemList.add(ShopItem(Material.CHORUS_FLOWER,0))
            ItemList.add(ShopItem(Material.CHORUS_PLANT,0))
            ItemList.add(ShopItem(Material.CRIMSON_ROOTS,0))
            ItemList.add(ShopItem(Material.WARPED_ROOTS,0))
            ItemList.add(ShopItem(Material.WEEPING_VINES,0))
            ItemList.add(ShopItem(Material.TWISTING_VINES,0))
            ItemList.add(ShopItem(Material.NETHER_SPROUTS,0))
            ItemList.add(ShopItem(Material.LILY_PAD,0))
            ItemList.add(ShopItem(Material.SEAGRASS,0))
            ItemList.add(ShopItem(Material.KELP,0))
            ItemList.add(ShopItem(Material.SEA_PICKLE,0))
            ItemList.add(ShopItem(Material.PAINTING,0))
            ItemList.add(ShopItem(Material.ITEM_FRAME,0))
            ItemList.add(ShopItem(Material.ARMOR_STAND,0))
            ItemList.add(ShopItem(Material.END_CRYSTAL,0))
            ItemList.add(ShopItem(Material.CHEST,0))
            ItemList.add(ShopItem(Material.ENDER_CHEST,0))
            ItemList.add(ShopItem(Material.SHULKER_BOX,0))
            ItemList.add(ShopItem(Material.BARREL,0))
            ItemList.add(ShopItem(Material.CRAFTING_TABLE,0))
            ItemList.add(ShopItem(Material.FURNACE,0))
            ItemList.add(ShopItem(Material.SMOKER,0))
            ItemList.add(ShopItem(Material.BLAST_FURNACE,0))
            ItemList.add(ShopItem(Material.ANVIL,0))
            ItemList.add(ShopItem(Material.GRINDSTONE,0))
            ItemList.add(ShopItem(Material.LOOM,0))
            ItemList.add(ShopItem(Material.CARTOGRAPHY_TABLE,0))
            ItemList.add(ShopItem(Material.STONECUTTER,0))
            ItemList.add(ShopItem(Material.SMITHING_TABLE,0))
            ItemList.add(ShopItem(Material.ENCHANTING_TABLE,0))
            ItemList.add(ShopItem(Material.FLETCHING_TABLE,0))
            ItemList.add(ShopItem(Material.COMPOSTER,0))
            ItemList.add(ShopItem(Material.WHITE_BED,0))
            ItemList.add(ShopItem(Material.RESPAWN_ANCHOR,0))
            ItemList.add(ShopItem(Material.SCAFFOLDING,0))
            ItemList.add(ShopItem(Material.LODESTONE,0))
            ItemList.add(ShopItem(Material.BELL,0))
            ItemList.add(ShopItem(Material.HONEYCOMB_BLOCK,0))
            ItemList.add(ShopItem(Material.BEE_NEST,0))
            ItemList.add(ShopItem(Material.BEEHIVE,0))
            ItemList.add(ShopItem(Material.TORCH,0))
            ItemList.add(ShopItem(Material.SOUL_TORCH,0))
            ItemList.add(ShopItem(Material.LANTERN,0))
            ItemList.add(ShopItem(Material.SOUL_LANTERN,0))
            ItemList.add(ShopItem(Material.END_ROD,0))
            ItemList.add(ShopItem(Material.CAMPFIRE,0))
            ItemList.add(ShopItem(Material.SOUL_CAMPFIRE,0))
            ItemList.add(ShopItem(Material.OAK_FENCE,0))
            ItemList.add(ShopItem(Material.LADDER,0))
            ItemList.add(ShopItem(Material.OAK_SIGN,0))
            ItemList.add(ShopItem(Material.GLASS_PANE,0))
            ItemList.add(ShopItem(Material.IRON_BARS,0))
            ItemList.add(ShopItem(Material.CHAIN,0))
            ItemList.add(ShopItem(Material.FLOWER_POT,0))
            ItemList.add(ShopItem(Material.WHITE_BANNER,0))
            ItemList.add(ShopItem(Material.WHITE_CARPET,0))
            ItemList.add(ShopItem(Material.SKELETON_SKULL,0))
            ItemList.add(ShopItem(Material.ZOMBIE_HEAD,0))
            ItemList.add(ShopItem(Material.CREEPER_HEAD,0))
            ItemList.add(ShopItem(Material.WITHER_SKELETON_SKULL,0))
            ItemList.add(ShopItem(Material.DRAGON_HEAD,0))
            ItemList.add(ShopItem(Material.COBWEB,0))
            ///////////////////////////////////////////////
            //레드스톤
            ItemList.add(ShopItem(Material.REDSTONE,0))
            ItemList.add(ShopItem(Material.REDSTONE_BLOCK,0))
            ItemList.add(ShopItem(Material.REDSTONE_TORCH,0))
            ItemList.add(ShopItem(Material.REPEATER,0))
            ItemList.add(ShopItem(Material.COMPARATOR,0))
            ItemList.add(ShopItem(Material.OAK_BUTTON,0))
            ItemList.add(ShopItem(Material.STONE_BUTTON,0))
            ItemList.add(ShopItem(Material.LEVER,0))
            ItemList.add(ShopItem(Material.OAK_PRESSURE_PLATE,0))
            ItemList.add(ShopItem(Material.STONE_PRESSURE_PLATE,0))
            ItemList.add(ShopItem(Material.LIGHT_WEIGHTED_PRESSURE_PLATE,0))
            ItemList.add(ShopItem(Material.HEAVY_WEIGHTED_PRESSURE_PLATE,0))
            ItemList.add(ShopItem(Material.OAK_DOOR,0))
            ItemList.add(ShopItem(Material.OAK_TRAPDOOR,0))
            ItemList.add(ShopItem(Material.OAK_FENCE_GATE,0))
            ItemList.add(ShopItem(Material.TRIPWIRE_HOOK,0))
            ItemList.add(ShopItem(Material.DISPENSER,0))
            ItemList.add(ShopItem(Material.DROPPER,0))
            ItemList.add(ShopItem(Material.NOTE_BLOCK,0))
            ItemList.add(ShopItem(Material.REDSTONE_LAMP,0))
            ItemList.add(ShopItem(Material.PISTON,0))
            ItemList.add(ShopItem(Material.STICKY_PISTON,0))
            ItemList.add(ShopItem(Material.DAYLIGHT_DETECTOR,0))
            ItemList.add(ShopItem(Material.TRAPPED_CHEST,0))
            ItemList.add(ShopItem(Material.HOPPER,0))
            ItemList.add(ShopItem(Material.OBSERVER,0))
            ItemList.add(ShopItem(Material.LECTERN,0))
            ItemList.add(ShopItem(Material.TARGET,0))
            ItemList.add(ShopItem(Material.TNT,0))
            ItemList.add(ShopItem(Material.HONEY_BLOCK,0))
            ItemList.add(ShopItem(Material.SLIME_BLOCK,0))
            ////////////////////////////////////////////////
            //수송
            ItemList.add(ShopItem(Material.MINECART,0))
            ItemList.add(ShopItem(Material.CHEST_MINECART,0))
            ItemList.add(ShopItem(Material.FURNACE_MINECART,0))
            ItemList.add(ShopItem(Material.TNT_MINECART,0))
            ItemList.add(ShopItem(Material.HOPPER_MINECART,0))
            ItemList.add(ShopItem(Material.RAIL,0))
            ItemList.add(ShopItem(Material.POWERED_RAIL,0))
            ItemList.add(ShopItem(Material.DETECTOR_RAIL,0))
            ItemList.add(ShopItem(Material.ACTIVATOR_RAIL,0))
            ItemList.add(ShopItem(Material.OAK_BOAT,0))
            ItemList.add(ShopItem(Material.SADDLE,0))
            ItemList.add(ShopItem(Material.ELYTRA,0))
            ///////////////////////////////////////////
            //기타아이템
            ItemList.add(ShopItem(Material.LEATHER,0))
            ItemList.add(ShopItem(Material.FEATHER,0))
            ItemList.add(ShopItem(Material.NETHER_STAR,0))
            ItemList.add(ShopItem(Material.INK_SAC,0))
            ItemList.add(ShopItem(Material.BLAZE_ROD,0))
            ItemList.add(ShopItem(Material.BONE,0))
            ItemList.add(ShopItem(Material.BONE_MEAL,0))
            ItemList.add(ShopItem(Material.SHULKER_SHELL,0))
            ItemList.add(ShopItem(Material.SLIME_BALL,0))
            ItemList.add(ShopItem(Material.NAUTILUS_SHELL,0))
            ItemList.add(ShopItem(Material.ENDER_PEARL,0))
            ItemList.add(ShopItem(Material.RABBIT_HIDE,0))
            ItemList.add(ShopItem(Material.PRISMARINE_CRYSTALS,0))
            ItemList.add(ShopItem(Material.GUNPOWDER,0))
            ItemList.add(ShopItem(Material.COAL,0))
            ItemList.add(ShopItem(Material.CHARCOAL,0))
            ItemList.add(ShopItem(Material.IRON_INGOT,0))
            ItemList.add(ShopItem(Material.IRON_NUGGET,0))
            ItemList.add(ShopItem(Material.GOLD_INGOT,0))
            ItemList.add(ShopItem(Material.GOLD_NUGGET,0))
            ItemList.add(ShopItem(Material.DIAMOND,0))
            ItemList.add(ShopItem(Material.NETHERITE_SCRAP,0))
            ItemList.add(ShopItem(Material.LAPIS_LAZULI,0))
            ItemList.add(ShopItem(Material.EMERALD,0))
            ItemList.add(ShopItem(Material.NETHER_QUARTZ_ORE,0))
            ItemList.add(ShopItem(Material.WHITE_DYE,0))
            ItemList.add(ShopItem(Material.LIGHT_GRAY_DYE,0))
            ItemList.add(ShopItem(Material.GRAY_DYE,0))
            ItemList.add(ShopItem(Material.BLACK_DYE,0))
            ItemList.add(ShopItem(Material.RED_DYE,0))
            ItemList.add(ShopItem(Material.ORANGE_DYE,0))
            ItemList.add(ShopItem(Material.YELLOW_DYE,0))
            ItemList.add(ShopItem(Material.LIME_DYE,0))
            ItemList.add(ShopItem(Material.CYAN_DYE,0))
            ItemList.add(ShopItem(Material.LIGHT_BLUE_DYE,0))
            ItemList.add(ShopItem(Material.BLUE_DYE,0))
            ItemList.add(ShopItem(Material.PURPLE_DYE,0))
            ItemList.add(ShopItem(Material.MAGENTA_DYE,0))
            ItemList.add(ShopItem(Material.PINK_DYE,0))
            ItemList.add(ShopItem(Material.BROWN_DYE,0))
            ItemList.add(ShopItem(Material.MUSIC_DISC_11,0))
            ItemList.add(ShopItem(Material.MUSIC_DISC_13,0))
            ItemList.add(ShopItem(Material.MUSIC_DISC_BLOCKS,0))
            ItemList.add(ShopItem(Material.MUSIC_DISC_CAT,0))
            ItemList.add(ShopItem(Material.MUSIC_DISC_CHIRP,0))
            ItemList.add(ShopItem(Material.MUSIC_DISC_FAR,0))
            ItemList.add(ShopItem(Material.MUSIC_DISC_MALL,0))
            ItemList.add(ShopItem(Material.MUSIC_DISC_MELLOHI,0))
            ItemList.add(ShopItem(Material.MUSIC_DISC_PIGSTEP,0))
            ItemList.add(ShopItem(Material.MUSIC_DISC_STAL,0))
            ItemList.add(ShopItem(Material.MUSIC_DISC_STRAD,0))
            ItemList.add(ShopItem(Material.MUSIC_DISC_WAIT,0))
            ItemList.add(ShopItem(Material.MUSIC_DISC_WARD,0))
            ItemList.add(ShopItem(Material.BEACON,0))
            ItemList.add(ShopItem(Material.CONDUIT,0))
            ItemList.add(ShopItem(Material.STRING,0))
            ItemList.add(ShopItem(Material.TURTLE_EGG,0))
            ItemList.add(ShopItem(Material.BUCKET,0))
            ItemList.add(ShopItem(Material.WATER_BUCKET,0))
            ItemList.add(ShopItem(Material.LAVA_BUCKET,0))
            ItemList.add(ShopItem(Material.MILK_BUCKET,0))
            ItemList.add(ShopItem(Material.BOOK,0))
            ItemList.add(ShopItem(Material.WRITABLE_BOOK,0))
            ItemList.add(ShopItem(Material.WHEAT_SEEDS,0))
            ItemList.add(ShopItem(Material.BEETROOT_SEEDS,0))
            ItemList.add(ShopItem(Material.PUMPKIN_SEEDS,0))
            ItemList.add(ShopItem(Material.MELON_SEEDS,0))
            ItemList.add(ShopItem(Material.WHEAT,0))
            ItemList.add(ShopItem(Material.ENDER_EYE,0))
            ItemList.add(ShopItem(Material.HEART_OF_THE_SEA,0))
            ItemList.add(ShopItem(Material.EGG,0))
            ItemList.add(ShopItem(Material.SUGAR,0))
            ItemList.add(ShopItem(Material.GLOWSTONE_DUST,0))
            ItemList.add(ShopItem(Material.SCUTE,0))
            ItemList.add(ShopItem(Material.HONEYCOMB,0))
            ItemList.add(ShopItem(Material.FLINT,0))
            ItemList.add(ShopItem(Material.CLAY_BALL,0))
            ItemList.add(ShopItem(Material.BRICK,0))
            ItemList.add(ShopItem(Material.NETHER_BRICK,0))
            ItemList.add(ShopItem(Material.NETHER_WART,0))
            ItemList.add(ShopItem(Material.SNOWBALL,0))
            ItemList.add(ShopItem(Material.STICK,0))
            ItemList.add(ShopItem(Material.PAPER,0))
            ItemList.add(ShopItem(Material.FIRE_CHARGE,0))
            ItemList.add(ShopItem(Material.BOWL,0))
            ItemList.add(ShopItem(Material.CHORUS_FRUIT,0))
            ItemList.add(ShopItem(Material.POPPED_CHORUS_FRUIT,0))
            ItemList.add(ShopItem(Material.COCOA_BEANS,0))
            ItemList.add(ShopItem(Material.LEATHER_HORSE_ARMOR,0))
            ItemList.add(ShopItem(Material.IRON_HORSE_ARMOR,0))
            ItemList.add(ShopItem(Material.GOLDEN_HORSE_ARMOR,0))
            ItemList.add(ShopItem(Material.DIAMOND_HORSE_ARMOR,0))
            ItemList.add(ShopItem(Material.EXPERIENCE_BOTTLE,0))
            ////////////////////////////////////////////
            //식료품
            ItemList.add(ShopItem(Material.PORKCHOP,0))
            ItemList.add(ShopItem(Material.COOKED_PORKCHOP,0))
            ItemList.add(ShopItem(Material.BEEF,0))
            ItemList.add(ShopItem(Material.COOKED_BEEF,0))
            ItemList.add(ShopItem(Material.CHICKEN,0))
            ItemList.add(ShopItem(Material.COOKED_CHICKEN,0))
            ItemList.add(ShopItem(Material.MUTTON,0))
            ItemList.add(ShopItem(Material.COOKED_MUTTON,0))
            ItemList.add(ShopItem(Material.RABBIT,0))
            ItemList.add(ShopItem(Material.COOKED_RABBIT,0))
            ItemList.add(ShopItem(Material.COD,0))
            ItemList.add(ShopItem(Material.COOKED_COD,0))
            ItemList.add(ShopItem(Material.SALMON,0))
            ItemList.add(ShopItem(Material.COOKED_SALMON,0))
            ItemList.add(ShopItem(Material.TROPICAL_FISH,0))
            ItemList.add(ShopItem(Material.PUFFERFISH,0))
            ItemList.add(ShopItem(Material.DRIED_KELP,0))
            ItemList.add(ShopItem(Material.POTATO,0))
            ItemList.add(ShopItem(Material.BAKED_POTATO,0))
            ItemList.add(ShopItem(Material.POISONOUS_POTATO,0))
            ItemList.add(ShopItem(Material.CARROT,0))
            ItemList.add(ShopItem(Material.BEETROOT,0))
            ItemList.add(ShopItem(Material.MELON_SLICE,0))
            ItemList.add(ShopItem(Material.APPLE,0))
            ItemList.add(ShopItem(Material.SWEET_BERRIES,0))
            ItemList.add(ShopItem(Material.BREAD,0))
            ItemList.add(ShopItem(Material.COOKIE,0))
            ItemList.add(ShopItem(Material.PUMPKIN_PIE,0))
            ItemList.add(ShopItem(Material.CAKE,0))
            ItemList.add(ShopItem(Material.MUSHROOM_STEW,0))
            ItemList.add(ShopItem(Material.RABBIT_STEW,0))
            ItemList.add(ShopItem(Material.BEETROOT_SOUP,0))
            ItemList.add(ShopItem(Material.ROTTEN_FLESH,0))
            ItemList.add(ShopItem(Material.SPIDER_EYE,0))
            ItemList.add(ShopItem(Material.GOLDEN_APPLE,0))
            ItemList.add(ShopItem(Material.ENCHANTED_GOLDEN_APPLE,0))
            ItemList.add(ShopItem(Material.HONEY_BOTTLE,0))
            /////////////////////////////////////////
            //도구 및 전투
            ItemList.add(ShopItem(Material.WOODEN_AXE,0))
            ItemList.add(ShopItem(Material.STONE_AXE,0))
            ItemList.add(ShopItem(Material.IRON_AXE,0))
            ItemList.add(ShopItem(Material.GOLDEN_AXE,0))
            ItemList.add(ShopItem(Material.DIAMOND_AXE,0))
            ItemList.add(ShopItem(Material.NETHERITE_AXE,0))
            ItemList.add(ShopItem(Material.WOODEN_PICKAXE,0))
            ItemList.add(ShopItem(Material.STONE_PICKAXE,0))
            ItemList.add(ShopItem(Material.IRON_PICKAXE,0))
            ItemList.add(ShopItem(Material.GOLDEN_PICKAXE,0))
            ItemList.add(ShopItem(Material.DIAMOND_PICKAXE,0))
            ItemList.add(ShopItem(Material.NETHERITE_PICKAXE,0))
            ItemList.add(ShopItem(Material.WOODEN_SHOVEL,0))
            ItemList.add(ShopItem(Material.STONE_SHOVEL,0))
            ItemList.add(ShopItem(Material.IRON_SHOVEL,0))
            ItemList.add(ShopItem(Material.GOLDEN_SHOVEL,0))
            ItemList.add(ShopItem(Material.DIAMOND_SHOVEL,0))
            ItemList.add(ShopItem(Material.NETHERITE_SHOVEL,0))
            ItemList.add(ShopItem(Material.WOODEN_HOE,0))
            ItemList.add(ShopItem(Material.STONE_HOE,0))
            ItemList.add(ShopItem(Material.IRON_HOE,0))
            ItemList.add(ShopItem(Material.GOLDEN_HOE,0))
            ItemList.add(ShopItem(Material.DIAMOND_HOE,0))
            ItemList.add(ShopItem(Material.NETHERITE_HOE,0))
            ItemList.add(ShopItem(Material.SHEARS,0))
            ItemList.add(ShopItem(Material.FISHING_ROD,0))
            ItemList.add(ShopItem(Material.CARROT_ON_A_STICK,0))
            ItemList.add(ShopItem(Material.WARPED_FUNGUS_ON_A_STICK,0))
            ItemList.add(ShopItem(Material.COMPASS,0))
            ItemList.add(ShopItem(Material.CLOCK,0))
            ItemList.add(ShopItem(Material.FLINT_AND_STEEL,0))
            ItemList.add(ShopItem(Material.LEAD,0))
            ItemList.add(ShopItem(Material.NAME_TAG,0))
            ItemList.add(ShopItem(Material.WOODEN_SWORD,0))
            ItemList.add(ShopItem(Material.STONE_SWORD,0))
            ItemList.add(ShopItem(Material.IRON_SWORD,0))
            ItemList.add(ShopItem(Material.GOLDEN_SWORD,0))
            ItemList.add(ShopItem(Material.DIAMOND_SWORD,0))
            ItemList.add(ShopItem(Material.NETHERITE_SWORD,0))
            ItemList.add(ShopItem(Material.BOW,0))
            ItemList.add(ShopItem(Material.CROSSBOW,0))
            ItemList.add(ShopItem(Material.ARROW,0))
            ItemList.add(ShopItem(Material.SPECTRAL_ARROW,0))
            ItemList.add(ShopItem(Material.TRIDENT,0))
            ItemList.add(ShopItem(Material.LEATHER_HELMET,0))
            ItemList.add(ShopItem(Material.IRON_HELMET,0))
            ItemList.add(ShopItem(Material.CHAINMAIL_HELMET,0))
            ItemList.add(ShopItem(Material.GOLDEN_HELMET,0))
            ItemList.add(ShopItem(Material.DIAMOND_HELMET,0))
            ItemList.add(ShopItem(Material.NETHERITE_HELMET,0))
            ItemList.add(ShopItem(Material.LEATHER_CHESTPLATE,0))
            ItemList.add(ShopItem(Material.IRON_CHESTPLATE,0))
            ItemList.add(ShopItem(Material.CHAINMAIL_CHESTPLATE,0))
            ItemList.add(ShopItem(Material.GOLDEN_CHESTPLATE,0))
            ItemList.add(ShopItem(Material.DIAMOND_CHESTPLATE,0))
            ItemList.add(ShopItem(Material.NETHERITE_CHESTPLATE,0))
            ItemList.add(ShopItem(Material.LEATHER_LEGGINGS,0))
            ItemList.add(ShopItem(Material.IRON_LEGGINGS,0))
            ItemList.add(ShopItem(Material.CHAINMAIL_LEGGINGS,0))
            ItemList.add(ShopItem(Material.GOLDEN_LEGGINGS,0))
            ItemList.add(ShopItem(Material.DIAMOND_LEGGINGS,0))
            ItemList.add(ShopItem(Material.NETHERITE_LEGGINGS,0))
            ItemList.add(ShopItem(Material.LEATHER_BOOTS,0))
            ItemList.add(ShopItem(Material.IRON_BOOTS,0))
            ItemList.add(ShopItem(Material.CHAINMAIL_BOOTS,0))
            ItemList.add(ShopItem(Material.GOLDEN_BOOTS,0))
            ItemList.add(ShopItem(Material.DIAMOND_BOOTS,0))
            ItemList.add(ShopItem(Material.NETHERITE_BOOTS,0))
            ItemList.add(ShopItem(Material.SHIELD,0))
            ItemList.add(ShopItem(Material.TOTEM_OF_UNDYING,0))
            ///////////////////////////////////////////
            //양조
            ItemList.add(ShopItem(Material.BREWING_STAND,0))
            ItemList.add(ShopItem(Material.CAULDRON,0))
            ItemList.add(ShopItem(Material.GLASS_BOTTLE,0))
            ItemList.add(ShopItem(Material.BLAZE_POWDER,0))
            ItemList.add(ShopItem(Material.FERMENTED_SPIDER_EYE,0))
            ItemList.add(ShopItem(Material.GHAST_TEAR,0))
            ItemList.add(ShopItem(Material.MAGMA_CREAM,0))
            ItemList.add(ShopItem(Material.GLISTERING_MELON_SLICE,0))
            ItemList.add(ShopItem(Material.GOLDEN_CARROT,0))
            ItemList.add(ShopItem(Material.RABBIT_FOOT,0))
            ItemList.add(ShopItem(Material.PHANTOM_MEMBRANE,0))
            /////////////////////////////////////////////////////
        }
    }
}