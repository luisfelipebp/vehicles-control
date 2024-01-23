package com.luisfelipebp.vehiclecontrol.models;

import com.luisfelipebp.vehiclecontrol.models.DTOs.EstablishmentDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "establishments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Establishment {

    public Establishment(EstablishmentDTO establishmentDTO){
        this.nome = establishmentDTO.nome();
        this.cnpj = establishmentDTO.cnpj();
        this.endereco = establishmentDTO.endereco();
        this.telefone = establishmentDTO.telefone();
        this.qtdVagaMoto = establishmentDTO.vagaMoto();
        this.qtdVagaCarro = establishmentDTO.vagaCarro();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String cnpj;

    private String endereco;

    private String telefone;

    private Integer qtdVagaMoto;

    private Integer qtdVagaCarro;
}
