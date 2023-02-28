package com.pdfcreator.creator.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.stereotype.Service;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.pdfcreator.creator.entity.Item;
import com.pdfcreator.creator.entity.PdfEntity;

@Service
public class PdfService {
	Font font=FontFactory.getFont(FontFactory.COURIER_BOLD, 10, BaseColor.BLACK);

	public void createPdf(PdfEntity pdf) throws FileNotFoundException, DocumentException {
		Document document=new Document();
		PdfWriter.getInstance(document, new FileOutputStream("iTextTable.pdf"));
		
		document.open();
		
		PdfPTable table=new PdfPTable(5);
		table.setWidths(new int[] {5,2,1,3,3});
		addTableHeader(table, pdf);
		addRows(table, pdf);
		document.add(table);
		
		document.close();
	}

	private void addTableHeader(PdfPTable table, PdfEntity pdf) {
		
		PdfPCell cell=new PdfPCell();
		cell.setFixedHeight(125f);
		cell.setPadding(20);
		cell.setColspan(2);
		
		Paragraph p=new Paragraph("Seller:",font);
		cell.addElement(p);
		p=new Paragraph(pdf.getSeller(),font);
		cell.addElement(p);
		p=new Paragraph(pdf.getSellerAddress(),font);
		cell.addElement(p);
		p=new Paragraph(pdf.getSellerGstin(),font);
		cell.addElement(p);
		table.addCell(cell);
		
		cell=new PdfPCell();
		cell.setFixedHeight(125f);
		cell.setPadding(20);
		cell.setColspan(3);
		
		p=new Paragraph("Buyer:",font);
		cell.addElement(p);
		p=new Paragraph(pdf.getBuyer(),font);
		cell.addElement(p);
		p=new Paragraph(pdf.getBuyerAddress(),font);
		cell.addElement(p);
		p=new Paragraph(pdf.getBuyerGstin(),font);
		cell.addElement(p);
		table.addCell(cell);
	}
	
	private void addRows(PdfPTable table, PdfEntity pdf) {
		String[] s=new String[] {"Item","Quantity","Rate","Amount"};
		for(int i=0; i<4; i++) {
			addCell(table,s[i],(i==1)?2:1);
		}
		
		List<Item> items=pdf.getItems();
		for(Item item:items) {
			addCell(table,item.getName(),1);
			addCell(table,item.getQuantity(),2);
			addCell(table,Float.toString(item.getRate()),1);
			addCell(table,Float.toString(item.getAmount()),1);
		}
		
		PdfPCell cell=new PdfPCell();
		cell.addElement(new Chunk(" "));
		cell.setColspan(5);
		table.addCell(cell);
	}

	private void addCell(PdfPTable table, String val, int spanning) {
		PdfPCell cell=new PdfPCell();
		Paragraph p=new Paragraph(val,font);
		p.setAlignment(Element.ALIGN_CENTER);
		cell.addElement(p);
		cell.setColspan(spanning);
		table.addCell(cell);
	}
	
}
