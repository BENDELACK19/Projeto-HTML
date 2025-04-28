package RPG;

import com.google.gson.Gson;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenAIService {

    private static final String API_KEY = "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";
    private static final String ENDPOINT = "https://api.openai.com/v1/chat/completions";

    public static String conversarComIA(String prompt) throws IOException {
        URL url = new URL(ENDPOINT);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("POST");
        connection.setRequestProperty("Authorization", "Bearer " + API_KEY);
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        String body = "{"
                + "\"model\": \"gpt-3.5-turbo\","
                + "\"messages\": [{\"role\": \"user\", \"content\": \"" + prompt + "\"}],"
                + "\"temperature\": 0.7"
                + "}";

        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = body.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        StringBuilder resposta = new StringBuilder();
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(connection.getInputStream(), "utf-8"))) {
            String responseLine;
            while ((responseLine = br.readLine()) != null) {
                resposta.append(responseLine.trim());
            }
        }

        Gson gson = new Gson();
        OpenAIResponse openAIResponse = gson.fromJson(resposta.toString(), OpenAIResponse.class);

        // Extraindo o conteúdo da resposta
        if (openAIResponse.choices != null && !openAIResponse.choices.isEmpty()) {
            return openAIResponse.choices.get(0).message.content;
        } else {
            throw new IOException("Resposta da IA não encontrada.");
        }
    }
}
