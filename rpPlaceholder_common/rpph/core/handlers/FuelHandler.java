package rpph.core.handlers;

import rpph.lib.BlockIds;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {

    @Override
    public int getBurnTime(ItemStack fuel) {
        if (fuel.itemID == BlockIds.RUBBER_WOOD) return 300;
        else return 0;
    }

}
