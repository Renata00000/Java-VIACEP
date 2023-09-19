
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

//    CRIANDO METODO COM A CLES ENDERECO QUE VAI BUSCAR O CEP
    public void buscaEndereco( EnderecoForm endereco){

        URI uri = URI.create("http://viacep.com.br/ws/"+endereco.uf()+"/"+endereco.localidade()+"/"+endereco.logradouro()+"/json/");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (Exception ex) {
            throw new RuntimeException("Endereco nao localizado, verifique o CEP digitado");

        }

    }
}
