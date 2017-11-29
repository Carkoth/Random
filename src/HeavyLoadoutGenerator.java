import java.lang.Math;
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
    //Class constructor
    private HeavyLoadoutGenerator() {

        //Loadout method calling
        this.loadoutMethod(1);
        //Item logging
        System.out.println("Loadout one cosmetic: " + loadoutOneCosmetic);
        System.out.println("    - Paint color: " + loadoutOnePaintColor);
        System.out.println("    - Unusual effect: " + loadoutOneUnusualEffect);

    }
    //Main loadout method
    private void loadoutMethod(int loadoutNumber) {

        //Determining what loadout the method is being called for
        switch (loadoutNumber) {

            //Loadout 1
            case 1: {

                //Loadout Loop
                while (!loadoutOneLoopSatisfied) {

                    int loadoutRandomizer = (int) (Math.random() * 357 + 1);
                    switch (loadoutRandomizer) {

                        //Hat Region
                        //Football Helmet
                        case 1: {

                            loadoutOneCosmetic = "Football Helmet";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Officer's Ushanka
                        case 2: {

                            loadoutOneCosmetic = "Officer's Ushanka";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Tough Guy's Toque
                        case 3: {

                            loadoutOneCosmetic = "Tough Guy's Toque";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Hound Dog
                        case 4: {

                            loadoutOneCosmetic = "Hound Dog";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            glassesEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Heavy Duty Rag
                        case 5: {

                            loadoutOneCosmetic = "Heavy Duty Rag";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Hard Counter
                        case 6: {

                            loadoutOneCosmetic = "Hard Counter";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Pugilist's Protector
                        case 7: {

                            loadoutOneCosmetic = "Pugilist's Protector";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Cadaver's Cranium
                        case 8: {

                            loadoutOneCosmetic = "Cadaver's Cranium";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Big Chief
                        case 9: {

                            loadoutOneCosmetic = "Cadaver's Cranium";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Coupe D'isaster
                        case 10: {

                            loadoutOneCosmetic = "Coupe D'isaster";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Magnificent Mongolian
                        case 11: {

                            loadoutOneCosmetic = "Magnificent Mongolian";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Dread Knot
                        case 12: {

                            loadoutOneCosmetic = "Dread Knot";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Team Captain
                        case 13: {

                            loadoutOneCosmetic = "Team Captain";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Capo's Capper
                        case 14: {

                            loadoutOneCosmetic = "Capo's Capper";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Copper's Hard Top
                        case 15: {

                            loadoutOneCosmetic = "Copper's Hard Top";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Dragonborn Helmet
                        case 16: {

                            loadoutOneCosmetic = "Dragonborn Helmet";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            faceEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Gym Rat
                        case 17: {

                            loadoutOneCosmetic = "Gym Rat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //One-Man Army
                        case 18: {

                            loadoutOneCosmetic = "One-Man Army";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Outdoorsman
                        case 19: {

                            loadoutOneCosmetic = "Outdoorsman";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Soviet Gentleman
                        case 20: {

                            loadoutOneCosmetic = "Soviet Gentleman";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Bunsen Brave
                        case 21: {

                            loadoutOneCosmetic = "Bunsen Brave";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Gridiron Gaurdian
                        case 22: {

                            loadoutOneCosmetic = "Gridiron Gaurdian";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Tungsten Toque
                        case 23: {

                            loadoutOneCosmetic = "Tungsten Toque";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Bear Necessities
                        case 24: {

                            loadoutOneCosmetic = "Bear Necessities";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Katyusha
                        case 25: {

                            loadoutOneCosmetic = "Katyusha";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Tsarboosh
                        case 26: {

                            loadoutOneCosmetic = "Tsarboosh";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Minnesota Slick
                        case 27: {

                            loadoutOneCosmetic = "Minnesota Slick";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Bullet Buzz
                        case 28: {

                            loadoutOneCosmetic = "Bullet Buzz";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Eliminator's Safegaurd
                        case 29: {

                            loadoutOneCosmetic = "Eliminator's Safegaurd";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Sammy Cap
                        case 30: {

                            loadoutOneCosmetic = "Sammy Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Trash Man
                        case 31: {

                            loadoutOneCosmetic = "Trash Man";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Fur-Lined Fighter
                        case 32: {

                            loadoutOneCosmetic = "Fur-Lined Fighter";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Old Man Frost
                        case 33: {

                            loadoutOneCosmetic = "Old Man Frost";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Siberian Facehugger
                        case 34: {

                            loadoutOneCosmetic = "Siberian Facehugger";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //White Russian
                        case 35: {

                            loadoutOneCosmetic = "White Russian";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Mo'Horn
                        case 36: {

                            loadoutOneCosmetic = "Mo'Horn";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            sf2016UnusualMethod(1);
                            break;

                        }
                        //Pestering Jester
                        case 37: {

                            loadoutOneCosmetic = "Pestering Jester";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            paintMethod(1);
                            sf2016UnusualMethod(1);
                            break;

                        }
                        //Warhood
                        case 38: {

                            loadoutOneCosmetic = "Warhood";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Aztec Aggresor
                        case 39: {

                            loadoutOneCosmetic = "Aztec Aggresor";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Commando Elite
                        case 40: {

                            loadoutOneCosmetic = "Commando Elite";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Fat Man's Field Cap
                        case 41: {

                            loadoutOneCosmetic = "Fat Man's Field Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Nuke
                        case 42: {

                            loadoutOneCosmetic = "Nuke";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Modest Pile of Hat
                        case 43: {

                            loadoutOneCosmetic = "Modest Pile of Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Noble Amassment of Hat
                        case 44: {

                            loadoutOneCosmetic = "Noble Amassment of Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Towering Pillar of Hat
                        case 45: {

                            loadoutOneCosmetic = "Towering Pillar of Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Dr's Dapper Topper
                        case 46: {

                            loadoutOneCosmetic = "Dr's Dapper Topper";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Horrific Headsplitter
                        case 47: {

                            loadoutOneCosmetic = "Horrific Headsplitter";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //A Rather Festive Hat
                        case 48: {

                            loadoutOneCosmetic = "A Rather Festive Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Company Man
                        case 49: {

                            loadoutOneCosmetic = "Company Man";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Killer Exclusive
                        case 50: {

                            loadoutOneCosmetic = "Killer Exclusive";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Hot Dogger
                        case 51: {

                            loadoutOneCosmetic = "Hot Dogger";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Salty Dog
                        case 52: {

                            loadoutOneCosmetic = "Salty Dog";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Brown Bomber
                        case 53: {

                            loadoutOneCosmetic = "Brown Bomber";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Human Cannonball
                        case 54: {

                            loadoutOneCosmetic = "Human Cannonball";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Crone's Dome
                        case 55: {

                            loadoutOneCosmetic = "Crone's Dome";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Executioner
                        case 56: {

                            loadoutOneCosmetic = "Executioner";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Tough Stuff Muffs
                        case 57: {

                            loadoutOneCosmetic = "Tough Stuff Muffs";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Galvanized Gibus
                        case 58: {

                           loadoutOneCosmetic = "Galvanized Gibus";
                           hatEquipRegion = true;
                           wholeHeadEquipRegion = true;
                           loadoutOneLoopSatisfied = true;
                           paintMethod(1);
                           standardUnusualMethod(1);
                           break;

                        }
                        //Modest Metal Pile of Scrap
                        case 59: {

                            loadoutOneCosmetic = "Modest Metal Pile of Scrap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Noble NIckel Amassment of Hats
                        case 60: {

                            loadoutOneCosmetic = "Noble Nickel Amassment of Hats";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Towering Titanium Pillar of Hats
                        case 61: {

                            loadoutOneCosmetic = "Towering Titanium Pillar of Hats";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Bot Dogger
                        case 62: {

                            loadoutOneCosmetic = "Bot Dogger";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Brotherhood of Arms
                        case 63: {

                            loadoutOneCosmetic = "Brotherhood of Arms";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Well-Rounded Riflemam
                        case 64: {

                            loadoutOneCosmetic = "Well-Rounded Rifleman";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Federal Casemaker
                        case 65: {

                            loadoutOneCosmetic = "Federal Casemaker";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Cotton Head
                        case 66: {

                            loadoutOneCosmetic = "Cotton Head";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Hong Kong Cone
                        case 67: {

                            loadoutOneCosmetic = "Hong Kong Cone";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Kiss King
                        case 68: {

                            loadoutOneCosmetic = "Kiss King";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Neckwear Headwear
                        case 69: {

                            loadoutOneCosmetic = "Neckwear Headwear";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Law
                        case 70: {

                            loadoutOneCosmetic = "Law";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Dark Fallkirk Helm
                        case 71: {

                            loadoutOneCosmetic = "Dark Fallkirk Helm";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Merc's Mohawk
                        case 72: {

                            loadoutOneCosmetic = "Merc's Mohawk";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Tipped Lid
                        case 73: {

                            loadoutOneCosmetic = "Tipped Lid";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Vive La France
                        case 74: {

                            loadoutOneCosmetic = "Vive La France";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            glassesEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Crown of the Old Kingdom
                        case 75: {

                            loadoutOneCosmetic = "Crown of the Old Kingdom";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Boxcar Bomber
                        case 76: {

                            loadoutOneCosmetic = "Boxcar";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Coldsnap Cap
                        case 77: {

                            loadoutOneCosmetic = "Coldsnap Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Winter Woodsman
                        case 78: {

                            loadoutOneCosmetic = "Winter Woodsman";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Co-Pilot
                        case 79: {

                            loadoutOneCosmetic = "Co-Pilot";
                            hatEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Finder's Fee
                        case 80: {

                            loadoutOneCosmetic = "Finder's Fee";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Captain Cardbeard Cutthroat
                        case 81: {

                            loadoutOneCosmetic = "Captrain Cardbeard Cutthroat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Rotation Sensation
                        case 82: {

                            loadoutOneCosmetic = "Rotation Sensation";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Potassium Bonnet
                        case 83: {

                            loadoutOneCosmetic = "Potassium Bonnet";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Phononaut
                        case 84: {

                            loadoutOneCosmetic = "Phononaut";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            invasionUnusualMethod(1);
                            break;

                        }
                        //Universal Translator
                        case 85: {

                            loadoutOneCosmetic = "Universal Translator";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            invasionUnusualMethod(1);

                        }
                        //Duck Billed Hatypus
                        case 86: {

                            loadoutOneCosmetic = "Duck Billed Hatypus";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            sf2015UnusualMethod(1);
                            break;

                        }
                        //Prehistoric Pullover
                        case 87: {

                            loadoutOneCosmetic = "Prehistoric Pullover";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            sf2015UnusualMethod(1);
                            break;

                        }
                        //A Well Wrapped Hat
                        case 88: {

                            loadoutOneCosmetic = "A Well Wrapped Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Chill Chullo
                        case 89: {

                            loadoutOneCosmetic = "Chill Chullo";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Patriot Peak
                        case 90: {

                            loadoutOneCosmetic = "Patriot Peak";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Class Crown
                        case 91: {

                            loadoutOneCosmetic = "Class Crown";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            sf2016UnusualMethod(1);
                            break;

                        }
                        //Lil' Bitey
                        case 92: {

                            loadoutOneCosmetic = "Lil' Bitey";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            sf2016UnusualMethod(1);
                            break;

                        }
                        //Nasty Norsemann
                        case 93: {

                            loadoutOneCosmetic = "Nasty Norsemann";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            sf2016UnusualMethod(1);
                            break;

                        }
                        //Toadstool Topper
                        case 94: {

                            loadoutOneCosmetic = "Toadstool Topper";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            sf2016UnusualMethod(1);
                            break;

                        }
                        //Woolen Warmer
                        case 95: {

                            loadoutOneCosmetic = "Woolen Warmer";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Legendary Lid
                        case 96: {

                            loadoutOneCosmetic = "Legendary Lid";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Hunter in Darkness
                        case 97: {

                            loadoutOneCosmetic = "Hunter in Darkness";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Pithy Professional
                        case 98: {

                            loadoutOneCosmetic = "Pithy Professional";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Dealer's Visor
                        case 99: {

                            loadoutOneCosmetic = "Dealer's Visor";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Pilotka
                        case 100: {

                            loadoutOneCosmetic = "Pilotka";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //War Head
                        case 101: {

                            loadoutOneCosmetic = "War Head";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //U-clanka-a
                        case 102: {

                            loadoutOneCosmetic = "U-clanka-a";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Crafty Hair
                        case 103: {

                            loadoutOneCosmetic = "Crafty Hair";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Heavy Artillery Officer's Cap
                        case 104: {

                            loadoutOneCosmetic = "Heavy Artillery Officer's Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //K-9 Mane
                        case 105: {

                            loadoutOneCosmetic = "K-9 Mane";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Brock's Locks
                        case 106: {

                            loadoutOneCosmetic = "Brock's Locks";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Pounding Father
                        case 107: {

                            loadoutOneCosmetic = "Pounding Father";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Wilson Weave
                        case 108: {

                            loadoutOneCosmetic = "Wilson Weave";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Der Maschinensoldaten-Helm
                        case 109: {

                            loadoutOneCosmetic = "Der Maschinensoldaten-Helm";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Sucker SLug
                        case 110: {

                            loadoutOneCosmetic = "Sucker Slug";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //War Eagle
                        case 111: {

                            loadoutOneCosmetic = "War Eagle";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Ghastly Gibus
                        case 112: {

                           loadoutOneCosmetic = "Ghastly Gibus";
                           hatEquipRegion = true;
                           wholeHeadEquipRegion = true;
                           loadoutOneLoopSatisfied = true;
                           paintMethod(1);
                           break;

                        }
                        //Bill's Hat
                        case 113: {

                            loadoutOneCosmetic = "Bill's Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Alien Swarm Parasite
                        case 114: {

                            loadoutOneCosmetic = "Alien Swarm Parasite";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Wiki Cap
                        case 115: {

                            loadoutOneCosmetic = "Wiki Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Ellis' Cap
                        case 116: {

                            loadoutOneCosmetic = "Ellis' Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Mann Co. Cap
                        case 117: {

                            loadoutOneCosmetic = "Mann Co. Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Ghastlier Gibus
                        case 118: {

                            loadoutOneCosmetic = "Ghastlier Gibus";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Spine-Chilling Skull
                        case 119: {

                            loadoutOneCosmetic = "Spine-Chilling Skull";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Voodoo Juju
                        case 120: {

                            loadoutOneCosmetic = "Voodoo Juju";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Bounty Hat
                        case 121: {

                            loadoutOneCosmetic = "Bounty Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Treasure Hat
                        case 122: {

                            loadoutOneCosmetic = "Treasure Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Hat of Undeniable Wealth and Respect
                        case 123: {

                            loadoutOneCosmetic = "Hat of Undeniable Wealth and Respect";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //World Travelers Hat
                        case 124: {

                            loadoutOneCosmetic = "World Travelers Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Atheletic Supporter
                        case 125: {

                            loadoutOneCosmetic = "Atheletic Supporter";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Humanitarian's Hachimaki
                        case 126: {

                            loadoutOneCosmetic = "Humanitariab's Hachimaki";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Benefactor's Kanmuri
                        case 127: {

                            loadoutOneCosmetic = "Benefactor's Kanmuri";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Magnanimous Monarch
                        case 128: {

                            loadoutOneCosmetic = "Magnanimous Monarch";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Aperture Labs Hard Hat
                        case 129: {

                            loadoutOneCosmetic = "Aperture Labs Hard Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Frontline Field Recorder
                        case 130: {

                            loadoutOneCosmetic = "Frontline Field Recorder";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Lo-Fi Longwave
                        case 131: {

                            loadoutOneCosmetic = "Lo-Fi Longwave";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Spiral Sallet
                        case 132: {

                            loadoutOneCosmetic = "Spiral Sallet";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            faceEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;



                        }
                        //Proof of Purchase
                        case 133: {

                            loadoutOneCosmetic = "Proof of Purchase";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Summer Hat
                        case 134: {

                            loadoutOneCosmetic = "Summer Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Party Hat
                        case 135: {

                            loadoutOneCosmetic = "Party Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Manniversary Paper hat
                        case 136: {

                            loadoutOneCosmetic = "Manniversary Paper Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Ghastlierest Gibus
                        case 137: {

                            loadoutOneCosmetic = "Ghastlierest Gibus";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //B.M.O.C
                        case 138: {

                            loadoutOneCosmetic = "B.M.O.C";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Ebenezer
                        case 139: {

                            loadoutOneCosmetic = "Ebenezer";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Full Head Of Steam
                        case 140: {

                            loadoutOneCosmetic = "Full Head of Steam";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Holiday Headcase
                        case 141: {

                           loadoutOneCosmetic = "Holiday Headcase";
                           hatEquipRegion = true;
                           wholeHeadEquipRegion = true;
                           necklaceEquipRegion = true;
                           beardEquipRegion = true;
                           loadoutOneLoopSatisfied = true;
                           break;

                        }
                        //Warsworn Helmet
                        case 142: {

                            loadoutOneCosmetic = "Warsworn Helmet";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Dueler
                        case 143: {

                            loadoutOneCosmetic = "Dueler";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Gifting Man From Gifting Land
                        case 144: {

                            loadoutOneCosmetic = "Gifting Man From Gifting Land";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Philater
                        case 145: {

                            loadoutOneCosmetic = "Philater";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Bolt Action Blitzer
                        case 146: {

                            loadoutOneCosmetic = "Bolt Action Blitzer";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Gentle Munitionne of Leisure
                        case 147: {

                            loadoutOneCosmetic = "Gentle Munitionne of Leisure";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Robot Chicken Hat
                        case 148: {

                            loadoutOneCosmetic = "Robot Chicken Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Ghostly Gibus
                        case 149: {

                            loadoutOneCosmetic = "Ghostly Gibus";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Skull Island Topper
                        case 150: {

                            loadoutOneCosmetic = "Skull Island Topper";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //That '70s Chapeau
                        case 151: {

                            loadoutOneCosmetic = "That '70s Chapeau";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Cockfighter
                        case 152: {

                           loadoutOneCosmetic = "Cockfighter";
                           hatEquipRegion = true;
                           wholeHeadEquipRegion = true;
                           loadoutOneLoopSatisfied = true;
                           paintMethod(1);
                           break;

                        }
                        //Mann Co. Online Cap
                        case 153: {

                            loadoutOneCosmetic = "Mann Co. Online Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Brutal Bouffant
                        case 154: {

                            loadoutOneCosmetic = "Brutal Bouffant";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Conspiracy Cap
                        case 155: {

                            loadoutOneCosmetic = "Conspiracy Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Public Agressor
                        case 156: {

                            loadoutOneCosmetic = "Public Agressor";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Hardy Laurel
                        case 157: {

                            loadoutOneCosmetic = "Hardy Laurel";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Grandmaster
                        case 158: {

                            loadoutOneCosmetic = "Grandmaster";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Towering Pillar of Summer Shades
                        case 159: {

                            loadoutOneCosmetic = "Towering Pillar of Shades";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Horace
                        case 160: {

                            loadoutOneCosmetic = "Horace";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //MK 50
                        case 161: {

                            loadoutOneCosmetic = "MK 50";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Dadliest Catch
                        case 162: {

                            loadoutOneCosmetic = "Dadliest Catch";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Bedouin Bandanna
                        case 163: {

                            loadoutOneCosmetic = "Bedouin Bandanna";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Prinny Hat
                        case 164: {

                            loadoutOneCosmetic = "Prinny Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Civilian JACK Hat
                        case 165: {

                            loadoutOneCosmetic = "Civilian JACK Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Military Grade JACK Hat
                        case 166: {

                            loadoutOneCosmetic = "Military Grade JACK Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Head Prize
                        case 167: {

                            loadoutOneCosmetic = "Head Prize";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Snowmann
                        case 168: {

                            loadoutOneCosmetic = "Snowmann";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Audio File
                        case 169: {

                            loadoutOneCosmetic = "Audio File";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Aztec Warrior
                        case 170: {

                            loadoutOneCosmetic = "Aztec Warrior";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Jungle Wreath
                        case 171: {

                            loadoutOneCosmetic = "Jungle Wreath";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Monstrous Memento
                        case 172: {

                            loadoutOneCosmetic = "Monstrous Memento";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Saxton
                        case 173: {

                            loadoutOneCosmetic = "Saxton";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Point and Shoot
                        case 174: {

                            loadoutOneCosmetic = "Point and Shoot";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Head Skin Region
                            //Large Luchadore
                        case 175: {

                            loadoutOneCosmetic = "Large Luchadore";
                            headSkinEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Polar Pullover
                        case 176: {

                            loadoutOneCosmetic = "Polar Pullover";
                            headSkinEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Cold War Luchadore
                        case 177: {

                            loadoutOneCosmetic = "Cold War Luchadore";
                            headSkinEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Arkham Cown
                        case 178: {

                            loadoutOneCosmetic = "Arkham Cowl";
                            headSkinEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Pocket (Heavy) Region
                            //Pocket Medic
                        case 179: {

                            loadoutOneCosmetic = "Pocket Medic";
                            pocketHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Beard Region
                            //Big Steel Jaw of Summer Fun
                        case 180: {

                            loadoutOneCosmetic = "Big Steel Jaw of Summer Fun";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //All-Father
                        case 181: {

                            loadoutOneCosmetic = "All-Father";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Mutton Mann
                        case 182: {

                            loadoutOneCosmetic = "Mutton Mann";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Cuban Bristle Crisis
                        case 183: {

                            loadoutOneCosmetic = "Cuban Bristle Crisis";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Viking Braider
                        case 184: {

                            loadoutOneCosmetic = "Viking Braider";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Dictator
                        case 185: {

                            loadoutOneCosmetic = "Dictator";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Leftover Trap
                        case 186: {

                            loadoutOneCosmetic = "Leftover Trap";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Yuri's Revenge
                        case 187: {

                            loadoutOneCosmetic = "Yuri's Revenge";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Unshaved Bear
                        case 188: {

                            loadoutOneCosmetic = "Unshaved Bear";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //El Duderino
                        case 189: {

                            loadoutOneCosmetic = "El Duderino";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Dictator
                        case 190: {

                            loadoutOneCosmetic = "Dictator";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Bruiser's Bandanna
                        case 191: {

                            loadoutOneCosmetic = "Bruiser's Bandanna";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Glasses Region
                            //Virtual Viewfinder
                        case 192: {

                            loadoutOneCosmetic = "Virtual Viewfinder";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Security Shades
                        case 193: {

                            loadoutOneCosmetic = "Security Shades";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Gabe Glasses
                        case 194: {

                            loadoutOneCosmetic = "Gabe Glasses";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            break;

                        }
                        //Macho Mann
                        case 195: {

                            loadoutOneCosmetic = "Macho Mann";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //War Goggles
                        case 196: {

                            loadoutOneCosmetic = "War Goggles";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Reader's Choice
                        case 197: {

                            loadoutOneCosmetic = "Reader's Choice";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Professor Speks
                        case 198: {

                            loadoutOneCosmetic = "Professor Speks";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Summer Shades
                        case 199: {

                            loadoutOneCosmetic = "Summer Shades";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Pyrovision Goggles
                        case 200: {

                            loadoutOneCosmetic = "Pyrovision Goggles";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Marxman
                        case 201: {

                            loadoutOneCosmetic = "Marxman";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //TF2VRH
                        case 202: {

                            loadoutOneCosmetic = "TF2VRH";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Graybanns
                        case 203: {

                            loadoutOneCosmetic = "Graybanns";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Tomb Readers
                        case 204: {

                            loadoutOneCosmetic = "Tomb Readers";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Spooktacles
                        case 205: {

                            loadoutOneCosmetic = "Spooktacles";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Arms Region
                            //Purity Fist
                        case 206: {

                            loadoutOneCosmetic = "Purity Fist";
                            armsEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Hip (Heavy)
                            //Sandvich Safe
                        case 207: {

                            loadoutOneCosmetic = "Sandvich Safe";
                            hipHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Heavy-Weight Champ
                        case 208: {

                            loadoutOneCosmetic = "Heavy-Weight Champ";
                            hipHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Combat Slacks
                        case 209: {

                            loadoutOneCosmetic = "Combat Slacks";
                            hipHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Towel (Heavy)
                        //Toss-Proof Towel
                        case 210: {

                            loadoutOneCosmetic = "Toss-Proof Towel";
                            towelHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Titanium Towel
                        case 211: {

                            loadoutOneCosmetic = "Titanium Towel";
                            towelHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Heavy Harness
                        case 212: {

                            loadoutOneCosmetic = "Heavy Harness";
                            towelHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Shirt Equip Region
                            //Apparatchiks Apparel
                        case 213: {

                            loadoutOneCosmetic = "Apparatchiks Apparel";
                            shirtEquipRegion = true;
                            armTattooEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Triad Trinket
                        case 214: {

                            loadoutOneCosmetic = "Triad Trinket";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Siberian Sophisticate
                        case 215: {

                            loadoutOneCosmetic = "Siberian Sophisticate";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Hunger Force
                        case 216: {

                            loadoutOneCosmetic = "Hunger Force";
                            shirtEquipRegion = true;
                            necklaceEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Tyurtlenek
                        case 217: {

                            loadoutOneCosmetic = "Tyurtlenek";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Bolshevik Biker
                        case 218: {

                            loadoutOneCosmetic = "Bolshevik Biker";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Weight Room Warmer
                        case 219: {

                            loadoutOneCosmetic = "Weight Room Warmer";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Heavy Lifter
                        case 220: {

                            loadoutOneCosmetic = "Heavy Lifter";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Warmth Preserver
                        case 221: {

                            loadoutOneCosmetic = "Warmth Preserver";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Hunter Heavy
                        case 222: {

                            loadoutOneCosmetic = "Hunter Heavy";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Sleeveless in Siberia
                        case 223: {

                            loadoutOneCosmetic = "Sleeveless in Siberia";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Snow Sleeves
                        case 224: {

                            loadoutOneCosmetic = "Snow Sleeves";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Commisar's Coat
                        case 225: {

                            loadoutOneCosmetic = "Commisar's Coat";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Siberian Sweater
                        case 226: {

                            loadoutOneCosmetic = "Siberian Sweater";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Heavy Tourism
                        case 227: {

                            loadoutOneCosmetic = "Heavy Tourism";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Airborne Attire
                        case 228: {

                            loadoutOneCosmetic = "Airborne Attire";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Siberian Tigerstripe
                        case 229: {

                            loadoutOneCosmetic = "Siberian Tigerstripe";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Tuxxy
                        case 230: {

                            loadoutOneCosmetic = "Tuxxy";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Dead of Night
                        case 231: {

                            loadoutOneCosmetic = "Dead of Night";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Arm Tattoos Region
                            //Champ Stamp
                        case 232: {

                            loadoutOneCosmetic = "Champ Stamp";
                            armTattooEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Sleeves Region
                            //Spooky Sleeves
                        case 233: {

                            loadoutOneCosmetic = "Spooky Sleeves";
                            sleevesEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Batter's Bracers
                        case 234: {

                            loadoutOneCosmetic = "Batter's Bracers";
                            sleevesEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Feet Region
                            //Aqua Flops
                        case 235: {

                            loadoutOneCosmetic = "Aqua Flops";
                            feetEquipRegon = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Rat Stompers
                        case 236: {

                            loadoutOneCosmetic = "Rat Stompers";
                            feetEquipRegon = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Flashdance Footies
                        case 237: {

                            loadoutOneCosmetic = "Flashdance Footies";
                            feetEquipRegon = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Hair (Heavy) Region
                            //Carl
                        case 238: {

                            loadoutOneCosmetic = "Carl";
                            hairHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Heavy's Hockey Hair
                        case 239: {

                            loadoutOneCosmetic = "Heavy's Hockey Hair";
                            hairHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Belt (Heavy) Region
                            //Samson Skewer
                        case 240: {

                            loadoutOneCosmetic = "Samson Skewer";
                            beltHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Fortune Hunteer
                        case 241: {

                            loadoutOneCosmetic = "Fortune Hunter";
                            beltHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Prinny Pouch
                        case 242: {

                            loadoutOneCosmetic = "Prinny Pouch";
                            beltHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Bullets (Heavy) Region
                            //Borscht Belt
                        case 243: {

                            loadoutOneCosmetic = "Borscht Belt";
                            bulletsHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Left Shoulder Region
                            //Red Army Robin
                        case 244: {

                            loadoutOneCosmetic = "Red Army Robin";
                            leftShoulderEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Grim Tweeter
                        case 245: {

                            loadoutOneCosmetic = "Grim Tweeter";
                            leftShoulderEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Croaking Hazard
                        case 246: {

                            loadoutOneCosmetic = "Croaking Hazard";
                            leftShoulderEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Quizzical Quetzal
                        case 247: {

                            loadoutOneCosmetic = "Quizzical Quetzal";
                            leftShoulderEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Pants Region
                            //Mann of the House
                        case 248: {

                            loadoutOneCosmetic = "Mann of the House";
                            pantsEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Gone Commando
                        case 249: {

                            loadoutOneCosmetic = "Gone Commando";
                            pantsEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Jungle Booty
                        case 250: {

                            loadoutOneCosmetic = "Jungle Booty";
                            pantsEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Breakneck Baggies
                        case 251: {

                            loadoutOneCosmetic = "Breakneck Baggies";
                            pantsEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Hip Pouch (Heavy)
                            //Little Bear
                        case 252: {

                            loadoutOneCosmetic = "Little Bear";
                            hipPouchEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
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

                            loadoutOneCosmetic = "Teufort Knight";
                            wholeHeadEquipRegion = true;
                            hatEquipRegion = true;
                            faceEquipRegion = true;
                            glassesEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Kathman - Hairdo
                        case 267: {

                            loadoutOneCosmetic = "Kathman-Hairdo";
                            wholeHeadEquipRegion = true;
                            hatEquipRegion = true;
                            faceEquipRegion = true;
                            glassesEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Saxton Hale Mask
                        case 268: {

                            loadoutOneCosmetic = "Saxton Hale Mask";
                            wholeHeadEquipRegion = true;
                            hatEquipRegion = true;
                            faceEquipRegion = true;
                            glassesEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Coat (Soldier) Region
                            //Gift Bringer
                        case 269: {

                            loadoutOneCosmetic = "Gift Bringer";
                            coatSoldierEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Face Region
                            //Captain Space Mann
                        case 270: {

                            loadoutOneCosmetic = "Captain Space Mann";
                            faceEquipRegion = true;
                            glassesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            invasionUnusualMethod(1);
                            break;

                        }
                        //Mad Mask
                        case 271: {

                            loadoutOneCosmetic = "Mad Mask";
                            faceEquipRegion = true;
                            glassesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Medal Region
                            //Mercenary
                        case 272: {

                            loadoutOneCosmetic = "Mercenary";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Soldier of Fortune
                        case 273: {

                            loadoutOneCosmetic = "Soldier of Fortune";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Grizzled Veteran
                        case 274: {

                            loadoutOneCosmetic = "Grizzled Veteran";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Primeval Warrior
                        case 275: {

                            loadoutOneCosmetic = "Primeval Warrior";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Bronze Dueling Badge
                        case 276: {

                            loadoutOneCosmetic = "Bronze Dueling Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Silver Dueling Badge
                        case 277: {

                            loadoutOneCosmetic = "Silver Dueling Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Gold Dueling Badge
                        case 278: {

                            loadoutOneCosmetic = "Gold Dueling Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Platinum Dueling Badge
                        case 279: {

                            loadoutOneCosmetic = "Platinum Dueling Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Polycount Pin
                        case 280: {

                            loadoutOneCosmetic = "Polycount Pin";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Companion Cube Pin
                        case 281: {

                            loadoutOneCosmetic = "Companion Cube Pin";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //License to Maim
                        case 282: {

                            loadoutOneCosmetic = "License to Maim";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Resurrection Associate Pin
                        case 283: {

                            loadoutOneCosmetic = "Resurrection Associate Pin";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //SpaceChem Pin
                        case 284: {

                            loadoutOneCosmetic = "SpaceChem Pin";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Dr. Grordbort's Crest
                        case 285: {

                            loadoutOneCosmetic = "Dr. Grordbort's Crest";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Clan Pride
                        case 286: {

                            loadoutOneCosmetic = "Clan Pride";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Photo Badge
                        case 287: {

                            loadoutOneCosmetic = "Photo Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Bombinomicon
                        case 288: {

                            loadoutOneCosmetic = "Bombinomicon";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Mark of the Saint
                        case 289: {

                            loadoutOneCosmetic = "Mark of the Saint";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Dr. Grordbort's Copper Crest
                        case 290: {

                            loadoutOneCosmetic = "Dr. Grordbort's Copper Crest";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Dr. Grordbort's Silver Crest
                        case 291: {

                            loadoutOneCosmetic = "Dr. Grordbort's Silver Crest";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Spirit of Giving
                        case 292: {

                            loadoutOneCosmetic = "Spirit of Giving";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Map Maker's Medallion
                        case 293: {

                            loadoutOneCosmetic = "Map Maker's Medallion";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Merc Medal
                        case 294: {

                            loadoutOneCosmetic = "Merc Medal";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Atomic Accolade
                        case 295: {

                            loadoutOneCosmetic = "Atomic Accolade";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Awesomenauts Badge
                        case 296: {

                            loadoutOneCosmetic = "Awesomenauts Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Operation Oil Spill Badge
                        case 298: {

                            loadoutOneCosmetic = "Operation Oil Spill Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Operation Steel Trap Badge
                        case 299: {

                            loadoutOneCosmetic = "Operation Steel Trap Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Operation Gear Grinder Badge
                        case 300: {

                            loadoutOneCosmetic = "Operation Gear Grinder Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Vigilant Pin
                        case 301: {

                            loadoutOneCosmetic = "Vigilant Pin";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Friends Forever Companion Square Badge
                        case 302: {

                            loadoutOneCosmetic = "Friends  Forever Companion Square Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Heroic Companion Badge
                        case 303: {

                            loadoutOneCosmetic = "Heroic Companion Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Triple A Badge
                        case 304: {

                            loadoutOneCosmetic = "Triple A Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Whale Bone Charm
                        case 305: {

                            loadoutOneCosmetic = "Whale Bone Charm";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Hitt Mann Badge
                        case 306: {

                            loadoutOneCosmetic = "Hitt Mann Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Faerie Solitare Pin
                        case 307: {

                            loadoutOneCosmetic = "Faerie Solitare Pin";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Saxxy Clapper Badge
                        case 308: {

                            loadoutOneCosmetic = "Saxxy Clapper Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Operation Mecha Engine
                        case 309: {

                            loadoutOneCosmetic = "Operation Mecha Engine";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Smissmas WWreath
                        case 310: {

                            loadoutOneCosmetic = "Smissmas Wreath";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Crot's Crest
                        case 311: {

                            loadoutOneCosmetic = "Croft's Crest";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Electric Badge-aloo
                        case 312: {

                            loadoutOneCosmetic = "Electric Badge-aloo";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Operation Two Cities Badge
                        case 313: {

                            loadoutOneCosmetic = "Operation Two Cities Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Heart of Gold
                        case 314: {

                            loadoutOneCosmetic = "Heart of Gold";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Baronial Badge
                        case 315: {

                            loadoutOneCosmetic = "Baronial Badge";
                            medalEquipRegion = true;
                            break;

                        }
                        //Thought That Counts
                        case 316: {

                            loadoutOneCosmetic = "Thought That Counts";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //End of the Line Community Medal
                        case 317: {

                            loadoutOneCosmetic = "End of the Line Community Medal";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Invasion Community Medal
                        case 318: {

                            loadoutOneCosmetic = "Invasion Community Medal";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Honeydew's Charitable Countenance
                        case 319: {

                            loadoutOneCosmetic = "Honeydews Charitable COuntenance";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Xephos' Philantrophic Physiognomy
                        case 320: {

                            loadoutOneCosmetic = "Xephos' Philantrophic Physiognomy";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Gift of Giving
                        case 321: {

                            loadoutOneCosmetic = "Gift of Giving";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Special Snowflake
                        case 322: {

                            loadoutOneCosmetic = "Special Snowflake";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;


                        }
                        //PASS Time Early Participation Medal
                        case 323: {

                            loadoutOneCosmetic = "PASS Time Early Participation Medal";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Altruist's Adornment
                        case 324: {

                            loadoutOneCosmetic = "Altruist's Adornment";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //TF2Maps 72hr TF2Jam Participent
                        case 325: {

                            loadoutOneCosmetic = "TF2Maps 72hr TF2 Jam Participent";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //PASS Time Miniature Half Jack
                        case 326: {

                            loadoutOneCosmetic = "PASS Time Miniature Half Jack";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Jaunty Camper
                        case 327: {

                            loadoutOneCosmetic = "Jaunty Camper";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Jaunty Benefactor
                        case 328: {

                            loadoutOneCosmetic = "Jaunty Benefactor";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Jaunty Trailblazer
                        case 329: {

                            loadoutOneCosmetic = "Jaunty Trailblazer";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Duncan's Kindhearted Kisser
                        case 330: {

                            loadoutOneCosmetic = "Duncan's Kindhearted Kisser";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Hannah's Altruistic Aspect
                        case 331: {

                            loadoutOneCosmetic = "Hannah's Altruistic Aspect";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Sips' Selfless Simulacrum
                        case 332: {

                            loadoutOneCosmetic = "Sips' Selfless Simulacrum";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Sjin's Generous Guise
                        case 333: {

                            loadoutOneCosmetic = "Sjin's Generous Guise";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Gift of Giving 2016
                        case 334: {

                            loadoutOneCosmetic = "Gift of Giving 2016";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Special Snowflake 2016
                        case 335: {

                            loadoutOneCosmetic = "Special Snowflake 2016";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Mapper vs. Machiners Participant Medal 2017
                        case 336: {

                            loadoutOneCosmetic = "Mapper vs. Machiners Participant Medal 2017";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Blapature Co. Contributor
                        case 338: {

                            loadoutOneCosmetic = "Blapature Co. Contributor";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //TF2Maps Charitable HEart
                        case 339: {

                            loadoutOneCosmetic = "TF2Maps Charitable Heart";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Earbud's Special Region
                            //Earbuds
                        case 340: {

                            loadoutOneCosmetic = "Earbuds";
                            earbudsSpecialEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Lenses Region
                        case 341: {

                            loadoutOneCosmetic = "Deus Specs";
                            medalEquipRegion = true;
                            glassesEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Eye-Catcher
                        case 342: {

                            loadoutOneCosmetic = "Eye-Catcher";
                            lensesEquipRegion = true;
                            glassesEquipRegion = true;
                            paintMethod(1);
                            break;

                        }
                        //Flair Region
                        case 343: {

                            loadoutOneCosmetic = "Flair!";
                            flairEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;


                        }
                        //Necklace Region
                            //Merc's Pride Scarf
                        case 344: {

                            loadoutOneCosmetic = "Merc's Pride Scarf";
                            necklaceEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Merc's Muffler
                        case 345: {

                            loadoutOneCosmetic = "Merc's Muffler";
                            necklaceEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Slithering Scarf
                        case 346: {

                            loadoutOneCosmetic = "Slithering Scarf";
                            necklaceEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Disconnected Floating Item Region
                            //Baloonicorn
                        case 347: {

                            loadoutOneCosmetic = "Baloonicorn";
                            disconnectedFloatingItemEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //RoBro 3000
                        case 348: {

                            loadoutOneCosmetic = "RoBro 3000";
                            disconnectedFloatingItemEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Reindoonicorn
                        case 349: {

                            loadoutOneCosmetic = "Reindoonicorn";
                            disconnectedFloatingItemEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Space Hamster Hammy
                        case 350: {

                            loadoutOneCosmetic = "Space Hamster Hammy";
                            disconnectedFloatingItemEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Belt Region
                            //Buttler
                        case 351: {

                            loadoutOneCosmetic = "Buttler";
                            beltEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Rump-o'-Lantern
                        case 352: {

                            loadoutOneCosmetic = "Rump-o'-Lantern";
                            beltEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Catastrophic Companions
                        case 353: {

                            loadoutOneCosmetic = "Catastrophic Companions";
                            beltEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Pocket Saxton
                        case 354: {

                            loadoutOneCosmetic = "Pocket Saxton";
                            beltEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Grenades Region
                            //Pocket Raiders
                        case 355: {

                            loadoutOneCosmetic = "Pocket Raiders";
                            grenadesEquipRegion = true;
                            pocketSniperEquipRegion = true;
                            pocketEngineerEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Pocket Villains
                        case 356: {

                            loadoutOneCosmetic = "Pocket Villains";
                            grenadesEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //None
                        case 367: {

                            loadoutOneCosmetic = "None";
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with choosing loadout one's cosmetic");
                            break;

                        }

                    }

                }
                break;

            }
            //Loadout 2
            case 2: {

                //Loadout Loop
                while (!loadoutOneLoopSatisfied) {

                    int loadoutRandomizer = (int) (Math.random() * 357 + 1);
                    switch (loadoutRandomizer) {

                        //Hat Region
                        //Football Helmet
                        case 1: {

                            loadoutOneCosmetic = "Football Helmet";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Officer's Ushanka
                        case 2: {

                            loadoutOneCosmetic = "Officer's Ushanka";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Tough Guy's Toque
                        case 3: {

                            loadoutOneCosmetic = "Tough Guy's Toque";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Hound Dog
                        case 4: {

                            loadoutOneCosmetic = "Hound Dog";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            glassesEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Heavy Duty Rag
                        case 5: {

                            loadoutOneCosmetic = "Heavy Duty Rag";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Hard Counter
                        case 6: {

                            loadoutOneCosmetic = "Hard Counter";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Pugilist's Protector
                        case 7: {

                            loadoutOneCosmetic = "Pugilist's Protector";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Cadaver's Cranium
                        case 8: {

                            loadoutOneCosmetic = "Cadaver's Cranium";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Big Chief
                        case 9: {

                            loadoutOneCosmetic = "Cadaver's Cranium";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Coupe D'isaster
                        case 10: {

                            loadoutOneCosmetic = "Coupe D'isaster";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Magnificent Mongolian
                        case 11: {

                            loadoutOneCosmetic = "Magnificent Mongolian";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Dread Knot
                        case 12: {

                            loadoutOneCosmetic = "Dread Knot";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Team Captain
                        case 13: {

                            loadoutOneCosmetic = "Team Captain";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Capo's Capper
                        case 14: {

                            loadoutOneCosmetic = "Capo's Capper";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Copper's Hard Top
                        case 15: {

                            loadoutOneCosmetic = "Copper's Hard Top";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Dragonborn Helmet
                        case 16: {

                            loadoutOneCosmetic = "Dragonborn Helmet";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            faceEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Gym Rat
                        case 17: {

                            loadoutOneCosmetic = "Gym Rat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //One-Man Army
                        case 18: {

                            loadoutOneCosmetic = "One-Man Army";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Outdoorsman
                        case 19: {

                            loadoutOneCosmetic = "Outdoorsman";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Soviet Gentleman
                        case 20: {

                            loadoutOneCosmetic = "Soviet Gentleman";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Bunsen Brave
                        case 21: {

                            loadoutOneCosmetic = "Bunsen Brave";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Gridiron Gaurdian
                        case 22: {

                            loadoutOneCosmetic = "Gridiron Gaurdian";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Tungsten Toque
                        case 23: {

                            loadoutOneCosmetic = "Tungsten Toque";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Bear Necessities
                        case 24: {

                            loadoutOneCosmetic = "Bear Necessities";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Katyusha
                        case 25: {

                            loadoutOneCosmetic = "Katyusha";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Tsarboosh
                        case 26: {

                            loadoutOneCosmetic = "Tsarboosh";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Minnesota Slick
                        case 27: {

                            loadoutOneCosmetic = "Minnesota Slick";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Bullet Buzz
                        case 28: {

                            loadoutOneCosmetic = "Bullet Buzz";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Eliminator's Safegaurd
                        case 29: {

                            loadoutOneCosmetic = "Eliminator's Safegaurd";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Sammy Cap
                        case 30: {

                            loadoutOneCosmetic = "Sammy Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Trash Man
                        case 31: {

                            loadoutOneCosmetic = "Trash Man";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Fur-Lined Fighter
                        case 32: {

                            loadoutOneCosmetic = "Fur-Lined Fighter";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Old Man Frost
                        case 33: {

                            loadoutOneCosmetic = "Old Man Frost";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Siberian Facehugger
                        case 34: {

                            loadoutOneCosmetic = "Siberian Facehugger";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //White Russian
                        case 35: {

                            loadoutOneCosmetic = "White Russian";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Mo'Horn
                        case 36: {

                            loadoutOneCosmetic = "Mo'Horn";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            sf2016UnusualMethod(1);
                            break;

                        }
                        //Pestering Jester
                        case 37: {

                            loadoutOneCosmetic = "Pestering Jester";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            paintMethod(1);
                            sf2016UnusualMethod(1);
                            break;

                        }
                        //Warhood
                        case 38: {

                            loadoutOneCosmetic = "Warhood";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Aztec Aggresor
                        case 39: {

                            loadoutOneCosmetic = "Aztec Aggresor";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Commando Elite
                        case 40: {

                            loadoutOneCosmetic = "Commando Elite";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Fat Man's Field Cap
                        case 41: {

                            loadoutOneCosmetic = "Fat Man's Field Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Nuke
                        case 42: {

                            loadoutOneCosmetic = "Nuke";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Modest Pile of Hat
                        case 43: {

                            loadoutOneCosmetic = "Modest Pile of Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Noble Amassment of Hat
                        case 44: {

                            loadoutOneCosmetic = "Noble Amassment of Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Towering Pillar of Hat
                        case 45: {

                            loadoutOneCosmetic = "Towering Pillar of Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Dr's Dapper Topper
                        case 46: {

                            loadoutOneCosmetic = "Dr's Dapper Topper";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Horrific Headsplitter
                        case 47: {

                            loadoutOneCosmetic = "Horrific Headsplitter";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //A Rather Festive Hat
                        case 48: {

                            loadoutOneCosmetic = "A Rather Festive Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Company Man
                        case 49: {

                            loadoutOneCosmetic = "Company Man";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Killer Exclusive
                        case 50: {

                            loadoutOneCosmetic = "Killer Exclusive";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Hot Dogger
                        case 51: {

                            loadoutOneCosmetic = "Hot Dogger";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Salty Dog
                        case 52: {

                            loadoutOneCosmetic = "Salty Dog";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Brown Bomber
                        case 53: {

                            loadoutOneCosmetic = "Brown Bomber";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Human Cannonball
                        case 54: {

                            loadoutOneCosmetic = "Human Cannonball";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Crone's Dome
                        case 55: {

                            loadoutOneCosmetic = "Crone's Dome";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Executioner
                        case 56: {

                            loadoutOneCosmetic = "Executioner";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Tough Stuff Muffs
                        case 57: {

                            loadoutOneCosmetic = "Tough Stuff Muffs";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Galvanized Gibus
                        case 58: {

                            loadoutOneCosmetic = "Galvanized Gibus";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Modest Metal Pile of Scrap
                        case 59: {

                            loadoutOneCosmetic = "Modest Metal Pile of Scrap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Noble NIckel Amassment of Hats
                        case 60: {

                            loadoutOneCosmetic = "Noble Nickel Amassment of Hats";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Towering Titanium Pillar of Hats
                        case 61: {

                            loadoutOneCosmetic = "Towering Titanium Pillar of Hats";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            standardUnusualMethod(1);
                            break;

                        }
                        //Bot Dogger
                        case 62: {

                            loadoutOneCosmetic = "Bot Dogger";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Brotherhood of Arms
                        case 63: {

                            loadoutOneCosmetic = "Brotherhood of Arms";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Well-Rounded Riflemam
                        case 64: {

                            loadoutOneCosmetic = "Well-Rounded Rifleman";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Federal Casemaker
                        case 65: {

                            loadoutOneCosmetic = "Federal Casemaker";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Cotton Head
                        case 66: {

                            loadoutOneCosmetic = "Cotton Head";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Hong Kong Cone
                        case 67: {

                            loadoutOneCosmetic = "Hong Kong Cone";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Kiss King
                        case 68: {

                            loadoutOneCosmetic = "Kiss King";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Neckwear Headwear
                        case 69: {

                            loadoutOneCosmetic = "Neckwear Headwear";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Law
                        case 70: {

                            loadoutOneCosmetic = "Law";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Dark Fallkirk Helm
                        case 71: {

                            loadoutOneCosmetic = "Dark Fallkirk Helm";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Merc's Mohawk
                        case 72: {

                            loadoutOneCosmetic = "Merc's Mohawk";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Tipped Lid
                        case 73: {

                            loadoutOneCosmetic = "Tipped Lid";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Vive La France
                        case 74: {

                            loadoutOneCosmetic = "Vive La France";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            glassesEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Crown of the Old Kingdom
                        case 75: {

                            loadoutOneCosmetic = "Crown of the Old Kingdom";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Boxcar Bomber
                        case 76: {

                            loadoutOneCosmetic = "Boxcar";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Coldsnap Cap
                        case 77: {

                            loadoutOneCosmetic = "Coldsnap Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Winter Woodsman
                        case 78: {

                            loadoutOneCosmetic = "Winter Woodsman";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Co-Pilot
                        case 79: {

                            loadoutOneCosmetic = "Co-Pilot";
                            hatEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Finder's Fee
                        case 80: {

                            loadoutOneCosmetic = "Finder's Fee";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Captain Cardbeard Cutthroat
                        case 81: {

                            loadoutOneCosmetic = "Captrain Cardbeard Cutthroat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Rotation Sensation
                        case 82: {

                            loadoutOneCosmetic = "Rotation Sensation";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Potassium Bonnet
                        case 83: {

                            loadoutOneCosmetic = "Potassium Bonnet";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Phononaut
                        case 84: {

                            loadoutOneCosmetic = "Phononaut";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            invasionUnusualMethod(1);
                            break;

                        }
                        //Universal Translator
                        case 85: {

                            loadoutOneCosmetic = "Universal Translator";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            invasionUnusualMethod(1);

                        }
                        //Duck Billed Hatypus
                        case 86: {

                            loadoutOneCosmetic = "Duck Billed Hatypus";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            sf2015UnusualMethod(1);
                            break;

                        }
                        //Prehistoric Pullover
                        case 87: {

                            loadoutOneCosmetic = "Prehistoric Pullover";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            sf2015UnusualMethod(1);
                            break;

                        }
                        //A Well Wrapped Hat
                        case 88: {

                            loadoutOneCosmetic = "A Well Wrapped Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Chill Chullo
                        case 89: {

                            loadoutOneCosmetic = "Chill Chullo";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Patriot Peak
                        case 90: {

                            loadoutOneCosmetic = "Patriot Peak";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Class Crown
                        case 91: {

                            loadoutOneCosmetic = "Class Crown";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            sf2016UnusualMethod(1);
                            break;

                        }
                        //Lil' Bitey
                        case 92: {

                            loadoutOneCosmetic = "Lil' Bitey";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            sf2016UnusualMethod(1);
                            break;

                        }
                        //Nasty Norsemann
                        case 93: {

                            loadoutOneCosmetic = "Nasty Norsemann";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            sf2016UnusualMethod(1);
                            break;

                        }
                        //Toadstool Topper
                        case 94: {

                            loadoutOneCosmetic = "Toadstool Topper";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            sf2016UnusualMethod(1);
                            break;

                        }
                        //Woolen Warmer
                        case 95: {

                            loadoutOneCosmetic = "Woolen Warmer";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Legendary Lid
                        case 96: {

                            loadoutOneCosmetic = "Legendary Lid";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Hunter in Darkness
                        case 97: {

                            loadoutOneCosmetic = "Hunter in Darkness";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Pithy Professional
                        case 98: {

                            loadoutOneCosmetic = "Pithy Professional";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Dealer's Visor
                        case 99: {

                            loadoutOneCosmetic = "Dealer's Visor";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Pilotka
                        case 100: {

                            loadoutOneCosmetic = "Pilotka";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //War Head
                        case 101: {

                            loadoutOneCosmetic = "War Head";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //U-clanka-a
                        case 102: {

                            loadoutOneCosmetic = "U-clanka-a";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Crafty Hair
                        case 103: {

                            loadoutOneCosmetic = "Crafty Hair";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Heavy Artillery Officer's Cap
                        case 104: {

                            loadoutOneCosmetic = "Heavy Artillery Officer's Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //K-9 Mane
                        case 105: {

                            loadoutOneCosmetic = "K-9 Mane";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Brock's Locks
                        case 106: {

                            loadoutOneCosmetic = "Brock's Locks";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Pounding Father
                        case 107: {

                            loadoutOneCosmetic = "Pounding Father";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Wilson Weave
                        case 108: {

                            loadoutOneCosmetic = "Wilson Weave";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Der Maschinensoldaten-Helm
                        case 109: {

                            loadoutOneCosmetic = "Der Maschinensoldaten-Helm";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Sucker SLug
                        case 110: {

                            loadoutOneCosmetic = "Sucker Slug";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //War Eagle
                        case 111: {

                            loadoutOneCosmetic = "War Eagle";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Ghastly Gibus
                        case 112: {

                            loadoutOneCosmetic = "Ghastly Gibus";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Bill's Hat
                        case 113: {

                            loadoutOneCosmetic = "Bill's Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Alien Swarm Parasite
                        case 114: {

                            loadoutOneCosmetic = "Alien Swarm Parasite";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Wiki Cap
                        case 115: {

                            loadoutOneCosmetic = "Wiki Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Ellis' Cap
                        case 116: {

                            loadoutOneCosmetic = "Ellis' Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Mann Co. Cap
                        case 117: {

                            loadoutOneCosmetic = "Mann Co. Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Ghastlier Gibus
                        case 118: {

                            loadoutOneCosmetic = "Ghastlier Gibus";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Spine-Chilling Skull
                        case 119: {

                            loadoutOneCosmetic = "Spine-Chilling Skull";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Voodoo Juju
                        case 120: {

                            loadoutOneCosmetic = "Voodoo Juju";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Bounty Hat
                        case 121: {

                            loadoutOneCosmetic = "Bounty Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Treasure Hat
                        case 122: {

                            loadoutOneCosmetic = "Treasure Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Hat of Undeniable Wealth and Respect
                        case 123: {

                            loadoutOneCosmetic = "Hat of Undeniable Wealth and Respect";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //World Travelers Hat
                        case 124: {

                            loadoutOneCosmetic = "World Travelers Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Atheletic Supporter
                        case 125: {

                            loadoutOneCosmetic = "Atheletic Supporter";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Humanitarian's Hachimaki
                        case 126: {

                            loadoutOneCosmetic = "Humanitariab's Hachimaki";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Benefactor's Kanmuri
                        case 127: {

                            loadoutOneCosmetic = "Benefactor's Kanmuri";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Magnanimous Monarch
                        case 128: {

                            loadoutOneCosmetic = "Magnanimous Monarch";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Aperture Labs Hard Hat
                        case 129: {

                            loadoutOneCosmetic = "Aperture Labs Hard Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Frontline Field Recorder
                        case 130: {

                            loadoutOneCosmetic = "Frontline Field Recorder";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Lo-Fi Longwave
                        case 131: {

                            loadoutOneCosmetic = "Lo-Fi Longwave";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Spiral Sallet
                        case 132: {

                            loadoutOneCosmetic = "Spiral Sallet";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            faceEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;



                        }
                        //Proof of Purchase
                        case 133: {

                            loadoutOneCosmetic = "Proof of Purchase";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Summer Hat
                        case 134: {

                            loadoutOneCosmetic = "Summer Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Party Hat
                        case 135: {

                            loadoutOneCosmetic = "Party Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Manniversary Paper hat
                        case 136: {

                            loadoutOneCosmetic = "Manniversary Paper Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Ghastlierest Gibus
                        case 137: {

                            loadoutOneCosmetic = "Ghastlierest Gibus";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //B.M.O.C
                        case 138: {

                            loadoutOneCosmetic = "B.M.O.C";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Ebenezer
                        case 139: {

                            loadoutOneCosmetic = "Ebenezer";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Full Head Of Steam
                        case 140: {

                            loadoutOneCosmetic = "Full Head of Steam";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Holiday Headcase
                        case 141: {

                            loadoutOneCosmetic = "Holiday Headcase";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            necklaceEquipRegion = true;
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Warsworn Helmet
                        case 142: {

                            loadoutOneCosmetic = "Warsworn Helmet";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Dueler
                        case 143: {

                            loadoutOneCosmetic = "Dueler";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Gifting Man From Gifting Land
                        case 144: {

                            loadoutOneCosmetic = "Gifting Man From Gifting Land";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Philater
                        case 145: {

                            loadoutOneCosmetic = "Philater";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Bolt Action Blitzer
                        case 146: {

                            loadoutOneCosmetic = "Bolt Action Blitzer";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Gentle Munitionne of Leisure
                        case 147: {

                            loadoutOneCosmetic = "Gentle Munitionne of Leisure";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Robot Chicken Hat
                        case 148: {

                            loadoutOneCosmetic = "Robot Chicken Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Ghostly Gibus
                        case 149: {

                            loadoutOneCosmetic = "Ghostly Gibus";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Skull Island Topper
                        case 150: {

                            loadoutOneCosmetic = "Skull Island Topper";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //That '70s Chapeau
                        case 151: {

                            loadoutOneCosmetic = "That '70s Chapeau";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Cockfighter
                        case 152: {

                            loadoutOneCosmetic = "Cockfighter";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Mann Co. Online Cap
                        case 153: {

                            loadoutOneCosmetic = "Mann Co. Online Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Brutal Bouffant
                        case 154: {

                            loadoutOneCosmetic = "Brutal Bouffant";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Conspiracy Cap
                        case 155: {

                            loadoutOneCosmetic = "Conspiracy Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Public Agressor
                        case 156: {

                            loadoutOneCosmetic = "Public Agressor";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Hardy Laurel
                        case 157: {

                            loadoutOneCosmetic = "Hardy Laurel";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Grandmaster
                        case 158: {

                            loadoutOneCosmetic = "Grandmaster";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Towering Pillar of Summer Shades
                        case 159: {

                            loadoutOneCosmetic = "Towering Pillar of Shades";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Horace
                        case 160: {

                            loadoutOneCosmetic = "Horace";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //MK 50
                        case 161: {

                            loadoutOneCosmetic = "MK 50";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Dadliest Catch
                        case 162: {

                            loadoutOneCosmetic = "Dadliest Catch";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Bedouin Bandanna
                        case 163: {

                            loadoutOneCosmetic = "Bedouin Bandanna";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Prinny Hat
                        case 164: {

                            loadoutOneCosmetic = "Prinny Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Civilian JACK Hat
                        case 165: {

                            loadoutOneCosmetic = "Civilian JACK Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Military Grade JACK Hat
                        case 166: {

                            loadoutOneCosmetic = "Military Grade JACK Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Head Prize
                        case 167: {

                            loadoutOneCosmetic = "Head Prize";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Snowmann
                        case 168: {

                            loadoutOneCosmetic = "Snowmann";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Audio File
                        case 169: {

                            loadoutOneCosmetic = "Audio File";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Aztec Warrior
                        case 170: {

                            loadoutOneCosmetic = "Aztec Warrior";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Jungle Wreath
                        case 171: {

                            loadoutOneCosmetic = "Jungle Wreath";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Monstrous Memento
                        case 172: {

                            loadoutOneCosmetic = "Monstrous Memento";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Saxton
                        case 173: {

                            loadoutOneCosmetic = "Saxton";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Point and Shoot
                        case 174: {

                            loadoutOneCosmetic = "Point and Shoot";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Head Skin Region
                            //Large Luchadore
                        case 175: {

                            loadoutOneCosmetic = "Large Luchadore";
                            headSkinEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Polar Pullover
                        case 176: {

                            loadoutOneCosmetic = "Polar Pullover";
                            headSkinEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Cold War Luchadore
                        case 177: {

                            loadoutOneCosmetic = "Cold War Luchadore";
                            headSkinEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Arkham Cown
                        case 178: {

                            loadoutOneCosmetic = "Arkham Cowl";
                            headSkinEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Pocket (Heavy) Region
                            //Pocket Medic
                        case 179: {

                            loadoutOneCosmetic = "Pocket Medic";
                            pocketHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Beard Region
                            //Big Steel Jaw of Summer Fun
                        case 180: {

                            loadoutOneCosmetic = "Big Steel Jaw of Summer Fun";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //All-Father
                        case 181: {

                            loadoutOneCosmetic = "All-Father";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Mutton Mann
                        case 182: {

                            loadoutOneCosmetic = "Mutton Mann";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Cuban Bristle Crisis
                        case 183: {

                            loadoutOneCosmetic = "Cuban Bristle Crisis";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Viking Braider
                        case 184: {

                            loadoutOneCosmetic = "Viking Braider";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Dictator
                        case 185: {

                            loadoutOneCosmetic = "Dictator";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Leftover Trap
                        case 186: {

                            loadoutOneCosmetic = "Leftover Trap";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Yuri's Revenge
                        case 187: {

                            loadoutOneCosmetic = "Yuri's Revenge";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Unshaved Bear
                        case 188: {

                            loadoutOneCosmetic = "Unshaved Bear";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //El Duderino
                        case 189: {

                            loadoutOneCosmetic = "El Duderino";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Dictator
                        case 190: {

                            loadoutOneCosmetic = "Dictator";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Bruiser's Bandanna
                        case 191: {

                            loadoutOneCosmetic = "Bruiser's Bandanna";
                            beardEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Glasses Region
                            //Virtual Viewfinder
                        case 192: {

                            loadoutOneCosmetic = "Virtual Viewfinder";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            standardUnusualMethod(1);
                            break;

                        }
                        //Security Shades
                        case 193: {

                            loadoutOneCosmetic = "Security Shades";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Gabe Glasses
                        case 194: {

                            loadoutOneCosmetic = "Gabe Glasses";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            break;

                        }
                        //Macho Mann
                        case 195: {

                            loadoutOneCosmetic = "Macho Mann";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //War Goggles
                        case 196: {

                            loadoutOneCosmetic = "War Goggles";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Reader's Choice
                        case 197: {

                            loadoutOneCosmetic = "Reader's Choice";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Professor Speks
                        case 198: {

                            loadoutOneCosmetic = "Professor Speks";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Summer Shades
                        case 199: {

                            loadoutOneCosmetic = "Summer Shades";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Pyrovision Goggles
                        case 200: {

                            loadoutOneCosmetic = "Pyrovision Goggles";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Marxman
                        case 201: {

                            loadoutOneCosmetic = "Marxman";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //TF2VRH
                        case 202: {

                            loadoutOneCosmetic = "TF2VRH";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Graybanns
                        case 203: {

                            loadoutOneCosmetic = "Graybanns";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Tomb Readers
                        case 204: {

                            loadoutOneCosmetic = "Tomb Readers";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Spooktacles
                        case 205: {

                            loadoutOneCosmetic = "Spooktacles";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Arms Region
                            //Purity Fist
                        case 206: {

                            loadoutOneCosmetic = "Purity Fist";
                            armsEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Hip (Heavy)
                            //Sandvich Safe
                        case 207: {

                            loadoutOneCosmetic = "Sandvich Safe";
                            hipHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Heavy-Weight Champ
                        case 208: {

                            loadoutOneCosmetic = "Heavy-Weight Champ";
                            hipHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Combat Slacks
                        case 209: {

                            loadoutOneCosmetic = "Combat Slacks";
                            hipHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Towel (Heavy)
                            //Toss-Proof Towel
                        case 210: {

                            loadoutOneCosmetic = "Toss-Proof Towel";
                            towelHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Titanium Towel
                        case 211: {

                            loadoutOneCosmetic = "Titanium Towel";
                            towelHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Heavy Harness
                        case 212: {

                            loadoutOneCosmetic = "Heavy Harness";
                            towelHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Shirt Equip Region
                        //Apparatchiks Apparel
                        case 213: {

                            loadoutOneCosmetic = "Apparatchiks Apparel";
                            shirtEquipRegion = true;
                            armTattooEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Triad Trinket
                        case 214: {

                            loadoutOneCosmetic = "Triad Trinket";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Siberian Sophisticate
                        case 215: {

                            loadoutOneCosmetic = "Siberian Sophisticate";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Hunger Force
                        case 216: {

                            loadoutOneCosmetic = "Hunger Force";
                            shirtEquipRegion = true;
                            necklaceEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Tyurtlenek
                        case 217: {

                            loadoutOneCosmetic = "Tyurtlenek";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Bolshevik Biker
                        case 218: {

                            loadoutOneCosmetic = "Bolshevik Biker";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Weight Room Warmer
                        case 219: {

                            loadoutOneCosmetic = "Weight Room Warmer";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Heavy Lifter
                        case 220: {

                            loadoutOneCosmetic = "Heavy Lifter";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Warmth Preserver
                        case 221: {

                            loadoutOneCosmetic = "Warmth Preserver";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Hunter Heavy
                        case 222: {

                            loadoutOneCosmetic = "Hunter Heavy";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Sleeveless in Siberia
                        case 223: {

                            loadoutOneCosmetic = "Sleeveless in Siberia";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Snow Sleeves
                        case 224: {

                            loadoutOneCosmetic = "Snow Sleeves";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Commisar's Coat
                        case 225: {

                            loadoutOneCosmetic = "Commisar's Coat";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Siberian Sweater
                        case 226: {

                            loadoutOneCosmetic = "Siberian Sweater";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Heavy Tourism
                        case 227: {

                            loadoutOneCosmetic = "Heavy Tourism";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Airborne Attire
                        case 228: {

                            loadoutOneCosmetic = "Airborne Attire";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Siberian Tigerstripe
                        case 229: {

                            loadoutOneCosmetic = "Siberian Tigerstripe";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Tuxxy
                        case 230: {

                            loadoutOneCosmetic = "Tuxxy";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Dead of Night
                        case 231: {

                            loadoutOneCosmetic = "Dead of Night";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Arm Tattoos Region
                            //Champ Stamp
                        case 232: {

                            loadoutOneCosmetic = "Champ Stamp";
                            armTattooEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Sleeves Region
                            //Spooky Sleeves
                        case 233: {

                            loadoutOneCosmetic = "Spooky Sleeves";
                            sleevesEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Batter's Bracers
                        case 234: {

                            loadoutOneCosmetic = "Batter's Bracers";
                            sleevesEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Feet Region
                            //Aqua Flops
                        case 235: {

                            loadoutOneCosmetic = "Aqua Flops";
                            feetEquipRegon = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Rat Stompers
                        case 236: {

                            loadoutOneCosmetic = "Rat Stompers";
                            feetEquipRegon = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Flashdance Footies
                        case 237: {

                            loadoutOneCosmetic = "Flashdance Footies";
                            feetEquipRegon = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Hair (Heavy) Region
                            //Carl
                        case 238: {

                            loadoutOneCosmetic = "Carl";
                            hairHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Heavy's Hockey Hair
                        case 239: {

                            loadoutOneCosmetic = "Heavy's Hockey Hair";
                            hairHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Belt (Heavy) Region
                            //Samson Skewer
                        case 240: {

                            loadoutOneCosmetic = "Samson Skewer";
                            beltHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Fortune Hunteer
                        case 241: {

                            loadoutOneCosmetic = "Fortune Hunter";
                            beltHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Prinny Pouch
                        case 242: {

                            loadoutOneCosmetic = "Prinny Pouch";
                            beltHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Bullets (Heavy) Region
                            //Borscht Belt
                        case 243: {

                            loadoutOneCosmetic = "Borscht Belt";
                            bulletsHeavyEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Left Shoulder Region
                            //Red Army Robin
                        case 244: {

                            loadoutOneCosmetic = "Red Army Robin";
                            leftShoulderEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Grim Tweeter
                        case 245: {

                            loadoutOneCosmetic = "Grim Tweeter";
                            leftShoulderEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Croaking Hazard
                        case 246: {

                            loadoutOneCosmetic = "Croaking Hazard";
                            leftShoulderEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Quizzical Quetzal
                        case 247: {

                            loadoutOneCosmetic = "Quizzical Quetzal";
                            leftShoulderEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Pants Region
                            //Mann of the House
                        case 248: {

                            loadoutOneCosmetic = "Mann of the House";
                            pantsEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Gone Commando
                        case 249: {

                            loadoutOneCosmetic = "Gone Commando";
                            pantsEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Jungle Booty
                        case 250: {

                            loadoutOneCosmetic = "Jungle Booty";
                            pantsEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Breakneck Baggies
                        case 251: {

                            loadoutOneCosmetic = "Breakneck Baggies";
                            pantsEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Hip Pouch (Heavy)
                        //Little Bear
                        case 252: {

                            loadoutOneCosmetic = "Little Bear";
                            hipPouchEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
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

                            loadoutOneCosmetic = "Teufort Knight";
                            wholeHeadEquipRegion = true;
                            hatEquipRegion = true;
                            faceEquipRegion = true;
                            glassesEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Kathman - Hairdo
                        case 267: {

                            loadoutOneCosmetic = "Kathman-Hairdo";
                            wholeHeadEquipRegion = true;
                            hatEquipRegion = true;
                            faceEquipRegion = true;
                            glassesEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Saxton Hale Mask
                        case 268: {

                            loadoutOneCosmetic = "Saxton Hale Mask";
                            wholeHeadEquipRegion = true;
                            hatEquipRegion = true;
                            faceEquipRegion = true;
                            glassesEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Coat (Soldier) Region
                            //Gift Bringer
                        case 269: {

                            loadoutOneCosmetic = "Gift Bringer";
                            coatSoldierEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Face Region
                            //Captain Space Mann
                        case 270: {

                            loadoutOneCosmetic = "Captain Space Mann";
                            faceEquipRegion = true;
                            glassesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            invasionUnusualMethod(1);
                            break;

                        }
                        //Mad Mask
                        case 271: {

                            loadoutOneCosmetic = "Mad Mask";
                            faceEquipRegion = true;
                            glassesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Medal Region
                            //Mercenary
                        case 272: {

                            loadoutOneCosmetic = "Mercenary";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Soldier of Fortune
                        case 273: {

                            loadoutOneCosmetic = "Soldier of Fortune";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Grizzled Veteran
                        case 274: {

                            loadoutOneCosmetic = "Grizzled Veteran";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Primeval Warrior
                        case 275: {

                            loadoutOneCosmetic = "Primeval Warrior";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Bronze Dueling Badge
                        case 276: {

                            loadoutOneCosmetic = "Bronze Dueling Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Silver Dueling Badge
                        case 277: {

                            loadoutOneCosmetic = "Silver Dueling Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Gold Dueling Badge
                        case 278: {

                            loadoutOneCosmetic = "Gold Dueling Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Platinum Dueling Badge
                        case 279: {

                            loadoutOneCosmetic = "Platinum Dueling Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Polycount Pin
                        case 280: {

                            loadoutOneCosmetic = "Polycount Pin";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Companion Cube Pin
                        case 281: {

                            loadoutOneCosmetic = "Companion Cube Pin";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //License to Maim
                        case 282: {

                            loadoutOneCosmetic = "License to Maim";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Resurrection Associate Pin
                        case 283: {

                            loadoutOneCosmetic = "Resurrection Associate Pin";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //SpaceChem Pin
                        case 284: {

                            loadoutOneCosmetic = "SpaceChem Pin";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Dr. Grordbort's Crest
                        case 285: {

                            loadoutOneCosmetic = "Dr. Grordbort's Crest";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Clan Pride
                        case 286: {

                            loadoutOneCosmetic = "Clan Pride";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Photo Badge
                        case 287: {

                            loadoutOneCosmetic = "Photo Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Bombinomicon
                        case 288: {

                            loadoutOneCosmetic = "Bombinomicon";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Mark of the Saint
                        case 289: {

                            loadoutOneCosmetic = "Mark of the Saint";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Dr. Grordbort's Copper Crest
                        case 290: {

                            loadoutOneCosmetic = "Dr. Grordbort's Copper Crest";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Dr. Grordbort's Silver Crest
                        case 291: {

                            loadoutOneCosmetic = "Dr. Grordbort's Silver Crest";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Spirit of Giving
                        case 292: {

                            loadoutOneCosmetic = "Spirit of Giving";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Map Maker's Medallion
                        case 293: {

                            loadoutOneCosmetic = "Map Maker's Medallion";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Merc Medal
                        case 294: {

                            loadoutOneCosmetic = "Merc Medal";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Atomic Accolade
                        case 295: {

                            loadoutOneCosmetic = "Atomic Accolade";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Awesomenauts Badge
                        case 296: {

                            loadoutOneCosmetic = "Awesomenauts Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Operation Oil Spill Badge
                        case 298: {

                            loadoutOneCosmetic = "Operation Oil Spill Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Operation Steel Trap Badge
                        case 299: {

                            loadoutOneCosmetic = "Operation Steel Trap Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Operation Gear Grinder Badge
                        case 300: {/**/

                            loadoutOneCosmetic = "Operation Gear Grinder Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Vigilant Pin
                        case 301: {

                            loadoutOneCosmetic = "Vigilant Pin";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Friends Forever Companion Square Badge
                        case 302: {

                            loadoutOneCosmetic = "Friends  Forever Companion Square Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Heroic Companion Badge
                        case 303: {

                            loadoutOneCosmetic = "Heroic Companion Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Triple A Badge
                        case 304: {

                            loadoutOneCosmetic = "Triple A Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Whale Bone Charm
                        case 305: {

                            loadoutOneCosmetic = "Whale Bone Charm";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Hitt Mann Badge
                        case 306: {

                            loadoutOneCosmetic = "Hitt Mann Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Faerie Solitare Pin
                        case 307: {

                            loadoutOneCosmetic = "Faerie Solitare Pin";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Saxxy Clapper Badge
                        case 308: {

                            loadoutOneCosmetic = "Saxxy Clapper Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Operation Mecha Engine
                        case 309: {

                            loadoutOneCosmetic = "Operation Mecha Engine";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Smissmas WWreath
                        case 310: {

                            loadoutOneCosmetic = "Smissmas Wreath";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Crot's Crest
                        case 311: {

                            loadoutOneCosmetic = "Croft's Crest";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Electric Badge-aloo
                        case 312: {

                            loadoutOneCosmetic = "Electric Badge-aloo";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Operation Two Cities Badge
                        case 313: {

                            loadoutOneCosmetic = "Operation Two Cities Badge";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Heart of Gold
                        case 314: {

                            loadoutOneCosmetic = "Heart of Gold";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Baronial Badge
                        case 315: {

                            loadoutOneCosmetic = "Baronial Badge";
                            medalEquipRegion = true;
                            break;

                        }
                        //Thought That Counts
                        case 316: {

                            loadoutOneCosmetic = "Thought That Counts";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //End of the Line Community Medal
                        case 317: {

                            loadoutOneCosmetic = "End of the Line Community Medal";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Invasion Community Medal
                        case 318: {

                            loadoutOneCosmetic = "Invasion Community Medal";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Honeydew's Charitable Countenance
                        case 319: {

                            loadoutOneCosmetic = "Honeydews Charitable COuntenance";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Xephos' Philantrophic Physiognomy
                        case 320: {

                            loadoutOneCosmetic = "Xephos' Philantrophic Physiognomy";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Gift of Giving
                        case 321: {

                            loadoutOneCosmetic = "Gift of Giving";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Special Snowflake
                        case 322: {

                            loadoutOneCosmetic = "Special Snowflake";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;


                        }
                        //PASS Time Early Participation Medal
                        case 323: {

                            loadoutOneCosmetic = "PASS Time Early Participation Medal";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Altruist's Adornment
                        case 324: {

                            loadoutOneCosmetic = "Altruist's Adornment";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //TF2Maps 72hr TF2Jam Participent
                        case 325: {

                            loadoutOneCosmetic = "TF2Maps 72hr TF2 Jam Participent";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //PASS Time Miniature Half Jack
                        case 326: {

                            loadoutOneCosmetic = "PASS Time Miniature Half Jack";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Jaunty Camper
                        case 327: {

                            loadoutOneCosmetic = "Jaunty Camper";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Jaunty Benefactor
                        case 328: {

                            loadoutOneCosmetic = "Jaunty Benefactor";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Jaunty Trailblazer
                        case 329: {

                            loadoutOneCosmetic = "Jaunty Trailblazer";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Duncan's Kindhearted Kisser
                        case 330: {

                            loadoutOneCosmetic = "Duncan's Kindhearted Kisser";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Hannah's Altruistic Aspect
                        case 331: {

                            loadoutOneCosmetic = "Hannah's Altruistic Aspect";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Sips' Selfless Simulacrum
                        case 332: {

                            loadoutOneCosmetic = "Sips' Selfless Simulacrum";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Sjin's Generous Guise
                        case 333: {

                            loadoutOneCosmetic = "Sjin's Generous Guise";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Gift of Giving 2016
                        case 334: {

                            loadoutOneCosmetic = "Gift of Giving 2016";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Special Snowflake 2016
                        case 335: {

                            loadoutOneCosmetic = "Special Snowflake 2016";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Mapper vs. Machiners Participant Medal 2017
                        case 336: {

                            loadoutOneCosmetic = "Mapper vs. Machiners Participant Medal 2017";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Blapature Co. Contributor
                        case 338: {

                            loadoutOneCosmetic = "Blapature Co. Contributor";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //TF2Maps Charitable HEart
                        case 339: {

                            loadoutOneCosmetic = "TF2Maps Charitable Heart";
                            medalEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Earbud's Special Region
                            //Earbuds
                        case 340: {

                            loadoutOneCosmetic = "Earbuds";
                            earbudsSpecialEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Lenses Region
                            //Deus Specs
                        case 341: {

                            loadoutOneCosmetic = "Deus Specs";
                            medalEquipRegion = true;
                            glassesEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Eye-Catcher
                        case 342: {

                            loadoutOneCosmetic = "Eye-Catcher";
                            lensesEquipRegion = true;
                            glassesEquipRegion = true;
                            paintMethod(1);
                            break;

                        }
                        //Flair Region
                        case 343: {

                            loadoutOneCosmetic = "Flair!";
                            flairEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;


                        }
                        //Necklace Region
                            //Merc's Pride Scarf
                        case 344: {

                            loadoutOneCosmetic = "Merc's Pride Scarf";
                            necklaceEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Merc's Muffler
                        case 345: {

                            loadoutOneCosmetic = "Merc's Muffler";
                            necklaceEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Slithering Scarf
                        case 346: {

                            loadoutOneCosmetic = "Slithering Scarf";
                            necklaceEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Disconnected Floating Item Region
                        //Baloonicorn
                        case 347: {

                            loadoutOneCosmetic = "Baloonicorn";
                            disconnectedFloatingItemEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //RoBro 3000
                        case 348: {

                            loadoutOneCosmetic = "RoBro 3000";
                            disconnectedFloatingItemEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Reindoonicorn
                        case 349: {

                            loadoutOneCosmetic = "Reindoonicorn";
                            disconnectedFloatingItemEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Space Hamster Hammy
                        case 350: {

                            loadoutOneCosmetic = "Space Hamster Hammy";
                            disconnectedFloatingItemEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Belt Region
                        //Buttler
                        case 351: {

                            loadoutOneCosmetic = "Buttler";
                            beltEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Rump-o'-Lantern
                        case 352: {

                            loadoutOneCosmetic = "Rump-o'-Lantern";
                            beltEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Catastrophic Companions
                        case 353: {

                            loadoutOneCosmetic = "Catastrophic Companions";
                            beltEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Pocket Saxton
                        case 354: {

                            loadoutOneCosmetic = "Pocket Saxton";
                            beltEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Grenades Region
                        //Pocket Raiders
                        case 355: {

                            loadoutOneCosmetic = "Pocket Raiders";
                            grenadesEquipRegion = true;
                            pocketSniperEquipRegion = true;
                            pocketEngineerEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Pocket Villains
                        case 356: {

                            loadoutOneCosmetic = "Pocket Villains";
                            grenadesEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //None
                        case 367: {

                            loadoutOneCosmetic = "None";
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with choosing loadout one's cosmetic");
                            break;

                        }

                    }

                }
                break;

            }
            //Loadout 3
            case 3: {



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



            }
            case 3: {



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

                break;

            }
            case 3: {

                break;

            }
            default: {

                System.out.println("Something went wrong with calling the unusual method (sf2015)");
                break;

            }

        }

    }
    //Scream Fortress 2016 unusual effect selector
    private void sf2016UnusualMethod (int loadoutNumber) {

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

                break;

            }
            case 3: {

                break;

            }
            default: {

                System.out.println("Something went wrong with calling the unusual method (sf216)");
                break;

            }

        }

    }
    //Invasion unusual effect selector
    private void invasionUnusualMethod (int loadoutNumber) {

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

                break;

            }
            case 3: {

                break;

            }
            default: {

                System.out.println("Something went wrong with calling the unusual method (Invasion)");
                break;

            }

        }

    }
    public static void main (String[] args) {

        new HeavyLoadoutGenerator();

    }

}
