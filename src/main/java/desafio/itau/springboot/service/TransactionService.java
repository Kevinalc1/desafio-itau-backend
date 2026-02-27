package desafio.itau.springboot.service;

import desafio.itau.springboot.dto.TransactionRequest;
import desafio.itau.springboot.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    private final List<Transaction> transactions = new ArrayList<>();

    public void adicionar(TransactionRequest dto) throws UnprocessableEntityException{

        if (dto.getValor() <= 0) {
            throw new UnprocessableEntityException(
                    "O valor deve ser maior que zero"
            );
        }

        Transaction transaction =
                new Transaction(dto.getValor(), dto.getDataHora());

        transactions.add(transaction);
    }

    public void limpar(){
        transactions.clear();
    }

    public List <Transaction> listar(){
        return transactions;
    }
}
