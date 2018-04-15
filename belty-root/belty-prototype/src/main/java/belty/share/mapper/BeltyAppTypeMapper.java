package belty.share.mapper;

import org.springframework.stereotype.Component;

import belty.share.dto.BeltyAppTypeDto;
import belty.share.entity.BeltyAppType;

@Component
public class BeltyAppTypeMapper {

	public BeltyAppTypeDto mapToDto(BeltyAppType domain) {
		BeltyAppTypeDto beltyAppTypeDto = new BeltyAppTypeDto(domain.getType(), domain.getName());
		beltyAppTypeDto.setId(domain.getId());
		return beltyAppTypeDto;
	}
}
