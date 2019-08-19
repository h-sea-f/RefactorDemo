package gildedRose;

public class AgedItem implements BaseItem {

    @Override
    public void updateQuality(Item item) {
        item.qualityIncrease();
        item.sellIn--;
        if (item.sellIn < 0) {
            item.qualityIncrease();
        }
    }
}
