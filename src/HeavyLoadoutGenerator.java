import java.util.concurrent.ThreadLocalRandom;
public class HeavyLoadoutGenerator {

    public HeavyLoadoutGenerator() {



    }
    //Loop satisfying variables
    private boolean loadoutOneloopSatisfied = false;
    private boolean loadoutTwoLoopSatisfied = false;
    private boolean loadoutThreeLoopSatisfied = false;
    //Equip region booleans
    private boolean hatEquipRegion = false;
    private boolean headSkinEquipRegion = false;
    private boolean pocketHeavyEquipRegion = false;
    private boolean beardEquipRegion = false;
    private boolean glassesEquipRegion = false;
    private boolean armsEquipRegion = false;
    private boolean hipHeavyEquipRegion = false;
    private boolean towelHeavyEquipRegion = false;
    private boolean shirtEquipRegion = false;
    private boolean armTattoosEquipRegion = false;
    private boolean sleevesEquipRegion = false;
    private boolean feetEquipRegion = false;
    private boolean hairHeavyEquipRegion = false;
    private boolean beltHeavyEquipRegion = false;
    private boolean bulletsHeavyEquipRegion = false;
    private boolean leftShoulderEquipRegion = false;
    private boolean pantsEquipRegion = false;
    private boolean hipPouchHeavyEquipRegion = false;
    private boolean beltEquipRegion = false;
    private boolean wholeHeadEquipRegion = false;
    private boolean coatSoldierEquipRegion = false;
    private boolean faceEquipRegion = false;
    private boolean medalEquipRegion = false;
    private boolean earbudsSpepcialEquipRegion = false;
    private boolean flairEquipRegion = false;
    private boolean necklaceEquipRegion = false;
    private boolean disconnectedFloatingItemEquipRegion = false;
    private boolean lensesEquipRegion = false;
    private boolean grenadesEquipRegion = false;
    private boolean pocketEngineerEquipRegion = false;
    //Paint slots
    private String loadoutOneCosmetic = null;
    private String loadoutTwoCosmetic = null;
    private String loadoutThreeCosmetic = null;
    private String loadoutOnePaintColour = null;
    private String loadoutTwoPaintColour = null;
    private String loadoutThreePaintColour = null;
    private String loadoutOneUnusualEffect = null;
    private String loadoutTwoUnusualEffect = null;
    private String loadoutThreeUnusualEffect = null;
    private void paintMethod(int loadoutSlot) {

        int paintChooser = ThreadLocalRandom.current().nextInt(0, 28);
        String[] paints = {

                " - A Color Similar to Slate", " - A Deep Commitment to Purple", " - A Distinctive Lack of Hue", " - A Mann's Mint",
                " - After Eight", " - Aged Moustache Grey", " - An Extraordinary Abundance of Tinge", " - Australium Gold",
                " - Color No. 216-190-216", " - Dark Salmon Injustice", " - Drably Olive", " - Indubitably Green",
                " - Mann Co. Orange", " - Muskelmannbraun", " - Noble Hatter's Violet", " - Peculiarly Drab Tincture",
                " - Pink as Hell", " - Radigan Conagher Brown", " - The Bitter Taste of Defeat and Lime", " - The Color of a Gentlemann's Business Pants",
                " - Ye Olde Rustic Colour", " - Zepheniah's Greed", " - An Air of Debonair", " - Balaclavas Are Forever",
                " - Cream Spirit", " - Operator's Overalls", " - The Value of Teamwork", " - Waterlogged Lab Coat"

        };
        switch (loadoutSlot) {

            case 1:

                if (Math.random() > 0.5) {

                    loadoutOnePaintColour = paints[paintChooser];

                }
                else {

                    loadoutOnePaintColour = "";

                }
                break;

            case 2:

                if (Math.random() > 0.5) {

                    loadoutTwoPaintColour = paints[paintChooser];

                }
                else {

                    loadoutTwoPaintColour = "";

                }
                break;

            case 3:

                if (Math.random() < 0.5) {

                    loadoutThreePaintColour = paints[paintChooser];

                }
                else {

                    loadoutThreePaintColour = "";

                }
                break;

            default:

                System.out.println("Error code 1");
                break;

        }

    }
    public void unusualMethod(String unusualSet, int loadoutSlot) {

        switch (unusualSet) {

            case "retired":

                String[] retiredEffects = {

                        " - Burning Flames", " - Circling Heart", " - Circling Peace Sign", " - Circling TF Logo",
                        " - Green Confetti", " - Green Energy", " - Haunted Ghostts", " - Massed Flies",
                        " - Purple Confetti", " - Purple Energy", " - Scorching Flames", " - Searing Plasma",
                        " - Sunbeams", " - Vivid Plasma", " - Blizzardy Storm", " - Bubbling",
                        " - Nuts n' Bolts", " - Orbiting Fire", " - Orbiting Planets", " - Smoking",
                        " - Steaming", " - Stormy Storm"

                };
                int retiredEffectChooser = ThreadLocalRandom.current().nextInt(0, 22);
                switch (loadoutSlot) {

                    case 1:

                        if (Math.random() > 0.5) {

                            loadoutOneUnusualEffect = retiredEffects[retiredEffectChooser];

                        }
                        else {

                            loadoutOneUnusualEffect = "";

                        }
                        break;

                    case 2:

                        if (Math.random() > 0.5) {

                            loadoutTwoUnusualEffect = retiredEffects[retiredEffectChooser];

                        }
                        else {

                            loadoutOneUnusualEffect = "";

                        }
                        break;

                    case 3:

                        if (Math.random() > 0.5) {

                            loadoutThreeUnusualEffect = retiredEffects[retiredEffectChooser];

                        }
                        else {

                            loadoutThreeUnusualEffect = "";

                        }
                        break;

                        default:

                            System.out.println("Error code 2");
                            break;

                }
                break;

            case "standard":

                String[] standardEffects = {

                        " - Burning Flames", " - Circling Heart", " - Circling Peace Sign", " - Circling TF Logo",
                        " - Green Confetti", " - Green Energy", " - Haunted Ghostts", " - Massed Flies",
                        " - Purple Confetti", " - Purple Energy", " - Scorching Flames", " - Searing Plasma",
                        " - Sunbeams", " - Vivid Plasma", " - Blizzardy Storm", " - Bubbling",
                        " - Nuts n' Bolts", " - Orbiting Fire", " - Orbiting Planets", " - Smoking",
                        " - Steaming", " - Stormy Storm", " - Aces High", " - Cloud Nine",
                        " - Dead Presidents", " - Disco Beat Down", " - Kill-a-Watt", " - Miam Nights",
                        " - Terror-Watt", " - Cauldron Bubbles", " - Cloudy Moon", " - Eerie Orbiting Fire",
                        " - Flaming Lantern", " - Harvest Moon", " - It's A Secret to Everybody", " - Knifestorm",
                        " - Misty Skull", " - Stormy 13th Hour", " - Arcanan", " - Chiroptera Venenata",
                        " - Darblaze", " - Demonflame", " - Hellfire", " - Poisoned Shadows",
                        " - Poisoned Shadows", " - Something Burning This Way Comes", " - Spellbound", " - Amaranthine",
                        " - Bonzo The All-Gnawing", " - Ghastly Ghosts Jr.", " - Haunted Phantasm Jr.", " - Stare From Beyond",
                        " - Ooze", " - Anti-Freeze", " - Electrostatic", " - Green Black Hole",
                        " - Memory Leak", " - Overclocked", " - Phosphorous", " - Power Surge",
                        " - Roboactive", " - Sulphurous", " - Time Warp", " - Death at Dusk",
                        " - Frostbite", " - Molten Mallard", " - Morning Glory"

                };
                int standardEffectChooser = ThreadLocalRandom.current().nextInt(0, 67);
                switch (loadoutSlot) {

                    case 1:

                        if (Math.random() > 0.5) {

                            loadoutOneUnusualEffect = standardEffects[standardEffectChooser];

                        }
                        else {

                            loadoutOneUnusualEffect = "";

                        }
                        break;

                    case 2:

                        if (Math.random() > 0.5) {

                            loadoutTwoUnusualEffect = standardEffects[standardEffectChooser];

                        }
                        else {

                            loadoutTwoUnusualEffect = "";

                        }
                        break;

                    case 3:

                        if (Math.random() > 0.5) {

                            loadoutThreeUnusualEffect = standardEffects[standardEffectChooser];

                        }
                        else {

                            loadoutThreeUnusualEffect = "";

                        }
                        break;

                        default:

                            System.out.println("Error code 3");
                            break;

                }
                break;

            case "invasion":

                String[] invasionEffects = {

                        " - Burning Flames", " - Circling Heart", " - Circling Peace Sign", " - Circling TF Logo",
                        " - Green Confetti", " - Green Energy", " - Haunted Ghostts", " - Massed Flies",
                        " - Purple Confetti", " - Purple Energy", " - Scorching Flames", " - Searing Plasma",
                        " - Sunbeams", " - Vivid Plasma", " - Blizzardy Storm", " - Bubbling",
                        " - Nuts n' Bolts", " - Orbiting Fire", " - Orbiting Planets", " - Smoking",
                        " - Steaming", " - Stormy Storm", " - Aces High", " - Cloud Nine",
                        " - Dead Presidents", " - Disco Beat Down", " - Kill-a-Watt", " - Miam Nights",
                        " - Terror-Watt", " - Cauldron Bubbles", " - Cloudy Moon", " - Eerie Orbiting Fire",
                        " - Flaming Lantern", " - Harvest Moon", " - It's A Secret to Everybody", " - Knifestorm",
                        " - Misty Skull", " - Stormy 13th Hour", " - Arcanan", " - Chiroptera Venenata",
                        " - Darblaze", " - Demonflame", " - Hellfire", " - Poisoned Shadows",
                        " - Poisoned Shadows", " - Something Burning This Way Comes", " - Spellbound", " - Amaranthine",
                        " - Bonzo The All-Gnawing", " - Ghastly Ghosts Jr.", " - Hauntted Phantasm Jr.", " - Stare From Beyond",
                        " - Ooze", " - Anti-Freeze", " - Electrostatic", " - Green Black Hole",
                        " - Memory Leak", " - Overclocked", " - Phosphorous", " - Power Surge",
                        " - Roboactive", " - Sulphurous", " - Time Warp", " - Death at Dusk",
                        " - Frostbite", " - Molten Mallard", " - Morning Glory", " - Abduction",
                        " - Atomic", " - Subatomic", " - Electric Hat Protector", " - Magnetic Hat Protector",
                        " - Voltaic Hat Protector", " - Galactic Codex", " - Ancient Codex", " - Nebula"

                };
                int invasionEffectChooser = ThreadLocalRandom.current().nextInt(0, 71);
                switch (loadoutSlot) {

                    case 1:

                        if (Math.random() > 0.5) {

                            loadoutOneUnusualEffect = invasionEffects[invasionEffectChooser];

                        }
                        else {

                            loadoutOneUnusualEffect = "";

                        }
                        break;

                    case 2:

                        if (Math.random() > 0.5) {

                            loadoutTwoUnusualEffect = invasionEffects[invasionEffectChooser];

                        }
                        else {

                            loadoutTwoUnusualEffect = "";

                        }
                        break;

                    case 3:

                        if (Math.random() > 0.5) {

                            loadoutThreeUnusualEffect = invasionEffects[invasionEffectChooser];

                        }
                        else {

                            loadoutThreeUnusualEffect = "";

                        }
                        break;

                    default:

                        System.out.println("Error code 4");
                        break;

                }
                break;

            case "sf2015":

                String[] sf2015Effects = {

                        " - Burning Flames", " - Circling Heart", " - Circling Peace Sign", " - Circling TF Logo",
                        " - Green Confetti", " - Green Energy", " - Haunted Ghostts", " - Massed Flies",
                        " - Purple Confetti", " - Purple Energy", " - Scorching Flames", " - Searing Plasma",
                        " - Sunbeams", " - Vivid Plasma", " - Blizzardy Storm", " - Bubbling",
                        " - Nuts n' Bolts", " - Orbiting Fire", " - Orbiting Planets", " - Smoking",
                        " - Steaming", " - Stormy Storm", " - Aces High", " - Cloud Nine",
                        " - Dead Presidents", " - Disco Beat Down", " - Kill-a-Watt", " - Miam Nights",
                        " - Terror-Watt", " - Cauldron Bubbles", " - Cloudy Moon", " - Eerie Orbiting Fire",
                        " - Flaming Lantern", " - Harvest Moon", " - It's A Secret to Everybody", " - Knifestorm",
                        " - Misty Skull", " - Stormy 13th Hour", " - Arcanan", " - Chiroptera Venenata",
                        " - Darblaze", " - Demonflame", " - Hellfire", " - Poisoned Shadows",
                        " - Poisoned Shadows", " - Something Burning This Way Comes", " - Spellbound", " - Amaranthine",
                        " - Bonzo The All-Gnawing", " - Ghastly Ghosts Jr.", " - Haunted Phantasm Jr.", " - Stare From Beyond",
                        " - Ooze", " - Anti-Freeze", " - Electrostatic", " - Green Black Hole",
                        " - Memory Leak", " - Overclocked", " - Phosphorous", " - Power Surge",
                        " - Roboactive", " - Sulphurous", " - Time Warp", " - Death at Dusk",
                        " - Frostbite", " - Molten Mallard", " - Morning Glory", " - Death by Disco",
                        " - It's a mystery to everyone", " - It's a puzzle to me", " - Ether Trail", " - Nether Trail",
                        " - Ancient Eldritch", " - Eldritch Flame"

                };
                //74 effects
                int sf2015EffectChooser = ThreadLocalRandom.current().nextInt(0, 74);
                switch (loadoutSlot) {

                    case 1:

                        if (Math.random() > 0.5) {

                            loadoutOneUnusualEffect = sf2015Effects[sf2015EffectChooser];

                        }
                        else {

                            loadoutOneUnusualEffect = "";

                        }
                        break;

                    case 2:

                        if (Math.random() > 0.5) {

                            loadoutTwoUnusualEffect = sf2015Effects[sf2015EffectChooser];

                        }
                        else {

                            loadoutTwoUnusualEffect = "";

                        }
                        break;

                    case 3:

                        if (Math.random() > 0.5) {

                            loadoutThreeUnusualEffect = sf2015Effects[sf2015EffectChooser];

                        }
                        else {

                            loadoutThreeUnusualEffect = "";

                        }
                        break;

                    default:

                        System.out.println("Error code 5");
                        break;

                }
                break;

            case "sf2016":

                String[] sf2016Effects = {

                        " - Burning Flames", " - Circling Heart", " - Circling Peace Sign", " - Circling TF Logo",
                        " - Green Confetti", " - Green Energy", " - Haunted Ghostts", " - Massed Flies",
                        " - Purple Confetti", " - Purple Energy", " - Scorching Flames", " - Searing Plasma",
                        " - Sunbeams", " - Vivid Plasma", " - Blizzardy Storm", " - Bubbling",
                        " - Nuts n' Bolts", " - Orbiting Fire", " - Orbiting Planets", " - Smoking",
                        " - Steaming", " - Stormy Storm", " - Aces High", " - Cloud Nine",
                        " - Dead Presidents", " - Disco Beat Down", " - Kill-a-Watt", " - Miam Nights",
                        " - Terror-Watt", " - Cauldron Bubbles", " - Cloudy Moon", " - Eerie Orbiting Fire",
                        " - Flaming Lantern", " - Harvest Moon", " - It's A Secret to Everybody", " - Knifestorm",
                        " - Misty Skull", " - Stormy 13th Hour", " - Arcanan", " - Chiroptera Venenata",
                        " - Darblaze", " - Demonflame", " - Hellfire", " - Poisoned Shadows",
                        " - Poisoned Shadows", " - Something Burning This Way Comes", " - Spellbound", " - Amaranthine",
                        " - Bonzo The All-Gnawing", " - Ghastly Ghosts Jr.", " - Haunted Phantasm Jr.", " - Stare From Beyond",
                        " - Ooze", " - Anti-Freeze", " - Electrostatic", " - Green Black Hole",
                        " - Memory Leak", " - Overclocked", " - Phosphorous", " - Power Surge",
                        " - Roboactive", " - Sulphurous", " - Time Warp", " - Death at Dusk",
                        " - Frostbite", " - Molten Mallard", " - Morning Glory", " - Neutron Star",
                        " - Starstorm Slumber", " - Starstorm Insomnia", " - Tesla Coil"

                };
                int sf2016EffectChooser = ThreadLocalRandom.current().nextInt(0, 74);
                switch (loadoutSlot) {

                    case 1:

                        if (Math.random() > 0.5) {

                            loadoutOneUnusualEffect = sf2016Effects[sf2016EffectChooser];

                        }
                        else {

                            loadoutOneUnusualEffect = "";

                        }
                        break;

                    case 2:

                        if (Math.random() > 0.5) {

                            loadoutTwoUnusualEffect = sf2016Effects[sf2016EffectChooser];

                        }
                        else {

                            loadoutTwoUnusualEffect = "";

                        }
                        break;

                    case 3:

                        if (Math.random() > 0.5) {

                            loadoutThreeUnusualEffect = sf2016Effects[sf2016EffectChooser];

                        }
                        else {

                            loadoutThreeUnusualEffect = "";

                        }
                        break;

                    default:

                        System.out.println("Error code 6");
                        break;

                }
                break;

        }

    }
    public void cosmeticMethod(int loadoutSlot) {

        switch (loadoutSlot) {

            case 1:

                while (!loadoutOneloopSatisfied) {

                    int cosmeticChooser = 0;
                    switch (cosmeticChooser) {

                        case 1:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("retired", 1);
                                loadoutOneCosmetic = "Football Helmet" + loadoutOnePaintColour + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 2:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Officer's Ushanka" + loadoutOnePaintColour + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 3:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Tough Guy's Toque" + loadoutOnePaintColour + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 4:

                            if (!hatEquipRegion && !glassesEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Hound Dog" + loadoutOnePaintColour + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                glassesEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 5:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Heavy Duty Rag" + loadoutOnePaintColour + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 6:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Pugilist's Protector" + loadoutOnePaintColour + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }

                        case 7:

                            if (!hatEquipRegion) {

                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Cadaver's Cranium" + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }

                        case 8:

                            if (!hatEquipRegion) {

                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Big Chief" + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 9:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Coup D'isaster" + loadoutOnePaintColour + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 10:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Magnificent Mongolian" + loadoutOnePaintColour + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 11:

                            if (!hatEquipRegion) {

                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Dread Knot" + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 12:

                            if (!hatEquipRegion) {

                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Team Captain" + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 13:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Capo's Capper" + loadoutOnePaintColour + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 14:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                if (Math.random() > 0.5) {

                                    loadoutOneCosmetic = "Copper's Hard Top (Peacekeeper)" + loadoutOnePaintColour + loadoutOneUnusualEffect;

                                }
                                else {

                                    loadoutOneCosmetic = "Copper's Hard Top (Lawless) " + loadoutOnePaintColour + loadoutOneUnusualEffect;

                                }
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 15:

                            if (!hatEquipRegion) {

                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Dragonborn Helmet" + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 16:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Gym Rat" + loadoutOnePaintColour + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 17:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                if (Math.random() > 0.5) {

                                    loadoutOneCosmetic = "One Man Army (Style 1)" + loadoutOnePaintColour + loadoutOneUnusualEffect;

                                }
                                else {

                                    loadoutOneCosmetic = "One Man Army (Style 2)" + loadoutOnePaintColour + loadoutOneUnusualEffect;

                                }
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 18:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Outdoorsman" + loadoutOnePaintColour + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 19:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                if (Math.random() > 0.5) {

                                    loadoutOneCosmetic = "Soviet Gentleman (Normal)" + loadoutOnePaintColour + loadoutOneUnusualEffect;

                                }
                                else {

                                    loadoutOneCosmetic = "Soviet Gentleman (Camo)" + loadoutOnePaintColour + loadoutOneUnusualEffect;

                                }
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 20:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Bunsen Brave" + loadoutOnePaintColour + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 21:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Gridiron Gaurdian" + loadoutOnePaintColour + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 22:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Tungsten Toque" + loadoutOnePaintColour + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 23:

                            if (!hatEquipRegion) {

                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Bear Necessities" + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 24:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Katyusha" + loadoutOnePaintColour + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 25:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Tsarboosh" + loadoutOnePaintColour + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 26:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Minnesota Slick" + loadoutOnePaintColour + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 27:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Bullet Buzz" + loadoutOnePaintColour + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 28:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                if (Math.random() > 0.5) {

                                    loadoutOneCosmetic = "Eliminator's Safegaurd (Visor Up)" + loadoutOnePaintColour + loadoutOneUnusualEffect;

                                }
                                else {

                                    loadoutOneCosmetic = "Eliminator's Safegaurd (Visor Down)" + loadoutOnePaintColour + loadoutOneUnusualEffect;

                                }
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 29:

                            if (!hatEquipRegion) {

                                paintMethod(1);
                                unusualMethod("standard", 1);
                                loadoutOneCosmetic = "Sammy Cap" + loadoutOnePaintColour + loadoutOneUnusualEffect;
                                hatEquipRegion = true;
                                loadoutOneloopSatisfied = true;
                                break;

                            }


                        case 30: {



                        }
                    }

                }

        }

    }
    public static void main(String args[]) {

        new HeavyLoadoutGenerator();

    }

}