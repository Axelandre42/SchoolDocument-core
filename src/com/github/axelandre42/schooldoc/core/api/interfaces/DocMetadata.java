package com.github.axelandre42.schooldoc.core.api.interfaces;

import java.util.ArrayList;

public class DocMetadata {
	private String teacherName, title;
	private ArrayList<String> subtitles = new ArrayList<String>();
	
	public String getTeacherName() {
		return this.teacherName;
	}
	public String getTitle() {
		return this.title;
	}
	public String[] getSubtitles() {
		return (String[]) this.subtitles.toArray();
	}
}
