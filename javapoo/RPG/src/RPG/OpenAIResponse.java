package RPG;

import com.google.gson.annotations.SerializedName;

import java.io.Serial;
import java.util.List;

public class OpenAIResponse {
    public static class Choice {
        @SerializedName("message")
        public Message message;
    }

    public static class Message {
        @SerializedName("content")
        public String content;
    }

    @SerializedName("choices")
    public List<Choice> choices;
}
