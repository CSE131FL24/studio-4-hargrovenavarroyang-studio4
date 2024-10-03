package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class RAINBOW {

	public static void main(String[] args) {
		double c = (1.0/(255*6.0));
		for (int i=0; i<255; i++) {
			StdDraw.setPenColor(255,i,0);
			StdDraw.filledRectangle(.5, (c*(i)-.5*c), .5, .5*c);
		}
		for (int i=0; i<255; i++) {
			StdDraw.setPenColor(255-i,255,0);
			StdDraw.filledRectangle(.5, (1.0/6)+(c*(i)-.5*c), .5, .5*c);
		}
		for (int i=0; i<255; i++) {
			StdDraw.setPenColor(0,255,i);
			StdDraw.filledRectangle(.5, (2.0/6)+(c*(i)-.5*c), .5, .5*c);
		}
		for (int i=0; i<255; i++) {
			StdDraw.setPenColor(0,255-i,255);
			StdDraw.filledRectangle(.5, (3.0/6)+(c*(i)-.5*c), .5, .5*c);
		}
		for (int i=0; i<255; i++) {
			StdDraw.setPenColor(i,0,255);
			StdDraw.filledRectangle(.5, (4.0/6)+(c*(i)-.5*c), .5, .5*c);
		}
		for (int i=0; i<255; i++) {
			StdDraw.setPenColor(255,0,255-i);
			StdDraw.filledRectangle(.5, (5.0/6)+(c*(i)-.5*c), .5, .5*c);
		}






	}

}
