package gildedRose;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            boolean isNotAgedAndNotBackstage = !items[i].name.equals("Aged Brie") && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert");
            if (isNotAgedAndNotBackstage) {
                updateOtherItemQuality(items[i]);
            } else {
                if (items[i].quality < 50) {
                    items[i].qualityIncrease();
                    updateBackstageQuality(items[i]);
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                                items[i].quality = items[i].quality - 1;
                                items[i].qualityReduce();
                            }
                        }
                    } else {
                        items[i].quality = 0;
                    }
                } else {
                    if (items[i].quality < 50) {
//                        items[i].quality = items[i].quality + 1;
                        items[i].qualityIncrease();
                    }
                }
            }
        }
    }

    public void updateOtherItemQuality(Item item) {
        boolean isQualityBigger0AndNotSulfuras = item.quality > 0 && !item.name.equals("Sulfuras, Hand of Ragnaros");
        if (isQualityBigger0AndNotSulfuras) {
//                        items[i].quality = items[i].quality - 1;
            item.qualityReduce();
        }
    }

    public void updateBackstageQuality(Item item) {
        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (item.sellIn < 11) {
                if (item.quality < 50) {
//                                items[i].quality = items[i].quality + 1;
                    item.qualityIncrease();
                }
            }

            if (item.sellIn < 6) {
                if (item.quality < 50) {
//                                items[i].quality = items[i].quality + 1;
                    item.qualityIncrease();
                }
            }
        }
    }
}