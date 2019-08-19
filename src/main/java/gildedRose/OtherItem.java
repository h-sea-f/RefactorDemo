package gildedRose;

public class OtherItem implements BaseItem {

    @Override
    public void updateQuality(Item item) {
        if (item.quality > 0) {
            item.qualityReduce();
        }
        item.sellIn--;
        if (item.sellIn < 0) {
            if (item.quality > 0) {
                item.qualityReduce();
            }
        }
    }
}
