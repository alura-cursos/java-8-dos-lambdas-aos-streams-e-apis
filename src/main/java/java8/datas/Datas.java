package java8.datas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate futuro = LocalDate.of(2099, 1, 25);
		System.out.println(futuro);
		
		Period period = Period.between(futuro, hoje);
		System.out.println(period);
		
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(sdf));
	}

}
