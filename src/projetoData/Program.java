package projetoData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date periodoMassa7 = formato.parse("05/08/2018");
		Date peridoMassa0 = formato.parse("04/08/2018");
		Date periodoMassa1 = formato.parse("05/08/2018");
		Date periodoInicia = formato.parse("06/08/2018");
		Date periodoMassa2 = formato.parse("07/08/2018");
		Date periodoMassa3 = formato.parse("08/08/2018");
		Date periodoMassa4 = formato.parse("09/08/2018");
		Date periodoFinal = formato.parse("10/08/2018");
		Date periodoMassa6 = formato.parse("11/08/2018");

		Integer testeComparaTo = periodoMassa1.compareTo(peridoMassa0);// Periodo
																		// inicial
																		// maior
																		// que o
																		// periodo
																		// final
																		// =
																		// true

		Integer testeComparaTo2 = periodoMassa1.compareTo(periodoInicia);// Periodo
																			// inicial
																			// menor
																			// que
																			// o
																			// periodo
																			// final
																			// =
																			// false

		Integer testeComparaTo3 = periodoMassa1.compareTo(periodoMassa1);// Periodo
																			// inicial
																			// igual
																			// periodo
																			// inicial
																			// =
																			// false

		if (testeComparaTo == 1) {
			System.out.println(" testeComparaTo true");
		}else if(testeComparaTo == 0){
			System.out.println(" testeComparaTo true");
		}else {
			System.out.println("testeComparaTo false");
		}

		if (testeComparaTo2 == 1) {
			System.out.println(" testeComparaTo2 true");
		}else if(testeComparaTo2 == 0){
			System.out.println(" testeComparaTo2 true");
		}else {
			System.out.println("testeComparaTo2 false");
		}

		if (testeComparaTo3 == 1) {
			System.out.println(" testeComparaTo3 true");
		}else if(testeComparaTo3 == 0){
			System.out.println(" testeComparaTo3 true");
		}else {
			System.out.println("testeComparaTo3 false");
		}

		Boolean testeBefore = periodoMassa1.before(peridoMassa0);// Periodo
																	// inicial
																	// maior que
																	// o periodo
																	// final =
																	// false

		Boolean testeBefore2 = periodoMassa1.before(periodoInicia);// Periodo
																	// inicial
																	// menor
																	// que
																	// o
																	// periodo
																	// final
																	// =
																	// false

		Boolean testeBefore3 = periodoMassa1.before(periodoMassa1);// Periodo
																	// inicial
																	// igual
																	// periodo
																	// inicial
																	// =
																	// false
		
		Boolean testeBefore4 = periodoMassa1.after(periodoMassa1);// Periodo
																	// inicial
																	// igual
																	// periodo
																	// inicial
																	// =
																	// false

		System.out.println("testeBefore : "+testeBefore);
		System.out.println("testeBefore 2 : "+testeBefore2);
		System.out.println("testeBefore 3 : "+testeBefore3);
		System.out.println("testeBefore 4 : "+testeBefore4);
	}
}
