package desafio.itau.springboot.Controller;

import desafio.itau.springboot.dto.StaticsResponse;
import desafio.itau.springboot.service.StaticsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticsController {

    private final StaticsService estatisticsService;

    public StaticsController(StaticsService estatisticsService) {
        this.estatisticsService = estatisticsService;
    }

    @GetMapping("/estatistica")
    public StaticsResponse status(){
        return estatisticsService.ultimos60s();
    }
}
