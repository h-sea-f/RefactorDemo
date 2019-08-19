package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public BaseItem baseItem;

    public Item(String name, int sellIn, int quality, BaseItem baseItem) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.baseItem = baseItem;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void qualityIncrease() {
        if (quality < 50) {
            quality++;
        }
    }

    public void qualityReduce() {
        setQuality(getQuality() - 1);
    }

    public void update() {
        baseItem.updateQuality(this);
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
