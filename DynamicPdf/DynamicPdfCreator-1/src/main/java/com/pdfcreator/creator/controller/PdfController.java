package com.pdfcreator.creator.controller;

import java.io.FileNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.text.DocumentException;
import com.pdfcreator.creator.entity.PdfEntity;
import com.pdfcreator.creator.service.PdfService;

@RestController
public class PdfController {
	@Autowired
	private PdfService pdfservice;
	
	@PostMapping("/createpdf")
	public ResponseEntity<String> createPdf(@RequestBody PdfEntity pdf) throws FileNotFoundException, DocumentException {
		pdfservice.createPdf(pdf);
		return new ResponseEntity<>("Success", HttpStatus.OK);
	}
	
}
