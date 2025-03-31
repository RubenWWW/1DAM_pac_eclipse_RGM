import java.util.*;
public class Ejercicio1_RGM {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(auditoriaEmpresa());

	}

	public static boolean auditoriaEmpresa() {

		System.out.println("Dime el salario del jefe ");
		Double SalarioJefe = sc.nextDouble();

		System.out.println("Dime el salario del Encargado ");
		Double SalarioEncargado = sc.nextDouble();

		System.out.println("Dime el salario del Oficinista ");
		Double SalarioOficinista = sc.nextDouble();

		System.out.println("Dime el numero de oficinistas ");
		int NumeroOficinistas = sc.nextInt();
		sc.nextLine();
		String resp="";

		do {
			System.out.println("Estan finalizados los proyectos |S|N| ");
			resp=sc.nextLine();

		} while (!resp.equalsIgnoreCase("S")&& !resp.equalsIgnoreCase("N"));

		boolean acabados=false;

		if (resp.equalsIgnoreCase("S")) {
			acabados=true;
		} else {
			acabados=false;
		}

		System.out.println("Dime el presupuesto dela Empresa ");
		Double presupuestoEmpresa = sc.nextDouble();

		if (!acabados) {
			System.out.println(" No ha pasado la auditoría ya que no ha terminado los proyectos acordados");
			return false;
		} else {
			Double suma = SalarioJefe + SalarioEncargado +(SalarioOficinista*NumeroOficinistas);
			if (suma>20000) {
				System.out.println("No ha pasado la auditoría ya que el gasto en personal es de " +suma+" y excede el límite mensual de 20.000 euros");
				return false;
			} else if (suma<=20000 && presupuestoEmpresa>100000) {
				System.out.println("No ha pasado la auditoría ya que el presupuesto asignado de "+presupuestoEmpresa+ " excede el límite establecido en 100.000 euros"); 		
				return false;
			} else {
				System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene");
				return true;	
			}
		}

	}
}
