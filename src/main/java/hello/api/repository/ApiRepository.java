package hello.api.repository;
import hello.api.domain.Api;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ApiRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void save(Api api){
       em.persist(api);
    }

    //조회
    public List<Api> findAll(){
        return em.createQuery("select a from Api a", Api.class)
                .getResultList();
    }

}
