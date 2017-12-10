import java.lang.Math;
import java.util.WeakHashMap;

public class HeavyLoadoutGenerator {

    //Variables for getting the while loops to end
    private boolean loadoutOneLoopSatisfied = false;
    private boolean loadoutTwoLoopSatisfied = false;
    private boolean loadoutThreeLoopSatisfied = false;
    //Equip regions
    private boolean hatEquipRegion = false;
    private boolean headSkinEquipRegion = false;
    private boolean pocketHeavyEquipRegion = false;
    private boolean beardEquipRegion = false;
    private boolean glassesEquipRegion = false;
    private boolean armsEquipRegion = false;
    private boolean hipHeavyEquipRegion = false;
    private boolean towelHeavyEquipRegion = false;
    private boolean shirtEquipRegion = false;
    private boolean armTattooEquipRegion = false;
    private boolean sleevesEquipRegion = false;
    private boolean feetEquipRegon = false;
    private boolean hairHeavyEquipRegion = false;
    private boolean beltHeavyEquipRegion = false;
    private boolean bulletsHeavyEquipRegion = false;
    private boolean leftShoulderEquipRegion = false;
    private boolean pantsEquipRegion = false;
    private boolean hipPouchEquipRegion = false;
    private boolean wholeHeadEquipRegion = false;
    private boolean coatSoldierEquipRegion = false;
    private boolean faceEquipRegion = false;
    private boolean medalEquipRegion = false;
    private boolean earbudsSpecialEquipRegion = false;
    private boolean lensesEquipRegion = false;
    private boolean flairEquipRegion = false;
    private boolean necklaceEquipRegion = false;
    private boolean disconnectedFloatingItemEquipRegion = false;
    private boolean beltEquipRegion = false;
    private boolean grenadesEquipRegion = false;
    private boolean pocketSniperEquipRegion = false;
    private boolean pocketEngineerEquipRegion = false;
    //Item logger variables
    private String loadoutOneCosmetic = "Something went wrong";
    private String loadoutOnePaintColor = "None";
    private String loadoutOneUnusualEffect = "None";
    private String loadoutTwoCosmetic = "Something went wrong";
    private String loadoutTwoPaintColor = "None";
    private String loadoutTwoUnusualEffect = "None";
    private String loadoutThreeCosmetic = "Something went wrong";
    private String loadoutThreePaintColor = "None";
    private String loadoutThreeUnusualEffect = "None";
    private String weapon = "Something went wrong";
    private String killstreak = "Something went wrong";
    //Class constructor
    private HeavyLoadoutGenerator() {

        //Loadout method calling
        this.loadoutMethod(1);
        this.loadoutMethod(2);
        this.loadoutMethod(3);
        //Item logging
        System.out.println("Loadout one cosmetic: " + loadoutOneCosmetic);
        System.out.println("    - Paint color: " + loadoutOnePaintColor);
        System.out.println("    - Unusual effect: " + loadoutOneUnusualEffect);
        System.out.println("Loadout two cosmetic: " + loadoutTwoCosmetic);
        System.out.println("    - Paint color: " + loadoutTwoPaintColor);
        System.out.println("    - Unusual effect: " + loadoutTwoUnusualEffect);
        System.out.println("Loadout three cosmetic: " + loadoutThreeCosmetic);
        System.out.println("    - Paint color: " + loadoutThreePaintColor);
        System.out.println("    - Unusual effect: " + loadoutThreeUnusualEffect);

    }
    //Main loadout method
    private void loadoutMethod(int loadoutNumber) {

        //Determining what loadout the method is being called for
        switch (loadoutNumber) {

            //Loadout 1
            case 1: {

                //Loadout Loop
                while (!loadoutOneLoopSatisfied) {

                    int loadoutRandomizer = (int) (Math.random() * 356 + 1);
                    switch (loadoutRandomizer) {

                        //Hat Region
                        //Football Helmet
                        case 1: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Football Helmet";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Officer's Ushanka
                        case 2: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Officer's Ushanka";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Tough Guy's Toque
                        case 3: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Tough Guy's Toque";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Hound Dog
                        case 4: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion && !glassesEquipRegion) {

                                loadoutOneCosmetic = "Hound Dog";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                glassesEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Heavy Duty Rag
                        case 5: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Heavy Duty Rag";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Hard Counter
                        case 6: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Hard Counter";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Pugilist's Protector
                        case 7: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Pugilist's Protector";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Cadaver's Cranium
                        case 8: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Cadaver's Cranium";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Big Chief
                        case 9: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Cadaver's Cranium";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Coupe D'isaster
                        case 10: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Coupe D'isaster";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Magnificent Mongolian
                        case 11: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Magnificent Mongolian";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Dread Knot
                        case 12: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Dread Knot";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Team Captain
                        case 13: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Team Captain";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Capo's Capper
                        case 14: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Capo's Capper";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Copper's Hard Top
                        case 15: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Copper's Hard Top";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Dragonborn Helmet
                        case 16: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion && !faceEquipRegion) {

                                loadoutOneCosmetic = "Dragonborn Helmet";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                faceEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Gym Rat
                        case 17: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Gym Rat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //One-Man Army
                        case 18: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "One-Man Army";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Outdoorsman
                        case 19: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Outdoorsman";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Soviet Gentleman
                        case 20: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Soviet Gentleman";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Bunsen Brave
                        case 21: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Bunsen Brave";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Gridiron Gaurdian
                        case 22: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Gridiron Gaurdian";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Tungsten Toque
                        case 23: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Tungsten Toque";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Bear Necessities
                        case 24: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Bear Necessities";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Katyusha
                        case 25: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Katyusha";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Tsarboosh
                        case 26: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Tsarboosh";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Minnesota Slick
                        case 27: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Minnesota Slick";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Bullet Buzz
                        case 28: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Bullet Buzz";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Eliminator's Safegaurd
                        case 29: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Eliminator's Safegaurd";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Sammy Cap
                        case 30: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Sammy Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Trash Man
                        case 31: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Trash Man";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Fur-Lined Fighter
                        case 32: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Fur-Lined Fighter";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Old Man Frost
                        case 33: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Old Man Frost";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Siberian Facehugger
                        case 34: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Siberian Facehugger";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //White Russian
                        case 35: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "White Russian";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Mo'Horn
                        case 36: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Mo'Horn";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                sf2016UnusualMethod(1);

                            }
                            break;

                        }
                        //Pestering Jester
                        case 37: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Pestering Jester";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                paintMethod(1);
                                sf2016UnusualMethod(1);

                            }
                            break;

                        }
                        //Warhood
                        case 38: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Warhood";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Aztec Aggresor
                        case 39: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Aztec Aggresor";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Commando Elite
                        case 40: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Commando Elite";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Fat Man's Field Cap
                        case 41: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Fat Man's Field Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Nuke
                        case 42: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Nuke";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Modest Pile of Hat
                        case 43: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Modest Pile of Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Noble Amassment of Hat
                        case 44: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Noble Amassment of Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Towering Pillar of Hat
                        case 45: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Towering Pillar of Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Dr's Dapper Topper
                        case 46: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Dr's Dapper Topper";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Horrific Headsplitter
                        case 47: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Horrific Headsplitter";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //A Rather Festive Hat
                        case 48: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "A Rather Festive Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Company Man
                        case 49: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Company Man";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Killer Exclusive
                        case 50: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Killer Exclusive";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Hot Dogger
                        case 51: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Hot Dogger";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Salty Dog
                        case 52: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Salty Dog";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Brown Bomber
                        case 53: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Brown Bomber";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Human Cannonball
                        case 54: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Human Cannonball";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Crone's Dome
                        case 55: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Crone's Dome";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Executioner
                        case 56: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Executioner";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Tough Stuff Muffs
                        case 57: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Tough Stuff Muffs";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Galvanized Gibus
                        case 58: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Galvanized Gibus";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Modest Metal Pile of Scrap
                        case 59: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Modest Metal Pile of Scrap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Noble NIckel Amassment of Hats
                        case 60: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Noble Nickel Amassment of Hats";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Towering Titanium Pillar of Hats
                        case 61: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Towering Titanium Pillar of Hats";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Bot Dogger
                        case 62: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Bot Dogger";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Brotherhood of Arms
                        case 63: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Brotherhood of Arms";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Well-Rounded Riflemam
                        case 64: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Well-Rounded Rifleman";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Federal Casemaker
                        case 65: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Federal Casemaker";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Cotton Head
                        case 66: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Cotton Head";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Hong Kong Cone
                        case 67: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Hong Kong Cone";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Kiss King
                        case 68: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Kiss King";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Neckwear Headwear
                        case 69: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Neckwear Headwear";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Law
                        case 70: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Law";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Dark Fallkirk Helm
                        case 71: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Dark Fallkirk Helm";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Merc's Mohawk
                        case 72: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Merc's Mohawk";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Tipped Lid
                        case 73: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Tipped Lid";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Vive La France
                        case 74: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion && !glassesEquipRegion) {

                                loadoutOneCosmetic = "Vive La France";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                glassesEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Crown of the Old Kingdom
                        case 75: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Crown of the Old Kingdom";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Boxcar Bomber
                        case 76: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Boxcar";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Coldsnap Cap
                        case 77: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Coldsnap Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Winter Woodsman
                        case 78: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Winter Woodsman";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Co-Pilot
                        case 79: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Co-Pilot";
                                hatEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Finder's Fee
                        case 80: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Finder's Fee";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Captain Cardbeard Cutthroat
                        case 81: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Captrain Cardbeard Cutthroat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Rotation Sensation
                        case 82: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Rotation Sensation";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Potassium Bonnet
                        case 83: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Potassium Bonnet";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Phononaut
                        case 84: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Phononaut";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                invasionUnusualMethod(1);

                            }
                            break;

                        }
                        //Universal Translator
                        case 85: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Universal Translator";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                invasionUnusualMethod(1);

                            }
                            break;

                        }
                        //Duck Billed Hatypus
                        case 86: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Duck Billed Hatypus";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                sf2015UnusualMethod(1);

                            }
                            break;

                        }
                        //Prehistoric Pullover
                        case 87: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Prehistoric Pullover";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                sf2015UnusualMethod(1);

                            }
                            break;

                        }
                        //A Well Wrapped Hat
                        case 88: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "A Well Wrapped Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Chill Chullo
                        case 89: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Chill Chullo";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Patriot Peak
                        case 90: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Patriot Peak";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Class Crown
                        case 91: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Class Crown";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                sf2016UnusualMethod(1);

                            }
                            break;

                        }
                        //Lil' Bitey
                        case 92: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Lil' Bitey";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                sf2016UnusualMethod(1);

                            }
                            break;

                        }
                        //Nasty Norsemann
                        case 93: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Nasty Norsemann";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                sf2016UnusualMethod(1);

                            }
                            break;

                        }
                        //Toadstool Topper
                        case 94: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Toadstool Topper";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                sf2016UnusualMethod(1);

                            }
                            break;

                        }
                        //Woolen Warmer
                        case 95: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Woolen Warmer";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Legendary Lid
                        case 96: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Legendary Lid";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Hunter in Darkness
                        case 97: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Hunter in Darkness";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Pithy Professional
                        case 98: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Pithy Professional";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Dealer's Visor
                        case 99: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Dealer's Visor";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Pilotka
                        case 100: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Pilotka";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //War Head
                        case 101: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "War Head";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //U-clanka-a
                        case 102: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "U-clanka-a";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Crafty Hair
                        case 103: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Crafty Hair";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Heavy Artillery Officer's Cap
                        case 104: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Heavy Artillery Officer's Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //K-9 Mane
                        case 105: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "K-9 Mane";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Brock's Locks
                        case 106: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Brock's Locks";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Pounding Father
                        case 107: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Pounding Father";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Wilson Weave
                        case 108: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Wilson Weave";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Der Maschinensoldaten-Helm
                        case 109: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Der Maschinensoldaten-Helm";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Sucker SLug
                        case 110: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Sucker Slug";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //War Eagle
                        case 111: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "War Eagle";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Ghastly Gibus
                        case 112: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Ghastly Gibus";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Bill's Hat
                        case 113: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Bill's Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Alien Swarm Parasite
                        case 114: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Alien Swarm Parasite";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Wiki Cap
                        case 115: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Wiki Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Ellis' Cap
                        case 116: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Ellis' Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Mann Co. Cap
                        case 117: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Mann Co. Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Ghastlier Gibus
                        case 118: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Ghastlier Gibus";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Spine-Chilling Skull
                        case 119: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Spine-Chilling Skull";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Voodoo Juju
                        case 120: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Voodoo Juju";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Bounty Hat
                        case 121: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Bounty Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Treasure Hat
                        case 122: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Treasure Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Hat of Undeniable Wealth and Respect
                        case 123: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Hat of Undeniable Wealth and Respect";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //World Travelers Hat
                        case 124: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "World Travelers Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Atheletic Supporter
                        case 125: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Atheletic Supporter";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Humanitarian's Hachimaki
                        case 126: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Humanitarian's Hachimaki";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Benefactor's Kanmuri
                        case 127: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Benefactor's Kanmuri";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Magnanimous Monarch
                        case 128: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Magnanimous Monarch";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Aperture Labs Hard Hat
                        case 129: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Aperture Labs Hard Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Frontline Field Recorder
                        case 130: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Frontline Field Recorder";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Lo-Fi Longwave
                        case 131: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Lo-Fi Longwave";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Spiral Sallet
                        case 132: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Spiral Sallet";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                faceEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;



                        }
                        //Proof of Purchase
                        case 133: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Proof of Purchase";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Summer Hat
                        case 134: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Summer Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Party Hat
                        case 135: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Party Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Manniversary Paper hat
                        case 136: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Manniversary Paper Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Ghastlierest Gibus
                        case 137: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Ghastlierest Gibus";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //B.M.O.C
                        case 138: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "B.M.O.C";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Ebenezer
                        case 139: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Ebenezer";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Full Head Of Steam
                        case 140: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Full Head of Steam";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Holiday Headcase
                        case 141: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion && !necklaceEquipRegion && !beardEquipRegion) {

                                loadoutOneCosmetic = "Holiday Headcase";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                necklaceEquipRegion = true;
                                beardEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Warsworn Helmet
                        case 142: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Warsworn Helmet";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Dueler
                        case 143: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Dueler";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Gifting Man From Gifting Land
                        case 144: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Gifting Man From Gifting Land";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Philater
                        case 145: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Philater";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Bolt Action Blitzer
                        case 146: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Bolt Action Blitzer";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Gentle Munitionne of Leisure
                        case 147: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Gentle Munitionne of Leisure";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Robot Chicken Hat
                        case 148: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Robot Chicken Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Ghostly Gibus
                        case 149: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Ghostly Gibus";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Skull Island Topper
                        case 150: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Skull Island Topper";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //That '70s Chapeau
                        case 151: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "That '70s Chapeau";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Cockfighter
                        case 152: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Cockfighter";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Mann Co. Online Cap
                        case 153: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Mann Co. Online Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Brutal Bouffant
                        case 154: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Brutal Bouffant";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Conspiracy Cap
                        case 155: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Conspiracy Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Public Agressor
                        case 156: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Public Agressor";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Hardy Laurel
                        case 157: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Hardy Laurel";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Grandmaster
                        case 158: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Grandmaster";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Towering Pillar of Summer Shades
                        case 159: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Towering Pillar of Shades";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Horace
                        case 160: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Horace";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //MK 50
                        case 161: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "MK 50";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Dadliest Catch
                        case 162: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Dadliest Catch";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Bedouin Bandanna
                        case 163: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Bedouin Bandanna";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Prinny Hat
                        case 164: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Prinny Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Civilian JACK Hat
                        case 165: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Civilian JACK Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Military Grade JACK Hat
                        case 166: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Military Grade JACK Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Head Prize
                        case 167: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Head Prize";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Snowmann
                        case 168: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Snowmann";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Audio File
                        case 169: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Audio File";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Aztec Warrior
                        case 170: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Aztec Warrior";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Jungle Wreath
                        case 171: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Jungle Wreath";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Monstrous Memento
                        case 172: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Monstrous Memento";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Saxton
                        case 173: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Saxton";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Point and Shoot
                        case 174: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Point and Shoot";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Head Skin Region
                        //Large Luchadore
                        case 175: {

                            if (!headSkinEquipRegion) {

                                loadoutOneCosmetic = "Large Luchadore";
                                headSkinEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Polar Pullover
                        case 176: {

                            if (!headSkinEquipRegion) {

                                loadoutOneCosmetic = "Polar Pullover";
                                headSkinEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Cold War Luchadore
                        case 177: {

                            if (!headSkinEquipRegion) {

                                loadoutOneCosmetic = "Cold War Luchadore";
                                headSkinEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Arkham Cowl
                        case 178: {

                            if (!headSkinEquipRegion) {

                                loadoutOneCosmetic = "Arkham Cowl";
                                headSkinEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Pocket (Heavy) Region
                        //Pocket Medic
                        case 179: {

                            if (!pocketHeavyEquipRegion) {

                                loadoutOneCosmetic = "Pocket Medic";
                                pocketHeavyEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Beard Region
                        //Big Steel Jaw of Summer Fun
                        case 180: {

                            if (!beardEquipRegion) {

                                loadoutOneCosmetic = "Big Steel Jaw of Summer Fun";
                                beardEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //All-Father
                        case 181: {

                            if (!beardEquipRegion) {

                                loadoutOneCosmetic = "All-Father";
                                beardEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Mutton Mann
                        case 182: {

                            if (!beardEquipRegion) {

                                loadoutOneCosmetic = "Mutton Mann";
                                beardEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Cuban Bristle Crisis
                        case 183: {

                            if (!beardEquipRegion) {

                                loadoutOneCosmetic = "Cuban Bristle Crisis";
                                beardEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Viking Braider
                        case 184: {

                            if (!beardEquipRegion) {

                                loadoutOneCosmetic = "Viking Braider";
                                beardEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Leftover Trap
                        case 185: {

                            if (!beardEquipRegion) {

                                loadoutOneCosmetic = "Leftover Trap";
                                beardEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Yuri's Revenge
                        case 186: {

                            if (!beardEquipRegion) {

                                loadoutOneCosmetic = "Yuri's Revenge";
                                beardEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Unshaved Bear
                        case 187: {

                            if (!beardEquipRegion) {

                                loadoutOneCosmetic = "Unshaved Bear";
                                beardEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //El Duderino
                        case 188: {

                            if (!beardEquipRegion) {

                                loadoutOneCosmetic = "El Duderino";
                                beardEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Dictator
                        case 189: {

                            if (!beardEquipRegion) {

                                loadoutOneCosmetic = "Dictator";
                                beardEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Bruiser's Bandanna
                        case 190: {

                            if (!beardEquipRegion) {

                                loadoutOneCosmetic = "Bruiser's Bandanna";
                                beardEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Glasses Region
                        //Virtual Viewfinder
                        case 191: {

                            if (!glassesEquipRegion && !faceEquipRegion && lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Virtual Viewfinder";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);
                                standardUnusualMethod(1);

                            }
                            break;

                        }
                        //Security Shades
                        case 192: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Security Shades";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Gabe Glasses
                        case 193: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Gabe Glasses";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;

                            }
                            break;

                        }
                        //Macho Mann
                        case 194: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Macho Mann";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //War Goggles
                        case 195: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion &&!wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "War Goggles";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Reader's Choice
                        case 196: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Reader's Choice";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Professor Speks
                        case 197: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Professor Speks";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Summer Shades
                        case 198: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion &&!wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Summer Shades";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Pyrovision Goggles
                        case 199: {

                            if (!glassesEquipRegion && !wholeHeadEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Pyrovision Goggles";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;


                        }
                        //Marxman
                        case 200: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Marxman";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //TF2VRH
                        case 201: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "TF2VRH";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Graybanns
                        case 202: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Graybanns";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Tomb Readers
                        case 203: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Tomb Readers";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Spooktacles
                        case 204: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Spooktacles";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Arms Region
                        //Purity Fist
                        case 205: {

                            if (!armsEquipRegion) {

                                loadoutOneCosmetic = "Purity Fist";
                                armsEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Hip (Heavy)
                        //Sandvich Safe
                        case 206: {

                            if (!hipHeavyEquipRegion) {

                                loadoutOneCosmetic = "Sandvich Safe";
                                hipHeavyEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Heavy-Weight Champ
                        case 207: {

                            if (!hipHeavyEquipRegion) {

                                loadoutOneCosmetic = "Heavy-Weight Champ";
                                hipHeavyEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Combat Slacks
                        case 208: {

                            if (!hipHeavyEquipRegion) {

                                loadoutOneCosmetic = "Combat Slacks";
                                hipHeavyEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Towel (Heavy)
                        //Toss-Proof Towel
                        case 209: {

                            if (!towelHeavyEquipRegion) {

                                loadoutOneCosmetic = "Toss-Proof Towel";
                                towelHeavyEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Titanium Towel
                        case 210: {

                            if (!towelHeavyEquipRegion) {

                                loadoutOneCosmetic = "Titanium Towel";
                                towelHeavyEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Heavy Harness
                        case 211: {

                            if (!towelHeavyEquipRegion) {

                                loadoutOneCosmetic = "Heavy Harness";
                                towelHeavyEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Shirt Equip Region
                        //Apparatchiks Apparel
                        case 212: {

                            if (!shirtEquipRegion && !armTattooEquipRegion) {

                                loadoutOneCosmetic = "Apparatchiks Apparel";
                                shirtEquipRegion = true;
                                armTattooEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Triad Trinket
                        case 213: {

                            if (!shirtEquipRegion) {

                                loadoutOneCosmetic = "Triad Trinket";
                                shirtEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Siberian Sophisticate
                        case 214: {

                            if (!shirtEquipRegion) {

                                loadoutOneCosmetic = "Siberian Sophisticate";
                                shirtEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Hunger Force
                        case 215: {

                            if (!shirtEquipRegion && !necklaceEquipRegion) {

                                loadoutOneCosmetic = "Hunger Force";
                                shirtEquipRegion = true;
                                necklaceEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Tyurtlenek
                        case 216: {

                            if (!shirtEquipRegion) {

                                loadoutOneCosmetic = "Tyurtlenek";
                                shirtEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Bolshevik Biker
                        case 217: {

                            if (!shirtEquipRegion) {

                                loadoutOneCosmetic = "Bolshevik Biker";
                                shirtEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Weight Room Warmer
                        case 218: {

                            if (!shirtEquipRegion) {

                                loadoutOneCosmetic = "Weight Room Warmer";
                                shirtEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Heavy Lifter
                        case 219: {

                            if (!shirtEquipRegion) {

                                loadoutOneCosmetic = "Heavy Lifter";
                                shirtEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Warmth Preserver
                        case 220: {

                            if (!shirtEquipRegion) {

                                loadoutOneCosmetic = "Warmth Preserver";
                                shirtEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Hunter Heavy
                        case 221: {

                            if (!shirtEquipRegion) {

                                loadoutOneCosmetic = "Hunter Heavy";
                                shirtEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Sleeveless in Siberia
                        case 222: {

                            if (!shirtEquipRegion) {

                                loadoutOneCosmetic = "Sleeveless in Siberia";
                                shirtEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Snow Sleeves
                        case 223: {

                            if (!shirtEquipRegion) {

                                loadoutOneCosmetic = "Snow Sleeves";
                                shirtEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Commisar's Coat
                        case 224: {

                            if (!shirtEquipRegion) {

                                loadoutOneCosmetic = "Commisar's Coat";
                                shirtEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Siberian Sweater
                        case 225: {

                            if (!shirtEquipRegion) {

                                loadoutOneCosmetic = "Siberian Sweater";
                                shirtEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Heavy Tourism
                        case 226: {

                            if (!shirtEquipRegion) {

                                loadoutOneCosmetic = "Heavy Tourism";
                                shirtEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Airborne Attire
                        case 227: {

                            if (!shirtEquipRegion) {

                                loadoutOneCosmetic = "Airborne Attire";
                                shirtEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Siberian Tigerstripe
                        case 228: {

                            if (!shirtEquipRegion) {

                                loadoutOneCosmetic = "Siberian Tigerstripe";
                                shirtEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Tuxxy
                        case 229: {

                            if (!shirtEquipRegion) {

                                loadoutOneCosmetic = "Tuxxy";
                                shirtEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Dead of Night
                        case 230: {

                            if (!shirtEquipRegion) {

                                loadoutOneCosmetic = "Dead of Night";
                                shirtEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Arm Tattoos Region
                        //Champ Stamp
                        case 231: {

                            if (!armTattooEquipRegion) {

                                loadoutOneCosmetic = "Champ Stamp";
                                armTattooEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Sleeves Region
                        //Spooky Sleeves
                        case 232: {

                            if (!sleevesEquipRegion) {

                                loadoutOneCosmetic = "Spooky Sleeves";
                                sleevesEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Batter's Bracers
                        case 233: {

                            if (!sleevesEquipRegion) {

                                loadoutOneCosmetic = "Batter's Bracers";
                                sleevesEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Feet Region
                        //Aqua Flops
                        case 234: {

                            if (!feetEquipRegon) {

                                loadoutOneCosmetic = "Aqua Flops";
                                feetEquipRegon = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Rat Stompers
                        case 235: {

                            if (!feetEquipRegon) {

                                loadoutOneCosmetic = "Rat Stompers";
                                feetEquipRegon = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Flashdance Footies
                        case 236: {

                            if (!feetEquipRegon) {

                                loadoutOneCosmetic = "Flashdance Footies";
                                feetEquipRegon = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }

                            break;

                        }
                        //Hair (Heavy) Region
                        //Carl
                        case 237: {

                            if (!hairHeavyEquipRegion) {

                                loadoutOneCosmetic = "Carl";
                                hairHeavyEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Heavy's Hockey Hair
                        case 238: {

                            if (!hairHeavyEquipRegion) {

                                loadoutOneCosmetic = "Heavy's Hockey Hair";
                                hairHeavyEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Belt (Heavy) Region
                        //Samson Skewer
                        case 240: {

                            if (!beltHeavyEquipRegion) {

                                loadoutOneCosmetic = "Samson Skewer";
                                beltHeavyEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Fortune Hunteer
                        case 241: {

                            if (!beltHeavyEquipRegion) {

                                loadoutOneCosmetic = "Fortune Hunter";
                                beltHeavyEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Prinny Pouch
                        case 242: {

                            if (!beltHeavyEquipRegion) {

                                loadoutOneCosmetic = "Prinny Pouch";
                                beltHeavyEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Bullets (Heavy) Region
                        //Borscht Belt
                        case 243: {

                            if (!bulletsHeavyEquipRegion) {

                                loadoutOneCosmetic = "Borscht Belt";
                                bulletsHeavyEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Left Shoulder Region
                        //Red Army Robin
                        case 244: {

                            if (!leftShoulderEquipRegion) {

                                loadoutOneCosmetic = "Red Army Robin";
                                leftShoulderEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Grim Tweeter
                        case 245: {

                            if (!leftShoulderEquipRegion) {

                                loadoutOneCosmetic = "Grim Tweeter";
                                leftShoulderEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Croaking Hazard
                        case 246: {

                            if (!leftShoulderEquipRegion) {

                                loadoutOneCosmetic = "Croaking Hazard";
                                leftShoulderEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Quizzical Quetzal
                        case 247: {

                            if (!leftShoulderEquipRegion) {

                                loadoutOneCosmetic = "Quizzical Quetzal";
                                leftShoulderEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Pants Region
                        //Mann of the House
                        case 248: {

                            if (!pantsEquipRegion) {

                                loadoutOneCosmetic = "Mann of the House";
                                pantsEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Gone Commando
                        case 249: {

                            if (!pantsEquipRegion) {

                                loadoutOneCosmetic = "Gone Commando";
                                pantsEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Jungle Booty
                        case 250: {

                            if (!pantsEquipRegion) {

                                loadoutOneCosmetic = "Jungle Booty";
                                pantsEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Breakneck Baggies
                        case 251: {

                            if (!pantsEquipRegion) {

                                loadoutOneCosmetic = "Breakneck Baggies";
                                pantsEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Hip Pouch (Heavy)
                        //Little Bear
                        case 252: {

                            if (!hipPouchEquipRegion) {

                                loadoutOneCosmetic = "Little Bear";
                                hipPouchEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //None
                        //Antlers
                        case 253: {

                            loadoutOneCosmetic =  "Antlers";
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Die Regime-Panzerung
                        case 254: {

                            loadoutOneCosmetic = "Die Regime-Panzerung";
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Himalayan Hair Shirt
                        case 255: {

                            loadoutOneCosmetic = "Himalayan Hair Shirt";
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Abominable Snow Pants
                        case 256: {

                            loadoutOneCosmetic = "Abominable Snow Pants";
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Cheater's Lament
                        case 257: {

                            loadoutOneCosmetic = "Cheater's Lament";
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Max's Severed Head
                        case 258: {

                            loadoutOneCosmetic = "Max's Severed Head";
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Something Special For Someone Special
                        case 259: {

                            loadoutOneCosmetic = "Something Special For Someone Special";
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Barely-Melted Capacitor
                        case 260: {

                            loadoutOneCosmetic = "Barely-Melted Capacitor";
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Tux
                        case 261: {

                            loadoutOneCosmetic = "Tux";
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Glitched Circuit Board
                        case 262: {

                            loadoutOneCosmetic = "Glitched Circuit Board";
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Mustachioed Mann
                        case 263: {

                            loadoutOneCosmetic = "Mustachioed Mann:";
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Brimstone
                        case 264: {

                            loadoutOneCosmetic = "Brimstone";
                            loadoutOneLoopSatisfied = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Batbelt
                        case 265: {

                            loadoutOneCosmetic = "Batbelt";
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Whole Head Region
                        //Teufort Knight
                        case 266: {

                            if (!wholeHeadEquipRegion && !hatEquipRegion && !faceEquipRegion && !glassesEquipRegion) {

                                loadoutOneCosmetic = "Teufort Knight";
                                wholeHeadEquipRegion = true;
                                hatEquipRegion = true;
                                faceEquipRegion = true;
                                glassesEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Kathman - Hairdo
                        case 267: {

                            if (!wholeHeadEquipRegion && !hatEquipRegion && !faceEquipRegion && !glassesEquipRegion) {

                                loadoutOneCosmetic = "Kathman-Hairdo";
                                wholeHeadEquipRegion = true;
                                hatEquipRegion = true;
                                faceEquipRegion = true;
                                glassesEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Saxton Hale Mask
                        case 268: {

                            if (!wholeHeadEquipRegion && !hatEquipRegion && !faceEquipRegion && !glassesEquipRegion) {

                                loadoutOneCosmetic = "Saxton Hale Mask";
                                wholeHeadEquipRegion = true;
                                hatEquipRegion = true;
                                faceEquipRegion = true;
                                glassesEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Coat (Soldier) Region
                        //Gift Bringer
                        case 269: {

                            if (!coatSoldierEquipRegion) {

                                loadoutOneCosmetic = "Gift Bringer";
                                coatSoldierEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Face Region
                        //Captain Space Mann
                        case 270: {

                            if (!faceEquipRegion && !glassesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Captain Space Mann";
                                faceEquipRegion = true;
                                glassesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                invasionUnusualMethod(1);

                            }
                            break;

                        }
                        //Mad Mask
                        case 271: {

                            if (!faceEquipRegion && !glassesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutOneCosmetic = "Mad Mask";
                                faceEquipRegion = true;
                                glassesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Medal Region
                        //Mercenary
                        case 272: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Mercenary";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Soldier of Fortune
                        case 273: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Soldier of Fortune";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Grizzled Veteran
                        case 274: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Grizzled Veteran";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Primeval Warrior
                        case 275: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Primeval Warrior";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Bronze Dueling Badge
                        case 276: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Bronze Dueling Badge";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Silver Dueling Badge
                        case 277: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Silver Dueling Badge";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Gold Dueling Badge
                        case 278: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Gold Dueling Badge";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Platinum Dueling Badge
                        case 279: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Platinum Dueling Badge";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Polycount Pin
                        case 280: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Polycount Pin";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Companion Cube Pin
                        case 281: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Companion Cube Pin";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //License to Maim
                        case 282: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "License to Maim";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Resurrection Associate Pin
                        case 283: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Resurrection Associate Pin";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //SpaceChem Pin
                        case 284: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "SpaceChem Pin";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Dr. Grordbort's Crest
                        case 285: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Dr. Grordbort's Crest";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Clan Pride
                        case 286: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Clan Pride";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Photo Badge
                        case 287: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Photo Badge";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Bombinomicon
                        case 288: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Bombinomicon";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Mark of the Saint
                        case 289: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Mark of the Saint";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Dr. Grordbort's Copper Crest
                        case 290: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Dr. Grordbort's Copper Crest";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Dr. Grordbort's Silver Crest
                        case 291: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Dr. Grordbort's Silver Crest";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Spirit of Giving
                        case 292: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Spirit of Giving";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Map Maker's Medallion
                        case 293: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Map Maker's Medallion";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Merc Medal
                        case 294: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Merc Medal";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Atomic Accolade
                        case 295: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Atomic Accolade";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Awesomenauts Badge
                        case 296: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Awesomenauts Badge";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Operation Oil Spill Badge
                        case 298: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Operation Oil Spill Badge";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Operation Steel Trap Badge
                        case 299: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Operation Steel Trap Badge";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Operation Gear Grinder Badge
                        case 300: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Operation Gear Grinder Badge";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Vigilant Pin
                        case 301: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Vigilant Pin";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Friends Forever Companion Square Badge
                        case 302: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Friends  Forever Companion Square Badge";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Heroic Companion Badge
                        case 303: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Heroic Companion Badge";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Triple A Badge
                        case 304: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Triple A Badge";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Whale Bone Charm
                        case 305: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Whale Bone Charm";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Hitt Mann Badge
                        case 306: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Hitt Mann Badge";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Faerie Solitare Pin
                        case 307: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Faerie Solitare Pin";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Saxxy Clapper Badge
                        case 308: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Saxxy Clapper Badge";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Operation Mecha Engine
                        case 309: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Operation Mecha Engine";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Smissmas WWreath
                        case 310: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Smissmas Wreath";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Crot's Crest
                        case 311: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Croft's Crest";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Electric Badge-aloo
                        case 312: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Electric Badge-aloo";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Operation Two Cities Badge
                        case 313: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Operation Two Cities Badge";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Heart of Gold
                        case 314: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Heart of Gold";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Baronial Badge
                        case 315: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Baronial Badge";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Thought That Counts
                        case 316: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Thought That Counts";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //End of the Line Community Medal
                        case 317: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "End of the Line Community Medal";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Invasion Community Medal
                        case 318: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Invasion Community Medal";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Honeydew's Charitable Countenance
                        case 319: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Honeydews Charitable COuntenance";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Xephos' Philantrophic Physiognomy
                        case 320: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Xephos' Philantrophic Physiognomy";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Gift of Giving
                        case 321: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Gift of Giving";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Special Snowflake
                        case 322: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Special Snowflake";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;


                        }
                        //PASS Time Early Participation Medal
                        case 323: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "PASS Time Early Participation Medal";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Altruist's Adornment
                        case 324: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Altruist's Adornment";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //TF2Maps 72hr TF2Jam Participent
                        case 325: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "TF2Maps 72hr TF2 Jam Participent";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //PASS Time Miniature Half Jack
                        case 326: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "PASS Time Miniature Half Jack";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Jaunty Camper
                        case 327: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Jaunty Camper";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Jaunty Benefactor
                        case 328: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Jaunty Benefactor";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Jaunty Trailblazer
                        case 329: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Jaunty Trailblazer";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Duncan's Kindhearted Kisser
                        case 330: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Duncan's Kindhearted Kisser";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Hannah's Altruistic Aspect
                        case 331: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Hannah's Altruistic Aspect";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Sips' Selfless Simulacrum
                        case 332: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Sips' Selfless Simulacrum";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Sjin's Generous Guise
                        case 333: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Sjin's Generous Guise";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Gift of Giving 2016
                        case 334: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Gift of Giving 2016";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Special Snowflake 2016
                        case 335: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Special Snowflake 2016";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Mapper vs. Machiners Participant Medal 2017
                        case 336: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Mapper vs. Machiners Participant Medal 2017";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Blapature Co. Contributor
                        case 337: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "Blapature Co. Contributor";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //TF2Maps Charitable HEart
                        case 338: {

                            if (!medalEquipRegion) {

                                loadoutOneCosmetic = "TF2Maps Charitable Heart";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Earbud's Special Region
                        //Earbuds
                        case 339: {

                            if (!earbudsSpecialEquipRegion) {

                                loadoutOneCosmetic = "Earbuds";
                                earbudsSpecialEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Lenses Region
                        case 340: {

                            if (!lensesEquipRegion && !glassesEquipRegion) {

                                loadoutOneCosmetic = "Deus Specs";
                                lensesEquipRegion = true;
                                glassesEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Eye-Catcher
                        case 341: {

                            if (!lensesEquipRegion && !glassesEquipRegion) {

                                loadoutOneCosmetic = "Eye-Catcher";
                                lensesEquipRegion = true;
                                glassesEquipRegion = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Flair Region
                        case 342: {

                            if (!flairEquipRegion) {

                                loadoutOneCosmetic = "Flair!";
                                flairEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;


                        }
                        //Necklace Region
                        //Merc's Pride Scarf
                        case 343: {

                            if (!necklaceEquipRegion) {

                                loadoutOneCosmetic = "Merc's Pride Scarf";
                                necklaceEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Merc's Muffler
                        case 344: {

                            if (!necklaceEquipRegion) {

                                loadoutOneCosmetic = "Merc's Muffler";
                                necklaceEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Slithering Scarf
                        case 345: {

                            if (!necklaceEquipRegion) {

                                loadoutOneCosmetic = "Slithering Scarf";
                                necklaceEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }

                            break;

                        }
                        //Disconnected Floating Item Region
                        //Baloonicorn
                        case 346: {

                            if (!disconnectedFloatingItemEquipRegion) {

                                loadoutOneCosmetic = "Baloonicorn";
                                disconnectedFloatingItemEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //RoBro 3000
                        case 347: {

                            if (!disconnectedFloatingItemEquipRegion) {

                                loadoutOneCosmetic = "RoBro 3000";
                                disconnectedFloatingItemEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Reindoonicorn
                        case 348: {

                            if (!disconnectedFloatingItemEquipRegion) {

                                loadoutOneCosmetic = "Reindoonicorn";
                                disconnectedFloatingItemEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Space Hamster Hammy
                        case 349: {

                            if (!disconnectedFloatingItemEquipRegion) {

                                loadoutOneCosmetic = "Space Hamster Hammy";
                                disconnectedFloatingItemEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Belt Region
                        //Buttler
                        case 350: {

                            if (!beltEquipRegion) {

                                loadoutOneCosmetic = "Buttler";
                                beltEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Rump-o'-Lantern
                        case 351: {

                            if (!beltEquipRegion) {

                                loadoutOneCosmetic = "Rump-o'-Lantern";
                                beltEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Catastrophic Companions
                        case 352: {

                            if (!beltEquipRegion) {

                                loadoutOneCosmetic = "Catastrophic Companions";
                                beltEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Pocket Saxton
                        case 353: {

                            if (!beltEquipRegion) {

                                loadoutOneCosmetic = "Pocket Saxton";
                                beltEquipRegion = true;
                                loadoutOneLoopSatisfied = true;
                                paintMethod(1);

                            }
                            break;

                        }
                        //Grenades Region
                        //Pocket Raiders
                        case 354: {

                            if (!grenadesEquipRegion && !pocketSniperEquipRegion && !pocketEngineerEquipRegion) {

                                loadoutOneCosmetic = "Pocket Raiders";
                                grenadesEquipRegion = true;
                                pocketSniperEquipRegion = true;
                                pocketEngineerEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Pocket Villains
                        case 355: {

                            if (!grenadesEquipRegion) {

                                loadoutOneCosmetic = "Pocket Villains";
                                grenadesEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }

                            break;

                        }
                        //None
                        case 356: {

                            loadoutOneCosmetic = "None";
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with choosing loadout two's cosmetic");
                            break;

                        }

                    }

                }
                break;

            }
            //Loadout 2
            case 2: {

                //Loadout Loop
                while (!loadoutTwoLoopSatisfied) {

                    int loadoutRandomizer = (int) (Math.random() * 356 + 1);
                    switch (loadoutRandomizer) {

                        //Hat Region
                        //Football Helmet
                        case 1: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Football Helmet";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Officer's Ushanka
                        case 2: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Officer's Ushanka";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Tough Guy's Toque
                        case 3: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Tough Guy's Toque";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Hound Dog
                        case 4: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion && !glassesEquipRegion) {

                                loadoutTwoCosmetic = "Hound Dog";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                glassesEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Heavy Duty Rag
                        case 5: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Heavy Duty Rag";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Hard Counter
                        case 6: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Hard Counter";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Pugilist's Protector
                        case 7: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Pugilist's Protector";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Cadaver's Cranium
                        case 8: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Cadaver's Cranium";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Big Chief
                        case 9: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Cadaver's Cranium";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Coupe D'isaster
                        case 10: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Coupe D'isaster";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Magnificent Mongolian
                        case 11: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Magnificent Mongolian";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Dread Knot
                        case 12: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Dread Knot";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Team Captain
                        case 13: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Team Captain";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Capo's Capper
                        case 14: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Capo's Capper";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Copper's Hard Top
                        case 15: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Copper's Hard Top";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Dragonborn Helmet
                        case 16: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion && !faceEquipRegion) {

                                loadoutTwoCosmetic = "Dragonborn Helmet";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                faceEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Gym Rat
                        case 17: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Gym Rat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //One-Man Army
                        case 18: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "One-Man Army";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Outdoorsman
                        case 19: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Outdoorsman";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Soviet Gentleman
                        case 20: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Soviet Gentleman";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Bunsen Brave
                        case 21: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Bunsen Brave";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Gridiron Gaurdian
                        case 22: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Gridiron Gaurdian";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Tungsten Toque
                        case 23: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Tungsten Toque";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Bear Necessities
                        case 24: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Bear Necessities";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Katyusha
                        case 25: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Katyusha";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Tsarboosh
                        case 26: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Tsarboosh";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Minnesota Slick
                        case 27: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Minnesota Slick";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Bullet Buzz
                        case 28: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Bullet Buzz";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Eliminator's Safegaurd
                        case 29: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Eliminator's Safegaurd";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Sammy Cap
                        case 30: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Sammy Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Trash Man
                        case 31: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Trash Man";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Fur-Lined Fighter
                        case 32: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Fur-Lined Fighter";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Old Man Frost
                        case 33: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Old Man Frost";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Siberian Facehugger
                        case 34: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Siberian Facehugger";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //White Russian
                        case 35: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "White Russian";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Mo'Horn
                        case 36: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Mo'Horn";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                sf2016UnusualMethod(2);

                            }
                            break;

                        }
                        //Pestering Jester
                        case 37: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Pestering Jester";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                paintMethod(2);
                                sf2016UnusualMethod(2);

                            }
                            break;

                        }
                        //Warhood
                        case 38: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Warhood";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Aztec Aggresor
                        case 39: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Aztec Aggresor";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Commando Elite
                        case 40: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Commando Elite";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Fat Man's Field Cap
                        case 41: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Fat Man's Field Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Nuke
                        case 42: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Nuke";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Modest Pile of Hat
                        case 43: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Modest Pile of Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Noble Amassment of Hat
                        case 44: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Noble Amassment of Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Towering Pillar of Hat
                        case 45: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Towering Pillar of Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Dr's Dapper Topper
                        case 46: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Dr's Dapper Topper";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Horrific Headsplitter
                        case 47: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Horrific Headsplitter";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //A Rather Festive Hat
                        case 48: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "A Rather Festive Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Company Man
                        case 49: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Company Man";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Killer Exclusive
                        case 50: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Killer Exclusive";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Hot Dogger
                        case 51: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Hot Dogger";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Salty Dog
                        case 52: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Salty Dog";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Brown Bomber
                        case 53: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Brown Bomber";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Human Cannonball
                        case 54: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Human Cannonball";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Crone's Dome
                        case 55: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Crone's Dome";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Executioner
                        case 56: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Executioner";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Tough Stuff Muffs
                        case 57: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Tough Stuff Muffs";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Galvanized Gibus
                        case 58: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Galvanized Gibus";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Modest Metal Pile of Scrap
                        case 59: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Modest Metal Pile of Scrap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Noble NIckel Amassment of Hats
                        case 60: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Noble Nickel Amassment of Hats";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Towering Titanium Pillar of Hats
                        case 61: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Towering Titanium Pillar of Hats";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Bot Dogger
                        case 62: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Bot Dogger";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Brotherhood of Arms
                        case 63: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Brotherhood of Arms";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Well-Rounded Riflemam
                        case 64: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Well-Rounded Rifleman";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Federal Casemaker
                        case 65: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Federal Casemaker";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Cotton Head
                        case 66: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Cotton Head";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Hong Kong Cone
                        case 67: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Hong Kong Cone";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Kiss King
                        case 68: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Kiss King";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Neckwear Headwear
                        case 69: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Neckwear Headwear";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Law
                        case 70: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Law";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Dark Fallkirk Helm
                        case 71: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Dark Fallkirk Helm";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Merc's Mohawk
                        case 72: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Merc's Mohawk";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Tipped Lid
                        case 73: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Tipped Lid";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Vive La France
                        case 74: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion && !glassesEquipRegion) {

                                loadoutTwoCosmetic = "Vive La France";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                glassesEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Crown of the Old Kingdom
                        case 75: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Crown of the Old Kingdom";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Boxcar Bomber
                        case 76: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Boxcar";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Coldsnap Cap
                        case 77: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Coldsnap Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Winter Woodsman
                        case 78: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Winter Woodsman";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Co-Pilot
                        case 79: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Co-Pilot";
                                hatEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Finder's Fee
                        case 80: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Finder's Fee";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Captain Cardbeard Cutthroat
                        case 81: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Captrain Cardbeard Cutthroat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Rotation Sensation
                        case 82: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Rotation Sensation";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Potassium Bonnet
                        case 83: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Potassium Bonnet";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Phononaut
                        case 84: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Phononaut";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                invasionUnusualMethod(2);

                            }
                            break;

                        }
                        //Universal Translator
                        case 85: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Universal Translator";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                invasionUnusualMethod(2);

                            }
                            break;

                        }
                        //Duck Billed Hatypus
                        case 86: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Duck Billed Hatypus";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                sf2015UnusualMethod(2);

                            }
                            break;

                        }
                        //Prehistoric Pullover
                        case 87: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Prehistoric Pullover";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                sf2015UnusualMethod(2);

                            }
                            break;

                        }
                        //A Well Wrapped Hat
                        case 88: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "A Well Wrapped Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Chill Chullo
                        case 89: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Chill Chullo";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Patriot Peak
                        case 90: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Patriot Peak";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Class Crown
                        case 91: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Class Crown";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                sf2016UnusualMethod(2);

                            }
                            break;

                        }
                        //Lil' Bitey
                        case 92: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Lil' Bitey";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                sf2016UnusualMethod(2);

                            }
                            break;

                        }
                        //Nasty Norsemann
                        case 93: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Nasty Norsemann";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                sf2016UnusualMethod(2);

                            }
                            break;

                        }
                        //Toadstool Topper
                        case 94: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Toadstool Topper";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                sf2016UnusualMethod(2);

                            }
                            break;

                        }
                        //Woolen Warmer
                        case 95: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Woolen Warmer";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Legendary Lid
                        case 96: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Legendary Lid";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Hunter in Darkness
                        case 97: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Hunter in Darkness";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Pithy Professional
                        case 98: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Pithy Professional";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Dealer's Visor
                        case 99: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Dealer's Visor";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Pilotka
                        case 100: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Pilotka";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //War Head
                        case 101: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "War Head";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //U-clanka-a
                        case 102: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "U-clanka-a";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Crafty Hair
                        case 103: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Crafty Hair";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Heavy Artillery Officer's Cap
                        case 104: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                            loadoutTwoCosmetic = "Heavy Artillery Officer's Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //K-9 Mane
                        case 105: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "K-9 Mane";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Brock's Locks
                        case 106: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Brock's Locks";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Pounding Father
                        case 107: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Pounding Father";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Wilson Weave
                        case 108: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Wilson Weave";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Der Maschinensoldaten-Helm
                        case 109: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Der Maschinensoldaten-Helm";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Sucker SLug
                        case 110: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Sucker Slug";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //War Eagle
                        case 111: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "War Eagle";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Ghastly Gibus
                        case 112: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Ghastly Gibus";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Bill's Hat
                        case 113: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Bill's Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Alien Swarm Parasite
                        case 114: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Alien Swarm Parasite";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Wiki Cap
                        case 115: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Wiki Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Ellis' Cap
                        case 116: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Ellis' Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Mann Co. Cap
                        case 117: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Mann Co. Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Ghastlier Gibus
                        case 118: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Ghastlier Gibus";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Spine-Chilling Skull
                        case 119: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Spine-Chilling Skull";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Voodoo Juju
                        case 120: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Voodoo Juju";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Bounty Hat
                        case 121: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Bounty Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Treasure Hat
                        case 122: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Treasure Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Hat of Undeniable Wealth and Respect
                        case 123: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Hat of Undeniable Wealth and Respect";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //World Travelers Hat
                        case 124: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "World Travelers Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Atheletic Supporter
                        case 125: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Atheletic Supporter";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Humanitarian's Hachimaki
                        case 126: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Humanitarian's Hachimaki";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Benefactor's Kanmuri
                        case 127: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Benefactor's Kanmuri";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Magnanimous Monarch
                        case 128: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Magnanimous Monarch";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Aperture Labs Hard Hat
                        case 129: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Aperture Labs Hard Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Frontline Field Recorder
                        case 130: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Frontline Field Recorder";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Lo-Fi Longwave
                        case 131: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Lo-Fi Longwave";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Spiral Sallet
                        case 132: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Spiral Sallet";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                faceEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;



                        }
                        //Proof of Purchase
                        case 133: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Proof of Purchase";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Summer Hat
                        case 134: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Summer Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Party Hat
                        case 135: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Party Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Manniversary Paper hat
                        case 136: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Manniversary Paper Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Ghastlierest Gibus
                        case 137: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Ghastlierest Gibus";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //B.M.O.C
                        case 138: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "B.M.O.C";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Ebenezer
                        case 139: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Ebenezer";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Full Head Of Steam
                        case 140: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Full Head of Steam";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Holiday Headcase
                        case 141: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion && !necklaceEquipRegion && !beardEquipRegion) {

                                loadoutTwoCosmetic = "Holiday Headcase";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                necklaceEquipRegion = true;
                                beardEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Warsworn Helmet
                        case 142: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Warsworn Helmet";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Dueler
                        case 143: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Dueler";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Gifting Man From Gifting Land
                        case 144: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Gifting Man From Gifting Land";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Philater
                        case 145: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Philater";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Bolt Action Blitzer
                        case 146: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Bolt Action Blitzer";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Gentle Munitionne of Leisure
                        case 147: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Gentle Munitionne of Leisure";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Robot Chicken Hat
                        case 148: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Robot Chicken Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Ghostly Gibus
                        case 149: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Ghostly Gibus";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Skull Island Topper
                        case 150: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Skull Island Topper";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //That '70s Chapeau
                        case 151: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "That '70s Chapeau";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Cockfighter
                        case 152: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Cockfighter";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Mann Co. Online Cap
                        case 153: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Mann Co. Online Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Brutal Bouffant
                        case 154: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Brutal Bouffant";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Conspiracy Cap
                        case 155: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Conspiracy Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Public Agressor
                        case 156: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Public Agressor";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Hardy Laurel
                        case 157: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Hardy Laurel";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Grandmaster
                        case 158: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Grandmaster";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Towering Pillar of Summer Shades
                        case 159: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Towering Pillar of Shades";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Horace
                        case 160: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Horace";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //MK 50
                        case 161: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "MK 50";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Dadliest Catch
                        case 162: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Dadliest Catch";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Bedouin Bandanna
                        case 163: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Bedouin Bandanna";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Prinny Hat
                        case 164: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Prinny Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Civilian JACK Hat
                        case 165: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Civilian JACK Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Military Grade JACK Hat
                        case 166: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Military Grade JACK Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Head Prize
                        case 167: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Head Prize";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Snowmann
                        case 168: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Snowmann";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Audio File
                        case 169: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Audio File";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Aztec Warrior
                        case 170: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Aztec Warrior";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Jungle Wreath
                        case 171: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Jungle Wreath";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Monstrous Memento
                        case 172: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Monstrous Memento";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Saxton
                        case 173: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Saxton";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Point and Shoot
                        case 174: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Point and Shoot";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Head Skin Region
                        //Large Luchadore
                        case 175: {

                            if (!headSkinEquipRegion) {

                                loadoutTwoCosmetic = "Large Luchadore";
                                headSkinEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Polar Pullover
                        case 176: {

                            if (!headSkinEquipRegion) {

                                loadoutTwoCosmetic = "Polar Pullover";
                                headSkinEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Cold War Luchadore
                        case 177: {

                            if (!headSkinEquipRegion) {

                                loadoutTwoCosmetic = "Cold War Luchadore";
                                headSkinEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Arkham Cowl
                        case 178: {

                            if (!headSkinEquipRegion) {

                                loadoutTwoCosmetic = "Arkham Cowl";
                                headSkinEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Pocket (Heavy) Region
                        //Pocket Medic
                        case 179: {

                            if (!pocketHeavyEquipRegion) {

                                loadoutTwoCosmetic = "Pocket Medic";
                                pocketHeavyEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Beard Region
                        //Big Steel Jaw of Summer Fun
                        case 180: {

                            if (!beardEquipRegion) {

                                loadoutTwoCosmetic = "Big Steel Jaw of Summer Fun";
                                beardEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //All-Father
                        case 181: {

                            if (!beardEquipRegion) {

                                loadoutTwoCosmetic = "All-Father";
                                beardEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Mutton Mann
                        case 182: {

                            if (!beardEquipRegion) {

                                loadoutTwoCosmetic = "Mutton Mann";
                                beardEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Cuban Bristle Crisis
                        case 183: {

                            if (!beardEquipRegion) {

                                loadoutTwoCosmetic = "Cuban Bristle Crisis";
                                beardEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Viking Braider
                        case 184: {

                            if (!beardEquipRegion) {

                                loadoutTwoCosmetic = "Viking Braider";
                                beardEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Leftover Trap
                        case 185: {

                            if (!beardEquipRegion) {

                                loadoutTwoCosmetic = "Leftover Trap";
                                beardEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Yuri's Revenge
                        case 186: {

                            if (!beardEquipRegion) {

                                loadoutTwoCosmetic = "Yuri's Revenge";
                                beardEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Unshaved Bear
                        case 187: {

                            if (!beardEquipRegion) {

                                loadoutTwoCosmetic = "Unshaved Bear";
                                beardEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //El Duderino
                        case 188: {

                            if (!beardEquipRegion) {

                                loadoutTwoCosmetic = "El Duderino";
                                beardEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Dictator
                        case 189: {

                            if (!beardEquipRegion) {

                                loadoutTwoCosmetic = "Dictator";
                                beardEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Bruiser's Bandanna
                        case 190: {

                            if (!beardEquipRegion) {

                                loadoutTwoCosmetic = "Bruiser's Bandanna";
                                beardEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Glasses Region
                        //Virtual Viewfinder
                        case 191: {

                            if (!glassesEquipRegion && !faceEquipRegion && lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Virtual Viewfinder";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                standardUnusualMethod(2);

                            }
                            break;

                        }
                        //Security Shades
                        case 192: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Security Shades";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Gabe Glasses
                        case 193: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Gabe Glasses";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;

                            }
                            break;

                        }
                        //Macho Mann
                        case 194: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Macho Mann";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //War Goggles
                        case 195: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion &&!wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "War Goggles";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Reader's Choice
                        case 196: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Reader's Choice";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Professor Speks
                        case 197: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Professor Speks";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Summer Shades
                        case 198: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion &&!wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Summer Shades";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Pyrovision Goggles
                        case 199: {

                            if (!glassesEquipRegion && !wholeHeadEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Pyrovision Goggles";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;


                        }
                        //Marxman
                        case 200: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Marxman";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //TF2VRH
                        case 201: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "TF2VRH";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Graybanns
                        case 202: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Graybanns";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Tomb Readers
                        case 203: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Tomb Readers";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Spooktacles
                        case 204: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Spooktacles";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Arms Region
                        //Purity Fist
                        case 205: {

                            if (!armsEquipRegion) {

                                loadoutTwoCosmetic = "Purity Fist";
                                armsEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Hip (Heavy)
                        //Sandvich Safe
                        case 206: {

                            if (!hipHeavyEquipRegion) {

                                loadoutTwoCosmetic = "Sandvich Safe";
                                hipHeavyEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Heavy-Weight Champ
                        case 207: {

                            if (!hipHeavyEquipRegion) {

                                loadoutTwoCosmetic = "Heavy-Weight Champ";
                                hipHeavyEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Combat Slacks
                        case 208: {

                            if (!hipHeavyEquipRegion) {

                                loadoutTwoCosmetic = "Combat Slacks";
                                hipHeavyEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Towel (Heavy)
                        //Toss-Proof Towel
                        case 209: {

                            if (!towelHeavyEquipRegion) {

                                loadoutTwoCosmetic = "Toss-Proof Towel";
                                towelHeavyEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Titanium Towel
                        case 210: {

                            if (!towelHeavyEquipRegion) {

                                loadoutTwoCosmetic = "Titanium Towel";
                                towelHeavyEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Heavy Harness
                        case 211: {

                            if (!towelHeavyEquipRegion) {

                                loadoutTwoCosmetic = "Heavy Harness";
                                towelHeavyEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Shirt Equip Region
                        //Apparatchiks Apparel
                        case 212: {

                            if (!shirtEquipRegion && !armTattooEquipRegion) {

                                loadoutTwoCosmetic = "Apparatchiks Apparel";
                                shirtEquipRegion = true;
                                armTattooEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Triad Trinket
                        case 213: {

                            if (!shirtEquipRegion) {

                                loadoutTwoCosmetic = "Triad Trinket";
                                shirtEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Siberian Sophisticate
                        case 214: {

                            if (!shirtEquipRegion) {

                                loadoutTwoCosmetic = "Siberian Sophisticate";
                                shirtEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Hunger Force
                        case 215: {

                            if (!shirtEquipRegion && !necklaceEquipRegion) {

                                loadoutTwoCosmetic = "Hunger Force";
                                shirtEquipRegion = true;
                                necklaceEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Tyurtlenek
                        case 216: {

                            if (!shirtEquipRegion) {

                                loadoutTwoCosmetic = "Tyurtlenek";
                                shirtEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Bolshevik Biker
                        case 217: {

                            if (!shirtEquipRegion) {

                                loadoutTwoCosmetic = "Bolshevik Biker";
                                shirtEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Weight Room Warmer
                        case 218: {

                            if (!shirtEquipRegion) {

                                loadoutTwoCosmetic = "Weight Room Warmer";
                                shirtEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Heavy Lifter
                        case 219: {

                            if (!shirtEquipRegion) {

                                loadoutTwoCosmetic = "Heavy Lifter";
                                shirtEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Warmth Preserver
                        case 220: {

                            if (!shirtEquipRegion) {

                                loadoutTwoCosmetic = "Warmth Preserver";
                                shirtEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Hunter Heavy
                        case 221: {

                            if (!shirtEquipRegion) {

                                loadoutTwoCosmetic = "Hunter Heavy";
                                shirtEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Sleeveless in Siberia
                        case 222: {

                            if (!shirtEquipRegion) {

                                loadoutTwoCosmetic = "Sleeveless in Siberia";
                                shirtEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Snow Sleeves
                        case 223: {

                            if (!shirtEquipRegion) {

                                loadoutTwoCosmetic = "Snow Sleeves";
                                shirtEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Commisar's Coat
                        case 224: {

                            if (!shirtEquipRegion) {

                                loadoutTwoCosmetic = "Commisar's Coat";
                                shirtEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Siberian Sweater
                        case 225: {

                            if (!shirtEquipRegion) {

                                loadoutTwoCosmetic = "Siberian Sweater";
                                shirtEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Heavy Tourism
                        case 226: {

                            if (!shirtEquipRegion) {

                                loadoutTwoCosmetic = "Heavy Tourism";
                                shirtEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Airborne Attire
                        case 227: {

                            if (!shirtEquipRegion) {

                                loadoutTwoCosmetic = "Airborne Attire";
                                shirtEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Siberian Tigerstripe
                        case 228: {

                            if (!shirtEquipRegion) {

                                loadoutTwoCosmetic = "Siberian Tigerstripe";
                                shirtEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Tuxxy
                        case 229: {

                            if (!shirtEquipRegion) {

                                loadoutTwoCosmetic = "Tuxxy";
                                shirtEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Dead of Night
                        case 230: {

                            if (!shirtEquipRegion) {

                                loadoutTwoCosmetic = "Dead of Night";
                                shirtEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Arm Tattoos Region
                        //Champ Stamp
                        case 231: {

                            if (!armTattooEquipRegion) {

                                loadoutTwoCosmetic = "Champ Stamp";
                                armTattooEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Sleeves Region
                        //Spooky Sleeves
                        case 232: {

                            if (!sleevesEquipRegion) {

                                loadoutTwoCosmetic = "Spooky Sleeves";
                                sleevesEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Batter's Bracers
                        case 233: {

                            if (!sleevesEquipRegion) {

                                loadoutTwoCosmetic = "Batter's Bracers";
                                sleevesEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Feet Region
                        //Aqua Flops
                        case 234: {

                            if (!feetEquipRegon) {

                                loadoutTwoCosmetic = "Aqua Flops";
                                feetEquipRegon = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Rat Stompers
                        case 235: {

                            if (!feetEquipRegon) {

                                loadoutTwoCosmetic = "Rat Stompers";
                                feetEquipRegon = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Flashdance Footies
                        case 236: {

                            if (!feetEquipRegon) {

                                loadoutTwoCosmetic = "Flashdance Footies";
                                feetEquipRegon = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }

                            break;

                        }
                        //Hair (Heavy) Region
                        //Carl
                        case 237: {

                            if (!hairHeavyEquipRegion) {

                                loadoutTwoCosmetic = "Carl";
                                hairHeavyEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Heavy's Hockey Hair
                        case 238: {

                            if (!hairHeavyEquipRegion) {

                                loadoutTwoCosmetic = "Heavy's Hockey Hair";
                                hairHeavyEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Belt (Heavy) Region
                        //Samson Skewer
                        case 240: {

                            if (!beltHeavyEquipRegion) {

                                loadoutTwoCosmetic = "Samson Skewer";
                                beltHeavyEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Fortune Hunteer
                        case 241: {

                            if (!beltHeavyEquipRegion) {

                                loadoutTwoCosmetic = "Fortune Hunter";
                                beltHeavyEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Prinny Pouch
                        case 242: {

                            if (!beltHeavyEquipRegion) {

                                loadoutTwoCosmetic = "Prinny Pouch";
                                beltHeavyEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Bullets (Heavy) Region
                        //Borscht Belt
                        case 243: {

                            if (!bulletsHeavyEquipRegion) {

                                loadoutTwoCosmetic = "Borscht Belt";
                                bulletsHeavyEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Left Shoulder Region
                        //Red Army Robin
                        case 244: {

                            if (!leftShoulderEquipRegion) {

                                loadoutTwoCosmetic = "Red Army Robin";
                                leftShoulderEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Grim Tweeter
                        case 245: {

                            if (!leftShoulderEquipRegion) {

                                loadoutTwoCosmetic = "Grim Tweeter";
                                leftShoulderEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Croaking Hazard
                        case 246: {

                            if (!leftShoulderEquipRegion) {

                                loadoutTwoCosmetic = "Croaking Hazard";
                                leftShoulderEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Quizzical Quetzal
                        case 247: {

                            if (!leftShoulderEquipRegion) {

                                loadoutTwoCosmetic = "Quizzical Quetzal";
                                leftShoulderEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Pants Region
                        //Mann of the House
                        case 248: {

                            if (!pantsEquipRegion) {

                                loadoutTwoCosmetic = "Mann of the House";
                                pantsEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Gone Commando
                        case 249: {

                            if (!pantsEquipRegion) {

                                loadoutTwoCosmetic = "Gone Commando";
                                pantsEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Jungle Booty
                        case 250: {

                            if (!pantsEquipRegion) {

                                loadoutTwoCosmetic = "Jungle Booty";
                                pantsEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Breakneck Baggies
                        case 251: {

                            if (!pantsEquipRegion) {

                                loadoutTwoCosmetic = "Breakneck Baggies";
                                pantsEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Hip Pouch (Heavy)
                        //Little Bear
                        case 252: {

                            if (!hipPouchEquipRegion) {

                                loadoutTwoCosmetic = "Little Bear";
                                hipPouchEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //None
                        //Antlers
                        case 253: {

                            loadoutTwoCosmetic =  "Antlers";
                            loadoutTwoLoopSatisfied = true;
                            standardUnusualMethod(2);
                            break;

                        }
                        //Die Regime-Panzerung
                        case 254: {

                            loadoutTwoCosmetic = "Die Regime-Panzerung";
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Himalayan Hair Shirt
                        case 255: {

                            loadoutTwoCosmetic = "Himalayan Hair Shirt";
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Abominable Snow Pants
                        case 256: {

                            loadoutTwoCosmetic = "Abominable Snow Pants";
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Cheater's Lament
                        case 257: {

                            loadoutTwoCosmetic = "Cheater's Lament";
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Max's Severed Head
                        case 258: {

                            loadoutTwoCosmetic = "Max's Severed Head";
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Something Special For Someone Special
                        case 259: {

                            loadoutTwoCosmetic = "Something Special For Someone Special";
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Barely-Melted Capacitor
                        case 260: {

                            loadoutTwoCosmetic = "Barely-Melted Capacitor";
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Tux
                        case 261: {

                            loadoutTwoCosmetic = "Tux";
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Glitched Circuit Board
                        case 262: {

                            loadoutTwoCosmetic = "Glitched Circuit Board";
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Mustachioed Mann
                        case 263: {

                            loadoutTwoCosmetic = "Mustachioed Mann:";
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Brimstone
                        case 264: {

                            loadoutTwoCosmetic = "Brimstone";
                            loadoutTwoLoopSatisfied = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Batbelt
                        case 265: {

                            loadoutTwoCosmetic = "Batbelt";
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Whole Head Region
                        //Teufort Knight
                        case 266: {

                            if (!wholeHeadEquipRegion && !hatEquipRegion && !faceEquipRegion && !glassesEquipRegion) {

                                loadoutTwoCosmetic = "Teufort Knight";
                                wholeHeadEquipRegion = true;
                                hatEquipRegion = true;
                                faceEquipRegion = true;
                                glassesEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Kathman - Hairdo
                        case 267: {

                            if (!wholeHeadEquipRegion && !hatEquipRegion && !faceEquipRegion && !glassesEquipRegion) {

                                loadoutTwoCosmetic = "Kathman-Hairdo";
                                wholeHeadEquipRegion = true;
                                hatEquipRegion = true;
                                faceEquipRegion = true;
                                glassesEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Saxton Hale Mask
                        case 268: {

                            if (!wholeHeadEquipRegion && !hatEquipRegion && !faceEquipRegion && !glassesEquipRegion) {

                                loadoutTwoCosmetic = "Saxton Hale Mask";
                                wholeHeadEquipRegion = true;
                                hatEquipRegion = true;
                                faceEquipRegion = true;
                                glassesEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Coat (Soldier) Region
                        //Gift Bringer
                        case 269: {

                            if (!coatSoldierEquipRegion) {

                                loadoutTwoCosmetic = "Gift Bringer";
                                coatSoldierEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Face Region
                        //Captain Space Mann
                        case 270: {

                            if (!faceEquipRegion && !glassesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Captain Space Mann";
                                faceEquipRegion = true;
                                glassesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                invasionUnusualMethod(2);

                            }
                            break;

                        }
                        //Mad Mask
                        case 271: {

                            if (!faceEquipRegion && !glassesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutTwoCosmetic = "Mad Mask";
                                faceEquipRegion = true;
                                glassesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Medal Region
                        //Mercenary
                        case 272: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Mercenary";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Soldier of Fortune
                        case 273: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Soldier of Fortune";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Grizzled Veteran
                        case 274: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Grizzled Veteran";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Primeval Warrior
                        case 275: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Primeval Warrior";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Bronze Dueling Badge
                        case 276: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Bronze Dueling Badge";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Silver Dueling Badge
                        case 277: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Silver Dueling Badge";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Gold Dueling Badge
                        case 278: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Gold Dueling Badge";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Platinum Dueling Badge
                        case 279: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Platinum Dueling Badge";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Polycount Pin
                        case 280: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Polycount Pin";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Companion Cube Pin
                        case 281: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Companion Cube Pin";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //License to Maim
                        case 282: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "License to Maim";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Resurrection Associate Pin
                        case 283: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Resurrection Associate Pin";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //SpaceChem Pin
                        case 284: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "SpaceChem Pin";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Dr. Grordbort's Crest
                        case 285: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Dr. Grordbort's Crest";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Clan Pride
                        case 286: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Clan Pride";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Photo Badge
                        case 287: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Photo Badge";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Bombinomicon
                        case 288: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Bombinomicon";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Mark of the Saint
                        case 289: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Mark of the Saint";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Dr. Grordbort's Copper Crest
                        case 290: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Dr. Grordbort's Copper Crest";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Dr. Grordbort's Silver Crest
                        case 291: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Dr. Grordbort's Silver Crest";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Spirit of Giving
                        case 292: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Spirit of Giving";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Map Maker's Medallion
                        case 293: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Map Maker's Medallion";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Merc Medal
                        case 294: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Merc Medal";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Atomic Accolade
                        case 295: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Atomic Accolade";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Awesomenauts Badge
                        case 296: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Awesomenauts Badge";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Operation Oil Spill Badge
                        case 298: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Operation Oil Spill Badge";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Operation Steel Trap Badge
                        case 299: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Operation Steel Trap Badge";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Operation Gear Grinder Badge
                        case 300: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Operation Gear Grinder Badge";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Vigilant Pin
                        case 301: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Vigilant Pin";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Friends Forever Companion Square Badge
                        case 302: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Friends  Forever Companion Square Badge";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Heroic Companion Badge
                        case 303: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Heroic Companion Badge";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Triple A Badge
                        case 304: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Triple A Badge";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Whale Bone Charm
                        case 305: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Whale Bone Charm";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Hitt Mann Badge
                        case 306: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Hitt Mann Badge";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Faerie Solitare Pin
                        case 307: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Faerie Solitare Pin";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Saxxy Clapper Badge
                        case 308: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Saxxy Clapper Badge";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Operation Mecha Engine
                        case 309: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Operation Mecha Engine";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Smissmas WWreath
                        case 310: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Smissmas Wreath";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Crot's Crest
                        case 311: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Croft's Crest";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Electric Badge-aloo
                        case 312: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Electric Badge-aloo";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Operation Two Cities Badge
                        case 313: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Operation Two Cities Badge";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Heart of Gold
                        case 314: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Heart of Gold";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Baronial Badge
                        case 315: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Baronial Badge";
                                medalEquipRegion = true;
                                loadoutOneLoopSatisfied = true;

                            }
                            break;

                        }
                        //Thought That Counts
                        case 316: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Thought That Counts";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //End of the Line Community Medal
                        case 317: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "End of the Line Community Medal";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Invasion Community Medal
                        case 318: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Invasion Community Medal";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Honeydew's Charitable Countenance
                        case 319: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Honeydews Charitable COuntenance";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Xephos' Philantrophic Physiognomy
                        case 320: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Xephos' Philantrophic Physiognomy";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Gift of Giving
                        case 321: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Gift of Giving";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Special Snowflake
                        case 322: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Special Snowflake";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;


                        }
                        //PASS Time Early Participation Medal
                        case 323: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "PASS Time Early Participation Medal";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Altruist's Adornment
                        case 324: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Altruist's Adornment";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //TF2Maps 72hr TF2Jam Participent
                        case 325: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "TF2Maps 72hr TF2 Jam Participent";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //PASS Time Miniature Half Jack
                        case 326: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "PASS Time Miniature Half Jack";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Jaunty Camper
                        case 327: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Jaunty Camper";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Jaunty Benefactor
                        case 328: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Jaunty Benefactor";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Jaunty Trailblazer
                        case 329: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Jaunty Trailblazer";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Duncan's Kindhearted Kisser
                        case 330: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Duncan's Kindhearted Kisser";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Hannah's Altruistic Aspect
                        case 331: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Hannah's Altruistic Aspect";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Sips' Selfless Simulacrum
                        case 332: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Sips' Selfless Simulacrum";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Sjin's Generous Guise
                        case 333: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Sjin's Generous Guise";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Gift of Giving 2016
                        case 334: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Gift of Giving 2016";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Special Snowflake 2016
                        case 335: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Special Snowflake 2016";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Mapper vs. Machiners Participant Medal 2017
                        case 336: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Mapper vs. Machiners Participant Medal 2017";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Blapature Co. Contributor
                        case 337: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "Blapature Co. Contributor";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //TF2Maps Charitable HEart
                        case 338: {

                            if (!medalEquipRegion) {

                                loadoutTwoCosmetic = "TF2Maps Charitable Heart";
                                medalEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Earbud's Special Region
                        //Earbuds
                        case 339: {

                            if (!earbudsSpecialEquipRegion) {

                                loadoutTwoCosmetic = "Earbuds";
                                earbudsSpecialEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Lenses Region
                        case 340: {

                            if (!lensesEquipRegion && !glassesEquipRegion) {

                                loadoutTwoCosmetic = "Deus Specs";
                                lensesEquipRegion = true;
                                glassesEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Eye-Catcher
                        case 341: {

                            if (!lensesEquipRegion && !glassesEquipRegion) {

                                loadoutTwoCosmetic = "Eye-Catcher";
                                lensesEquipRegion = true;
                                glassesEquipRegion = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Flair Region
                        case 342: {

                            if (!flairEquipRegion) {

                                loadoutTwoCosmetic = "Flair!";
                                flairEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;


                        }
                        //Necklace Region
                        //Merc's Pride Scarf
                        case 343: {

                            if (!necklaceEquipRegion) {

                                loadoutTwoCosmetic = "Merc's Pride Scarf";
                                necklaceEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Merc's Muffler
                        case 344: {

                            if (!necklaceEquipRegion) {

                                loadoutTwoCosmetic = "Merc's Muffler";
                                necklaceEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Slithering Scarf
                        case 345: {

                            if (!necklaceEquipRegion) {

                                loadoutTwoCosmetic = "Slithering Scarf";
                                necklaceEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }

                            break;

                        }
                        //Disconnected Floating Item Region
                        //Baloonicorn
                        case 346: {

                            if (!disconnectedFloatingItemEquipRegion) {

                                loadoutTwoCosmetic = "Baloonicorn";
                                disconnectedFloatingItemEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //RoBro 3000
                        case 347: {

                            if (!disconnectedFloatingItemEquipRegion) {

                                loadoutTwoCosmetic = "RoBro 3000";
                                disconnectedFloatingItemEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Reindoonicorn
                        case 348: {

                            if (!disconnectedFloatingItemEquipRegion) {

                                loadoutTwoCosmetic = "Reindoonicorn";
                                disconnectedFloatingItemEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Space Hamster Hammy
                        case 349: {

                            if (!disconnectedFloatingItemEquipRegion) {

                                loadoutTwoCosmetic = "Space Hamster Hammy";
                                disconnectedFloatingItemEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Belt Region
                        //Buttler
                        case 350: {

                            if (!beltEquipRegion) {

                                loadoutTwoCosmetic = "Buttler";
                                beltEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Rump-o'-Lantern
                        case 351: {

                            if (!beltEquipRegion) {

                                loadoutTwoCosmetic = "Rump-o'-Lantern";
                                beltEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Catastrophic Companions
                        case 352: {

                            if (!beltEquipRegion) {

                                loadoutTwoCosmetic = "Catastrophic Companions";
                                beltEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Pocket Saxton
                        case 353: {

                            if (!beltEquipRegion) {

                                loadoutTwoCosmetic = "Pocket Saxton";
                                beltEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Grenades Region
                        //Pocket Raiders
                        case 354: {

                            if (!grenadesEquipRegion && !pocketSniperEquipRegion && !pocketEngineerEquipRegion) {

                                loadoutTwoCosmetic = "Pocket Raiders";
                                grenadesEquipRegion = true;
                                pocketSniperEquipRegion = true;
                                pocketEngineerEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Pocket Villains
                        case 355: {

                            if (!grenadesEquipRegion) {

                                loadoutTwoCosmetic = "Pocket Villains";
                                grenadesEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }

                            break;

                        }
                        //None
                        case 356: {

                            loadoutTwoCosmetic = "None";
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with choosing loadout two's cosmetic");
                            break;

                        }

                    }

                }
                break;

            }
            //Loadout 3
            case 3: {

                //Loadout Loop
                while (!loadoutThreeLoopSatisfied) {

                    int loadoutRandomizer = (int) (Math.random() * 356 + 1);
                    switch (loadoutRandomizer) {

                        //Hat Region
                        //Football Helmet
                        case 1: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Football Helmet";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Officer's Ushanka
                        case 2: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Officer's Ushanka";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Tough Guy's Toque
                        case 3: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Tough Guy's Toque";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Hound Dog
                        case 4: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion && !glassesEquipRegion) {

                                loadoutThreeCosmetic = "Hound Dog";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                glassesEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Heavy Duty Rag
                        case 5: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Heavy Duty Rag";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Hard Counter
                        case 6: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Hard Counter";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Pugilist's Protector
                        case 7: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Pugilist's Protector";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Cadaver's Cranium
                        case 8: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Cadaver's Cranium";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Big Chief
                        case 9: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Cadaver's Cranium";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Coupe D'isaster
                        case 10: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Coupe D'isaster";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Magnificent Mongolian
                        case 11: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Magnificent Mongolian";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Dread Knot
                        case 12: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Dread Knot";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Team Captain
                        case 13: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Team Captain";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Capo's Capper
                        case 14: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Capo's Capper";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Copper's Hard Top
                        case 15: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Copper's Hard Top";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Dragonborn Helmet
                        case 16: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion && !faceEquipRegion) {

                                loadoutThreeCosmetic = "Dragonborn Helmet";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                faceEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Gym Rat
                        case 17: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Gym Rat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //One-Man Army
                        case 18: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "One-Man Army";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Outdoorsman
                        case 19: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Outdoorsman";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Soviet Gentleman
                        case 20: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Soviet Gentleman";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Bunsen Brave
                        case 21: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Bunsen Brave";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Gridiron Gaurdian
                        case 22: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Gridiron Gaurdian";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Tungsten Toque
                        case 23: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Tungsten Toque";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Bear Necessities
                        case 24: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Bear Necessities";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Katyusha
                        case 25: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Katyusha";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Tsarboosh
                        case 26: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Tsarboosh";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Minnesota Slick
                        case 27: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Minnesota Slick";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Bullet Buzz
                        case 28: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Bullet Buzz";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Eliminator's Safegaurd
                        case 29: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Eliminator's Safegaurd";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Sammy Cap
                        case 30: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Sammy Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Trash Man
                        case 31: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Trash Man";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Fur-Lined Fighter
                        case 32: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Fur-Lined Fighter";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Old Man Frost
                        case 33: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Old Man Frost";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Siberian Facehugger
                        case 34: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Siberian Facehugger";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //White Russian
                        case 35: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "White Russian";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Mo'Horn
                        case 36: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Mo'Horn";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                sf2016UnusualMethod(3);

                            }
                            break;

                        }
                        //Pestering Jester
                        case 37: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Pestering Jester";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                paintMethod(3);
                                sf2016UnusualMethod(3);

                            }
                            break;

                        }
                        //Warhood
                        case 38: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Warhood";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Aztec Aggresor
                        case 39: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Aztec Aggresor";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Commando Elite
                        case 40: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Commando Elite";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Fat Man's Field Cap
                        case 41: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Fat Man's Field Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Nuke
                        case 42: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Nuke";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Modest Pile of Hat
                        case 43: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Modest Pile of Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Noble Amassment of Hat
                        case 44: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Noble Amassment of Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Towering Pillar of Hat
                        case 45: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Towering Pillar of Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Dr's Dapper Topper
                        case 46: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Dr's Dapper Topper";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Horrific Headsplitter
                        case 47: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Horrific Headsplitter";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //A Rather Festive Hat
                        case 48: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "A Rather Festive Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Company Man
                        case 49: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Company Man";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Killer Exclusive
                        case 50: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Killer Exclusive";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Hot Dogger
                        case 51: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Hot Dogger";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Salty Dog
                        case 52: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Salty Dog";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Brown Bomber
                        case 53: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Brown Bomber";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Human Cannonball
                        case 54: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Human Cannonball";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Crone's Dome
                        case 55: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Crone's Dome";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Executioner
                        case 56: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Executioner";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Tough Stuff Muffs
                        case 57: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Tough Stuff Muffs";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Galvanized Gibus
                        case 58: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Galvanized Gibus";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Modest Metal Pile of Scrap
                        case 59: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Modest Metal Pile of Scrap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Noble NIckel Amassment of Hats
                        case 60: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Noble Nickel Amassment of Hats";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Towering Titanium Pillar of Hats
                        case 61: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Towering Titanium Pillar of Hats";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Bot Dogger
                        case 62: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Bot Dogger";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Brotherhood of Arms
                        case 63: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Brotherhood of Arms";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Well-Rounded Riflemam
                        case 64: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Well-Rounded Rifleman";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Federal Casemaker
                        case 65: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Federal Casemaker";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Cotton Head
                        case 66: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Cotton Head";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Hong Kong Cone
                        case 67: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Hong Kong Cone";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Kiss King
                        case 68: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Kiss King";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Neckwear Headwear
                        case 69: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Neckwear Headwear";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Law
                        case 70: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Law";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Dark Fallkirk Helm
                        case 71: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Dark Fallkirk Helm";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Merc's Mohawk
                        case 72: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Merc's Mohawk";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Tipped Lid
                        case 73: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Tipped Lid";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Vive La France
                        case 74: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion && !glassesEquipRegion) {

                                loadoutThreeCosmetic = "Vive La France";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                glassesEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Crown of the Old Kingdom
                        case 75: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Crown of the Old Kingdom";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Boxcar Bomber
                        case 76: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Boxcar";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Coldsnap Cap
                        case 77: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Coldsnap Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Winter Woodsman
                        case 78: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Winter Woodsman";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Co-Pilot
                        case 79: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Co-Pilot";
                                hatEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Finder's Fee
                        case 80: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Finder's Fee";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Captain Cardbeard Cutthroat
                        case 81: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Captrain Cardbeard Cutthroat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Rotation Sensation
                        case 82: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Rotation Sensation";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Potassium Bonnet
                        case 83: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Potassium Bonnet";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Phononaut
                        case 84: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Phononaut";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                invasionUnusualMethod(3);

                            }
                            break;

                        }
                        //Universal Translator
                        case 85: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Universal Translator";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                invasionUnusualMethod(3);

                            }
                            break;

                        }
                        //Duck Billed Hatypus
                        case 86: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Duck Billed Hatypus";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                sf2015UnusualMethod(3);

                            }
                            break;

                        }
                        //Prehistoric Pullover
                        case 87: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Prehistoric Pullover";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                sf2015UnusualMethod(3);

                            }
                            break;

                        }
                        //A Well Wrapped Hat
                        case 88: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "A Well Wrapped Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Chill Chullo
                        case 89: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Chill Chullo";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Patriot Peak
                        case 90: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Patriot Peak";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Class Crown
                        case 91: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Class Crown";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                sf2016UnusualMethod(3);

                            }
                            break;

                        }
                        //Lil' Bitey
                        case 92: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Lil' Bitey";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                sf2016UnusualMethod(3);

                            }
                            break;

                        }
                        //Nasty Norsemann
                        case 93: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Nasty Norsemann";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                sf2016UnusualMethod(3);

                            }
                            break;

                        }
                        //Toadstool Topper
                        case 94: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Toadstool Topper";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                sf2016UnusualMethod(3);

                            }
                            break;

                        }
                        //Woolen Warmer
                        case 95: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Woolen Warmer";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Legendary Lid
                        case 96: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Legendary Lid";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Hunter in Darkness
                        case 97: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Hunter in Darkness";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Pithy Professional
                        case 98: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Pithy Professional";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Dealer's Visor
                        case 99: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Dealer's Visor";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Pilotka
                        case 100: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Pilotka";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //War Head
                        case 101: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "War Head";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //U-clanka-a
                        case 102: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "U-clanka-a";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Crafty Hair
                        case 103: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Crafty Hair";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Heavy Artillery Officer's Cap
                        case 104: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Heavy Artillery Officer's Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //K-9 Mane
                        case 105: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "K-9 Mane";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Brock's Locks
                        case 106: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Brock's Locks";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Pounding Father
                        case 107: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Pounding Father";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Wilson Weave
                        case 108: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Wilson Weave";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Der Maschinensoldaten-Helm
                        case 109: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Der Maschinensoldaten-Helm";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Sucker SLug
                        case 110: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Sucker Slug";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //War Eagle
                        case 111: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "War Eagle";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Ghastly Gibus
                        case 112: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Ghastly Gibus";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Bill's Hat
                        case 113: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Bill's Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Alien Swarm Parasite
                        case 114: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Alien Swarm Parasite";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Wiki Cap
                        case 115: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Wiki Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Ellis' Cap
                        case 116: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Ellis' Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Mann Co. Cap
                        case 117: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Mann Co. Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Ghastlier Gibus
                        case 118: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Ghastlier Gibus";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Spine-Chilling Skull
                        case 119: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Spine-Chilling Skull";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Voodoo Juju
                        case 120: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Voodoo Juju";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Bounty Hat
                        case 121: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Bounty Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Treasure Hat
                        case 122: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Treasure Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Hat of Undeniable Wealth and Respect
                        case 123: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Hat of Undeniable Wealth and Respect";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //World Travelers Hat
                        case 124: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "World Travelers Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Atheletic Supporter
                        case 125: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Atheletic Supporter";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Humanitarian's Hachimaki
                        case 126: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Humanitarian's Hachimaki";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Benefactor's Kanmuri
                        case 127: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Benefactor's Kanmuri";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Magnanimous Monarch
                        case 128: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Magnanimous Monarch";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Aperture Labs Hard Hat
                        case 129: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Aperture Labs Hard Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Frontline Field Recorder
                        case 130: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Frontline Field Recorder";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Lo-Fi Longwave
                        case 131: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Lo-Fi Longwave";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Spiral Sallet
                        case 132: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Spiral Sallet";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                faceEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;



                        }
                        //Proof of Purchase
                        case 133: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Proof of Purchase";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Summer Hat
                        case 134: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Summer Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Party Hat
                        case 135: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Party Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Manniversary Paper hat
                        case 136: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Manniversary Paper Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Ghastlierest Gibus
                        case 137: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Ghastlierest Gibus";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //B.M.O.C
                        case 138: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "B.M.O.C";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Ebenezer
                        case 139: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Ebenezer";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Full Head Of Steam
                        case 140: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Full Head of Steam";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Holiday Headcase
                        case 141: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion && !necklaceEquipRegion && !beardEquipRegion) {

                                loadoutThreeCosmetic = "Holiday Headcase";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                necklaceEquipRegion = true;
                                beardEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Warsworn Helmet
                        case 142: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Warsworn Helmet";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Dueler
                        case 143: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Dueler";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Gifting Man From Gifting Land
                        case 144: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Gifting Man From Gifting Land";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Philater
                        case 145: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Philater";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Bolt Action Blitzer
                        case 146: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Bolt Action Blitzer";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Gentle Munitionne of Leisure
                        case 147: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Gentle Munitionne of Leisure";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Robot Chicken Hat
                        case 148: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Robot Chicken Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Ghostly Gibus
                        case 149: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Ghostly Gibus";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Skull Island Topper
                        case 150: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Skull Island Topper";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //That '70s Chapeau
                        case 151: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "That '70s Chapeau";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Cockfighter
                        case 152: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Cockfighter";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Mann Co. Online Cap
                        case 153: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Mann Co. Online Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Brutal Bouffant
                        case 154: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Brutal Bouffant";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Conspiracy Cap
                        case 155: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Conspiracy Cap";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Public Agressor
                        case 156: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Public Agressor";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Hardy Laurel
                        case 157: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Hardy Laurel";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Grandmaster
                        case 158: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Grandmaster";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Towering Pillar of Summer Shades
                        case 159: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Towering Pillar of Shades";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Horace
                        case 160: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Horace";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //MK 50
                        case 161: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "MK 50";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Dadliest Catch
                        case 162: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Dadliest Catch";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Bedouin Bandanna
                        case 163: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Bedouin Bandanna";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Prinny Hat
                        case 164: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Prinny Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Civilian JACK Hat
                        case 165: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Civilian JACK Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Military Grade JACK Hat
                        case 166: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Military Grade JACK Hat";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Head Prize
                        case 167: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Head Prize";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Snowmann
                        case 168: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Snowmann";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Audio File
                        case 169: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Audio File";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Aztec Warrior
                        case 170: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Aztec Warrior";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Jungle Wreath
                        case 171: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Jungle Wreath";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Monstrous Memento
                        case 172: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Monstrous Memento";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Saxton
                        case 173: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Saxton";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Point and Shoot
                        case 174: {

                            if (!hatEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Point and Shoot";
                                hatEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Head Skin Region
                        //Large Luchadore
                        case 175: {

                            if (!headSkinEquipRegion) {

                                loadoutThreeCosmetic = "Large Luchadore";
                                headSkinEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Polar Pullover
                        case 176: {

                            if (!headSkinEquipRegion) {

                                loadoutThreeCosmetic = "Polar Pullover";
                                headSkinEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Cold War Luchadore
                        case 177: {

                            if (!headSkinEquipRegion) {

                                loadoutThreeCosmetic = "Cold War Luchadore";
                                headSkinEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Arkham Cowl
                        case 178: {

                            if (!headSkinEquipRegion) {

                                loadoutThreeCosmetic = "Arkham Cowl";
                                headSkinEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Pocket (Heavy) Region
                        //Pocket Medic
                        case 179: {

                            if (!pocketHeavyEquipRegion) {

                                loadoutThreeCosmetic = "Pocket Medic";
                                pocketHeavyEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Beard Region
                        //Big Steel Jaw of Summer Fun
                        case 180: {

                            if (!beardEquipRegion) {

                                loadoutThreeCosmetic = "Big Steel Jaw of Summer Fun";
                                beardEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //All-Father
                        case 181: {

                            if (!beardEquipRegion) {

                                loadoutThreeCosmetic = "All-Father";
                                beardEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Mutton Mann
                        case 182: {

                            if (!beardEquipRegion) {

                                loadoutThreeCosmetic = "Mutton Mann";
                                beardEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Cuban Bristle Crisis
                        case 183: {

                            if (!beardEquipRegion) {

                                loadoutThreeCosmetic = "Cuban Bristle Crisis";
                                beardEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Viking Braider
                        case 184: {

                            if (!beardEquipRegion) {

                                loadoutThreeCosmetic = "Viking Braider";
                                beardEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Leftover Trap
                        case 185: {

                            if (!beardEquipRegion) {

                                loadoutThreeCosmetic = "Leftover Trap";
                                beardEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Yuri's Revenge
                        case 186: {

                            if (!beardEquipRegion) {

                                loadoutThreeCosmetic = "Yuri's Revenge";
                                beardEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Unshaved Bear
                        case 187: {

                            if (!beardEquipRegion) {

                                loadoutThreeCosmetic = "Unshaved Bear";
                                beardEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //El Duderino
                        case 188: {

                            if (!beardEquipRegion) {

                                loadoutThreeCosmetic = "El Duderino";
                                beardEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Dictator
                        case 189: {

                            if (!beardEquipRegion) {

                                loadoutThreeCosmetic = "Dictator";
                                beardEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Bruiser's Bandanna
                        case 190: {

                            if (!beardEquipRegion) {

                                loadoutThreeCosmetic = "Bruiser's Bandanna";
                                beardEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Glasses Region
                        //Virtual Viewfinder
                        case 191: {

                            if (!glassesEquipRegion && !faceEquipRegion && lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Virtual Viewfinder";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                standardUnusualMethod(3);

                            }
                            break;

                        }
                        //Security Shades
                        case 192: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Security Shades";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Gabe Glasses
                        case 193: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Gabe Glasses";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;

                            }
                            break;

                        }
                        //Macho Mann
                        case 194: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Macho Mann";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //War Goggles
                        case 195: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion &&!wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "War Goggles";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Reader's Choice
                        case 196: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Reader's Choice";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Professor Speks
                        case 197: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Professor Speks";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Summer Shades
                        case 198: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion &&!wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Summer Shades";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Pyrovision Goggles
                        case 199: {

                            if (!glassesEquipRegion && !wholeHeadEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Pyrovision Goggles";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;


                        }
                        //Marxman
                        case 200: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Marxman";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //TF2VRH
                        case 201: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "TF2VRH";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Graybanns
                        case 202: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Graybanns";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Tomb Readers
                        case 203: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Tomb Readers";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Spooktacles
                        case 204: {

                            if (!glassesEquipRegion && !faceEquipRegion && !lensesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Spooktacles";
                                glassesEquipRegion = true;
                                faceEquipRegion = true;
                                lensesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Arms Region
                        //Purity Fist
                        case 205: {

                            if (!armsEquipRegion) {

                                loadoutThreeCosmetic = "Purity Fist";
                                armsEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Hip (Heavy)
                        //Sandvich Safe
                        case 206: {

                            if (!hipHeavyEquipRegion) {

                                loadoutThreeCosmetic = "Sandvich Safe";
                                hipHeavyEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Heavy-Weight Champ
                        case 207: {

                            if (!hipHeavyEquipRegion) {

                                loadoutThreeCosmetic = "Heavy-Weight Champ";
                                hipHeavyEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Combat Slacks
                        case 208: {

                            if (!hipHeavyEquipRegion) {

                                loadoutThreeCosmetic = "Combat Slacks";
                                hipHeavyEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Towel (Heavy)
                        //Toss-Proof Towel
                        case 209: {

                            if (!towelHeavyEquipRegion) {

                                loadoutThreeCosmetic = "Toss-Proof Towel";
                                towelHeavyEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Titanium Towel
                        case 210: {

                            if (!towelHeavyEquipRegion) {

                                loadoutThreeCosmetic = "Titanium Towel";
                                towelHeavyEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Heavy Harness
                        case 211: {

                            if (!towelHeavyEquipRegion) {

                                loadoutThreeCosmetic = "Heavy Harness";
                                towelHeavyEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Shirt Equip Region
                        //Apparatchiks Apparel
                        case 212: {

                            if (!shirtEquipRegion && !armTattooEquipRegion) {

                                loadoutThreeCosmetic = "Apparatchiks Apparel";
                                shirtEquipRegion = true;
                                armTattooEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Triad Trinket
                        case 213: {

                            if (!shirtEquipRegion) {

                                loadoutThreeCosmetic = "Triad Trinket";
                                shirtEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Siberian Sophisticate
                        case 214: {

                            if (!shirtEquipRegion) {

                                loadoutThreeCosmetic = "Siberian Sophisticate";
                                shirtEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Hunger Force
                        case 215: {

                            if (!shirtEquipRegion && !necklaceEquipRegion) {

                                loadoutThreeCosmetic = "Hunger Force";
                                shirtEquipRegion = true;
                                necklaceEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Tyurtlenek
                        case 216: {

                            if (!shirtEquipRegion) {

                                loadoutThreeCosmetic = "Tyurtlenek";
                                shirtEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Bolshevik Biker
                        case 217: {

                            if (!shirtEquipRegion) {

                                loadoutThreeCosmetic = "Bolshevik Biker";
                                shirtEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Weight Room Warmer
                        case 218: {

                            if (!shirtEquipRegion) {

                                loadoutThreeCosmetic = "Weight Room Warmer";
                                shirtEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Heavy Lifter
                        case 219: {

                            if (!shirtEquipRegion) {

                                loadoutThreeCosmetic = "Heavy Lifter";
                                shirtEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Warmth Preserver
                        case 220: {

                            if (!shirtEquipRegion) {

                                loadoutThreeCosmetic = "Warmth Preserver";
                                shirtEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Hunter Heavy
                        case 221: {

                            if (!shirtEquipRegion) {

                                loadoutThreeCosmetic = "Hunter Heavy";
                                shirtEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Sleeveless in Siberia
                        case 222: {

                            if (!shirtEquipRegion) {

                                loadoutThreeCosmetic = "Sleeveless in Siberia";
                                shirtEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Snow Sleeves
                        case 223: {

                            if (!shirtEquipRegion) {

                                loadoutThreeCosmetic = "Snow Sleeves";
                                shirtEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Commisar's Coat
                        case 224: {

                            if (!shirtEquipRegion) {

                                loadoutThreeCosmetic = "Commisar's Coat";
                                shirtEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Siberian Sweater
                        case 225: {

                            if (!shirtEquipRegion) {

                                loadoutThreeCosmetic = "Siberian Sweater";
                                shirtEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Heavy Tourism
                        case 226: {

                            if (!shirtEquipRegion) {

                                loadoutThreeCosmetic = "Heavy Tourism";
                                shirtEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Airborne Attire
                        case 227: {

                            if (!shirtEquipRegion) {

                                loadoutThreeCosmetic = "Airborne Attire";
                                shirtEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Siberian Tigerstripe
                        case 228: {

                            if (!shirtEquipRegion) {

                                loadoutThreeCosmetic = "Siberian Tigerstripe";
                                shirtEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Tuxxy
                        case 229: {

                            if (!shirtEquipRegion) {

                                loadoutThreeCosmetic = "Tuxxy";
                                shirtEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Dead of Night
                        case 230: {

                            if (!shirtEquipRegion) {

                                loadoutThreeCosmetic = "Dead of Night";
                                shirtEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Arm Tattoos Region
                        //Champ Stamp
                        case 231: {

                            if (!armTattooEquipRegion) {

                                loadoutThreeCosmetic = "Champ Stamp";
                                armTattooEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Sleeves Region
                        //Spooky Sleeves
                        case 232: {

                            if (!sleevesEquipRegion) {

                                loadoutThreeCosmetic = "Spooky Sleeves";
                                sleevesEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Batter's Bracers
                        case 233: {

                            if (!sleevesEquipRegion) {

                                loadoutThreeCosmetic = "Batter's Bracers";
                                sleevesEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Feet Region
                        //Aqua Flops
                        case 234: {

                            if (!feetEquipRegon) {

                                loadoutThreeCosmetic = "Aqua Flops";
                                feetEquipRegon = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Rat Stompers
                        case 235: {

                            if (!feetEquipRegon) {

                                loadoutThreeCosmetic = "Rat Stompers";
                                feetEquipRegon = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Flashdance Footies
                        case 236: {

                            if (!feetEquipRegon) {

                                loadoutThreeCosmetic = "Flashdance Footies";
                                feetEquipRegon = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }

                            break;

                        }
                        //Hair (Heavy) Region
                        //Carl
                        case 237: {

                            if (!hairHeavyEquipRegion) {

                                loadoutThreeCosmetic = "Carl";
                                hairHeavyEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Heavy's Hockey Hair
                        case 238: {

                            if (!hairHeavyEquipRegion) {

                                loadoutThreeCosmetic = "Heavy's Hockey Hair";
                                hairHeavyEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Belt (Heavy) Region
                        //Samson Skewer
                        case 240: {

                            if (!beltHeavyEquipRegion) {

                                loadoutThreeCosmetic = "Samson Skewer";
                                beltHeavyEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Fortune Hunteer
                        case 241: {

                            if (!beltHeavyEquipRegion) {

                                loadoutThreeCosmetic = "Fortune Hunter";
                                beltHeavyEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Prinny Pouch
                        case 242: {

                            if (!beltHeavyEquipRegion) {

                                loadoutThreeCosmetic = "Prinny Pouch";
                                beltHeavyEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Bullets (Heavy) Region
                        //Borscht Belt
                        case 243: {

                            if (!bulletsHeavyEquipRegion) {

                                loadoutThreeCosmetic = "Borscht Belt";
                                bulletsHeavyEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Left Shoulder Region
                        //Red Army Robin
                        case 244: {

                            if (!leftShoulderEquipRegion) {

                                loadoutThreeCosmetic = "Red Army Robin";
                                leftShoulderEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Grim Tweeter
                        case 245: {

                            if (!leftShoulderEquipRegion) {

                                loadoutThreeCosmetic = "Grim Tweeter";
                                leftShoulderEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Croaking Hazard
                        case 246: {

                            if (!leftShoulderEquipRegion) {

                                loadoutThreeCosmetic = "Croaking Hazard";
                                leftShoulderEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Quizzical Quetzal
                        case 247: {

                            if (!leftShoulderEquipRegion) {

                                loadoutThreeCosmetic = "Quizzical Quetzal";
                                leftShoulderEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Pants Region
                        //Mann of the House
                        case 248: {

                            if (!pantsEquipRegion) {

                                loadoutThreeCosmetic = "Mann of the House";
                                pantsEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Gone Commando
                        case 249: {

                            if (!pantsEquipRegion) {

                                loadoutThreeCosmetic = "Gone Commando";
                                pantsEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Jungle Booty
                        case 250: {

                            if (!pantsEquipRegion) {

                                loadoutThreeCosmetic = "Jungle Booty";
                                pantsEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Breakneck Baggies
                        case 251: {

                            if (!pantsEquipRegion) {

                                loadoutThreeCosmetic = "Breakneck Baggies";
                                pantsEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Hip Pouch (Heavy)
                        //Little Bear
                        case 252: {

                            if (!hipPouchEquipRegion) {

                                loadoutThreeCosmetic = "Little Bear";
                                hipPouchEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //None
                        //Antlers
                        case 253: {

                            loadoutThreeCosmetic =  "Antlers";
                            loadoutThreeLoopSatisfied = true;
                            standardUnusualMethod(3);
                            break;

                        }
                        //Die Regime-Panzerung
                        case 254: {

                            loadoutThreeCosmetic = "Die Regime-Panzerung";
                            loadoutThreeLoopSatisfied = true;
                            break;

                        }
                        //Himalayan Hair Shirt
                        case 255: {

                            loadoutThreeCosmetic = "Himalayan Hair Shirt";
                            loadoutThreeLoopSatisfied = true;
                            break;

                        }
                        //Abominable Snow Pants
                        case 256: {

                            loadoutThreeCosmetic = "Abominable Snow Pants";
                            loadoutThreeLoopSatisfied = true;
                            break;

                        }
                        //Cheater's Lament
                        case 257: {

                            loadoutThreeCosmetic = "Cheater's Lament";
                            loadoutThreeLoopSatisfied = true;
                            break;

                        }
                        //Max's Severed Head
                        case 258: {

                            loadoutThreeCosmetic = "Max's Severed Head";
                            loadoutThreeLoopSatisfied = true;
                            paintMethod(3);
                            break;

                        }
                        //Something Special For Someone Special
                        case 259: {

                            loadoutThreeCosmetic = "Something Special For Someone Special";
                            loadoutThreeLoopSatisfied = true;
                            break;

                        }
                        //Barely-Melted Capacitor
                        case 260: {

                            loadoutThreeCosmetic = "Barely-Melted Capacitor";
                            loadoutThreeLoopSatisfied = true;
                            break;

                        }
                        //Tux
                        case 261: {

                            loadoutThreeCosmetic = "Tux";
                            loadoutThreeLoopSatisfied = true;
                            break;

                        }
                        //Glitched Circuit Board
                        case 262: {

                            loadoutThreeCosmetic = "Glitched Circuit Board";
                            loadoutThreeLoopSatisfied = true;
                            break;

                        }
                        //Mustachioed Mann
                        case 263: {

                            loadoutThreeCosmetic = "Mustachioed Mann:";
                            loadoutThreeLoopSatisfied = true;
                            paintMethod(3);
                            break;

                        }
                        //Brimstone
                        case 264: {

                            loadoutThreeCosmetic = "Brimstone";
                            loadoutThreeLoopSatisfied = true;
                            loadoutThreeLoopSatisfied = true;
                            break;

                        }
                        //Batbelt
                        case 265: {

                            loadoutThreeCosmetic = "Batbelt";
                            loadoutThreeLoopSatisfied = true;
                            paintMethod(3);
                            break;

                        }
                        //Whole Head Region
                        //Teufort Knight
                        case 266: {

                            if (!wholeHeadEquipRegion && !hatEquipRegion && !faceEquipRegion && !glassesEquipRegion) {

                                loadoutThreeCosmetic = "Teufort Knight";
                                wholeHeadEquipRegion = true;
                                hatEquipRegion = true;
                                faceEquipRegion = true;
                                glassesEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Kathman - Hairdo
                        case 267: {

                            if (!wholeHeadEquipRegion && !hatEquipRegion && !faceEquipRegion && !glassesEquipRegion) {

                                loadoutThreeCosmetic = "Kathman-Hairdo";
                                wholeHeadEquipRegion = true;
                                hatEquipRegion = true;
                                faceEquipRegion = true;
                                glassesEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Saxton Hale Mask
                        case 268: {

                            if (!wholeHeadEquipRegion && !hatEquipRegion && !faceEquipRegion && !glassesEquipRegion) {

                                loadoutThreeCosmetic = "Saxton Hale Mask";
                                wholeHeadEquipRegion = true;
                                hatEquipRegion = true;
                                faceEquipRegion = true;
                                glassesEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Coat (Soldier) Region
                        //Gift Bringer
                        case 269: {

                            if (!coatSoldierEquipRegion) {

                                loadoutThreeCosmetic = "Gift Bringer";
                                coatSoldierEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Face Region
                        //Captain Space Mann
                        case 270: {

                            if (!faceEquipRegion && !glassesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Captain Space Mann";
                                faceEquipRegion = true;
                                glassesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                invasionUnusualMethod(3);

                            }
                            break;

                        }
                        //Mad Mask
                        case 271: {

                            if (!faceEquipRegion && !glassesEquipRegion && !wholeHeadEquipRegion) {

                                loadoutThreeCosmetic = "Mad Mask";
                                faceEquipRegion = true;
                                glassesEquipRegion = true;
                                wholeHeadEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Medal Region
                        //Mercenary
                        case 272: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Mercenary";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Soldier of Fortune
                        case 273: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Soldier of Fortune";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Grizzled Veteran
                        case 274: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Grizzled Veteran";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Primeval Warrior
                        case 275: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Primeval Warrior";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Bronze Dueling Badge
                        case 276: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Bronze Dueling Badge";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Silver Dueling Badge
                        case 277: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Silver Dueling Badge";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Gold Dueling Badge
                        case 278: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Gold Dueling Badge";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Platinum Dueling Badge
                        case 279: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Platinum Dueling Badge";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Polycount Pin
                        case 280: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Polycount Pin";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Companion Cube Pin
                        case 281: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Companion Cube Pin";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //License to Maim
                        case 282: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "License to Maim";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Resurrection Associate Pin
                        case 283: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Resurrection Associate Pin";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //SpaceChem Pin
                        case 284: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "SpaceChem Pin";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Dr. Grordbort's Crest
                        case 285: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Dr. Grordbort's Crest";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Clan Pride
                        case 286: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Clan Pride";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Photo Badge
                        case 287: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Photo Badge";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Bombinomicon
                        case 288: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Bombinomicon";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Mark of the Saint
                        case 289: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Mark of the Saint";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Dr. Grordbort's Copper Crest
                        case 290: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Dr. Grordbort's Copper Crest";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Dr. Grordbort's Silver Crest
                        case 291: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Dr. Grordbort's Silver Crest";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Spirit of Giving
                        case 292: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Spirit of Giving";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Map Maker's Medallion
                        case 293: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Map Maker's Medallion";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Merc Medal
                        case 294: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Merc Medal";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Atomic Accolade
                        case 295: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Atomic Accolade";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Awesomenauts Badge
                        case 296: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Awesomenauts Badge";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Operation Oil Spill Badge
                        case 298: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Operation Oil Spill Badge";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Operation Steel Trap Badge
                        case 299: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Operation Steel Trap Badge";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Operation Gear Grinder Badge
                        case 300: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Operation Gear Grinder Badge";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Vigilant Pin
                        case 301: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Vigilant Pin";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Friends Forever Companion Square Badge
                        case 302: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Friends  Forever Companion Square Badge";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Heroic Companion Badge
                        case 303: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Heroic Companion Badge";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Triple A Badge
                        case 304: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Triple A Badge";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Whale Bone Charm
                        case 305: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Whale Bone Charm";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Hitt Mann Badge
                        case 306: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Hitt Mann Badge";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Faerie Solitare Pin
                        case 307: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Faerie Solitare Pin";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Saxxy Clapper Badge
                        case 308: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Saxxy Clapper Badge";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Operation Mecha Engine
                        case 309: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Operation Mecha Engine";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Smissmas WWreath
                        case 310: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Smissmas Wreath";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Crot's Crest
                        case 311: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Croft's Crest";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Electric Badge-aloo
                        case 312: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Electric Badge-aloo";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Operation Two Cities Badge
                        case 313: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Operation Two Cities Badge";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Heart of Gold
                        case 314: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Heart of Gold";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Baronial Badge
                        case 315: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Baronial Badge";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Thought That Counts
                        case 316: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Thought That Counts";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //End of the Line Community Medal
                        case 317: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "End of the Line Community Medal";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Invasion Community Medal
                        case 318: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Invasion Community Medal";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Honeydew's Charitable Countenance
                        case 319: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Honeydews Charitable COuntenance";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Xephos' Philantrophic Physiognomy
                        case 320: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Xephos' Philantrophic Physiognomy";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Gift of Giving
                        case 321: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Gift of Giving";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Special Snowflake
                        case 322: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Special Snowflake";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;


                        }
                        //PASS Time Early Participation Medal
                        case 323: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "PASS Time Early Participation Medal";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Altruist's Adornment
                        case 324: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Altruist's Adornment";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //TF2Maps 72hr TF2Jam Participent
                        case 325: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "TF2Maps 72hr TF2 Jam Participent";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //PASS Time Miniature Half Jack
                        case 326: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "PASS Time Miniature Half Jack";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Jaunty Camper
                        case 327: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Jaunty Camper";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Jaunty Benefactor
                        case 328: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Jaunty Benefactor";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Jaunty Trailblazer
                        case 329: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Jaunty Trailblazer";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Duncan's Kindhearted Kisser
                        case 330: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Duncan's Kindhearted Kisser";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Hannah's Altruistic Aspect
                        case 331: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Hannah's Altruistic Aspect";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Sips' Selfless Simulacrum
                        case 332: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Sips' Selfless Simulacrum";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Sjin's Generous Guise
                        case 333: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Sjin's Generous Guise";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Gift of Giving 2016
                        case 334: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Gift of Giving 2016";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Special Snowflake 2016
                        case 335: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Special Snowflake 2016";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Mapper vs. Machiners Participant Medal 2017
                        case 336: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Mapper vs. Machiners Participant Medal 2017";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Blapature Co. Contributor
                        case 337: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "Blapature Co. Contributor";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //TF2Maps Charitable HEart
                        case 338: {

                            if (!medalEquipRegion) {

                                loadoutThreeCosmetic = "TF2Maps Charitable Heart";
                                medalEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Earbud's Special Region
                        //Earbuds
                        case 339: {

                            if (!earbudsSpecialEquipRegion) {

                                loadoutThreeCosmetic = "Earbuds";
                                earbudsSpecialEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Lenses Region
                        case 340: {

                            if (!lensesEquipRegion && !glassesEquipRegion) {

                                loadoutThreeCosmetic = "Deus Specs";
                                lensesEquipRegion = true;
                                glassesEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Eye-Catcher
                        case 341: {

                            if (!lensesEquipRegion && !glassesEquipRegion) {

                                loadoutThreeCosmetic = "Eye-Catcher";
                                lensesEquipRegion = true;
                                glassesEquipRegion = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Flair Region
                        case 342: {

                            if (!flairEquipRegion) {

                                loadoutThreeCosmetic = "Flair!";
                                flairEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;


                        }
                        //Necklace Region
                        //Merc's Pride Scarf
                        case 343: {

                            if (!necklaceEquipRegion) {

                                loadoutThreeCosmetic = "Merc's Pride Scarf";
                                necklaceEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Merc's Muffler
                        case 344: {

                            if (!necklaceEquipRegion) {

                                loadoutThreeCosmetic = "Merc's Muffler";
                                necklaceEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Slithering Scarf
                        case 345: {

                            if (!necklaceEquipRegion) {

                                loadoutThreeCosmetic = "Slithering Scarf";
                                necklaceEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }

                            break;

                        }
                        //Disconnected Floating Item Region
                        //Baloonicorn
                        case 346: {

                            if (!disconnectedFloatingItemEquipRegion) {

                                loadoutThreeCosmetic = "Baloonicorn";
                                disconnectedFloatingItemEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //RoBro 3000
                        case 347: {

                            if (!disconnectedFloatingItemEquipRegion) {

                                loadoutThreeCosmetic = "RoBro 3000";
                                disconnectedFloatingItemEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Reindoonicorn
                        case 348: {

                            if (!disconnectedFloatingItemEquipRegion) {

                                loadoutThreeCosmetic = "Reindoonicorn";
                                disconnectedFloatingItemEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Space Hamster Hammy
                        case 349: {

                            if (!disconnectedFloatingItemEquipRegion) {

                                loadoutThreeCosmetic = "Space Hamster Hammy";
                                disconnectedFloatingItemEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Belt Region
                        //Buttler
                        case 350: {

                            if (!beltEquipRegion) {

                                loadoutThreeCosmetic = "Buttler";
                                beltEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Rump-o'-Lantern
                        case 351: {

                            if (!beltEquipRegion) {

                                loadoutThreeCosmetic = "Rump-o'-Lantern";
                                beltEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Catastrophic Companions
                        case 352: {

                            if (!beltEquipRegion) {

                                loadoutThreeCosmetic = "Catastrophic Companions";
                                beltEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Pocket Saxton
                        case 353: {

                            if (!beltEquipRegion) {

                                loadoutThreeCosmetic = "Pocket Saxton";
                                beltEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Grenades Region
                        //Pocket Raiders
                        case 354: {

                            if (!grenadesEquipRegion && !pocketSniperEquipRegion && !pocketEngineerEquipRegion) {

                                loadoutThreeCosmetic = "Pocket Raiders";
                                grenadesEquipRegion = true;
                                pocketSniperEquipRegion = true;
                                pocketEngineerEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Pocket Villains
                        case 355: {

                            if (!grenadesEquipRegion) {

                                loadoutThreeCosmetic = "Pocket Villains";
                                grenadesEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }

                            break;

                        }
                        //None
                        case 356: {

                            loadoutThreeCosmetic = "None";
                            loadoutThreeLoopSatisfied = true;
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with choosing loadout two's cosmetic");
                            break;

                        }

                    }

                }
                break;

            }
            default: {

                System.out.println("Something went wrong with calling the loadout method");
                break;

            }

        }

    }
    //Paint method
    private void paintMethod(int loadoutNumber) {

        switch (loadoutNumber) {

            case 1: {

                int paintYesNo = (int) (Math.random() * 2 + 1);
                if (paintYesNo == 2) {

                    int paintChooser = (int) (Math.random() * 29 + 1);
                    switch (paintChooser) {

                        //A Color Similar to Slate
                        case 1: {

                            loadoutOnePaintColor = "A Color Similar to Slate";
                            break;

                        }
                        //A Deep Commitment to Purple
                        case 2: {

                            loadoutOnePaintColor = "A Deep Commitment to Purple";
                            break;

                        }
                        //A Distinctive Lack of Hue
                        case 3: {

                            loadoutOnePaintColor = "A Distinctive Lack of Hue";
                            break;

                        }
                        //A Mann's Mint
                        case 4: {

                            loadoutOnePaintColor = "A Mann's Mint";
                            break;

                        }
                        //After Eight
                        case 5: {

                            loadoutOnePaintColor = "After Eight";
                            break;

                        }
                        //Aged Moustache Grey
                        case 6: {

                            loadoutOnePaintColor = "Aged Moustache Grey";
                            break;

                        }
                        //An Extraordinary Abundance of Tinge
                        case 7: {

                            loadoutOnePaintColor = "An Extraordinary Abundance of Tinge";
                            break;

                        }
                        //Australium Gold
                        case 8: {

                            loadoutOnePaintColor = "Australium Gold";
                            break;

                        }
                        //Color No. 216-190=216
                        case 9: {

                            loadoutOnePaintColor = "Color No. 216-190-216";
                            break;

                        }
                        //Dark Salmon Injustice
                        case 10: {

                            loadoutOnePaintColor = "Dark Salmon Injustice";
                            break;

                        }
                        //Drably Olive
                        case 11: {

                            loadoutOnePaintColor = "Drably Olive";
                            break;

                        }
                        //Indubitably Green
                        case 12: {

                            loadoutOnePaintColor = "Indubitably Green";
                            break;

                        }
                        //Mann Co. Orange
                        case 13: {

                            loadoutOnePaintColor = "Indubitably Green";
                            break;

                        }
                        //Muskelmannbraun
                        case 14: {

                            loadoutOnePaintColor = "Muskelmannbraun";
                            break;

                        }
                        //Noble Hatteer's Violet
                        case 15: {

                            loadoutOnePaintColor = "Noble Hatter's Violet";
                            break;

                        }
                        //Peculiarly Drab Tincture
                        case 16: {

                            loadoutOnePaintColor = "Peculiarly Drab Tincture";
                            break;

                        }
                        //Pink as Hell
                        case 17: {

                            loadoutOnePaintColor = "Pink as Hell";
                            break;

                        }
                        //Radigan Conagher Brown
                        case 18: {

                            loadoutOnePaintColor = "Radigan Conagher Brown";
                            break;

                        }
                        //The Bitter Taste of Defeat and Lime
                        case 19: {

                            loadoutOnePaintColor = "The BBitter Taste of Defeat and Lime";
                            break;

                        }
                        //The Color of a Gentlemann's Business Pants
                        case 20: {

                            loadoutOnePaintColor = "The Color of a Gentlemann's Business Pants";
                            break;

                        }
                        //Ye Olde Rustic Colour
                        case 21: {

                            loadoutOnePaintColor = "Ye Olde Rustic Colour";
                            break;

                        }
                        //Zepheniah's Greed
                        case 22: {

                            loadoutOnePaintColor = "Zepheniah's Greed";
                            break;

                        }
                        //An Air of Debonair
                        case 23: {

                            loadoutOnePaintColor = "An Air of Debonair";
                            break;

                        }
                        //Balaclavas Are Forever
                        case 24: {

                            loadoutOnePaintColor = "Balaclavas are Forever";
                            break;

                        }
                        //Cream Spirit
                        case 25: {

                            loadoutOnePaintColor = "Cream Spirit";
                            break;

                        }
                        //Operator's Overalls
                        case 26: {

                            loadoutOnePaintColor = "Operator's Overalls";
                            break;

                        }
                        //Team Spirit
                        case 27: {

                            loadoutOnePaintColor = "Team Spirit";
                            break;

                        }
                        //The Value of Teamwork
                        case 28: {

                            loadoutOnePaintColor = "The Value of Teamwork";
                            break;

                        }
                        //Waterlogged Lab Coat
                        case 29: {

                            loadoutOnePaintColor = "Waterlogged Lab Coat";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with choosing loadout one's paint");

                        }

                    }

                }
                break;

            }
            case 2: {

                int paintYesNo = (int) (Math.random() * 2 + 1);
                if (paintYesNo == 2) {

                    int paintChooser = (int) (Math.random() * 29 + 1);
                    switch (paintChooser) {

                        //A Color Similar to Slate
                        case 1: {

                            loadoutTwoPaintColor = "A Color Similar to Slate";
                            break;

                        }
                        //A Deep Commitment to Purple
                        case 2: {

                            loadoutTwoPaintColor = "A Deep Commitment to Purple";
                            break;

                        }
                        //A Distinctive Lack of Hue
                        case 3: {

                            loadoutTwoPaintColor = "A Distinctive Lack of Hue";
                            break;

                        }
                        //A Mann's Mint
                        case 4: {

                            loadoutTwoPaintColor = "A Mann's Mint";
                            break;

                        }
                        //After Eight
                        case 5: {

                            loadoutTwoPaintColor = "After Eight";
                            break;

                        }
                        //Aged Moustache Grey
                        case 6: {

                            loadoutTwoPaintColor = "Aged Moustache Grey";
                            break;

                        }
                        //An Extraordinary Abundance of Tinge
                        case 7: {

                            loadoutTwoPaintColor = "An Extraordinary Abundance of Tinge";
                            break;

                        }
                        //Australium Gold
                        case 8: {

                            loadoutTwoPaintColor = "Australium Gold";
                            break;

                        }
                        //Color No. 216-190=216
                        case 9: {

                            loadoutTwoPaintColor = "Color No. 216-190-216";
                            break;

                        }
                        //Dark Salmon Injustice
                        case 10: {

                            loadoutTwoPaintColor = "Dark Salmon Injustice";
                            break;

                        }
                        //Drably Olive
                        case 11: {

                            loadoutTwoPaintColor = "Drably Olive";
                            break;

                        }
                        //Indubitably Green
                        case 12: {

                            loadoutTwoPaintColor = "Indubitably Green";
                            break;

                        }
                        //Mann Co. Orange
                        case 13: {

                            loadoutTwoPaintColor = "Indubitably Green";
                            break;

                        }
                        //Muskelmannbraun
                        case 14: {

                            loadoutTwoPaintColor = "Muskelmannbraun";
                            break;

                        }
                        //Noble Hatteer's Violet
                        case 15: {

                            loadoutTwoPaintColor = "Noble Hatter's Violet";
                            break;

                        }
                        //Peculiarly Drab Tincture
                        case 16: {

                            loadoutTwoPaintColor = "Peculiarly Drab Tincture";
                            break;

                        }
                        //Pink as Hell
                        case 17: {

                            loadoutTwoPaintColor = "Pink as Hell";
                            break;

                        }
                        //Radigan Conagher Brown
                        case 18: {

                            loadoutTwoPaintColor = "Radigan Conagher Brown";
                            break;

                        }
                        //The Bitter Taste of Defeat and Lime
                        case 19: {

                            loadoutTwoPaintColor = "The BBitter Taste of Defeat and Lime";
                            break;

                        }
                        //The Color of a Gentlemann's Business Pants
                        case 20: {

                            loadoutTwoPaintColor = "The Color of a Gentlemann's Business Pants";
                            break;

                        }
                        //Ye Olde Rustic Colour
                        case 21: {

                            loadoutTwoPaintColor = "Ye Olde Rustic Colour";
                            break;

                        }
                        //Zepheniah's Greed
                        case 22: {

                            loadoutTwoPaintColor = "Zepheniah's Greed";
                            break;

                        }
                        //An Air of Debonair
                        case 23: {

                            loadoutTwoPaintColor = "An Air of Debonair";
                            break;

                        }
                        //Balaclavas Are Forever
                        case 24: {

                            loadoutTwoPaintColor = "Balaclavas are Forever";
                            break;

                        }
                        //Cream Spirit
                        case 25: {

                            loadoutTwoPaintColor = "Cream Spirit";
                            break;

                        }
                        //Operator's Overalls
                        case 26: {

                            loadoutTwoPaintColor = "Operator's Overalls";
                            break;

                        }
                        //Team Spirit
                        case 27: {

                            loadoutTwoPaintColor = "Team Spirit";
                            break;

                        }
                        //The Value of Teamwork
                        case 28: {

                            loadoutTwoPaintColor = "The Value of Teamwork";
                            break;

                        }
                        //Waterlogged Lab Coat
                        case 29: {

                            loadoutTwoPaintColor = "Waterlogged Lab Coat";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with choosing loadout two's paint");
                            break;

                        }

                    }

                }
                break;

            }
            case 3: {

                int paintYesNo = (int) (Math.random() * 2 + 1);
                if (paintYesNo == 2) {

                    int paintChooser = (int) (Math.random() * 29 + 1);
                    switch (paintChooser) {

                        //A Color Similar to Slate
                        case 1: {

                            loadoutThreePaintColor = "A Color Similar to Slate";
                            break;

                        }
                        //A Deep Commitment to Purple
                        case 2: {

                            loadoutThreePaintColor = "A Deep Commitment to Purple";
                            break;

                        }
                        //A Distinctive Lack of Hue
                        case 3: {

                            loadoutThreePaintColor = "A Distinctive Lack of Hue";
                            break;

                        }
                        //A Mann's Mint
                        case 4: {

                            loadoutThreePaintColor = "A Mann's Mint";
                            break;

                        }
                        //After Eight
                        case 5: {

                            loadoutThreePaintColor = "After Eight";
                            break;

                        }
                        //Aged Moustache Grey
                        case 6: {

                            loadoutThreePaintColor = "Aged Moustache Grey";
                            break;

                        }
                        //An Extraordinary Abundance of Tinge
                        case 7: {

                            loadoutThreePaintColor = "An Extraordinary Abundance of Tinge";
                            break;

                        }
                        //Australium Gold
                        case 8: {

                            loadoutThreePaintColor = "Australium Gold";
                            break;

                        }
                        //Color No. 216-190=216
                        case 9: {

                            loadoutThreePaintColor = "Color No. 216-190-216";
                            break;

                        }
                        //Dark Salmon Injustice
                        case 10: {

                            loadoutThreePaintColor = "Dark Salmon Injustice";
                            break;

                        }
                        //Drably Olive
                        case 11: {

                            loadoutThreePaintColor = "Drably Olive";
                            break;

                        }
                        //Indubitably Green
                        case 12: {

                            loadoutThreePaintColor = "Indubitably Green";
                            break;

                        }
                        //Mann Co. Orange
                        case 13: {

                            loadoutThreePaintColor = "Indubitably Green";
                            break;

                        }
                        //Muskelmannbraun
                        case 14: {

                            loadoutThreePaintColor = "Muskelmannbraun";
                            break;

                        }
                        //Noble Hatteer's Violet
                        case 15: {

                            loadoutThreePaintColor = "Noble Hatter's Violet";
                            break;

                        }
                        //Peculiarly Drab Tincture
                        case 16: {

                            loadoutThreePaintColor = "Peculiarly Drab Tincture";
                            break;

                        }
                        //Pink as Hell
                        case 17: {

                            loadoutThreePaintColor = "Pink as Hell";
                            break;

                        }
                        //Radigan Conagher Brown
                        case 18: {

                            loadoutThreePaintColor = "Radigan Conagher Brown";
                            break;

                        }
                        //The Bitter Taste of Defeat and Lime
                        case 19: {

                            loadoutThreePaintColor = "The BBitter Taste of Defeat and Lime";
                            break;

                        }
                        //The Color of a Gentlemann's Business Pants
                        case 20: {

                            loadoutThreePaintColor = "The Color of a Gentlemann's Business Pants";
                            break;

                        }
                        //Ye Olde Rustic Colour
                        case 21: {

                            loadoutThreePaintColor = "Ye Olde Rustic Colour";
                            break;

                        }
                        //Zepheniah's Greed
                        case 22: {

                            loadoutThreePaintColor = "Zepheniah's Greed";
                            break;

                        }
                        //An Air of Debonair
                        case 23: {

                            loadoutThreePaintColor = "An Air of Debonair";
                            break;

                        }
                        //Balaclavas Are Forever
                        case 24: {

                            loadoutThreePaintColor = "Balaclavas are Forever";
                            break;

                        }
                        //Cream Spirit
                        case 25: {

                            loadoutThreePaintColor = "Cream Spirit";
                            break;

                        }
                        //Operator's Overalls
                        case 26: {

                            loadoutThreePaintColor = "Operator's Overalls";
                            break;

                        }
                        //Team Spirit
                        case 27: {

                            loadoutThreePaintColor = "Team Spirit";
                            break;

                        }
                        //The Value of Teamwork
                        case 28: {

                            loadoutThreePaintColor = "The Value of Teamwork";
                            break;

                        }
                        //Waterlogged Lab Coat
                        case 29: {

                            loadoutThreePaintColor = "Waterlogged Lab Coat";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with choosing loadout one's paint");

                        }

                    }

                }
                break;

            }
            default: {

                System.out.println("Something went wrong with calling the paint method");
                break;

            }

        }

    }
    //Standard unusual selector
    private void standardUnusualMethod(int loadoutNumber) {

        switch (loadoutNumber) {

            case 1: {

                int unusualYesNo = (int) (Math.random() * 22 + 1);
                if (unusualYesNo == 2) {

                    int unusualChooser = (int) (Math.random() * 66 + 1);
                    switch (unusualChooser) {

                        //Burning Flames
                        case 1: {

                            loadoutOneUnusualEffect = "Burning Flames";
                            break;

                        }
                        //Circling Hearts
                        case 2: {

                            loadoutOneUnusualEffect = "Circling Hearts";
                            break;

                        }
                        //Circling Peace Sign
                        case 3: {

                            loadoutOneUnusualEffect = "Circling Peace Sign";
                            break;

                        }
                        //Circling TF Logo
                        case 4: {

                            loadoutOneUnusualEffect = "Circling TF Logo";
                            break;

                        }
                        //Green Confetti
                        case 5: {

                            loadoutOneUnusualEffect = "Green Confetti";
                            break;

                        }
                        //Green Energy
                        case 6: {

                            loadoutOneUnusualEffect = "Green Energy";
                            break;

                        }
                        //Haunted Ghosts
                        case 7: {

                            loadoutOneUnusualEffect = "Haunted Ghosts";
                            break;

                        }
                        //Massed Flies
                        case 8: {

                            loadoutOneUnusualEffect = "Massed Flies";
                            break;

                        }
                        //Purple Confetti
                        case 9: {

                            loadoutOneUnusualEffect = "Purple Confetti";
                            break;

                        }
                        //Purple Energy
                        case 10: {

                            loadoutOneUnusualEffect = "Purple Energy";
                            break;

                        }
                        //Scorching Flames
                        case 11: {

                            loadoutOneUnusualEffect = "Scorching Flames";
                            break;

                        }
                        //Searing Plasma
                        case 12: {

                            loadoutOneUnusualEffect = "Searing Plasma";
                            break;

                        }
                        //Sunbeams
                        case 13: {

                            loadoutOneUnusualEffect = "Sunbeams";
                            break;

                        }
                        //Vivid Plasma
                        case 14: {

                            loadoutOneUnusualEffect = "Vivid Plasma";
                            break;

                        }
                        //Blizzardy Storm
                        case 15: {

                            loadoutOneUnusualEffect = "Blizzardy Storm";
                            break;

                        }
                        //Bubbling
                        case 16: {

                            loadoutOneUnusualEffect = "Bubbling";
                            break;

                        }
                        //Nuts n' Bolts
                        case 17: {

                            loadoutOneUnusualEffect = "Nuts n' Bolts";
                            break;

                        }
                        //Orbiting Fire
                        case 18: {

                            loadoutOneUnusualEffect = "Orbiting Fire";
                            break;

                        }
                        //Orbiting Planets
                        case 19: {

                            loadoutOneUnusualEffect = "Orbiting Planets";
                            break;

                        }
                        //Smoking
                        case 20: {

                            loadoutOneUnusualEffect = "Smoking";
                            break;

                        }
                        //Steaming
                        case 21: {

                            loadoutOneUnusualEffect = "Steaming";
                            break;

                        }
                        //Stormy Storm
                        case 22: {

                            loadoutOneUnusualEffect = "Stormy Storm";
                            break;

                        }
                        //Aces High
                        case 23: {

                            loadoutOneUnusualEffect = "Aces High";
                            break;

                        }
                        //Cloud 9
                        case 24: {

                            loadoutOneUnusualEffect = "Cloud 9";
                            break;

                        }
                        //Dead Presidents
                        case 25: {

                            loadoutOneUnusualEffect = "Dead Presidents";
                            break;

                        }
                        //Disco Beat Down
                        case 26: {

                            loadoutOneUnusualEffect = "Disco Beat Down";
                            break;

                        }
                        //Kill-a-Watt
                        case 27: {

                            loadoutOneUnusualEffect = "Kill-A-Watt";
                            break;

                        }
                        //Miami Nights
                        case 28: {

                            loadoutOneUnusualEffect = "Miami Nights";
                            break;

                        }
                        //Terror-Watt
                        case 29: {

                            loadoutOneUnusualEffect = "Terror-Watt";
                            break;

                        }
                        //Cauldron Bubbles
                        case 30: {

                            loadoutOneUnusualEffect = "Cauldron Bubbles";
                            break;

                        }
                        //Cloudy Moon
                        case 31: {

                            loadoutOneUnusualEffect = "Cloudy Moon";
                            break;

                        }
                        //Eerie Orbiting Fire
                        case 32: {

                            loadoutOneUnusualEffect = "Eerie Orbiting Fire";
                            break;

                        }
                        //Flaming Lantern
                        case 33: {

                            loadoutOneUnusualEffect = "Flaming Lantern";
                            break;

                        }
                        //Harvest Moon
                        case 34: {

                            loadoutOneUnusualEffect = "Harvest Moon";
                            break;

                        }
                        //It's A Secret to Everybody
                        case 35: {

                            loadoutOneUnusualEffect = "It's A Secret To Everybody";
                            break;

                        }
                        //Knifestorm
                        case 36: {

                            loadoutOneUnusualEffect = "Knifestorm";
                            break;

                        }
                        //Misty Skull
                        case 37: {

                            loadoutOneUnusualEffect = "Misty Skull";
                            break;

                        }
                        //Stormy 13th Hour
                        case 38: {

                            loadoutOneUnusualEffect = "Stormy 13th Hour";
                            break;

                        }
                        //Arcana
                        case 39: {

                            loadoutOneUnusualEffect = "Arcana";
                            break;

                        }
                        //Chiroptera Venenata
                        case 40: {

                            loadoutOneUnusualEffect = "Chiroptera Venenata";
                            break;

                        }
                        //Darkblaze
                        case 41: {

                            loadoutOneUnusualEffect = "Darkblaze";
                            break;

                        }
                        //Demonflame
                        case 42: {

                            loadoutOneUnusualEffect = "Demonflame";
                            break;

                        }
                        //Hellfire
                        case 43: {

                            loadoutOneUnusualEffect = "Hellfire";
                            break;

                        }
                        //Poisoned Shadows
                        case 44: {

                            loadoutOneUnusualEffect = "Poisoned Shadows";
                            break;

                        }
                        //Something Burning This Way Comes
                        case 45: {

                            loadoutOneUnusualEffect = "Something Burning This Way Comes";
                            break;

                        }
                        //Spellbound
                        case 46: {

                            loadoutOneUnusualEffect = "Spellbound";
                            break;

                        }
                        //Amaranthine
                        case 47: {

                            loadoutOneUnusualEffect = "Amaranthine";
                            break;

                        }
                        //Bonzo The All-Gnawing
                        case 48: {

                            loadoutOneUnusualEffect = "Bonzo The All-Gnawing";
                            break;

                        }
                        //Ghastly Ghosts Jr.
                        case 49: {

                            loadoutOneUnusualEffect = "Ghastly Ghosts Jr.";
                            break;

                        }
                        //Haunted Phantasm Jr.
                        case 50: {

                            loadoutOneUnusualEffect = "Haunted Phantasm Jr.";
                            break;

                        }
                        //Stare From Beyond
                        case 51: {

                            loadoutOneUnusualEffect = "Stare From Beyond";
                            break;

                        }
                        //Ooze
                        case 52: {

                            loadoutOneUnusualEffect = "Ooze";
                            break;

                        }
                        //Anti-Freeze
                        case 53: {

                            loadoutOneUnusualEffect = "Anti-Freeze";
                            break;

                        }
                        //Electrostatic
                        case 54: {

                            loadoutOneUnusualEffect = "Electrostatic";
                            break;

                        }
                        //Green Black Hole
                        case 55: {

                            loadoutOneUnusualEffect = "Green Black Hole";
                            break;

                        }
                        //Memory Leak
                        case 56: {

                            loadoutOneUnusualEffect = "Memory Leak";
                            break;

                        }
                        //Overclocked
                        case 57: {

                            loadoutOneUnusualEffect = "Overclocked";
                            break;

                        }
                        //Phosphorous
                        case 58: {

                            loadoutOneUnusualEffect = "Phosphorous";
                            break;

                        }
                        //Power Surge
                        case 59: {

                            loadoutOneUnusualEffect = "Power Surge";
                            break;

                        }
                        //Roboactive
                        case 60: {

                            loadoutOneUnusualEffect = "Roboactive";
                            break;

                        }
                        //Sulphurous
                        case 61: {

                            loadoutOneUnusualEffect = "Sulphurous";
                            break;

                        }
                        //Time Warp
                        case 62: {

                            loadoutOneUnusualEffect = "Time Warp";
                            break;

                        }
                        //Death at Dusk
                        case 63: {

                            loadoutOneUnusualEffect = "Death at Dusk";
                            break;

                        }
                        //Frostbite
                        case 64: {

                            loadoutOneUnusualEffect = "Frostbite";
                            break;

                        }
                        //Molten Mallard
                        case 65: {

                            loadoutOneUnusualEffect = "Molten Mallard";
                            break;

                        }
                        //Morning Glory
                        case 66: {

                            loadoutOneUnusualEffect = "Morning Glory";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with loadout one's unusual effect (Standard");
                            break;

                        }

                    }

                }
                break;

            }
            case 2: {

                int unusualYesNo = (int) (Math.random() * 22 + 1);
                if (unusualYesNo == 2) {

                    int unusualChooser = (int) (Math.random() * 66 + 1);
                    switch (unusualChooser) {

                        //Burning Flames
                        case 1: {

                            loadoutTwoUnusualEffect = "Burning Flames";
                            break;

                        }
                        //Circling Hearts
                        case 2: {

                            loadoutTwoUnusualEffect = "Circling Hearts";
                            break;

                        }
                        //Circling Peace Sign
                        case 3: {

                            loadoutTwoUnusualEffect = "Circling Peace Sign";
                            break;

                        }
                        //Circling TF Logo
                        case 4: {

                            loadoutTwoUnusualEffect = "Circling TF Logo";
                            break;

                        }
                        //Green Confetti
                        case 5: {

                            loadoutTwoUnusualEffect = "Green Confetti";
                            break;

                        }
                        //Green Energy
                        case 6: {

                            loadoutTwoUnusualEffect = "Green Energy";
                            break;

                        }
                        //Haunted Ghosts
                        case 7: {

                            loadoutTwoUnusualEffect = "Haunted Ghosts";
                            break;

                        }
                        //Massed Flies
                        case 8: {

                            loadoutTwoUnusualEffect = "Massed Flies";
                            break;

                        }
                        //Purple Confetti
                        case 9: {

                            loadoutTwoUnusualEffect = "Purple Confetti";
                            break;

                        }
                        //Purple Energy
                        case 10: {

                            loadoutTwoUnusualEffect = "Purple Energy";
                            break;

                        }
                        //Scorching Flames
                        case 11: {

                            loadoutTwoUnusualEffect = "Scorching Flames";
                            break;

                        }
                        //Searing Plasma
                        case 12: {

                            loadoutTwoUnusualEffect = "Searing Plasma";
                            break;

                        }
                        //Sunbeams
                        case 13: {

                            loadoutTwoUnusualEffect = "Sunbeams";
                            break;

                        }
                        //Vivid Plasma
                        case 14: {

                            loadoutTwoUnusualEffect = "Vivid Plasma";
                            break;

                        }
                        //Blizzardy Storm
                        case 15: {

                            loadoutTwoUnusualEffect = "Blizzardy Storm";
                            break;

                        }
                        //Bubbling
                        case 16: {

                            loadoutTwoUnusualEffect = "Bubbling";
                            break;

                        }
                        //Nuts n' Bolts
                        case 17: {

                            loadoutTwoUnusualEffect = "Nuts n' Bolts";
                            break;

                        }
                        //Orbiting Fire
                        case 18: {

                            loadoutTwoUnusualEffect = "Orbiting Fire";
                            break;

                        }
                        //Orbiting Planets
                        case 19: {

                            loadoutTwoUnusualEffect = "Orbiting Planets";
                            break;

                        }
                        //Smoking
                        case 20: {

                            loadoutTwoUnusualEffect = "Smoking";
                            break;

                        }
                        //Steaming
                        case 21: {

                            loadoutTwoUnusualEffect = "Steaming";
                            break;

                        }
                        //Stormy Storm
                        case 22: {

                            loadoutTwoUnusualEffect = "Stormy Storm";
                            break;

                        }
                        //Aces High
                        case 23: {

                            loadoutTwoUnusualEffect = "Aces High";
                            break;

                        }
                        //Cloud 9
                        case 24: {

                            loadoutTwoUnusualEffect = "Cloud 9";
                            break;

                        }
                        //Dead Presidents
                        case 25: {

                            loadoutTwoUnusualEffect = "Dead Presidents";
                            break;

                        }
                        //Disco Beat Down
                        case 26: {

                            loadoutTwoUnusualEffect = "Disco Beat Down";
                            break;

                        }
                        //Kill-a-Watt
                        case 27: {

                            loadoutTwoUnusualEffect = "Kill-A-Watt";
                            break;

                        }
                        //Miami Nights
                        case 28: {

                            loadoutTwoUnusualEffect = "Miami Nights";
                            break;

                        }
                        //Terror-Watt
                        case 29: {

                            loadoutTwoUnusualEffect = "Terror-Watt";
                            break;

                        }
                        //Cauldron Bubbles
                        case 30: {

                            loadoutTwoUnusualEffect = "Cauldron Bubbles";
                            break;

                        }
                        //Cloudy Moon
                        case 31: {

                            loadoutTwoUnusualEffect = "Cloudy Moon";
                            break;

                        }
                        //Eerie Orbiting Fire
                        case 32: {

                            loadoutTwoUnusualEffect = "Eerie Orbiting Fire";
                            break;

                        }
                        //Flaming Lantern
                        case 33: {

                            loadoutTwoUnusualEffect = "Flaming Lantern";
                            break;

                        }
                        //Harvest Moon
                        case 34: {

                            loadoutTwoUnusualEffect = "Harvest Moon";
                            break;

                        }
                        //It's A Secret to Everybody
                        case 35: {

                            loadoutTwoUnusualEffect = "It's A Secret To Everybody";
                            break;

                        }
                        //Knifestorm
                        case 36: {

                            loadoutTwoUnusualEffect = "Knifestorm";
                            break;

                        }
                        //Misty Skull
                        case 37: {

                            loadoutTwoUnusualEffect = "Misty Skull";
                            break;

                        }
                        //Stormy 13th Hour
                        case 38: {

                            loadoutTwoUnusualEffect = "Stormy 13th Hour";
                            break;

                        }
                        //Arcana
                        case 39: {

                            loadoutTwoUnusualEffect = "Arcana";
                            break;

                        }
                        //Chiroptera Venenata
                        case 40: {

                            loadoutTwoUnusualEffect = "Chiroptera Venenata";
                            break;

                        }
                        //Darkblaze
                        case 41: {

                            loadoutTwoUnusualEffect = "Darkblaze";
                            break;

                        }
                        //Demonflame
                        case 42: {

                            loadoutTwoUnusualEffect = "Demonflame";
                            break;

                        }
                        //Hellfire
                        case 43: {

                            loadoutTwoUnusualEffect = "Hellfire";
                            break;

                        }
                        //Poisoned Shadows
                        case 44: {

                            loadoutTwoUnusualEffect = "Poisoned Shadows";
                            break;

                        }
                        //Something Burning This Way Comes
                        case 45: {

                            loadoutTwoUnusualEffect = "Something Burning This Way Comes";
                            break;

                        }
                        //Spellbound
                        case 46: {

                            loadoutTwoUnusualEffect = "Spellbound";
                            break;

                        }
                        //Amaranthine
                        case 47: {

                            loadoutTwoUnusualEffect = "Amaranthine";
                            break;

                        }
                        //Bonzo The All-Gnawing
                        case 48: {

                            loadoutTwoUnusualEffect = "Bonzo The All-Gnawing";
                            break;

                        }
                        //Ghastly Ghosts Jr.
                        case 49: {

                            loadoutTwoUnusualEffect = "Ghastly Ghosts Jr.";
                            break;

                        }
                        //Haunted Phantasm Jr.
                        case 50: {

                            loadoutTwoUnusualEffect = "Haunted Phantasm Jr.";
                            break;

                        }
                        //Stare From Beyond
                        case 51: {

                            loadoutTwoUnusualEffect = "Stare From Beyond";
                            break;

                        }
                        //Ooze
                        case 52: {

                            loadoutTwoUnusualEffect = "Ooze";
                            break;

                        }
                        //Anti-Freeze
                        case 53: {

                            loadoutTwoUnusualEffect = "Anti-Freeze";
                            break;

                        }
                        //Electrostatic
                        case 54: {

                            loadoutTwoUnusualEffect = "Electrostatic";
                            break;

                        }
                        //Green Black Hole
                        case 55: {

                            loadoutTwoUnusualEffect = "Green Black Hole";
                            break;

                        }
                        //Memory Leak
                        case 56: {

                            loadoutTwoUnusualEffect = "Memory Leak";
                            break;

                        }
                        //Overclocked
                        case 57: {

                            loadoutTwoUnusualEffect = "Overclocked";
                            break;

                        }
                        //Phosphorous
                        case 58: {

                            loadoutTwoUnusualEffect = "Phosphorous";
                            break;

                        }
                        //Power Surge
                        case 59: {

                            loadoutTwoUnusualEffect = "Power Surge";
                            break;

                        }
                        //Roboactive
                        case 60: {

                            loadoutTwoUnusualEffect = "Roboactive";
                            break;

                        }
                        //Sulphurous
                        case 61: {

                            loadoutTwoUnusualEffect = "Sulphurous";
                            break;

                        }
                        //Time Warp
                        case 62: {

                            loadoutTwoUnusualEffect = "Time Warp";
                            break;

                        }
                        //Death at Dusk
                        case 63: {

                            loadoutTwoUnusualEffect = "Death at Dusk";
                            break;

                        }
                        //Frostbite
                        case 64: {

                            loadoutTwoUnusualEffect = "Frostbite";
                            break;

                        }
                        //Molten Mallard
                        case 65: {

                            loadoutTwoUnusualEffect = "Molten Mallard";
                            break;

                        }
                        //Morning Glory
                        case 66: {

                            loadoutTwoUnusualEffect = "Morning Glory";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with loadout one's unusual effect (Standard");
                            break;

                        }

                    }

                }
                break;

            }
            case 3: {

                int unusualYesNo = (int) (Math.random() * 22 + 1);
                if (unusualYesNo == 2) {

                    int unusualChooser = (int) (Math.random() * 66 + 1);
                    switch (unusualChooser) {

                        //Burning Flames
                        case 1: {

                            loadoutThreeUnusualEffect = "Burning Flames";
                            break;

                        }
                        //Circling Hearts
                        case 2: {

                            loadoutThreeUnusualEffect = "Circling Hearts";
                            break;

                        }
                        //Circling Peace Sign
                        case 3: {

                            loadoutThreeUnusualEffect = "Circling Peace Sign";
                            break;

                        }
                        //Circling TF Logo
                        case 4: {

                            loadoutThreeUnusualEffect = "Circling TF Logo";
                            break;

                        }
                        //Green Confetti
                        case 5: {

                            loadoutThreeUnusualEffect = "Green Confetti";
                            break;

                        }
                        //Green Energy
                        case 6: {

                            loadoutThreeUnusualEffect = "Green Energy";
                            break;

                        }
                        //Haunted Ghosts
                        case 7: {

                            loadoutThreeUnusualEffect = "Haunted Ghosts";
                            break;

                        }
                        //Massed Flies
                        case 8: {

                            loadoutThreeUnusualEffect = "Massed Flies";
                            break;

                        }
                        //Purple Confetti
                        case 9: {

                            loadoutThreeUnusualEffect = "Purple Confetti";
                            break;

                        }
                        //Purple Energy
                        case 10: {

                            loadoutThreeUnusualEffect = "Purple Energy";
                            break;

                        }
                        //Scorching Flames
                        case 11: {

                            loadoutThreeUnusualEffect = "Scorching Flames";
                            break;

                        }
                        //Searing Plasma
                        case 12: {

                            loadoutThreeUnusualEffect = "Searing Plasma";
                            break;

                        }
                        //Sunbeams
                        case 13: {

                            loadoutThreeUnusualEffect = "Sunbeams";
                            break;

                        }
                        //Vivid Plasma
                        case 14: {

                            loadoutThreeUnusualEffect = "Vivid Plasma";
                            break;

                        }
                        //Blizzardy Storm
                        case 15: {

                            loadoutThreeUnusualEffect = "Blizzardy Storm";
                            break;

                        }
                        //Bubbling
                        case 16: {

                            loadoutThreeUnusualEffect = "Bubbling";
                            break;

                        }
                        //Nuts n' Bolts
                        case 17: {

                            loadoutThreeUnusualEffect = "Nuts n' Bolts";
                            break;

                        }
                        //Orbiting Fire
                        case 18: {

                            loadoutThreeUnusualEffect = "Orbiting Fire";
                            break;

                        }
                        //Orbiting Planets
                        case 19: {

                            loadoutThreeUnusualEffect = "Orbiting Planets";
                            break;

                        }
                        //Smoking
                        case 20: {

                            loadoutThreeUnusualEffect = "Smoking";
                            break;

                        }
                        //Steaming
                        case 21: {

                            loadoutThreeUnusualEffect = "Steaming";
                            break;

                        }
                        //Stormy Storm
                        case 22: {

                            loadoutThreeUnusualEffect = "Stormy Storm";
                            break;

                        }
                        //Aces High
                        case 23: {

                            loadoutThreeUnusualEffect = "Aces High";
                            break;

                        }
                        //Cloud 9
                        case 24: {

                            loadoutThreeUnusualEffect = "Cloud 9";
                            break;

                        }
                        //Dead Presidents
                        case 25: {

                            loadoutThreeUnusualEffect = "Dead Presidents";
                            break;

                        }
                        //Disco Beat Down
                        case 26: {

                            loadoutThreeUnusualEffect = "Disco Beat Down";
                            break;

                        }
                        //Kill-a-Watt
                        case 27: {

                            loadoutThreeUnusualEffect = "Kill-A-Watt";
                            break;

                        }
                        //Miami Nights
                        case 28: {

                            loadoutThreeUnusualEffect = "Miami Nights";
                            break;

                        }
                        //Terror-Watt
                        case 29: {

                            loadoutThreeUnusualEffect = "Terror-Watt";
                            break;

                        }
                        //Cauldron Bubbles
                        case 30: {

                            loadoutThreeUnusualEffect = "Cauldron Bubbles";
                            break;

                        }
                        //Cloudy Moon
                        case 31: {

                            loadoutThreeUnusualEffect = "Cloudy Moon";
                            break;

                        }
                        //Eerie Orbiting Fire
                        case 32: {

                            loadoutThreeUnusualEffect = "Eerie Orbiting Fire";
                            break;

                        }
                        //Flaming Lantern
                        case 33: {

                            loadoutThreeUnusualEffect = "Flaming Lantern";
                            break;

                        }
                        //Harvest Moon
                        case 34: {

                            loadoutThreeUnusualEffect = "Harvest Moon";
                            break;

                        }
                        //It's A Secret to Everybody
                        case 35: {

                            loadoutThreeUnusualEffect = "It's A Secret To Everybody";
                            break;

                        }
                        //Knifestorm
                        case 36: {

                            loadoutThreeUnusualEffect = "Knifestorm";
                            break;

                        }
                        //Misty Skull
                        case 37: {

                            loadoutThreeUnusualEffect = "Misty Skull";
                            break;

                        }
                        //Stormy 13th Hour
                        case 38: {

                            loadoutThreeUnusualEffect = "Stormy 13th Hour";
                            break;

                        }
                        //Arcana
                        case 39: {

                            loadoutThreeUnusualEffect = "Arcana";
                            break;

                        }
                        //Chiroptera Venenata
                        case 40: {

                            loadoutThreeUnusualEffect = "Chiroptera Venenata";
                            break;

                        }
                        //Darkblaze
                        case 41: {

                            loadoutThreeUnusualEffect = "Darkblaze";
                            break;

                        }
                        //Demonflame
                        case 42: {

                            loadoutThreeUnusualEffect = "Demonflame";
                            break;

                        }
                        //Hellfire
                        case 43: {

                            loadoutThreeUnusualEffect = "Hellfire";
                            break;

                        }
                        //Poisoned Shadows
                        case 44: {

                            loadoutThreeUnusualEffect = "Poisoned Shadows";
                            break;

                        }
                        //Something Burning This Way Comes
                        case 45: {

                            loadoutThreeUnusualEffect = "Something Burning This Way Comes";
                            break;

                        }
                        //Spellbound
                        case 46: {

                            loadoutThreeUnusualEffect = "Spellbound";
                            break;

                        }
                        //Amaranthine
                        case 47: {

                            loadoutThreeUnusualEffect = "Amaranthine";
                            break;

                        }
                        //Bonzo The All-Gnawing
                        case 48: {

                            loadoutThreeUnusualEffect = "Bonzo The All-Gnawing";
                            break;

                        }
                        //Ghastly Ghosts Jr.
                        case 49: {

                            loadoutThreeUnusualEffect = "Ghastly Ghosts Jr.";
                            break;

                        }
                        //Haunted Phantasm Jr.
                        case 50: {

                            loadoutThreeUnusualEffect = "Haunted Phantasm Jr.";
                            break;

                        }
                        //Stare From Beyond
                        case 51: {

                            loadoutThreeUnusualEffect = "Stare From Beyond";
                            break;

                        }
                        //Ooze
                        case 52: {

                            loadoutThreeUnusualEffect = "Ooze";
                            break;

                        }
                        //Anti-Freeze
                        case 53: {

                            loadoutThreeUnusualEffect = "Anti-Freeze";
                            break;

                        }
                        //Electrostatic
                        case 54: {

                            loadoutThreeUnusualEffect = "Electrostatic";
                            break;

                        }
                        //Green Black Hole
                        case 55: {

                            loadoutThreeUnusualEffect = "Green Black Hole";
                            break;

                        }
                        //Memory Leak
                        case 56: {

                            loadoutThreeUnusualEffect = "Memory Leak";
                            break;

                        }
                        //Overclocked
                        case 57: {

                            loadoutThreeUnusualEffect = "Overclocked";
                            break;

                        }
                        //Phosphorous
                        case 58: {

                            loadoutThreeUnusualEffect = "Phosphorous";
                            break;

                        }
                        //Power Surge
                        case 59: {

                            loadoutThreeUnusualEffect = "Power Surge";
                            break;

                        }
                        //Roboactive
                        case 60: {

                            loadoutThreeUnusualEffect = "Roboactive";
                            break;

                        }
                        //Sulphurous
                        case 61: {

                            loadoutThreeUnusualEffect = "Sulphurous";
                            break;

                        }
                        //Time Warp
                        case 62: {

                            loadoutThreeUnusualEffect = "Time Warp";
                            break;

                        }
                        //Death at Dusk
                        case 63: {

                            loadoutThreeUnusualEffect = "Death at Dusk";
                            break;

                        }
                        //Frostbite
                        case 64: {

                            loadoutThreeUnusualEffect = "Frostbite";
                            break;

                        }
                        //Molten Mallard
                        case 65: {

                            loadoutThreeUnusualEffect = "Molten Mallard";
                            break;

                        }
                        //Morning Glory
                        case 66: {

                            loadoutThreeUnusualEffect = "Morning Glory";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with loadout one's unusual effect (Standard");
                            break;

                        }

                    }

                }
                break;

            }
            default: {

                System.out.println("Something went wrong with calling the unusual method (Standard)");
                break;

            }

        }

    }
    //Scream Fortress 2015 unusual effect selector
    private void sf2015UnusualMethod(int loadoutNumber) {

        switch (loadoutNumber) {

            case 1: {

                int unusualYesNo = (int) (Math.random() * 2 + 1);
                if (unusualYesNo == 2) {

                    int unusualChooser = (int) (Math.random() * 7 + 1);
                    switch (unusualChooser) {

                        //Death by Disco
                        case 1: {

                            loadoutOneUnusualEffect = "Death by Disco";
                            break;

                        }
                        //It's a mystery to everyone
                        case 2: {

                            loadoutOneUnusualEffect = "It's a mystery to everyone";
                            break;

                        }
                        //It's a puzzle to me
                        case 3: {

                            loadoutOneUnusualEffect = "It's a puzzle to me";
                            break;

                        }
                        //Ether Trail
                        case 4: {

                            loadoutOneUnusualEffect = "Ether Trail";
                            break;

                        }
                        //Nether Trail
                        case 5: {

                            loadoutOneUnusualEffect = "Nether Trail";
                            break;

                        }
                        //Ancient Eldritch
                        case 6: {

                            loadoutOneUnusualEffect = "Ancient Eldritch";
                            break;

                        }
                        //Eldritch Flame
                        case 7: {

                            loadoutOneUnusualEffect = "Eldritch Flame";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with choosing loadout one's unusual effect (sf2015)");
                            break;

                        }

                    }

                }
                break;

            }
            case 2: {

                int unusualYesNo = (int) (Math.random() * 2 + 1);
                if (unusualYesNo == 2) {

                    int unusualChooser = (int) (Math.random() * 7 + 1);
                    switch (unusualChooser) {

                        //Death by Disco
                        case 1: {

                            loadoutTwoUnusualEffect = "Death by Disco";
                            break;

                        }
                        //It's a mystery to everyone
                        case 2: {

                            loadoutTwoUnusualEffect = "It's a mystery to everyone";
                            break;

                        }
                        //It's a puzzle to me
                        case 3: {

                            loadoutTwoUnusualEffect = "It's a puzzle to me";
                            break;

                        }
                        //Ether Trail
                        case 4: {

                            loadoutTwoUnusualEffect = "Ether Trail";
                            break;

                        }
                        //Nether Trail
                        case 5: {

                            loadoutTwoUnusualEffect = "Nether Trail";
                            break;

                        }
                        //Ancient Eldritch
                        case 6: {

                            loadoutTwoUnusualEffect = "Ancient Eldritch";
                            break;

                        }
                        //Eldritch Flame
                        case 7: {

                            loadoutTwoUnusualEffect = "Eldritch Flame";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with choosing loadout one's unusual effect (sf2015)");
                            break;

                        }

                    }

                }
                break;

            }
            case 3: {

                int unusualYesNo = (int) (Math.random() * 2 + 1);
                if (unusualYesNo == 2) {

                    int unusualChooser = (int) (Math.random() * 7 + 1);
                    switch (unusualChooser) {

                        //Death by Disco
                        case 1: {

                            loadoutThreeUnusualEffect = "Death by Disco";
                            break;

                        }
                        //It's a mystery to everyone
                        case 2: {

                            loadoutThreeUnusualEffect = "It's a mystery to everyone";
                            break;

                        }
                        //It's a puzzle to me
                        case 3: {

                            loadoutThreeUnusualEffect = "It's a puzzle to me";
                            break;

                        }
                        //Ether Trail
                        case 4: {

                            loadoutThreeUnusualEffect = "Ether Trail";
                            break;

                        }
                        //Nether Trail
                        case 5: {

                            loadoutThreeUnusualEffect = "Nether Trail";
                            break;

                        }
                        //Ancient Eldritch
                        case 6: {

                            loadoutThreeUnusualEffect = "Ancient Eldritch";
                            break;

                        }
                        //Eldritch Flame
                        case 7: {

                            loadoutThreeUnusualEffect = "Eldritch Flame";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with choosing loadout one's unusual effect (sf2015)");
                            break;

                        }

                    }

                }
                break;

            }
            default: {

                System.out.println("Something went wrong with calling the unusual method (sf2015)");
                break;

            }

        }

    }
    //Scream Fortress 2016 unusual effect selector
    private void sf2016UnusualMethod(int loadoutNumber) {

        switch (loadoutNumber) {

            case 1: {

                int unusualYesNo = (int) (Math.random() * 2 + 1);
                if (unusualYesNo == 2) {

                    int unusualChooser = (int) (Math.random() * 4 + 1);
                    switch (unusualChooser) {

                        //Neutron Star
                        case 1: {

                            loadoutOneUnusualEffect = "Neutron Star";
                            break;

                        }
                        //Starstorm Slumber
                        case 2: {

                            loadoutOneUnusualEffect = "Starstorm Slumber";
                            break;

                        }
                        //Starstorm Insomnia
                        case 3: {

                            loadoutOneUnusualEffect = "Starstorm Insomnia";
                            break;

                        }
                        //Tesla Coil
                        case 4: {

                            loadoutOneUnusualEffect = "Tesla Coil";
                            break;

                        }
                        default: {

                            System.out.println("Someting went wrong with choosing loadout one's unusual effect (sf2016)");
                            break;

                        }

                    }

                }
                break;

            }
            case 2: {

                int unusualYesNo = (int) (Math.random() * 2 + 1);
                if (unusualYesNo == 2) {

                    int unusualChooser = (int) (Math.random() * 4 + 1);
                    switch (unusualChooser) {

                        //Neutron Star
                        case 1: {

                            loadoutTwoUnusualEffect = "Neutron Star";
                            break;

                        }
                        //Starstorm Slumber
                        case 2: {

                            loadoutTwoUnusualEffect = "Starstorm Slumber";
                            break;

                        }
                        //Starstorm Insomnia
                        case 3: {

                            loadoutTwoUnusualEffect = "Starstorm Insomnia";
                            break;

                        }
                        //Tesla Coil
                        case 4: {

                            loadoutTwoUnusualEffect = "Tesla Coil";
                            break;

                        }
                        default: {

                            System.out.println("Someting went wrong with choosing loadout one's unusual effect (sf2016)");
                            break;

                        }

                    }

                }
                break;

            }
            case 3: {

                int unusualYesNo = (int) (Math.random() * 2 + 1);
                if (unusualYesNo == 2) {

                    int unusualChooser = (int) (Math.random() * 4 + 1);
                    switch (unusualChooser) {

                        //Neutron Star
                        case 1: {

                            loadoutThreeUnusualEffect = "Neutron Star";
                            break;

                        }
                        //Starstorm Slumber
                        case 2: {

                            loadoutThreeUnusualEffect = "Starstorm Slumber";
                            break;

                        }
                        //Starstorm Insomnia
                        case 3: {

                            loadoutThreeUnusualEffect = "Starstorm Insomnia";
                            break;

                        }
                        //Tesla Coil
                        case 4: {

                            loadoutThreeUnusualEffect = "Tesla Coil";
                            break;

                        }
                        default: {

                            System.out.println("Someting went wrong with choosing loadout one's unusual effect (sf2016)");
                            break;

                        }

                    }

                }
                break;

            }
            default: {

                System.out.println("Something went wrong with calling the unusual method (sf216)");
                break;

            }

        }

    }
    //Invasion unusual effect selector
    private void invasionUnusualMethod(int loadoutNumber) {

        switch (loadoutNumber) {

            case 1: {

                int unusualYesNo = (int) (Math.random() * 2 + 1);
                if (unusualYesNo == 2) {

                    int unusualChooser = (int) (Math.random() * 9 + 1);
                    switch (unusualChooser) {

                        //Abduction
                        case 1: {

                            loadoutOneUnusualEffect = "Abduction";
                            break;

                        }
                        //Atomic
                        case 2: {

                            loadoutOneUnusualEffect = "Atomic";
                            break;

                        }
                        //Subatomic
                        case 3: {

                            loadoutOneUnusualEffect = "Subatomic";
                            break;

                        }
                        //Electric Hat Protector
                        case 4: {

                            loadoutOneUnusualEffect = "Electric Hat Protector";
                            break;

                        }
                        //Magnetic Hat Protector
                        case 5: {

                            loadoutOneUnusualEffect = "Magnetic Hat Protector";
                            break;

                        }
                        //Voltaic Hat Protector
                        case 6: {

                            loadoutOneUnusualEffect = "Voltaic Hat Protector";
                            break;

                        }
                        //Galactic Codex
                        case 7: {

                            loadoutOneUnusualEffect = "Galactic Codex";
                            break;

                        }
                        //Ancient Codex
                        case 8: {

                            loadoutOneUnusualEffect = "Ancient Codex";
                            break;

                        }
                        //Nebula
                        case 9: {

                            loadoutOneUnusualEffect = "Nebula";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong wtih choosing loadout one's unusual effect (Invasion)");
                            break;

                        }

                    }

                }
                break;

            }
            case 2: {

                int unusualYesNo = (int) (Math.random() * 2 + 1);
                if (unusualYesNo == 2) {

                    int unusualChooser = (int) (Math.random() * 9 + 1);
                    switch (unusualChooser) {

                        //Abduction
                        case 1: {

                            loadoutTwoUnusualEffect = "Abduction";
                            break;

                        }
                        //Atomic
                        case 2: {

                            loadoutTwoUnusualEffect = "Atomic";
                            break;

                        }
                        //Subatomic
                        case 3: {

                            loadoutTwoUnusualEffect = "Subatomic";
                            break;

                        }
                        //Electric Hat Protector
                        case 4: {

                            loadoutTwoUnusualEffect = "Electric Hat Protector";
                            break;

                        }
                        //Magnetic Hat Protector
                        case 5: {

                            loadoutTwoUnusualEffect = "Magnetic Hat Protector";
                            break;

                        }
                        //Voltaic Hat Protector
                        case 6: {

                            loadoutTwoUnusualEffect = "Voltaic Hat Protector";
                            break;

                        }
                        //Galactic Codex
                        case 7: {

                            loadoutTwoUnusualEffect = "Galactic Codex";
                            break;

                        }
                        //Ancient Codex
                        case 8: {

                            loadoutTwoUnusualEffect = "Ancient Codex";
                            break;

                        }
                        //Nebula
                        case 9: {

                            loadoutTwoUnusualEffect = "Nebula";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong wtih choosing loadout one's unusual effect (Invasion)");
                            break;

                        }

                    }

                }
                break;

            }
            case 3: {

                int unusualYesNo = (int) (Math.random() * 2 + 1);
                if (unusualYesNo == 2) {

                    int unusualChooser = (int) (Math.random() * 9 + 1);
                    switch (unusualChooser) {

                        //Abduction
                        case 1: {

                            loadoutThreeUnusualEffect = "Abduction";
                            break;

                        }
                        //Atomic
                        case 2: {

                            loadoutThreeUnusualEffect = "Atomic";
                            break;

                        }
                        //Subatomic
                        case 3: {

                            loadoutThreeUnusualEffect = "Subatomic";
                            break;

                        }
                        //Electric Hat Protector
                        case 4: {

                            loadoutThreeUnusualEffect = "Electric Hat Protector";
                            break;

                        }
                        //Magnetic Hat Protector
                        case 5: {

                            loadoutThreeUnusualEffect = "Magnetic Hat Protector";
                            break;

                        }
                        //Voltaic Hat Protector
                        case 6: {

                            loadoutThreeUnusualEffect = "Voltaic Hat Protector";
                            break;

                        }
                        //Galactic Codex
                        case 7: {

                            loadoutThreeUnusualEffect = "Galactic Codex";
                            break;

                        }
                        //Ancient Codex
                        case 8: {

                            loadoutThreeUnusualEffect = "Ancient Codex";
                            break;

                        }
                        //Nebula
                        case 9: {

                            loadoutThreeUnusualEffect = "Nebula";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong wtih choosing loadout one's unusual effect (Invasion)");
                            break;

                        }

                    }

                }
                break;

            }
            default: {

                System.out.println("Something went wrong with calling the unusual method (Invasion)");
                break;

            }

        }

    }
    private void killstreakMethod() {

        int killstreakYesNo = (int) (Math.random() * 2 + 1);
        if (killstreakYesNo == 1) {

            int killstreakVersion = (int) (Math.random() * 2 + 1);
            switch (killstreakVersion) {

                //Specialized Killstreak
                case 1: {

                    String killstreakSheen = "Something went wrong with choosing the killstreak sheen";
                    int killstreakSheenChooser = (int) (Math.random() * 7 + 1);
                    switch (killstreakSheenChooser) {


                        //Team Shine
                        case 1: {

                            killstreakSheen = "Team Shine";
                            break;

                        }
                        //Hot Rod
                        case 2: {

                            killstreakSheen = "Hot Rod";
                            break;

                        }
                        //Manndarin
                        case 3: {

                            killstreakSheen = "Manndarin";
                            break;

                        }
                        //Deadly Daffodil
                        case 4: {

                            killstreakSheen = "Deadly Daffodil";
                            break;

                        }
                        //Mean Green
                        case 5: {

                            killstreakSheen = "Mean Green";
                            break;

                        }
                        //Agonizing Emerald
                        case 6: {

                            killstreakSheen = "Agonizing Emerald";
                            break;

                        }
                        //Villainous Violet
                        case 7: {

                            killstreakSheen = "Villainous Violet";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with the switch statement for the killstreak sheens");
                            break;

                        }


                    }
                    killstreak = "specialized killstreak - " + killstreakSheen;
                    break;

                }
                //Professional Killstreak
                case 2: {

                    String killstreakSheen = "Something went wrong with choosing the killstreak sheen";
                    int killstreakSheenChooser = (int) (Math.random() * 7 + 1);
                    switch (killstreakSheenChooser) {


                        //Team Shine
                        case 1: {

                            killstreakSheen = "Team Shine";
                            break;

                        }
                        //Hot Rod
                        case 2: {

                            killstreakSheen = "Hot Rod";
                            break;

                        }
                        //Manndarin
                        case 3: {

                            killstreakSheen = "Manndarin";
                            break;

                        }
                        //Deadly Daffodil
                        case 4: {

                            killstreakSheen = "Deadly Daffodil";
                            break;

                        }
                        //Mean Green
                        case 5: {

                            killstreakSheen = "Mean Green";
                            break;

                        }
                        //Agonizing Emerald
                        case 6: {

                            killstreakSheen = "Agonizing Emerald";
                            break;

                        }
                        //Villainous Violet
                        case 7: {

                            killstreakSheen = "Villainous Violet";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with the switch statement for the killstreak sheens");
                            break;

                        }


                    }
                    int killNumber = (int) (Math.random() * 20 + 5);
                    String killstreakEffect = "Something went wrong with choosing the killstreak effect";
                    int killstreakEffectChooser = (int) (Math.random() * 7 + 1);
                    switch (killstreakEffectChooser) {

                        //Cerebral Discharge
                        case 1: {

                            killstreakEffect = "Cerebral Discharge";
                            break;

                        }
                        //Fire Horns
                        case 2: {

                            killstreakEffect = "Fire Horns";
                            break;

                        }
                        //Flames
                        case 3: {

                            killstreakEffect = "Flames";
                            break;

                        }
                        //Hypno-Beam
                        case 4: {

                            killstreakEffect = "Hypno-Beam";
                            break;

                        }
                        //Incinerator
                        case 5: {

                            killstreakEffect = "Incinerator";
                            break;

                        }
                        //Singularity
                        case 6: {

                            killstreakEffect = "Singularity";
                            break;

                        }
                        //Tornado
                        case 7: {

                            killstreakEffect = "Tornado";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with the switch statement for the killstreak effects");
                            break;

                        }

                    }
                    killstreak = "professional killstreak - " + killstreakSheen + " - " + killstreakEffect + " - " + killNumber + " kills";
                    break;

                }
                default: {

                    System.out.println("Something went wrong with choosing between specialized and professional killstreak");
                    break;

                }

            }

        }
        else {

            killstreak = "no killstreak";

        }

    }
    private void botkillerMethod() {

        int botkillerVersionChooser = (int) (Math.random() * 8 + 1);
        switch (botkillerVersionChooser) {

            //Rust
            case 1: {

                killstreakMethod();
                weapon = "Rust Botkiller Minigun - " + killstreak;
                break;

            }
            //Blood
            case 2: {

                killstreakMethod();
                weapon = "Blood Botkiller Minigun - " + killstreak;
                break;

            }
            //Carbonado
            case 3: {

                killstreakMethod();
                weapon = "Carbonado Botkiller Minigun - " + killstreak;
                break;

            }
            //Diamond
            case 4: {

                killstreakMethod();
                weapon = "Diamond Botkiller Minigun - " + killstreak;
                break;

            }
            //Silver Mk. 1
            case 5: {

                killstreakMethod();
                weapon = "Silver Mk. 1 Minigun - " + killstreak;
                break;

            }
            //Gold Mk. 1
            case 6: {

                killstreakMethod();
                weapon = "Gold Mk. 1 Botkiller Minigun - " + killstreak;
                break;

            }
            //Silver Mk. 2
            case 7: {

                killstreakMethod();
                weapon = "Silver Mk. 2 Botkiller Minigun - " + killstreak;
                break;

            }
            //Gold Mk. 2
            case 8: {

                killstreakMethod();
                weapon = "Gold Mk. 2 - " + killstreak;
                break;

            }
            default: {

                System.out.println("Something went wrong with choosing the botkiller version");

            }

        }

    }
    public static void main (String[] args) {

        new HeavyLoadoutGenerator();

    }

}
