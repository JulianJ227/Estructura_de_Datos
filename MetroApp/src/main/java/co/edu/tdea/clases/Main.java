package co.edu.tdea.clases;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		MapaMetro mapa = new MapaMetro();
		
		//LINEA A y B
		Estacion niquia = new Estacion("Niquia", "A");
		Estacion bello = new Estacion("Bello", "A");
		Estacion madera = new Estacion("Madera", "A");
		Estacion acevedo = new Estacion("Acevedo", "A");
		Estacion tricentenario = new Estacion("Tricentenario", "A");
		Estacion caribe = new Estacion("Caribe", "A");
		Estacion universidad = new Estacion("Universidad", "A");
		Estacion hospital = new Estacion("Hospital", "A");
		Estacion prado = new Estacion("prado", "A");
		Estacion parqueBerrio = new Estacion("Parque Berrío", "A");
		Estacion sanAntonio = new Estacion("San Antonio", "A");
		Estacion alpujarra = new Estacion("Alpujarra", "A");
		Estacion exposiciones = new Estacion("Exposiciones", "A");
		Estacion industriales = new Estacion("Industriales", "A");
		Estacion poblado = new Estacion("Poblado", "A");
		Estacion aguacatala = new Estacion("Aguacatala", "A");
		Estacion ayura = new Estacion("Ayura", "A");
		Estacion envigado = new Estacion("Envigado", "A");
		Estacion itagui = new Estacion("Itagui", "A");
		Estacion sabaneta = new Estacion("Sabaneta", "A");
		Estacion laEstrella = new Estacion("La Estrella", "A");
		Estacion sanJavier = new Estacion("San Javier", "B");
		Estacion santaLucia = new Estacion("Santa Lucia", "B");
		Estacion floresta = new Estacion("Floresta", "B");
		Estacion estadio = new Estacion("Estadio", "B");
		Estacion suramericana = new Estacion("Suramericana", "B");
		Estacion cisneros = new Estacion("Cisneros", "B");
		
		//Linea T - TRANVIA
		Estacion sanJose = new Estacion("San Jose", "T");
		Estacion pabellon = new Estacion("Pabellon", "T");
		Estacion bicentenario = new Estacion("Bicentenario", "T");
		Estacion buenosAires = new Estacion("Buenos Aires", "T");
		Estacion miraflores = new Estacion("Miraflores", "T");
		Estacion loyola = new Estacion("Loyola", "T");
		Estacion alejandroEchavarria = new Estacion("Alejandro Echavarria", "T");
		Estacion oriente = new Estacion("Oriente", "T");
		
		//METROCABLE
		Estacion sena = new Estacion("Sena", "P");
		Estacion doceDeOctubre = new Estacion("12 de Octubre", "P");
		Estacion elProgreso = new Estacion("El Progreso", "P");
		Estacion andalucia = new Estacion("Andalucia", "K");
		Estacion popular = new Estacion("Popular", "K");
		Estacion santoDomingo = new Estacion("Santo Domingo", "K");
		Estacion arvi = new Estacion("Arvi", "L");
		Estacion juanXVIII = new Estacion("Juan XVIII", "J");
		Estacion vallejuelos = new Estacion("Vallejuelos", "J");
		Estacion laAurora = new Estacion("La Aurora", "J");
		Estacion elPinal = new Estacion("El Pinal", "M");
		Estacion treceDeNoviembre = new Estacion("13 de Noviembre", "M");
		Estacion lasTorres = new Estacion("Las Torres", "H");
		Estacion villaSierra = new Estacion("Villa Sierra", "H");
		
		
		// Agregar estaciones al mapa
		mapa.agregarEstacion(niquia);
		mapa.agregarEstacion(bello);
		mapa.agregarEstacion(madera);
		mapa.agregarEstacion(acevedo);
		mapa.agregarEstacion(tricentenario);
		mapa.agregarEstacion(caribe);
		mapa.agregarEstacion(universidad);
		mapa.agregarEstacion(hospital);
		mapa.agregarEstacion(prado);
		mapa.agregarEstacion(parqueBerrio);
		mapa.agregarEstacion(sanAntonio);
		mapa.agregarEstacion(alpujarra);
		mapa.agregarEstacion(exposiciones);
		mapa.agregarEstacion(industriales);
		mapa.agregarEstacion(poblado);
		mapa.agregarEstacion(aguacatala);
		mapa.agregarEstacion(ayura);
		mapa.agregarEstacion(envigado);
		mapa.agregarEstacion(itagui);
		mapa.agregarEstacion(sabaneta);
		mapa.agregarEstacion(laEstrella);
		mapa.agregarEstacion(sanJavier);
		mapa.agregarEstacion(santaLucia);
		mapa.agregarEstacion(floresta);
		mapa.agregarEstacion(estadio);
		mapa.agregarEstacion(suramericana);
		mapa.agregarEstacion(cisneros);
		mapa.agregarEstacion(sanJose);
		mapa.agregarEstacion(pabellon);
		mapa.agregarEstacion(bicentenario);
		mapa.agregarEstacion(buenosAires);
		mapa.agregarEstacion(miraflores);
		mapa.agregarEstacion(loyola);
		mapa.agregarEstacion(alejandroEchavarria);
		mapa.agregarEstacion(oriente);
		mapa.agregarEstacion(sena);
		mapa.agregarEstacion(doceDeOctubre);
		mapa.agregarEstacion(elProgreso);
		mapa.agregarEstacion(andalucia);
		mapa.agregarEstacion(popular);
		mapa.agregarEstacion(santoDomingo);
		mapa.agregarEstacion(arvi);
		mapa.agregarEstacion(juanXVIII);
		mapa.agregarEstacion(vallejuelos);
		mapa.agregarEstacion(laAurora);
		mapa.agregarEstacion(elPinal);
		mapa.agregarEstacion(treceDeNoviembre);
		mapa.agregarEstacion(lasTorres);
		mapa.agregarEstacion(villaSierra);


		//CONECTAR LAS ESTACIONES LINEA A
		mapa.agregarConexion(niquia, bello);
		mapa.agregarConexion(bello, madera);
		mapa.agregarConexion(madera, acevedo);
		mapa.agregarConexion(acevedo, tricentenario);
		mapa.agregarConexion(tricentenario, caribe);
		mapa.agregarConexion(caribe, universidad);
		mapa.agregarConexion(universidad, hospital);
		mapa.agregarConexion(hospital, prado);
		mapa.agregarConexion(prado, parqueBerrio);
		mapa.agregarConexion(parqueBerrio, sanAntonio);
		mapa.agregarConexion(sanAntonio, alpujarra);
		mapa.agregarConexion(alpujarra, exposiciones);
		mapa.agregarConexion(exposiciones, industriales);
		mapa.agregarConexion(industriales, poblado);
		mapa.agregarConexion(poblado, aguacatala);
		mapa.agregarConexion(aguacatala, ayura);
		mapa.agregarConexion(ayura, envigado);
		mapa.agregarConexion(envigado, itagui);
		mapa.agregarConexion(itagui, sabaneta);
		mapa.agregarConexion(sabaneta, laEstrella);
		
		//CONEXIONES LINEA B
		mapa.agregarConexion(sanJavier, santaLucia);
		mapa.agregarConexion(santaLucia, floresta);
		mapa.agregarConexion(floresta, estadio);
		mapa.agregarConexion(estadio, suramericana);
		mapa.agregarConexion(suramericana, cisneros);
		mapa.agregarConexion(cisneros, sanAntonio); // Conexión con la Línea A

		//CONEXIONES TRANVIA
		mapa.agregarConexion(sanAntonio, sanJose);
		mapa.agregarConexion(sanJose, pabellon);
		mapa.agregarConexion(pabellon, bicentenario);
		mapa.agregarConexion(bicentenario, buenosAires);
		mapa.agregarConexion(buenosAires, miraflores);
		mapa.agregarConexion(miraflores, loyola);
		mapa.agregarConexion(loyola, alejandroEchavarria);
		mapa.agregarConexion(alejandroEchavarria, oriente);

		//CONEXIONES METROCABLE
		mapa.agregarConexion(acevedo, sena);
		mapa.agregarConexion(sena, doceDeOctubre);
		mapa.agregarConexion(doceDeOctubre, elProgreso);
		mapa.agregarConexion(acevedo, andalucia);
		mapa.agregarConexion(andalucia, popular);
		mapa.agregarConexion(popular, santoDomingo);
		mapa.agregarConexion(santoDomingo, arvi);
		mapa.agregarConexion(sanJavier, juanXVIII);
		mapa.agregarConexion(juanXVIII, vallejuelos);
		mapa.agregarConexion(vallejuelos, laAurora);
		mapa.agregarConexion(miraflores, elPinal);
		mapa.agregarConexion(elPinal, treceDeNoviembre);
		mapa.agregarConexion(oriente, lasTorres);
		mapa.agregarConexion(lasTorres, villaSierra);

		
		Scanner sc = new Scanner(System.in);
		

        System.out.print("Ingrese la estación de origen: ");
        String origen = sc.nextLine();

        System.out.print("Ingrese la estación de destino: ");
        String destino = sc.nextLine();

        List<Estacion> ruta = mapa.encontrarRutaMasCorta(origen, destino);

        if (!ruta.isEmpty()) {
            System.out.println("Ruta más corta:");
            String lineaAnterior = ruta.get(0).getLinea();
            
            System.out.print(ruta.get(0).getNombre() + " (" + lineaAnterior + ")");

            for (int i = 1; i < ruta.size(); i++) {
                Estacion actual = ruta.get(i);
                String lineaActual = actual.getLinea();

                // Si cambia la línea, indicamos el transbordo
                if (!lineaActual.equals(lineaAnterior)) {
                    System.out.println("\nHacer transbordo a " + obtenerNombreLinea(lineaActual));
                }

                System.out.print(" -> " + actual.getNombre() + " (" + lineaActual + ")");
                lineaAnterior = lineaActual;
            }

            System.out.println(" -> Fin");
        } else {
            System.out.println("No se encontró una ruta.");
        }


        sc.close();
    }

	private static String obtenerNombreLinea(String codigoLinea) {
	    switch (codigoLinea) {
	        case "A": return "Línea A (Metro)";
	        case "B": return "Línea B (Metro)";
	        case "T": return "Línea T (Tranvía)";
	        case "P": return "Línea P (Metrocable)";
	        case "K": return "Línea K (Metrocable)";
	        case "J": return "Línea J (Metrocable)";
	        case "L": return "Línea L (Metrocable)";
	        case "M": return "Línea M (Metrocable)";
	        case "H": return "Línea H (Metrocable)";
	        default: return "Línea desconocida";
	    }
	}



}
