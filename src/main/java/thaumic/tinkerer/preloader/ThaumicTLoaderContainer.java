package thaumic.tinkerer.preloader;

import com.google.common.eventbus.EventBus;
import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Map;

/**
 * Created by Katrina on 06/04/14.
 */
public class ThaumicTLoaderContainer extends DummyModContainer implements IFMLLoadingPlugin {

    public static Logger logger = LogManager.getLogger("TTinkers");
    private final ModMetadata md = new ModMetadata();

    public ThaumicTLoaderContainer() {
        md.autogenerated = true;
        md.credits = "nekosune, Pixlepix, and all thanks to Vazkii";
        md.modId = getModId();
        md.version = getVersion();
        md.name = getName();
        md.authorList = Arrays.asList("nekosune", "Pixlepix", "Vazkii");
    }

    @Override
    public String getModId() {
        return "ThaumicTinkerer-preloader";
    }

    @Override
    public String getName() {
        return "Thaumic Tinkerer Core";
    }

    @Override
    public String getVersion() {
        return "0.1";
    }

    @Override
    public String getDisplayVersion() {
        return getVersion();
    }

    @Override
    public ModMetadata getMetadata() {
        return md;
    }

    @Override
    public boolean registerBus(EventBus bus, LoadController controller) {
        bus.register(this);
        return true;
    }

    @Override
    public String[] getASMTransformerClass() {
        return new String[]{"thaumic.tinkerer.preloader.AccessTransformer"};
    }

    @Override
    public String getModContainerClass() {
        return "thaumic.tinkerer.preloader.ThaumicTLoaderContainer";
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

    @Override
    public String getAccessTransformerClass() {
        return "thaumic.tinkerer.preloader.AccessTransformer";
    }
}
