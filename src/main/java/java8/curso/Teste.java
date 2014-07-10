package java8.curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teste {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(Curso::getAlunos));

		cursos.stream()
			  .filter(c -> c.getAlunos() > 50)
			  .map(Curso::getNome)
			  .forEach(System.out::println);
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .map(Curso::getAlunos)
		   .forEach(System.out::println);

		OptionalDouble media = cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .mapToInt(Curso::getAlunos).average();
		   System.out.println(media.getAsDouble());

		Optional<Curso> possivelPrimeiroCurso = cursos.stream()
		  .filter(c -> c.getAlunos() > 50)
		  .findFirst();
		
		Stream<Curso> stream = cursos.stream()
				   .filter(c -> c.getAlunos() > 50);
		List<Curso> cursos2 = stream.collect(Collectors.toList());

	}

}
