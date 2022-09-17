package lumien.randomthings.Transformer;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import java.util.Map;

@IFMLLoadingPlugin.SortingIndex(1001)
public class RTLoadingPlugin implements IFMLLoadingPlugin {
    public static boolean IN_MCP = false;

    @Override
    public String[] getASMTransformerClass() {
        // This will return the name of the class
        // "mod.culegooner.EDClassTransformer"
        return new String[] {RTClassTransformer.class.getName()};
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return RTCallHook.class.getName();
    }

    @Override
    public void injectData(Map<String, Object> data) {
        IN_MCP = !(Boolean) data.get("runtimeDeobfuscationEnabled");
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
