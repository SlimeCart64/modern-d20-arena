public class Player {
    String name;
    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;
    int hp;
    int armorClass;
    int initiative;
    Firearm primary;
    Firearm secondary;
    int goldPieces;

    public Player(String name, Firearm primary, Firearm secondary, int goldPieces) {
        this.name = name;
        strength = 10;
        dexterity = 10;
        constitution = 10;
        intelligence = 10;
        wisdom = 10;
        charisma = 10;
        hp = 100;
        armorClass = 10;
        initiative = 0;
        this.primary = primary;
        this.secondary = secondary;
        this.goldPieces = goldPieces;
    }

    public Player(String name, int goldPieces) {
        this.name = name;
        strength = 10;
        dexterity = 10;
        constitution = 10;
        intelligence = 10;
        wisdom = 10;
        charisma = 10;
        hp = 100;
        armorClass = 10;
        initiative = 0;
        this.goldPieces = goldPieces;
    }

    public Player(String name) {
        this.name = name;
        strength = 10;
        dexterity = 10;
        constitution = 10;
        intelligence = 10;
        wisdom = 10;
        charisma = 10;
        hp = 100;
        armorClass = 10;
        initiative = 0;
        goldPieces = 0;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public void makeScores(String[] order, boolean printOut) {
        for (int i = 0; i < 6; i++) {
            if (order[i].equals("str")) {
                if (i == 0) {
                    setStrength((int) (Math.random() * 3 + 16));
                }
                else if (i == 1) {
                    setStrength((int) (Math.random() * 5 + 13));
                }
                else if (i == 2) {
                    setStrength((int) (Math.random() * 3 + 12));
                }
                else if (i == 3) {
                    setStrength((int) (Math.random() * 3 + 11));
                }
                else if (i == 4) {
                    setStrength((int) (Math.random() * 2 + 10));
                }
                else {
                    setStrength((int) (Math.random() * 4 + 7));
                }
            }
            else if (order[i].equals("dex")) {
                if (i == 0) {
                    setDexterity((int) (Math.random() * 3 + 16));
                }
                else if (i == 1) {
                    setDexterity((int) (Math.random() * 5 + 13));
                }
                else if (i == 2) {
                    setDexterity((int) (Math.random() * 3 + 12));
                }
                else if (i == 3) {
                    setDexterity((int) (Math.random() * 3 + 11));
                }
                else if (i == 4) {
                    setDexterity((int) (Math.random() * 2 + 10));
                }
                else {
                    setDexterity((int) (Math.random() * 4 + 7));
                }
            }
            else if (order[i].equals("con")) {
                if (i == 0) {
                    setConstitution((int) (Math.random() * 3 + 16));
                }
                else if (i == 1) {
                    setConstitution((int) (Math.random() * 5 + 13));
                }
                else if (i == 2) {
                    setConstitution((int) (Math.random() * 3 + 12));
                }
                else if (i == 3) {
                    setConstitution((int) (Math.random() * 3 + 11));
                }
                else if (i == 4) {
                    setConstitution((int) (Math.random() * 2 + 10));
                }
                else {
                    setConstitution((int) (Math.random() * 4 + 7));
                }
            }
            else if (order[i].equals("int")) {
                if (i == 0) {
                    setIntelligence((int) (Math.random() * 3 + 16));
                }
                else if (i == 1) {
                    setIntelligence((int) (Math.random() * 5 + 13));
                }
                else if (i == 2) {
                    setIntelligence((int) (Math.random() * 3 + 12));
                }
                else if (i == 3) {
                    setIntelligence((int) (Math.random() * 3 + 11));
                }
                else if (i == 4) {
                    setIntelligence((int) (Math.random() * 2 + 10));
                }
                else {
                    setIntelligence((int) (Math.random() * 4 + 7));
                }
            }
            else if (order[i].equals("wis")) {
                if (i == 0) {
                    setWisdom((int) (Math.random() * 3 + 16));
                }
                else if (i == 1) {
                    setWisdom((int) (Math.random() * 5 + 13));
                }
                else if (i == 2) {
                    setWisdom((int) (Math.random() * 3 + 12));
                }
                else if (i == 3) {
                    setWisdom((int) (Math.random() * 3 + 11));
                }
                else if (i == 4) {
                    setWisdom((int) (Math.random() * 2 + 10));
                }
                else {
                    setWisdom((int) (Math.random() * 4 + 7));
                }
            }
            else {
                if (i == 0) {
                    setCharisma((int) (Math.random() * 3 + 16));
                }
                else if (i == 1) {
                    setCharisma((int) (Math.random() * 5 + 13));
                }
                else if (i == 2) {
                    setCharisma((int) (Math.random() * 3 + 12));
                }
                else if (i == 3) {
                    setCharisma((int) (Math.random() * 3 + 11));
                }
                else if (i == 4) {
                    setCharisma((int) (Math.random() * 2 + 10));
                }
                else {
                    setCharisma((int) (Math.random() * 4 + 7));
                }
            }
        }
        if (printOut) {
            System.out.println("Scores are as follows:");
            System.out.println("Strength: " + getStrength());
            System.out.println("Dexterity: " + getDexterity());
            System.out.println("Constitution: " + getConstitution());
            System.out.println("Intelligence: " + getIntelligence());
            System.out.println("Wisdom: " + getWisdom());
            System.out.println("Charisma: " + getCharisma());
        }
    }
}
