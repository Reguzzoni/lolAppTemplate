package node.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import node.entity.SummonerEntity;
import node.model.SummonerDto;
import node.repository.SummonerRepository;

@Service
public class SummonerServiceImpl implements SummonerService{
	
	@Autowired
	public SummonerRepository ruoliRepository;
	
	public List<SummonerDto> getAllRuoli() {
		List<SummonerEntity> listRuoloEntity = ruoliRepository.findAll();
		return listRuoloEntity.stream()
				.map(entity -> {
					SummonerDto dto = new SummonerDto();
					dto.setDescrizioneRuolo(entity.getDescrizioneRuolo());
					dto.setRuolo(entity.getRuolo());
					return dto;
				})
				.collect(Collectors.toList());
	}
	
}
