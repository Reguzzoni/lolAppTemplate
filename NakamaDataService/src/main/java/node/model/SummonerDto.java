package node.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merakianalytics.orianna.types.core.summoner.Summoner;

import lombok.Getter;
import lombok.Setter;

public class SummonerDto {
	@JsonProperty("SummonerResponse")
	
	@Getter 
	@Setter 
	private String name;
     
	@Getter 
	@Setter 
	private int level;
	
	@Override
	public String toString() {
		return String.format("Summoner [ruolo=%s, descrizioneRuolo=%s]", getName(), getLevel());
	}
    
	public static SummonerDto convertFromEntity(Summoner summoner) {
		SummonerDto dto = new SummonerDto();
		dto.setName(summoner.getName());
		dto.setLevel(summoner.getLevel());
		return dto;
	}
}
