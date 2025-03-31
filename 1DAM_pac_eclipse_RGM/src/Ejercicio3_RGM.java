import java.util.*;
public class Ejercicio3_RGM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int totalv=0;
		int totald=0;
		int totalc=0;
		int maxc=0;
		Double maxd=0.0;
		
		System.out.print("Numero de sesiones: ");
        int sesiones = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        
        System.out.print("Introduce tu peso: ");
        Double peso = sc.nextDouble();
        
        System.out.print("Introduce tu altura: ");
        Double altura = sc.nextDouble();
        
        sc.nextLine();
        
        System.out.print("Introduce tu Sexo: ");
        String sexo = sc.nextLine();
        
        System.out.print("Introduce tu Velocidad Inicial: (En KM)");
        Double velocidadInicial = sc.nextDouble();
        
        System.out.print("Introduce tu Distancia Inicial: (En metros)");
        Double DistanciaInicial = sc.nextDouble();
        
        System.out.print("Introduce tus Calorias Iniciales: ");
        int CaloriasIniciales = sc.nextInt();
        
        Double IMC=peso/Math.pow(altura, 2);
        
        for (int i = 1; i <=sesiones ; i++) {
			
        	System.out.print("Introduce tu Velocidad: (En KM)");
            Double velocidad = sc.nextDouble();
            totalv+=velocidad;
            
            System.out.print("Introduce tu Distancia: (En metros)");
            Double distancia = sc.nextDouble();
            totald+=distancia;
            
            System.out.print("Introduce tus Calorias: ");
            int calorias = sc.nextInt();
        	totalc+=calorias;
        	
        	if (calorias > maxc) {
				maxc=calorias;
			}
        	
        	if (distancia > maxd) {
				maxd=distancia;
			}
        	
        	
		}
        
        System.out.println("Hola "+nombre+" te presentamos la ficha de entrenamiento");
        System.out.println("Edad: "+edad);
        System.out.println("Peso: "+peso);
        System.out.println("Altura: "+altura);
        System.out.println("Sexo: "+sexo);
        System.out.println("Indice de masa corporal: "+String.format("%.2f", IMC) );
        System.out.println("La media de entrenamiento en "+ sesiones+ " sesiones es:");
        
        System.out.println("Velocidad: "+totalv/sesiones);
        System.out.println("Distancia: "+totald/sesiones);
        System.out.println("Calorias: "+totalc/sesiones);
        System.out.println("Maxima distancia recorrida: "+maxd);
        System.out.println("Maximas calorias quemadas: "+maxc);
        
        if ((totald/sesiones)>DistanciaInicial || (totalc/sesiones)>CaloriasIniciales || (totalv/sesiones)>velocidadInicial) {
			System.out.println("Enhorabuena has superado tus marcas en: ");
			
			if ((totald/sesiones)>DistanciaInicial) {
				System.out.print("Distancia ");
			}
			
			if ((totalv/sesiones)>velocidadInicial) {
				System.out.print("Velocidad ");
			}
			
			if ((totalc/sesiones)>CaloriasIniciales) {
				System.out.print("Calorias ");
			}
			
		}
        
	}

}
