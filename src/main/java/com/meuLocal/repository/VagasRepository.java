package com.meuLocal.repository;

import com.meuLocal.domain.Vagas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface VagasRepository extends JpaRepository<Vagas, Long> {

    @Query("SELECT vag FROM Vagas vag WHERE vag.longitude = ?1 and vag.latitude = ?2")
    List<Vagas> findByLocalizacao(double longitude, double latitude);
}