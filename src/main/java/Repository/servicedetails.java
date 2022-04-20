package Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Servicedetails extends Repository {
@Query(value = " ",nativeQuery = true)
List<Servicedetails> findByChannel(String serviceId);
}
