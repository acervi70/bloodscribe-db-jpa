package com.reigninbinary.bloodscribe.db.jpa.mappers;

import org.modelmapper.AbstractConverter;
import org.modelmapper.Converter;


public class ModelMapperConverters {

	public static Converter<String, Boolean> visibleConverter = 
			new AbstractConverter<String, Boolean>() {
		
		protected Boolean convert(String source) {
			
			return isVisible(source);
		}
	};
	
	public static Converter<String, Boolean> readonlyConverter = 
			new AbstractConverter<String, Boolean>() {
		
		protected Boolean convert(String source) {
			
			return isReadOnly(source);
		}
	};
	
	private static boolean isReadOnly(String readOnly) {
		
		final String READONLY = "Y";
		
		return (readOnly != null && 0 == READONLY.compareTo(readOnly));
	};
	
	private static boolean isVisible(String visible) {
		
		final String VISIBLE = "Y";
		
		return (visible != null && 0 == VISIBLE.compareTo(visible));
	};
}
