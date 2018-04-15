package belty.share.dataregister;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import belty.share.entity.BeltyAppType;
import belty.share.repository.BeltyAppTypeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EntityTestConfiguration.class)
@ActiveProfiles(value = { "local" })
public class BeltyAppTypeRegister {

	@Autowired
	private BeltyAppTypeRepository beltyAppTypeRepositpory;

	@Test
	@Rollback(false)
	@Transactional
	public void saveBeltyAppType() {
		beltyAppTypeRepositpory.save(new BeltyAppType("FLOWER_POT", "화분"));
		beltyAppTypeRepositpory.save(new BeltyAppType("REFRIGERATOR", "냉장고"));
	}
}
