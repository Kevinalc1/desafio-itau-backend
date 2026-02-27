package desafio.itau.springboot.dto;

import desafio.itau.springboot.model.Transaction;
import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public class TransactionRequest {

    private double valor;
    private OffsetDateTime dataHora;

    @NotNull
    public double getValor() {
        return valor;
    }

    @NotNull
    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}
