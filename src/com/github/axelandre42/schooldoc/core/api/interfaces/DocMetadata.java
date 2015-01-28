package com.github.axelandre42.schooldoc.core.api.interfaces;

import java.util.ArrayList;

public class DocMetadata {
	private String teacherName = "", title = "";
	private ArrayList<String> subtitles = new ArrayList<String>();
	
	public DocMetadata() {
		
	}
	
	public DocMetadata(String title) {
		this.title = title;
	}
	
	public DocMetadata(String title, String teacherName) {
		this.title = title;
		this.teacherName = teacherName;
	}
	
	public DocMetadata(String title, String teacherName, String... subtitles) {
		this.title = title;
		this.teacherName = teacherName;
		
		for (String str : subtitles) {
			this.subtitles.add(str);
		}
	}
	
	public void addSubtitle(String subtitle) {
		this.subtitles.add(subtitle);
	}
	
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
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
