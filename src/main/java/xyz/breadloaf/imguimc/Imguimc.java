package xyz.breadloaf.imguimc;

import com.mojang.blaze3d.platform.Window;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xyz.breadloaf.imguimc.interfaces.Renderable;
import java.util.ArrayList;


@Environment(EnvType.CLIENT)
public class Imguimc implements ClientModInitializer {
    public static final String MODID = "imgui-mc";
    public static final Logger LOGGER = LogManager.getLogger(MODID);
    public static final Minecraft MINECRAFT = Minecraft.getInstance();
    public static ArrayList<Renderable> renderstack = new ArrayList<>();
    @Override
    public void onInitializeClient() {

    }

    public static Renderable pushRenderable(Renderable renderable) {
        renderstack.add(renderable);
        return renderable;
    }

    public static Renderable pullRenderable(Renderable renderable) {
        renderstack.remove(renderable);
        return renderable;
    }
}
