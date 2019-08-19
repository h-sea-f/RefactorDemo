package GildedRose;

import gildedRose.GildedRose;
import gildedRose.Item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {
    @Test
    public void should_quality_1_when_invoke_updateQuality_and_item_name_a_quality_2() {
        Item[] items = {new Item("a", 2, 2)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(1, gildedRose.getItems()[0].getQuality());
    }

    @Test
    public void should_return_original_items_when_invoke_updateQuality_and_item_name_a_quality_0(){
        Item[] items = {new Item("a", 2, 0)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(items[0].toString(), gildedRose.getItems()[0].toString());
    }
}
