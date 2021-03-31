public class Firearm {
    String name;
    String type;
    String ammo;
    String description;
    int cost;
    int magSize;
    double reloadTime;
    DiceTray damage;
    int rangeNormal;
    int rangeDisadvantage;
    int fireRate;
    TriggerGroup fireModes;

    public Firearm(String name, String type, String ammo, int cost, int magSize, double reloadTime, DiceTray damage, int rangeNormal, int rangeDisadvantage, int fireRate, TriggerGroup fireModes) {
        this.name = name;
        this.type = type;
        this.ammo = ammo;
        this.cost =
        this.magSize = magSize;
        this.reloadTime = reloadTime;
        this.damage = damage;
        this.rangeNormal = rangeNormal;
        this.rangeDisadvantage = rangeDisadvantage;
        this.fireRate = fireRate;
        this.fireModes = fireModes;
    }

    public boolean hasSemi() {
        return fireModes.hasSemi();
    }

    public boolean hasBurst() {
        return fireModes.hasBurst();
    }

    public boolean hasAuto() {
        return fireModes.hasAuto();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public DiceTray getDamage() {
        return damage;
    }

    public int getMagSize() {
        return magSize;
    }

    public double getReloadTime() {
        return reloadTime;
    }

    public int getFireRate() {
        return fireRate;
    }

    public int getRangeDisadvantage() {
        return rangeDisadvantage;
    }

    public int getRangeNormal() {
        return rangeNormal;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
