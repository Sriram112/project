package Repository;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface sportdetails extends Repository{

@Query(value = "",nativeQuery = true)
    List<sportdetails> findByChannelId(String sportdetails);
}
