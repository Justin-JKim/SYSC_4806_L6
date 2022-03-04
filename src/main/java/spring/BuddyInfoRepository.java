package spring;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;
import spring.classes.BuddyInfo;

@RepositoryRestResource(collectionResourceRel = "buddies", path = "buddies")
public interface BuddyInfoRepository extends PagingAndSortingRepository<BuddyInfo, String> {

    BuddyInfo findByName(@Param("name") String name);

    @Transactional
    void deleteByName(@Param("name") String name);

}