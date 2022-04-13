package io.github.rodrigoflexa.clientes.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
    public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(nullable = false,length = 150)
    private String nome;

    @Column(nullable = false,length = 11)
    private String cpf;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;

    @PrePersist
    public void prePersist(){
        setData(LocalDate.now());
    }

}
