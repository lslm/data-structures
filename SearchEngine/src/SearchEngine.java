import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEngine {
    private Queue<String> fila = new LinkedList<>();
    private List<String> sitesDescobertos = new ArrayList();

    public void descobrirSites(String primeiroSite) {
        fila.add(primeiroSite);
        sitesDescobertos.add(primeiroSite);

        while(!fila.isEmpty()) {
            // enquanto a fila não estiver vazia, navegaremos pelos sites dela
            String proximoSite = fila.remove();

            // Fazer uma requisição para o site;
            // Descobrir outros sites dentro dele;
            // Adicionar os sites descobertos na fila;
            // Adicionar sites descobertos em sitesDescobertos;

            String html = lerSite(proximoSite);
            String regex = "https://(\\w+\\.)*(\\w+)";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(html);

            while (matcher.find()) {
                String linkEncontrado = matcher.group();

                if (!sitesDescobertos.contains(linkEncontrado)) {
                    sitesDescobertos.add(linkEncontrado);
                    System.out.println("Link encontrado: " + linkEncontrado);
                    fila.add(linkEncontrado);
                }
            }
        }
    }

    private String lerSite(String endereco) {
        StringBuilder rawHTML = new StringBuilder("");

        try {
            URL urlInstance = new URL(endereco);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlInstance.openStream()));

            String line = "";
            while((line = bufferedReader.readLine()) != null) {
                rawHTML.append(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Não foi possível fazer a requisição para o endereço: " + endereco);
        }

        return rawHTML.toString();
    }
}
