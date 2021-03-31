public class TriggerGroup {
    boolean hasSemi;
    boolean hasBurst;
    boolean hasAuto;

    public TriggerGroup(boolean hasSemi, boolean hasBurst, boolean hasAuto) {
        this.hasSemi = hasSemi;
        this.hasBurst = hasBurst;
        this.hasAuto = hasAuto;
    }

    public boolean hasAuto() {
        return hasAuto;
    }

    public boolean hasBurst() {
        return hasBurst;
    }

    public boolean hasSemi() {
        return hasSemi;
    }
}
