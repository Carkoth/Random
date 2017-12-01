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
                while (!loadoutTwoLoopSatisfied) {

                    int loadoutRandomizer = (int) (Math.random() * 357 + 1);
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

                            loadoutTwoCosmetic = "War Head";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //U-clanka-a
                        case 102: {

                            loadoutTwoCosmetic = "U-clanka-a";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Crafty Hair
                        case 103: {

                            loadoutTwoCosmetic = "Crafty Hair";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Heavy Artillery Officer's Cap
                        case 104: {

                            loadoutTwoCosmetic = "Heavy Artillery Officer's Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //K-9 Mane
                        case 105: {

                            loadoutTwoCosmetic = "K-9 Mane";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Brock's Locks
                        case 106: {

                            loadoutTwoCosmetic = "Brock's Locks";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Pounding Father
                        case 107: {

                            loadoutTwoCosmetic = "Pounding Father";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Wilson Weave
                        case 108: {

                            loadoutTwoCosmetic = "Wilson Weave";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Der Maschinensoldaten-Helm
                        case 109: {

                            loadoutTwoCosmetic = "Der Maschinensoldaten-Helm";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Sucker SLug
                        case 110: {

                            loadoutTwoCosmetic = "Sucker Slug";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //War Eagle
                        case 111: {

                            loadoutTwoCosmetic = "War Eagle";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Ghastly Gibus
                        case 112: {

                            loadoutTwoCosmetic = "Ghastly Gibus";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Bill's Hat
                        case 113: {

                            loadoutTwoCosmetic = "Bill's Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Alien Swarm Parasite
                        case 114: {

                            loadoutTwoCosmetic = "Alien Swarm Parasite";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Wiki Cap
                        case 115: {

                            loadoutTwoCosmetic = "Wiki Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Ellis' Cap
                        case 116: {

                            loadoutTwoCosmetic = "Ellis' Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Mann Co. Cap
                        case 117: {

                            loadoutTwoCosmetic = "Mann Co. Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Ghastlier Gibus
                        case 118: {

                            loadoutTwoCosmetic = "Ghastlier Gibus";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Spine-Chilling Skull
                        case 119: {

                            loadoutTwoCosmetic = "Spine-Chilling Skull";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Voodoo Juju
                        case 120: {

                            loadoutTwoCosmetic = "Voodoo Juju";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Bounty Hat
                        case 121: {

                            loadoutTwoCosmetic = "Bounty Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Treasure Hat
                        case 122: {

                            loadoutTwoCosmetic = "Treasure Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Hat of Undeniable Wealth and Respect
                        case 123: {

                            loadoutTwoCosmetic = "Hat of Undeniable Wealth and Respect";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //World Travelers Hat
                        case 124: {

                            loadoutTwoCosmetic = "World Travelers Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Atheletic Supporter
                        case 125: {

                            loadoutTwoCosmetic = "Atheletic Supporter";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Humanitarian's Hachimaki
                        case 126: {

                            loadoutTwoCosmetic = "Humanitariab's Hachimaki";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Benefactor's Kanmuri
                        case 127: {

                            loadoutTwoCosmetic = "Benefactor's Kanmuri";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Magnanimous Monarch
                        case 128: {

                            loadoutTwoCosmetic = "Magnanimous Monarch";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Aperture Labs Hard Hat
                        case 129: {

                            loadoutTwoCosmetic = "Aperture Labs Hard Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Frontline Field Recorder
                        case 130: {

                            loadoutTwoCosmetic = "Frontline Field Recorder";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Lo-Fi Longwave
                        case 131: {

                            loadoutTwoCosmetic = "Lo-Fi Longwave";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Spiral Sallet
                        case 132: {

                            loadoutTwoCosmetic = "Spiral Sallet";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            faceEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;



                        }
                        //Proof of Purchase
                        case 133: {

                            loadoutTwoCosmetic = "Proof of Purchase";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Summer Hat
                        case 134: {

                            loadoutTwoCosmetic = "Summer Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Party Hat
                        case 135: {

                            loadoutTwoCosmetic = "Party Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Manniversary Paper hat
                        case 136: {

                            loadoutTwoCosmetic = "Manniversary Paper Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Ghastlierest Gibus
                        case 137: {

                            loadoutTwoCosmetic = "Ghastlierest Gibus";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //B.M.O.C
                        case 138: {

                            loadoutTwoCosmetic = "B.M.O.C";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Ebenezer
                        case 139: {

                            loadoutTwoCosmetic = "Ebenezer";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Full Head Of Steam
                        case 140: {

                            loadoutTwoCosmetic = "Full Head of Steam";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Holiday Headcase
                        case 141: {

                            loadoutTwoCosmetic = "Holiday Headcase";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            necklaceEquipRegion = true;
                            beardEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Warsworn Helmet
                        case 142: {

                            loadoutTwoCosmetic = "Warsworn Helmet";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Dueler
                        case 143: {

                            loadoutTwoCosmetic = "Dueler";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Gifting Man From Gifting Land
                        case 144: {

                            loadoutTwoCosmetic = "Gifting Man From Gifting Land";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Philater
                        case 145: {

                            loadoutTwoCosmetic = "Philater";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Bolt Action Blitzer
                        case 146: {

                            loadoutTwoCosmetic = "Bolt Action Blitzer";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Gentle Munitionne of Leisure
                        case 147: {

                            loadoutTwoCosmetic = "Gentle Munitionne of Leisure";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Robot Chicken Hat
                        case 148: {

                            loadoutTwoCosmetic = "Robot Chicken Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Ghostly Gibus
                        case 149: {

                            loadoutTwoCosmetic = "Ghostly Gibus";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Skull Island Topper
                        case 150: {

                            loadoutTwoCosmetic = "Skull Island Topper";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //That '70s Chapeau
                        case 151: {

                            loadoutTwoCosmetic = "That '70s Chapeau";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Cockfighter
                        case 152: {

                            loadoutTwoCosmetic = "Cockfighter";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Mann Co. Online Cap
                        case 153: {

                            loadoutTwoCosmetic = "Mann Co. Online Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Brutal Bouffant
                        case 154: {

                            loadoutTwoCosmetic = "Brutal Bouffant";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Conspiracy Cap
                        case 155: {

                            loadoutTwoCosmetic = "Conspiracy Cap";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Public Agressor
                        case 156: {

                            loadoutTwoCosmetic = "Public Agressor";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Hardy Laurel
                        case 157: {

                            loadoutTwoCosmetic = "Hardy Laurel";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Grandmaster
                        case 158: {

                            loadoutTwoCosmetic = "Grandmaster";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Towering Pillar of Summer Shades
                        case 159: {

                            loadoutTwoCosmetic = "Towering Pillar of Shades";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Horace
                        case 160: {

                            loadoutTwoCosmetic = "Horace";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //MK 50
                        case 161: {

                            loadoutTwoCosmetic = "MK 50";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Dadliest Catch
                        case 162: {

                            loadoutTwoCosmetic = "Dadliest Catch";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Bedouin Bandanna
                        case 163: {

                            loadoutTwoCosmetic = "Bedouin Bandanna";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Prinny Hat
                        case 164: {

                            loadoutTwoCosmetic = "Prinny Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Civilian JACK Hat
                        case 165: {

                            loadoutTwoCosmetic = "Civilian JACK Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Military Grade JACK Hat
                        case 166: {

                            loadoutTwoCosmetic = "Military Grade JACK Hat";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Head Prize
                        case 167: {

                            loadoutTwoCosmetic = "Head Prize";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Snowmann
                        case 168: {

                            loadoutTwoCosmetic = "Snowmann";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Audio File
                        case 169: {

                            loadoutTwoCosmetic = "Audio File";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Aztec Warrior
                        case 170: {

                            loadoutTwoCosmetic = "Aztec Warrior";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Jungle Wreath
                        case 171: {

                            loadoutTwoCosmetic = "Jungle Wreath";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Monstrous Memento
                        case 172: {

                            loadoutTwoCosmetic = "Monstrous Memento";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Saxton
                        case 173: {

                            loadoutTwoCosmetic = "Saxton";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Point and Shoot
                        case 174: {

                            loadoutTwoCosmetic = "Point and Shoot";
                            hatEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Head Skin Region
                        //Large Luchadore
                        case 175: {

                            loadoutTwoCosmetic = "Large Luchadore";
                            headSkinEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            standardUnusualMethod(2);
                            break;

                        }
                        //Polar Pullover
                        case 176: {

                            loadoutTwoCosmetic = "Polar Pullover";
                            headSkinEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            standardUnusualMethod(2);
                            break;

                        }
                        //Cold War Luchadore
                        case 177: {

                            loadoutTwoCosmetic = "Cold War Luchadore";
                            headSkinEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Arkham Cown
                        case 178: {

                            loadoutTwoCosmetic = "Arkham Cowl";
                            headSkinEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Pocket (Heavy) Region
                        //Pocket Medic
                        case 179: {

                            loadoutTwoCosmetic = "Pocket Medic";
                            pocketHeavyEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Beard Region
                        //Big Steel Jaw of Summer Fun
                        case 180: {

                            loadoutTwoCosmetic = "Big Steel Jaw of Summer Fun";
                            beardEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //All-Father
                        case 181: {

                            loadoutTwoCosmetic = "All-Father";
                            beardEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Mutton Mann
                        case 182: {

                            loadoutTwoCosmetic = "Mutton Mann";
                            beardEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Cuban Bristle Crisis
                        case 183: {

                            loadoutTwoCosmetic = "Cuban Bristle Crisis";
                            beardEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Viking Braider
                        case 184: {

                            loadoutTwoCosmetic = "Viking Braider";
                            beardEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Dictator
                        case 185: {

                            loadoutTwoCosmetic = "Dictator";
                            beardEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Leftover Trap
                        case 186: {

                            loadoutTwoCosmetic = "Leftover Trap";
                            beardEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Yuri's Revenge
                        case 187: {

                            loadoutTwoCosmetic = "Yuri's Revenge";
                            beardEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Unshaved Bear
                        case 188: {

                            loadoutTwoCosmetic = "Unshaved Bear";
                            beardEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //El Duderino
                        case 189: {

                            loadoutTwoCosmetic = "El Duderino";
                            beardEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Dictator
                        case 190: {

                            loadoutTwoCosmetic = "Dictator";
                            beardEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Bruiser's Bandanna
                        case 191: {

                            loadoutTwoCosmetic = "Bruiser's Bandanna";
                            beardEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Glasses Region
                        //Virtual Viewfinder
                        case 192: {

                            loadoutTwoCosmetic = "Virtual Viewfinder";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            standardUnusualMethod(2);
                            break;

                        }
                        //Security Shades
                        case 193: {

                            loadoutTwoCosmetic = "Security Shades";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Gabe Glasses
                        case 194: {

                            loadoutTwoCosmetic = "Gabe Glasses";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            break;

                        }
                        //Macho Mann
                        case 195: {

                            loadoutTwoCosmetic = "Macho Mann";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //War Goggles
                        case 196: {

                            loadoutTwoCosmetic = "War Goggles";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Reader's Choice
                        case 197: {

                            loadoutTwoCosmetic = "Reader's Choice";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Professor Speks
                        case 198: {

                            loadoutTwoCosmetic = "Professor Speks";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Summer Shades
                        case 199: {

                            loadoutTwoCosmetic = "Summer Shades";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Pyrovision Goggles
                        case 200: {

                            loadoutTwoCosmetic = "Pyrovision Goggles";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Marxman
                        case 201: {

                            loadoutTwoCosmetic = "Marxman";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //TF2VRH
                        case 202: {

                            loadoutTwoCosmetic = "TF2VRH";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Graybanns
                        case 203: {

                            loadoutTwoCosmetic = "Graybanns";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Tomb Readers
                        case 204: {

                            loadoutTwoCosmetic = "Tomb Readers";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Spooktacles
                        case 205: {

                            loadoutTwoCosmetic = "Spooktacles";
                            glassesEquipRegion = true;
                            faceEquipRegion = true;
                            lensesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Arms Region
                        //Purity Fist
                        case 206: {

                            loadoutTwoCosmetic = "Purity Fist";
                            armsEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Hip (Heavy)
                        //Sandvich Safe
                        case 207: {

                            loadoutTwoCosmetic = "Sandvich Safe";
                            hipHeavyEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Heavy-Weight Champ
                        case 208: {

                            loadoutTwoCosmetic = "Heavy-Weight Champ";
                            hipHeavyEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Combat Slacks
                        case 209: {

                            loadoutTwoCosmetic = "Combat Slacks";
                            hipHeavyEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Towel (Heavy)
                        //Toss-Proof Towel
                        case 210: {

                            loadoutTwoCosmetic = "Toss-Proof Towel";
                            towelHeavyEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Titanium Towel
                        case 211: {

                            loadoutTwoCosmetic = "Titanium Towel";
                            towelHeavyEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Heavy Harness
                        case 212: {

                            loadoutTwoCosmetic = "Heavy Harness";
                            towelHeavyEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Shirt Equip Region
                        //Apparatchiks Apparel
                        case 213: {

                            loadoutTwoCosmetic = "Apparatchiks Apparel";
                            shirtEquipRegion = true;
                            armTattooEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Triad Trinket
                        case 214: {

                            loadoutTwoCosmetic = "Triad Trinket";
                            shirtEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Siberian Sophisticate
                        case 215: {

                            loadoutTwoCosmetic = "Siberian Sophisticate";
                            shirtEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Hunger Force
                        case 216: {

                            loadoutTwoCosmetic = "Hunger Force";
                            shirtEquipRegion = true;
                            necklaceEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Tyurtlenek
                        case 217: {

                            loadoutTwoCosmetic = "Tyurtlenek";
                            shirtEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Bolshevik Biker
                        case 218: {

                            loadoutTwoCosmetic = "Bolshevik Biker";
                            shirtEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Weight Room Warmer
                        case 219: {

                            loadoutTwoCosmetic = "Weight Room Warmer";
                            shirtEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Heavy Lifter
                        case 220: {

                            loadoutTwoCosmetic = "Heavy Lifter";
                            shirtEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Warmth Preserver
                        case 221: {

                            loadoutTwoCosmetic = "Warmth Preserver";
                            shirtEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Hunter Heavy
                        case 222: {

                            loadoutTwoCosmetic = "Hunter Heavy";
                            shirtEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Sleeveless in Siberia
                        case 223: {

                            loadoutTwoCosmetic = "Sleeveless in Siberia";
                            shirtEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Snow Sleeves
                        case 224: {

                            loadoutTwoCosmetic = "Snow Sleeves";
                            shirtEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Commisar's Coat
                        case 225: {

                            loadoutTwoCosmetic = "Commisar's Coat";
                            shirtEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Siberian Sweater
                        case 226: {

                            loadoutTwoCosmetic = "Siberian Sweater";
                            shirtEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Heavy Tourism
                        case 227: {

                            loadoutTwoCosmetic = "Heavy Tourism";
                            shirtEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Airborne Attire
                        case 228: {

                            loadoutTwoCosmetic = "Airborne Attire";
                            shirtEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Siberian Tigerstripe
                        case 229: {

                            loadoutTwoCosmetic = "Siberian Tigerstripe";
                            shirtEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Tuxxy
                        case 230: {

                            loadoutTwoCosmetic = "Tuxxy";
                            shirtEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Dead of Night
                        case 231: {

                            loadoutTwoCosmetic = "Dead of Night";
                            shirtEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Arm Tattoos Region
                        //Champ Stamp
                        case 232: {

                            loadoutTwoCosmetic = "Champ Stamp";
                            armTattooEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Sleeves Region
                        //Spooky Sleeves
                        case 233: {

                            loadoutTwoCosmetic = "Spooky Sleeves";
                            sleevesEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Batter's Bracers
                        case 234: {

                            loadoutTwoCosmetic = "Batter's Bracers";
                            sleevesEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Feet Region
                        //Aqua Flops
                        case 235: {

                            loadoutTwoCosmetic = "Aqua Flops";
                            feetEquipRegon = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Rat Stompers
                        case 236: {

                            loadoutTwoCosmetic = "Rat Stompers";
                            feetEquipRegon = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Flashdance Footies
                        case 237: {

                            loadoutTwoCosmetic = "Flashdance Footies";
                            feetEquipRegon = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Hair (Heavy) Region
                        //Carl
                        case 238: {

                            loadoutTwoCosmetic = "Carl";
                            hairHeavyEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Heavy's Hockey Hair
                        case 239: {

                            loadoutTwoCosmetic = "Heavy's Hockey Hair";
                            hairHeavyEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Belt (Heavy) Region
                        //Samson Skewer
                        case 240: {

                            loadoutTwoCosmetic = "Samson Skewer";
                            beltHeavyEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Fortune Hunteer
                        case 241: {

                            loadoutTwoCosmetic = "Fortune Hunter";
                            beltHeavyEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Prinny Pouch
                        case 242: {

                            loadoutTwoCosmetic = "Prinny Pouch";
                            beltHeavyEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Bullets (Heavy) Region
                        //Borscht Belt
                        case 243: {

                            loadoutTwoCosmetic = "Borscht Belt";
                            bulletsHeavyEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Left Shoulder Region
                        //Red Army Robin
                        case 244: {

                            loadoutTwoCosmetic = "Red Army Robin";
                            leftShoulderEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Grim Tweeter
                        case 245: {

                            loadoutTwoCosmetic = "Grim Tweeter";
                            leftShoulderEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Croaking Hazard
                        case 246: {

                            loadoutTwoCosmetic = "Croaking Hazard";
                            leftShoulderEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Quizzical Quetzal
                        case 247: {

                            loadoutTwoCosmetic = "Quizzical Quetzal";
                            leftShoulderEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Pants Region
                        //Mann of the House
                        case 248: {

                            loadoutTwoCosmetic = "Mann of the House";
                            pantsEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Gone Commando
                        case 249: {

                            loadoutTwoCosmetic = "Gone Commando";
                            pantsEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Jungle Booty
                        case 250: {

                            loadoutTwoCosmetic = "Jungle Booty";
                            pantsEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Breakneck Baggies
                        case 251: {

                            loadoutTwoCosmetic = "Breakneck Baggies";
                            pantsEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Hip Pouch (Heavy)
                        //Little Bear
                        case 252: {

                            loadoutTwoCosmetic = "Little Bear";
                            hipPouchEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
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

                            loadoutTwoCosmetic = "Teufort Knight";
                            wholeHeadEquipRegion = true;
                            hatEquipRegion = true;
                            faceEquipRegion = true;
                            glassesEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Kathman - Hairdo
                        case 267: {

                            loadoutTwoCosmetic = "Kathman-Hairdo";
                            wholeHeadEquipRegion = true;
                            hatEquipRegion = true;
                            faceEquipRegion = true;
                            glassesEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Saxton Hale Mask
                        case 268: {

                            loadoutTwoCosmetic = "Saxton Hale Mask";
                            wholeHeadEquipRegion = true;
                            hatEquipRegion = true;
                            faceEquipRegion = true;
                            glassesEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Coat (Soldier) Region
                        //Gift Bringer
                        case 269: {

                            loadoutTwoCosmetic = "Gift Bringer";
                            coatSoldierEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Face Region
                        //Captain Space Mann
                        case 270: {

                            loadoutTwoCosmetic = "Captain Space Mann";
                            faceEquipRegion = true;
                            glassesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            invasionUnusualMethod(2);
                            break;

                        }
                        //Mad Mask
                        case 271: {

                            loadoutTwoCosmetic = "Mad Mask";
                            faceEquipRegion = true;
                            glassesEquipRegion = true;
                            wholeHeadEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Medal Region
                        //Mercenary
                        case 272: {

                            loadoutTwoCosmetic = "Mercenary";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Soldier of Fortune
                        case 273: {

                            loadoutTwoCosmetic = "Soldier of Fortune";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Grizzled Veteran
                        case 274: {

                            loadoutTwoCosmetic = "Grizzled Veteran";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Primeval Warrior
                        case 275: {

                            loadoutTwoCosmetic = "Primeval Warrior";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Bronze Dueling Badge
                        case 276: {

                            loadoutTwoCosmetic = "Bronze Dueling Badge";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Silver Dueling Badge
                        case 277: {

                            loadoutTwoCosmetic = "Silver Dueling Badge";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Gold Dueling Badge
                        case 278: {

                            loadoutTwoCosmetic = "Gold Dueling Badge";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Platinum Dueling Badge
                        case 279: {

                            loadoutTwoCosmetic = "Platinum Dueling Badge";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Polycount Pin
                        case 280: {

                            loadoutTwoCosmetic = "Polycount Pin";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Companion Cube Pin
                        case 281: {

                            loadoutTwoCosmetic = "Companion Cube Pin";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //License to Maim
                        case 282: {

                            loadoutTwoCosmetic = "License to Maim";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Resurrection Associate Pin
                        case 283: {/**/

                            loadoutTwoCosmetic = "Resurrection Associate Pin";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //SpaceChem Pin
                        case 284: {

                            loadoutTwoCosmetic = "SpaceChem Pin";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Dr. Grordbort's Crest
                        case 285: {

                            loadoutTwoCosmetic = "Dr. Grordbort's Crest";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Clan Pride
                        case 286: {

                            loadoutTwoCosmetic = "Clan Pride";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Photo Badge
                        case 287: {

                            loadoutTwoCosmetic = "Photo Badge";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Bombinomicon
                        case 288: {

                            loadoutTwoCosmetic = "Bombinomicon";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Mark of the Saint
                        case 289: {

                            loadoutTwoCosmetic = "Mark of the Saint";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Dr. Grordbort's Copper Crest
                        case 290: {

                            loadoutTwoCosmetic = "Dr. Grordbort's Copper Crest";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Dr. Grordbort's Silver Crest
                        case 291: {

                            loadoutTwoCosmetic = "Dr. Grordbort's Silver Crest";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Spirit of Giving
                        case 292: {

                            loadoutTwoCosmetic = "Spirit of Giving";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Map Maker's Medallion
                        case 293: {

                            loadoutTwoCosmetic = "Map Maker's Medallion";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Merc Medal
                        case 294: {

                            loadoutTwoCosmetic = "Merc Medal";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Atomic Accolade
                        case 295: {

                            loadoutTwoCosmetic = "Atomic Accolade";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Awesomenauts Badge
                        case 296: {

                            loadoutTwoCosmetic = "Awesomenauts Badge";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Operation Oil Spill Badge
                        case 298: {

                            loadoutTwoCosmetic = "Operation Oil Spill Badge";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Operation Steel Trap Badge
                        case 299: {

                            loadoutTwoCosmetic = "Operation Steel Trap Badge";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Operation Gear Grinder Badge
                        case 300: {

                            loadoutTwoCosmetic = "Operation Gear Grinder Badge";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Vigilant Pin
                        case 301: {

                            loadoutTwoCosmetic = "Vigilant Pin";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Friends Forever Companion Square Badge
                        case 302: {

                            loadoutTwoCosmetic = "Friends  Forever Companion Square Badge";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Heroic Companion Badge
                        case 303: {

                            loadoutTwoCosmetic = "Heroic Companion Badge";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Triple A Badge
                        case 304: {

                            loadoutTwoCosmetic = "Triple A Badge";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Whale Bone Charm
                        case 305: {

                            loadoutTwoCosmetic = "Whale Bone Charm";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Hitt Mann Badge
                        case 306: {

                            loadoutTwoCosmetic = "Hitt Mann Badge";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Faerie Solitare Pin
                        case 307: {

                            loadoutTwoCosmetic = "Faerie Solitare Pin";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Saxxy Clapper Badge
                        case 308: {

                            loadoutTwoCosmetic = "Saxxy Clapper Badge";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Operation Mecha Engine
                        case 309: {

                            loadoutTwoCosmetic = "Operation Mecha Engine";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Smissmas WWreath
                        case 310: {

                            loadoutTwoCosmetic = "Smissmas Wreath";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Crot's Crest
                        case 311: {

                            loadoutTwoCosmetic = "Croft's Crest";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Electric Badge-aloo
                        case 312: {

                            loadoutTwoCosmetic = "Electric Badge-aloo";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Operation Two Cities Badge
                        case 313: {

                            loadoutTwoCosmetic = "Operation Two Cities Badge";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Heart of Gold
                        case 314: {

                            loadoutTwoCosmetic = "Heart of Gold";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Baronial Badge
                        case 315: {

                            loadoutTwoCosmetic = "Baronial Badge";
                            medalEquipRegion = true;
                            break;

                        }
                        //Thought That Counts
                        case 316: {

                            loadoutTwoCosmetic = "Thought That Counts";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //End of the Line Community Medal
                        case 317: {

                            loadoutTwoCosmetic = "End of the Line Community Medal";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Invasion Community Medal
                        case 318: {

                            loadoutTwoCosmetic = "Invasion Community Medal";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Honeydew's Charitable Countenance
                        case 319: {

                            loadoutTwoCosmetic = "Honeydews Charitable COuntenance";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Xephos' Philantrophic Physiognomy
                        case 320: {

                            loadoutTwoCosmetic = "Xephos' Philantrophic Physiognomy";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Gift of Giving
                        case 321: {

                            loadoutTwoCosmetic = "Gift of Giving";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Special Snowflake
                        case 322: {

                            loadoutTwoCosmetic = "Special Snowflake";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;


                        }
                        //PASS Time Early Participation Medal
                        case 323: {

                            loadoutTwoCosmetic = "PASS Time Early Participation Medal";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Altruist's Adornment
                        case 324: {

                            loadoutTwoCosmetic = "Altruist's Adornment";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //TF2Maps 72hr TF2Jam Participent
                        case 325: {

                            loadoutTwoCosmetic = "TF2Maps 72hr TF2 Jam Participent";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //PASS Time Miniature Half Jack
                        case 326: {

                            loadoutTwoCosmetic = "PASS Time Miniature Half Jack";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Jaunty Camper
                        case 327: {

                            loadoutTwoCosmetic = "Jaunty Camper";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Jaunty Benefactor
                        case 328: {

                            loadoutTwoCosmetic = "Jaunty Benefactor";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Jaunty Trailblazer
                        case 329: {

                            loadoutTwoCosmetic = "Jaunty Trailblazer";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Duncan's Kindhearted Kisser
                        case 330: {

                            loadoutTwoCosmetic = "Duncan's Kindhearted Kisser";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Hannah's Altruistic Aspect
                        case 331: {

                            loadoutTwoCosmetic = "Hannah's Altruistic Aspect";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Sips' Selfless Simulacrum
                        case 332: {

                            loadoutTwoCosmetic = "Sips' Selfless Simulacrum";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Sjin's Generous Guise
                        case 333: {

                            loadoutTwoCosmetic = "Sjin's Generous Guise";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Gift of Giving 2016
                        case 334: {

                            loadoutTwoCosmetic = "Gift of Giving 2016";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Special Snowflake 2016
                        case 335: {

                            loadoutTwoCosmetic = "Special Snowflake 2016";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Mapper vs. Machiners Participant Medal 2017
                        case 336: {

                            loadoutTwoCosmetic = "Mapper vs. Machiners Participant Medal 2017";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Blapature Co. Contributor
                        case 338: {

                            loadoutTwoCosmetic = "Blapature Co. Contributor";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //TF2Maps Charitable HEart
                        case 339: {

                            loadoutTwoCosmetic = "TF2Maps Charitable Heart";
                            medalEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Earbud's Special Region
                        //Earbuds
                        case 340: {

                            loadoutTwoCosmetic = "Earbuds";
                            earbudsSpecialEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Lenses Region
                        case 341: {

                            loadoutTwoCosmetic = "Deus Specs";
                            medalEquipRegion = true;
                            glassesEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Eye-Catcher
                        case 342: {

                            loadoutTwoCosmetic = "Eye-Catcher";
                            lensesEquipRegion = true;
                            glassesEquipRegion = true;
                            paintMethod(2);
                            break;

                        }
                        //Flair Region
                        case 343: {

                            loadoutTwoCosmetic = "Flair!";
                            flairEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;


                        }
                        //Necklace Region
                        //Merc's Pride Scarf
                        case 344: {

                            loadoutTwoCosmetic = "Merc's Pride Scarf";
                            necklaceEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Merc's Muffler
                        case 345: {

                            loadoutTwoCosmetic = "Merc's Muffler";
                            necklaceEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Slithering Scarf
                        case 346: {

                            loadoutTwoCosmetic = "Slithering Scarf";
                            necklaceEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Disconnected Floating Item Region
                        //Baloonicorn
                        case 347: {

                            loadoutTwoCosmetic = "Baloonicorn";
                            disconnectedFloatingItemEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //RoBro 3000
                        case 348: {

                            loadoutTwoCosmetic = "RoBro 3000";
                            disconnectedFloatingItemEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Reindoonicorn
                        case 349: {

                            loadoutTwoCosmetic = "Reindoonicorn";
                            disconnectedFloatingItemEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Space Hamster Hammy
                        case 350: {

                            loadoutTwoCosmetic = "Space Hamster Hammy";
                            disconnectedFloatingItemEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Belt Region
                        //Buttler
                        case 351: {

                            loadoutTwoCosmetic = "Buttler";
                            beltEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Rump-o'-Lantern
                        case 352: {

                            loadoutTwoCosmetic = "Rump-o'-Lantern";
                            beltEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Catastrophic Companions
                        case 353: {

                            loadoutTwoCosmetic = "Catastrophic Companions";
                            beltEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Pocket Saxton
                        case 354: {

                            loadoutTwoCosmetic = "Pocket Saxton";
                            beltEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            paintMethod(2);
                            break;

                        }
                        //Grenades Region
                        //Pocket Raiders
                        case 355: {

                            loadoutTwoCosmetic = "Pocket Raiders";
                            grenadesEquipRegion = true;
                            pocketSniperEquipRegion = true;
                            pocketEngineerEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //Pocket Villains
                        case 356: {

                            loadoutTwoCosmetic = "Pocket Villains";
                            grenadesEquipRegion = true;
                            loadoutTwoLoopSatisfied = true;
                            break;

                        }
                        //None
                        case 367: {

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
