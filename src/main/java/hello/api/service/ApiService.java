package hello.api.service;
import hello.api.domain.Api;
import hello.api.repository.ApiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ApiService {

    private final ApiRepository apiRepository;

    @Transactional
    public void saveAPi(Api api){
        apiRepository.save(api);
    }

    //조회
    public List<Api> findApi(){
        return apiRepository.findAll();
    }

}
