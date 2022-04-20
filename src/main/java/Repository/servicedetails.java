package Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface servicedetails extends Repository {
@Query(value = " ",nativeQuery = true)
List<servicedetails> findByChannel(String serviceId);
}
