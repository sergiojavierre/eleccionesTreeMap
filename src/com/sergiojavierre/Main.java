package com.sergiojavierre;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int escaños = 5;
        List<Partido> partidos = new ArrayList<>();

	    Partido a = new Partido("a",10000);
	    Partido b = new Partido("b", 25000);
	    Partido c = new Partido("c",30000);
	    Partido d = new Partido("d",12000);

	    partidos.add(a);
	    partidos.add(b);
	    partidos.add(c);
	    partidos.add(d);

		TreeMap<Integer,Partido> resultados = new TreeMap<>();
		for(int vuelta = 1; vuelta <= escaños; vuelta++){
	        for(int i = 0; i < partidos.size(); i++){
	            Partido actual = partidos.get(i);
	            resultados.put(actual.getVotos()/vuelta,actual);
            }
        }
		NavigableMap<Integer,Partido> resultadosOrdenados = resultados.descendingMap();
		for(int escaño = 1; escaño <= escaños; escaño++){
			Map.Entry<Integer,Partido> entradaActual = resultadosOrdenados.pollFirstEntry();
			System.out.format(
					"Escaño %d para el partido %s con %d votos\n",
					escaño,
					entradaActual.getValue().getNombre(),
					entradaActual.getKey()
			);
		}
    }
}
