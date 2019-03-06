package util;
import org.apache.http.HttpRequest;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

/**
 * @author shkstart
 * @create 2019-01-20 15:59
 */
public class PostClientRequest {
    public static void main(String[] args) throws ClientProtocolException, IOException {
        String url = "http://localhost:7020/refresh";
        HttpPost httpPost = new HttpPost(url);
        CloseableHttpClient client = HttpClients.createDefault();

        client.execute(httpPost);
    }
}
