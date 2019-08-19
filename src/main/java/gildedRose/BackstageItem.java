package gildedRose;

public class BackstageItem implements BaseItem {

    @Override
    public void updateQuality(Item item) {
        item.qualityIncrease();
        if (item.sellIn < 11) {
            item.qualityIncrease();
        }
        if (item.sellIn < 6) {
            item.qualityIncrease();
        }
        item.sellIn--;
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
