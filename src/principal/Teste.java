package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Teste {
	public static void main(String[] args) throws ParseException {
		Date data = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2015");
		data.setDate(31);
		System.out.println(new SimpleDateFormat().format(data));
	}

}

