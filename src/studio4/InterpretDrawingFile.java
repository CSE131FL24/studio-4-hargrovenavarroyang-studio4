package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		StdDraw.setPenColor(r,g,b);
		boolean filled = in.nextBoolean();
		
		if (shape.equals("rectangle")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double hw = in.nextDouble();
			double hh = in.nextDouble();
			if (filled==true) {
				StdDraw.filledRectangle(x, y, hw, hh);
			} else {
				StdDraw.rectangle(x,y,hw,hh);
			}
			
			
		} else if (shape.equals("ellipse")) {
			double p = in.nextDouble();
			double q = in.nextDouble();
			double k = in.nextDouble();
			double n = in.nextDouble();
			if (filled==true) {
				StdDraw.filledEllipse(p, q, k, n);
			}
			else {
				StdDraw.ellipse(q, k, r, n);
			
		} else {
			
		}
		
	}
}
