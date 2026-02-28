package desafio.itau.springboot.service;

import desafio.itau.springboot.dto.StaticsResponse;
import desafio.itau.springboot.model.Transaction;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.List;

@Service
public class StaticsService {

    private final TransactionService transactionService;

    public StaticsService(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    public StaticsResponse ultimos60s() {

        OffsetDateTime limite = OffsetDateTime.now().minusSeconds(60);

        List<Transaction> transactions = transactionService.listar();

        DoubleSummaryStatistics statistics = transactions.stream()
                .filter(t -> !t.getDataHora().isBefore(limite))
                .mapToDouble(Transaction::getValor)
                .summaryStatistics();

        return new StaticsResponse(statistics);
    }
}
