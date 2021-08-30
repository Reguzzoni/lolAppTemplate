package node.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

public class SummonerDto {
	@JsonProperty("SummonerResponse")
	
	@Getter 
	@Setter 
	private String ruolo;
     
	@Getter 
	@Setter 
	private String descrizioneRuolo;
	
	@Override
	public String toString() {
		return String.format("Summoner [ruolo=%s, descrizioneRuolo=%s]", getRuolo(), getDescrizioneRuolo());
	}
    
}
