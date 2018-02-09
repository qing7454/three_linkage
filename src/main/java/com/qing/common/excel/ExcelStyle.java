package com.qing.common.excel;

import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.UnderlineStyle;
import jxl.format.VerticalAlignment;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;

public class ExcelStyle {
	private static WritableCellFormat alignStyle;

	/**
	 * 获取报表页眉样式
	 * @return
	 * @throws Exception
	 */
	public static WritableCellFormat getReportHeaderStyle() throws Exception {
		WritableFont font = new WritableFont(WritableFont.createFont("宋体"));
		WritableCellFormat as = new WritableCellFormat(font);
		as.setBackground(Colour.GRAY_25); // 背景色
		setBorder(as);
		return as;
	}

	/**
	 * 获取报表页脚样式
	 * @return format
	 * @throws Exception e
	 */
	public static WritableCellFormat getReportFooterStyle() throws Exception {
		WritableFont font = new WritableFont(WritableFont.createFont("宋体"), 11,
				WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE,
				Colour.RED);
		WritableCellFormat as = new WritableCellFormat(font);
		setBorder(as);
		return as;
	}

	/**
	 * 获取头部标题样式
	 * @return 格式
	 * @throws Exception e
	 */
	public static WritableCellFormat getReportHeaderTitleStyle()
			throws Exception {
		WritableFont font = new WritableFont(WritableFont.createFont("宋体"), 15,
				WritableFont.NO_BOLD, false, UnderlineStyle.NO_UNDERLINE,
				Colour.BLACK);
		WritableCellFormat as = new WritableCellFormat(font);
		as.setAlignment(Alignment.CENTRE); // 设置对齐方式
		// ,把水平对齐方式指定为居中
		as.setVerticalAlignment(VerticalAlignment.CENTRE);// 把垂直对齐方式指定为居中
		return as;
	}

	/**
	 * 设置边框大小
	 * @param as format
	 * @throws Exception e
	 */
	public static void setBorder(WritableCellFormat as) throws Exception {
		// 画上
		as.setBorder(Border.TOP, BorderLineStyle.THIN, Colour.BLACK);// 设置边框的颜色和样式
		// 画左
		as.setBorder(Border.LEFT, BorderLineStyle.THIN, Colour.BLACK);// 设置边框的颜色和样式
		// 画右
		as.setBorder(Border.RIGHT, BorderLineStyle.THIN, Colour.BLACK);// 设置边框的颜色和样式
		// 画下
		as.setBorder(Border.BOTTOM, BorderLineStyle.THIN, Colour.BLACK);// 设置边框的颜色和样式
		// drawLine(sheet, x, y, Border.BOTTOM);
		as.setAlignment(Alignment.CENTRE); // 设置对齐方式
		// ,把水平对齐方式指定为居中
		as.setVerticalAlignment(VerticalAlignment.CENTRE);// 把垂直对齐方式指定为居中
	}

	/**
	 * 获取cell内容样式
	 * @return 样式
	 * @throws Exception e
	 */
	public static WritableCellFormat getReportContentStyle() throws Exception {
		WritableCellFormat as = new WritableCellFormat();
		setBorder(as);
		return as;
	}

}
