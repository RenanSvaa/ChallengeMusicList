import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args) {
        ArrayList<String> listaParaIlhaDeserta = new ArrayList<>();
        
        listaParaIlhaDeserta.add("Vida Chique");
        listaParaIlhaDeserta.add("Opção");
        listaParaIlhaDeserta.add("Flow Espacial");
        listaParaIlhaDeserta.add("Jordan");
        listaParaIlhaDeserta.add("Deus Perdoa");
        listaParaIlhaDeserta.add("Beleza Exótica");
        
        System.out.println("Lista original:");
        System.out.println(listaParaIlhaDeserta);
        
        System.out.println("Número de músicas na lista: " + listaParaIlhaDeserta.size());
        
        while (listaParaIlhaDeserta.size() > 5) {
            listaParaIlhaDeserta.remove(listaParaIlhaDeserta.size() - 1);
        }
        
        System.out.println("Lista reduzida:");
        System.out.println(listaParaIlhaDeserta);
        
        int indiceA = listaParaIlhaDeserta.indexOf("Flow Espacial");
        int indiceB = listaParaIlhaDeserta.indexOf("Deus Perdoa");
        
        String tempA = listaParaIlhaDeserta.get(indiceA);
        listaParaIlhaDeserta.set(indiceA, listaParaIlhaDeserta.get(indiceB));
        listaParaIlhaDeserta.set(indiceB, tempA);
        
        System.out.println("Lista com troca de músicas:");
        System.out.println(listaParaIlhaDeserta);
    }
}

