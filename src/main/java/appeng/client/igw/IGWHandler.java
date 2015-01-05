package appeng.client.igw;


import appeng.api.AEApi;
import igwmod.api.WikiRegistry;

public class IGWHandler {
    public static void init() {
        igwmod.api.WikiRegistry.registerWikiTab(new IGWWikiAETab());
        WikiRegistry.registerBlockAndItemPageEntry(AEApi.instance().blocks().blockCraftingUnit.block(), "/block/appliedenergistics2.BlockCraftingUnit.txt");

    }
}
