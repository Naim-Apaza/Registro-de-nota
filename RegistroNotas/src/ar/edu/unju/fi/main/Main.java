package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNotas;

public class Main {

	public static void main(String[] args) {
		Alumno alumno = generarAlumno();

		registrarNotas(alumno, 2);
	}

	public static Alumno generarAlumno() {
		Alumno alumno = new Alumno();

		Scanner in = new Scanner(System.in);

		System.out.print("Ingrese el legajo: ");
		Integer legajo = in.nextInt();
		System.out.print("Ingrese el nombre: ");
		String nombre = in.next();
		System.out.print("Ingrese el apellido: ");
		String apellido = in.next();

		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		alumno.setLegajo(legajo);

		System.out.println(alumno.toString());

		return alumno;
	}

	public static void registrarNotas(Alumno alumno, int numMaterias) {
		Scanner in = new Scanner(System.in);

		while (numMaterias <= 4) {
			System.out.print("Ingrese el codigo de la materia: ");
			String codigoMateria = in.next();
			System.out.print("Ingrese el nombre de la materia: ");
			String nombreMateria = in.next();

			Materia materia = new Materia(codigoMateria, nombreMateria);

			System.out.print("Ingrese el codigo del registro de nota: ");
			String codigoNota = in.next();
			System.out.print("Ingrese el nota final de la materia: ");
			float nota = in.nextFloat();

			RegistroNotas registroNotas = new RegistroNotas(codigoNota, alumno, materia, nota);

			System.out.println(registroNotas.toString());
			numMaterias++;
		}
	}

}
