package wau.hl.toeppelmod.procedures;

import wau.hl.toeppelmod.ToeppelmodModElements;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.server.MinecraftServer;

import java.util.Map;

@ToeppelmodModElements.ModElement.Tag
public class ToppelRightClickedOnEntityProcedure extends ToeppelmodModElements.ModElement {
	public ToppelRightClickedOnEntityProcedure(ToeppelmodModElements instance) {
		super(instance, 1);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		{
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new StringTextComponent("Hallo, ich bin T\u00F6ppel."));
		}
	}
}
