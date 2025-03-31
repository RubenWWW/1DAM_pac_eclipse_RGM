import java.util.*;
public class Ejercicio2_RGM {

	public static void main(String[] args) {

		if (proceso_seleccion()) {
			System.out.println("Has sido contratado");
		} else{
			System.out.println("No has sido contratado");
		};

	}

	public static boolean proceso_seleccion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu edad");
		int edad= sc.nextInt();

		boolean respuesta=false;
		int total=0;
		int importe=0;
		Double nomina=0.0;

		if (edad > 40) {
			respuesta=false;
		} else {
			sc.nextLine();
			System.out.println("Dime tu nombre");
			String nombre=sc.nextLine();

			System.out.println("Dime tus años trabajados");
			int a_trab=sc.nextInt();

			System.out.println("Dime tu sueldo bruto anterior");
			int sueldo_ant=sc.nextInt();

			if (sueldo_ant > 30000) {
				respuesta=false;
			} else {
				for (int i = 1; i <= 5; i++) {
					System.out.println("Dime tu nomina de hace "+i+" meses");
					importe=sc.nextInt();

					total+=importe;

					System.out.println("Total:"+total);
				}

				if ((total/5)> 2500) {
					nomina=(total/5)*1.05;
					respuesta=true;
				} else {
					nomina=(total/5)*1.1;
					respuesta=true;
				}
			}

		}
		return respuesta;
	}
}
