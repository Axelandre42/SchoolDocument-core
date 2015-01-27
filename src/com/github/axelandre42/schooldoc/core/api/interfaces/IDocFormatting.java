package com.github.axelandre42.schooldoc.core.api.interfaces;

import java.awt.Graphics2D;

public interface IDocFormatting {
	void setMetadata();
	void format(Graphics2D g);
}
