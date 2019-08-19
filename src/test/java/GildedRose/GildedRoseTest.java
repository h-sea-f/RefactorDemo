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
    public void should_return_new_items_when_invoke_updateQuality_and_item_name_a_quality_0(){
        Item[] items = {new Item("a", 2, 0)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals("a, 1, 0", gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_return_new_items_when_invoke_updateQuality_and_item_name_Aged_Brie_quality_50(){
        Item[] items = {new Item("a", 2, 50)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals("a, 1, 49", gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_return_new_items_when_invoke_updateQuality_and_item_name_Backstage_passes_to_a_TAFKAL80ETC_concert_quality_49_sellin_10(){
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 50", gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_return_new_items_when_invoke_updateQuality_and_item_name_Backstage_passes_to_a_TAFKAL80ETC_concert_quality_49_sellin_11(){
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert", 11, 49)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 10, 50", gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_return_new_items_when_invoke_updateQuality_and_item_name_Backstage_passes_to_a_TAFKAL80ETC_concert_quality_48_sellin_11(){
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert", 11, 48)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 10, 49", gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_return_new_items_when_invoke_updateQuality_and_item_name_Backstage_passes_to_a_TAFKAL80ETC_concert_quality_48_sellin_10(){
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert", 10, 48)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 50", gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_return_new_items_when_invoke_updateQuality_and_item_name_Backstage_passes_to_a_TAFKAL80ETC_concert_quality_48_sellin_5(){
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert", 5, 48)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 50", gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_return_new_items_when_invoke_updateQuality_and_item_name_Backstage_passes_to_a_TAFKAL80ETC_concert_quality_30_sellin_10(){
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert", 10, 30)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 32", gildedRose.getItems()[0].toString());
    }

    @Test
    public void should_return_new_items_when_invoke_updateQuality_and_item_name_Backstage_passes_to_a_TAFKAL80ETC_concert_quality_30_sellin_5(){
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert", 5, 30)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 33", gildedRose.getItems()[0].toString());
    }
}
