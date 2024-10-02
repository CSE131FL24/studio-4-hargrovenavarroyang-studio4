package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		for (int i=0; i<255; i++) {
			StdDraw.setPenColor(255-i,255,255);
			double c = (.5/255);
			StdDraw.filledRectangle(.5, (.5+c*(i)-.5*c), .5, .5*c);
		}
		
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledRectangle(.5, .25, .25, .5);
		
		StdDraw.setPenColor(128,128,128);
		StdDraw.filledRectangle(.5, .25, .20, .30);
		
		StdDraw.setPenColor(255,255,0);
		
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<4; j++) {
				StdDraw.filledRectangle((.35 +.15*i), (.50 - .15*j), .01, .02);
			}
		}
		
		StdDraw.setPenColor(0,255,255);
		for (int i = 0; i<4; i++) {
			StdDraw.filledRectangle(.2+ .2*i, .1, .07, .01);
		}
		
		
	}
}