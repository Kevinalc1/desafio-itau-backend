package desafio.itau.springboot.Controller;

import desafio.itau.springboot.dto.TransactionRequest;
import desafio.itau.springboot.service.TransactionService;
import desafio.itau.springboot.service.UnprocessableEntityException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacao")
public class TransactionController {

    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Void> criar(
            @RequestBody TransactionRequest dto) throws UnprocessableEntityException {

        service.adicionar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping
    public ResponseEntity<String> limpar(){
        service.limpar();
        return ResponseEntity.ok("Transação removida");
    }









}
