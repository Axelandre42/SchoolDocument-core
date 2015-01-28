package com.github.axelandre42.schooldoc.core.api.docs;

import java.util.List;

import com.github.axelandre42.schooldoc.core.api.docs.drawing.LineData;
import com.github.axelandre42.schooldoc.core.api.docs.drawing.TextData;

public interface IDocFormatting {

	List<LineData> getAllLinesData();
	
	List<TextData> getAllTextsData();

	DocMetadata getDocMetadata();
}
