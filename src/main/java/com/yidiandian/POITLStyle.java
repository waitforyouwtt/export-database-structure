package com.yidiandian;

import com.deepoove.poi.data.style.Style;
import com.deepoove.poi.data.style.TableStyle;
/**
 *
 * @author 凤凰[小哥哥]
 * @version 1.0
 */
public class POITLStyle {

	public static Style getHeaderStyle(){
		Style style = new Style();
		style.setBold(true);
		style.setFontSize(12);
		style.setColor("000000");
		style.setFontFamily("宋体");
		return style;
	}
	
	public static TableStyle getHeaderTableStyle(){
		TableStyle style = new TableStyle();;
		style.setBackgroundColor("B7B7B7");
		return style;
	}
	
	public static Style getBodyStyle(){
		Style style = new Style();
		style.setBold(false);
		style.setFontSize(12);
		style.setColor("000000");
		style.setFontFamily("宋体");
		return style;
	}
	
	public static TableStyle getBodyTableStyle(){
		TableStyle style = new TableStyle();;
		style.setBackgroundColor("DEDEDE");
		return style;
	}
}
