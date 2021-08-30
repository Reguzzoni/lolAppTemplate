package node;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.merakianalytics.orianna.Orianna;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class Application {

	public static void main(String[] args) {
		//https://orianna.readthedocs.io/en/latest/configuring-orianna/configuring-orianna-json.html
		Orianna.loadConfiguration("orianna.json");
		SpringApplication.run(Application.class, args);
	}
}
