package com.projects.userservice;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class GenericUrlConnection {

	@Autowired
	private RestTemplate restTemplate;
		
       public ResponseEntity<Object> sendRequest(String url, Object requestBody) {
    	  
    	  return restTemplate.getForEntity(url, Object.class);
       }
		
	}
	
	


/** 
 public ResponseEntity<Object> sendPostRequest(String url, Object requestBody) {
		logger.info("Going to send post request");
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Object> entity = new HttpEntity<>(requestBody, headers);
		return restTemplate.exchange(url, HttpMethod.POST, entity, Object.class);
	}
 **/

/*RestTemplate restTemplate = new RestTemplate();
String fooResourceUrl
  = "http://localhost:8080/spring-rest/foos";
ResponseEntity<String> response
  = restTemplate.getForEntity(fooResourceUrl + "/1", String.class);
assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));*/
