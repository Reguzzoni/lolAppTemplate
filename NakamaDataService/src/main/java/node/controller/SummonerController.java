package node.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.merakianalytics.orianna.Orianna;
import com.merakianalytics.orianna.types.common.Region;
import com.merakianalytics.orianna.types.core.summoner.Summoner;

import lombok.extern.slf4j.Slf4j;
import node.model.SummonerDto;
import node.service.SummonerService;

@RestController
@Slf4j
@RequestMapping("/summoner")
public class SummonerController {

	@Autowired
	SummonerService summonerService;
	
	@GetMapping(value="/helloWorld")
	public ResponseEntity<String> gethelloWorld(){

		return ResponseEntity.ok().body("Hello World");
	}
	
	@GetMapping("/getSummonerTest") 
	public ResponseEntity<SummonerDto> getSummonerTest(){
		Summoner summoner = Orianna.summonerNamed("Uracicle").withRegion(Region.EUROPE_WEST).get();
        
        log.debug("getSummonerTest result name is : " + summoner.getName());
        
        SummonerDto dto = SummonerDto.convertFromEntity(summoner);
        
		return Optional
				.ofNullable(dto)
				.map( list -> ResponseEntity.ok().body(list))  
				.orElseGet( () -> ResponseEntity.notFound().build() );
	}
}
