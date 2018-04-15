package belty.share.api;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import belty.share.dto.BeltyAppTypeDto;
import belty.share.entity.BeltyAppType;
import belty.share.mapper.BeltyAppTypeMapper;
import belty.share.repository.BeltyAppTypeRepository;

@RestController
@RequestMapping("apptype")
public class BeltyAppTypeController {

	@Autowired
	private BeltyAppTypeMapper beltyAppTypeMapper;

	@Autowired
	private BeltyAppTypeRepository beltyAppTypeRepository;

	@RequestMapping(value = "/search/all", method = RequestMethod.GET)
	@Transactional
	public List<BeltyAppTypeDto> serarhAll() {
		Iterable<BeltyAppType> belTypeAppTypeList = beltyAppTypeRepository.findAll();
		List<BeltyAppTypeDto> belTypeAppTypeDtoList = new ArrayList<>();
		belTypeAppTypeList.forEach(beltyAppType -> {
			belTypeAppTypeDtoList.add(this.beltyAppTypeMapper.mapToDto(beltyAppType));
		});

		return belTypeAppTypeDtoList;
	}
}
