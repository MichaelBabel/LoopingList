import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Lista ordenada");
        List<String> lista = new ArrayList<>();
        lista.add("Santa Catarina");
        lista.add("Paraná");
        lista.add("Rio Grande do Sul");
        lista.add("São Paulo");
        lista.add("Rio de Janeiro");

        System.out.println("Usando toString");
        System.out.println(lista);
        System.out.println("");

        System.out.println("Usando ArrayList iterator");
        // Iterator usa dois dados = hasNext() para ver se há algum dado
        // na próxima linha, que retorna um boolean, e next(),
        // para obter o dado da próxima linha
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            String valor = iterator.next();
            System.out.println(valor);
        }
        System.out.println("");

        System.out.println("Usando ForEach");
        for (String valor : lista) {
            System.out.println(valor);
        }
        System.out.println("");

        System.out.println("Usando Referência ao Método em Java 8");
        lista.forEach(System.out::println);
        System.out.println("");

        System.out.println("Lista não ordenada");
        Map<String, String> mapa = new HashMap<>();
        mapa.put("Santa Catarina", "Florianópolis");
        mapa.put("Paraná", "Curitiba");
        mapa.put("Rio Grande do Sul", "Porto Alegre");
        mapa.put("Goiás", "Goiânia");
        mapa.put("Espírito Santo", "Vitória");
        System.out.println(mapa);
        System.out.println("");

        System.out.println("Usando HashMap Iterator");
        Set<String> chaves = mapa.keySet();
        Iterator<String> iterator1 = chaves.iterator();
        while (iterator1.hasNext()) {
            String chave = iterator1.next();
            System.out.println("A capital de " + chave + " é " + mapa.get(chave));
        }
        System.out.println("");

        System.out.println("Usando HashMap ForEach");
        Set<String> estados = mapa.keySet();
        Iterator<String> iterator2 = estados.iterator();
        for (String estado : estados) {
            System.out.println("A capital de " + estado + " é " + mapa.get(estado));
        }
        System.out.println("");
    }
}