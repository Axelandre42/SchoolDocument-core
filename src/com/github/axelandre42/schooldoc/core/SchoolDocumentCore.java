package com.github.axelandre42.schooldoc.core;

import java.util.HashMap;
import java.util.Map;

import com.github.axelandre42.schooldoc.core.api.SchoolDocAPI;
import com.github.axelandre42.schooldoc.core.api.docs.IDocFormatting;
import com.github.axelandre42.schooldoc.core.api.registry.IPluginDataRegistry;
import com.github.axelandre42.schooldoc.core.gui.SchoolDocGUI;

public class SchoolDocumentCore {
	
	private static class PluginDataRegistry implements IPluginDataRegistry {

		@Override
		public void registerDocumentFormatting(IDocFormatting format, String id) {
			// TODO Auto-generated method stub
			instance.registerDocumentFormatting(format, id);
		}
		
	}

	public static SchoolDocumentCore instance;
	
	private Map<String, IDocFormatting> regFormats = new HashMap<String, IDocFormatting>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		instance = new SchoolDocumentCore();
	}
	
	private SchoolDocumentCore() {
		SchoolDocAPI.instance = new SchoolDocAPI();
		SchoolDocAPI.instance.pluginDataRegistry = new PluginDataRegistry();
		
		SchoolDocGUI.instance = new SchoolDocGUI();
		
	}
	
	private void registerDocumentFormatting(IDocFormatting format, String id) {
		regFormats.put(id, format);
	}

}
