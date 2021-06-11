import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int contadormayor =0;
		int contadormenor=0;
		int edad;
		double i;
		double promediomayor;
		double promediomenor;
		int sumaedadmayor =0;
		int sumaedadmenor=0;
		for (i=1;i<=100;i++) {
			System.out.println("Ingrese edad "+i+":");
			edad =  scanner.nextInt();
			if (edad>=25) {
				sumaedadmayor = sumaedadmayor+edad;
				contadormayor = contadormayor+1;
			} else {
				sumaedadmenor = sumaedadmenor+edad;
				contadormenor = contadormenor+1;
			}
		}
		promediomayor = sumaedadmayor/contadormayor;
		promediomenor = sumaedadmenor/contadormenor;
		System.out.println("Promedio de los mayores de 25: "+promediomayor);
		System.out.println("Promedio de los menores de 25: "+promediomenor);
	}


}

