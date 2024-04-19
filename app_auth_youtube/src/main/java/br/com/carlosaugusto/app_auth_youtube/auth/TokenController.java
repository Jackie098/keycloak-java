package br.com.carlosaugusto.app_auth_youtube.auth;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/token")
public class TokenController {

  @PostMapping("/")
  public String token(@RequestBody User user) {
    HttpHeaders headers = new HttpHeaders();
    RestTemplate rt = new RestTemplate();

    headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

    MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
    formData.add("client_id", user.clienttId);
    formData.add("username", user.username);
    formData.add("password", user.password);
    formData.add("grantType", user.grantType);

    HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<MultiValueMap<String, String>>(formData, headers);

    rt.postForEntity(entity, String.class);
  }

  public record User(String password, String clienttId, String grantType, String username) {
  }
}
