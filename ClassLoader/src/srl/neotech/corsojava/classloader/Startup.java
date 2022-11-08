package srl.neotech.corsojava.classloader;

import com.diogonunes.jcolor.Ansi;
import com.diogonunes.jcolor.AnsiFormat;
import com.diogonunes.jcolor.Attribute;

public class Startup {

	public static void main(String[] args) {
		
		System.out.println("Prova di scrittura");
		System.out.println("Prova di blu");
		
		AnsiFormat af = new AnsiFormat(Attribute.BLUE_BACK());
		System.out.println(Ansi.colorize("Prova Uno", af));
		System.out.println();
		
		AnsiFormat af2 = new AnsiFormat(Attribute.BRIGHT_MAGENTA_TEXT());
		System.out.println(Ansi.colorize("Prova Due", af2));
		System.out.println(" ");
	}

}
