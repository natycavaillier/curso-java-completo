package map.demonstracaoUm.application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        //- Não aceita repetições do objeto chave
        //- Os elementos não têm posição
        //- O Acesso/inserção/remoção de elementos é rapido
        // hashMap(mais rapido e nao ordenado),
        // treeMap(lento ordem com base no copmareTo do objeto)
        // e linkedHashMap(velocidade intermediaria e elementos na ordem que foram adicionados)

        Map<String, String> cookies = new TreeMap<>();

        //Inserir elemento no map
        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "991929394");

        cookies.remove("email");
        //Vai sobrescrever o valor antigo
        cookies.put("phone", "991112222");

        System.out.println("Contem a chave 'phone': " + cookies.containsKey("phone"));
        System.out.println("Valor do 'phone': " + cookies.get("phone"));
        //Quando nao existe, retorna 'null'
        System.out.println("Email: " + cookies.get("adress"));
        System.out.println("Size: " + cookies.size());

        System.out.println("----- ALL COOKIES -----");

        //keySet() => Retorna um set com as chaves do Map
        //get(key) => Valor associado àquela chave
        for(String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
