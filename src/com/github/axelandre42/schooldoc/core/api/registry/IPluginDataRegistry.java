package com.github.axelandre42.schooldoc.core.api.registry;

import com.github.axelandre42.schooldoc.core.api.docs.IDocFormatting;

public interface IPluginDataRegistry {
	void registerDocumentFormatting(IDocFormatting format, String id);
	
}
