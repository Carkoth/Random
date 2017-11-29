import java.lang.Math;
public class Test {

    /*

    loadoutOneCosmetic = "Hat";
    equipRegion = true;
    loadoutOneLoopSatisfied = true
    standardUnusualMethod(1);
    break;


   wholeHead
   Hat
   Face
   Glasses


     */
    //Variables for getting the while loops to end
    private boolean loadoutOneLoopSatisfied = false;
    private boolean loadoutTwoLoopSatisfied = false;
    private boolean loadoutThreeLoopSatisfied = false;
    //Equip regions
    private boolean hatEquipRegion = false;
    private boolean shirtEquipRegion = false;
    private boolean hairEquipRegion = false;
    private boolean miscEquipRegion = false;
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
    private Test() {

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
        switch(loadoutNumber) {

            //Loadout 1
            case 1: {

                //Loadout Loop
                while (!loadoutOneLoopSatisfied) {

                    int loadoutRandomizer = (int) (Math.random() * 11 + 1);
                    switch (loadoutRandomizer) {

                        //Hat 1
                        case 1: {

                            loadoutOneCosmetic = "Hat 1";
                            hatEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            unusualMethod(1);
                            break;

                        }
                        //Hat 2
                        case 2: {

                            loadoutOneCosmetic = "Hat 2";
                            hatEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Hat 3
                        case 3: {

                            loadoutOneCosmetic = "Hat 3";
                            hatEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            unusualMethod(1);
                            break;

                        }
                        //Hat 4
                        case 4: {

                            loadoutOneCosmetic = "Hat 4";
                            hatEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Shirt 1
                        case 5: {

                            loadoutOneCosmetic = "Shirt 1";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            paintMethod(1);
                            break;

                        }
                        //Shirt 2
                        case 6: {

                            loadoutOneCosmetic = "Shirt 2";
                            shirtEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Hair 1
                        case 7: {

                            loadoutOneCosmetic = "Hair 1";
                            hairEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            unusualMethod(1);
                            break;

                        }
                        //Hair 2
                        case 8: {

                            loadoutOneCosmetic = "Hair 2";
                            hairEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Misc 1
                        case 9: {

                            loadoutOneCosmetic = "Misc 1";
                            miscEquipRegion = true;
                            hatEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //Misc 2
                        case 10: {

                            loadoutOneCosmetic = "Misc 2";
                            miscEquipRegion = true;
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        //None
                        case 11: {

                            loadoutOneCosmetic = "None";
                            loadoutOneLoopSatisfied = true;
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with choosing loadout one's cosmetic");
                            loadoutOneLoopSatisfied = true;
                            break;

                        }

                    }

                }
                break;

            }
            //Loadout 2
            case 2: {

                while (!loadoutTwoLoopSatisfied) {

                    int loadoutRandomizer = (int) (Math.random() * 11 + 1);
                    switch (loadoutRandomizer) {

                        //Hat 1
                        case 1: {

                            if (!hatEquipRegion) {

                                loadoutTwoCosmetic = "Hat 1";
                                hatEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                unusualMethod(2);

                            }
                            break;

                        }
                        //Hat 2
                        case 2: {

                            if (!hatEquipRegion) {

                                loadoutTwoCosmetic = "Hat 2";
                                hatEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);
                                break;

                            }
                            break;

                        }
                        //Hat 3
                        case 3: {

                            if (!hatEquipRegion) {

                                loadoutTwoCosmetic = "Hat 3";
                                hatEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                unusualMethod(2);

                            }
                            break;

                        }
                        //Hat 4
                        case 4: {

                            if (!hatEquipRegion) {

                                loadoutTwoCosmetic = "Hat 4";
                                hatEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Shirt 1
                        case 5: {

                            if (!shirtEquipRegion) {

                                loadoutTwoCosmetic = "Shirt 1";
                                shirtEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                paintMethod(2);

                            }
                            break;

                        }
                        //Shirt 2
                        case 6: {

                            if (!shirtEquipRegion) {

                                loadoutTwoCosmetic = "Shirt 2";
                                shirtEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Hair 1
                        case 7: {

                            if (!hairEquipRegion) {

                                loadoutTwoCosmetic = "Hair 2";
                                hairEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;
                                unusualMethod(2);

                            }
                            break;

                        }
                        //Hair 2
                        case 8: {

                            if (!hairEquipRegion) {

                                loadoutTwoCosmetic = "Hair 2";
                                hairEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Misc 1
                        case 9: {

                            if (!miscEquipRegion && !hatEquipRegion) {

                                loadoutTwoCosmetic = "Misc  1";
                                miscEquipRegion = true;
                                hatEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //Misc 2
                        case 10: {

                            if (!miscEquipRegion) {

                                loadoutTwoCosmetic = "Misc 2";
                                miscEquipRegion = true;
                                loadoutTwoLoopSatisfied = true;

                            }
                            break;

                        }
                        //None
                        case 11: {

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

                while (!loadoutThreeLoopSatisfied) {

                    int loadoutRandomizer = (int) (Math.random() * 11 + 1);
                    switch (loadoutRandomizer) {

                        //Hat 1
                        case 1: {

                            if (!hatEquipRegion) {

                                loadoutThreeCosmetic = "Hat 1";
                                hatEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);
                                unusualMethod(3);

                            }
                            break;

                        }
                        //Hat 2
                        case 2: {

                            if (!hatEquipRegion) {

                                loadoutThreeCosmetic = "Hat 2";
                                hatEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Hat 3
                        case 3: {

                            if (!hatEquipRegion) {

                                loadoutThreeCosmetic = "Hat 3";
                                hatEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                unusualMethod(3);

                            }
                            break;

                        }
                        //Hat 4
                        case 4: {

                            if (!hatEquipRegion) {

                                loadoutThreeCosmetic = "Hat 2";
                                hatEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Shirt 1
                        case 5: {

                            if (!shirtEquipRegion) {

                                loadoutThreeCosmetic = "Shirt 1";
                                shirtEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                paintMethod(3);

                            }
                            break;

                        }
                        //Shirt 2
                        case 6: {

                            if (!shirtEquipRegion) {

                                loadoutThreeCosmetic = "Shirt 2";
                                shirtEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Hair 1
                        case 7: {

                            if (!hairEquipRegion) {

                                loadoutThreeCosmetic = "Hair 2";
                                hairEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;
                                unusualMethod(3);

                            }
                            break;

                        }
                        //Hair 2
                        case 8: {

                            if (!hairEquipRegion) {

                                loadoutThreeCosmetic = "Hair 2";
                                hairEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Misc 1
                        case 9: {

                            if (!miscEquipRegion && !hatEquipRegion) {

                                loadoutThreeCosmetic = "Misc 1";
                                miscEquipRegion = true;
                                hatEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        //Misc 2
                        case 10: {

                            if (!miscEquipRegion) {

                                loadoutThreeCosmetic = "Misc 2";
                                miscEquipRegion = true;
                                loadoutThreeLoopSatisfied = true;

                            }
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong wtih choosing loadout three's cosmetics");
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
    //Paint selector
    private void paintMethod(int loadoutNumber) {

        switch (loadoutNumber) {

            case 1: {

                int paintYesNo = (int) (Math.random() * 2 + 1);
                if (paintYesNo == 2) {

                    int paintChooser = (int) (Math.random() * 3 + 1);
                    switch (paintChooser) {

                        //Red
                        case 1: {

                            loadoutOnePaintColor = "Red";
                            break;

                        }
                        //Yellow
                        case 2: {

                            loadoutOnePaintColor = "Yellow";
                            break;

                        }
                        //Blue
                        case 3: {

                            loadoutOnePaintColor = "Blue";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with choosing loadout one's paint");
                            break;

                        }

                    }

                }
                break;

            }
            case 2: {

                int paintYesNo = (int) (Math.random() * 2 + 1);
                if (paintYesNo == 2) {

                    int paintChooser = (int) (Math.random() * 3 + 1);
                    switch (paintChooser) {

                        //Red
                        case 1: {

                            loadoutTwoPaintColor = "Red";
                            break;

                        }
                        //Yellow
                        case 2: {

                            loadoutTwoPaintColor = "Yellow";
                            break;

                        }
                        //Blue
                        case 3: {

                            loadoutTwoPaintColor = "Blue";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with choosing loadout two's paint color");

                        }

                    }

                }
                break;

            }
            case 3: {

                int paintYesNo = (int) (Math.random() * 2 + 1);
                if (paintYesNo == 2) {

                    int paintChooser = (int) (Math.random() * 3 + 1);
                    switch (paintChooser) {

                        //Red
                        case 1: {

                            loadoutThreePaintColor = "Red";
                            break;

                        }
                        //Yellow
                        case 2: {

                            loadoutThreePaintColor = "Yellow";
                            break;

                        }
                        //Blue
                        case 3: {

                            loadoutThreePaintColor = "Blue";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with choosing loadout three's paint");
                            break;

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
    //Unusual selector
    private void unusualMethod(int loadoutNumber) {

        switch (loadoutNumber) {

            case 1: {

                int unusualYesNo = (int) (Math.random() * 2 + 1);
                if (unusualYesNo == 2) {

                    int unusualChooser = (int) (Math.random() * 2 + 1);
                    switch (unusualChooser) {

                        //Effect 1
                        case 1: {

                            loadoutOneUnusualEffect = "Effect 1";
                            break;

                        }
                        //Effect 2
                        case 2: {

                            loadoutOneUnusualEffect = "Effect 2";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with choosing loadout one's unusual effect");
                            break;

                        }

                    }

                }
                break;

            }
            case 2: {

                int unusualYesNo = (int) (Math.random() * 2 + 1);
                if (unusualYesNo == 2) {

                    int unusualChooser = (int) (Math.random() * 2 + 1);
                    switch (unusualChooser) {

                        //Effect 1
                        case 1: {

                            loadoutTwoUnusualEffect = "Effect 1";
                            break;

                        }
                        //Effect 2
                        case 2: {

                            loadoutTwoUnusualEffect = "Effect 2";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with choosing loadout two's unusual effect");
                            break;

                        }

                    }

                }
                break;

            }
            case 3: {

                int unusualYesNo = (int) (Math.random() * 2 + 1);
                if (unusualYesNo == 2) {

                    int unusualChooser = (int) (Math.random() * 2 + 1);
                    switch (unusualChooser) {

                        //Effect 1
                        case 1: {

                            loadoutThreeUnusualEffect = "Effect 1";
                            break;

                        }
                        //Effect 2
                        case 2: {

                            loadoutThreeUnusualEffect = "Effect 2";
                            break;

                        }
                        default: {

                            System.out.println("Something went wrong with choosing loadout three's unusual effect");
                            break;

                        }

                    }

                }
                break;

            }
            default: {

                System.out.println("Something went wrong with calling the unusual method");
                break;

            }

        }

    }
    public static void main (String[] args) {

        new Test();

    }

}
