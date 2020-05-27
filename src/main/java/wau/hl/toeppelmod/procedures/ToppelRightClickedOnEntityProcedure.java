package wau.hl.toeppelmod.procedures;

import wau.hl.toeppelmod.TppelModElements;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.server.MinecraftServer;

@TppelModElements.ModElement.Tag
public class ToppelRightClickedOnEntityProcedure extends TppelModElements.ModElement {
	public ToppelRightClickedOnEntityProcedure(TppelModElements instance) {
		super(instance, 1);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		{
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new StringTextComponent("Hallo, ich bin T\u00F6ppel."));
		}
	}
}
