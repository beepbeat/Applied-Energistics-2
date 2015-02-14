package appeng.client.igw;

import appeng.api.AEApi;
import igwmod.gui.GuiWiki;
import igwmod.gui.tabs.BaseWikiTab;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;

public class IGWWikiAETab extends BaseWikiTab {


    public IGWWikiAETab(){
        pageEntries.add("Crafting CPU");
    }
    @Override
    protected String getPageName(String pageEntry) {
        return I18n.format("igwtab.entry." + pageEntry);
    }

    @Override
    protected String getPageLocation(String pageEntry) {
        return "wiki/AETab/" + pageEntry;
    }

    @Override
    public String getName() {
        return "Applied Energistics 2";
    }

    @Override
    public ItemStack renderTabIcon(GuiWiki gui) {
        return AEApi.instance().blocks().blockController.stack(1);
    }
}
