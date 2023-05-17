package indra.talentCamp.interfaces;

import java.util.*;
import java.util.stream.Collectors;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<AreaCalculable> escenario = Arrays.asList(
        		new Circulo(10.0),
        		new Triangulo(12.0, 15.0, 16.36, 16.36),
        		new Rectangulo(10,10),
        		new Planta());
        
        System.out.println("El area total de mi dibujo es...");
        System.out.println("Areas: "+escenario.stream().mapToDouble(figura -> figura.calcularArea()).sum());
        
        //System.out.println("El perimetro total de mi dibujo es..");
        //System.out.println("Perimetro: "+ dibujo.stream().mapToDouble(n->n.calcularPerimetro()).sum());
        
        //Bienvenidos al lado oscuro : Casteos
        
        //Casteo "clasico"
        /*double perimetroTotal = 0.0;
        for (AreaCalculable c : escenario) {
        	//if (c instanceof Perimetro) {
        	if (Perimetro.class.isInstance(c)) {
        		//perimetroTotal +=((Perimetro)c).calcularPerimetro();
        		perimetroTotal += Perimetro.class.cast(c).calcularPerimetro();
        	}
        }*/
        
        //Casteo con expresion lambda
        double perimetroTotal = escenario.stream()
        		.filter(Perimetro.class::isInstance)
        		.map(Perimetro.class::cast).mapToDouble(p -> p.calcularPerimetro()).sum();
        
        System.out.println("Perimetro Total: " +  perimetroTotal);
        

        //Ejemplo de uso de interfaz existente
        List<Figura> figuras = escenario.stream()
        		.filter(Figura.class::isInstance)
        		.map(Figura.class::cast).collect(Collectors.toList());
        //System.out.println(figuras.getClass());
        Collections.sort(figuras);
        figuras.forEach(System.out::println);
	}

}
