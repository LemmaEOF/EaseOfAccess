package gay.lemmaeof.easeofaccess;

import gay.lemmaeof.easeofaccess.impl.ExtraAccessibilityOptions;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class EaseOfAccess {

    public EaseOfAccess() {
        MinecraftForge.EVENT_BUS.addListener(this::getOptions);
    }

    public void getOptions(final AddOptionsEvent ev) {
        ev.addOptions(ExtraAccessibilityOptions.REDUCE_MOTION);
    }
}