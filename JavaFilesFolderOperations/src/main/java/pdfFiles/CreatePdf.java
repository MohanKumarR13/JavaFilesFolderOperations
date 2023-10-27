package pdfFiles;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1CFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

public class CreatePdf {

	public static void main(String[] args) throws IOException {
		// Create a new Pdf Document
		PDDocument document = new PDDocument();

		// Create a new page
		PDPage page = new PDPage(PDRectangle.A4);
		document.addPage(page);

		// Create Content Stream
		PDPageContentStream contentStream = new PDPageContentStream(document, page);

		// Font & Size
		// contentStream.setFont(PDType1Font.COURIER, 14); //2.x
		PDType1Font font = new PDType1Font(Standard14Fonts.FontName.HELVETICA);
		contentStream.setFont(font, 14); // 3.x
		contentStream.beginText();
		contentStream.newLineAtOffset(50, 700);
		contentStream.showText("Hello Welcome to PDF...");
		contentStream.endText();
		contentStream.close();
		// Save Pdf File
		document.save(".\\data\\sample.pdf");
		document.close();
		System.out.println("PDF File Created..");

	}

}
