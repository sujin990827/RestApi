package hello.api.controller;
import hello.api.domain.Api;
import hello.api.service.ApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ApiController {

    private final ApiService apiService;

    @PostMapping("/api/post")
    public Api createApi(@RequestBody Api api){
        api.setId(api.getId());
        api.setLatitude(api.getLatitude());
        api.setLongitude(api.getLongitude());
        api.setSpeed(api.getSpeed());
        LocalDateTime now = LocalDateTime.now();
        api.setTime(now);
        apiService.saveAPi(api);
        return api;
    }

    @RequestMapping("/api")
    public List<Api> getApi() throws ClassNotFoundException, SQLException{
        List<Api> list = apiService.findApi();
        return list;
    }
}
