package br.com.carlosaugusto.app_auth_youtube.auth;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/token")
@RestController
public class TokenController {

  @PostMapping("/")
  public String token(@RequestBody User user) {
    HttpHeaders headers = new HttpHeaders();
    RestTemplate rt = new RestTemplate();

    headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

    MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();

    rt.postForEntity();
  }

  public record User(String password, String clienttId, String grantType, String user) {
  }
}
