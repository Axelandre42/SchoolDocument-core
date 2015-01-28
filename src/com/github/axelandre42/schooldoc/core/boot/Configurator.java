package com.github.axelandre42.schooldoc.core.boot;

import java.io.File;

public class Configurator {
	public static Configurator getDefault() {
		return new Configurator(new File("default.cfg"));
	}
	
	public Configurator(File file) {
		
	}
}
