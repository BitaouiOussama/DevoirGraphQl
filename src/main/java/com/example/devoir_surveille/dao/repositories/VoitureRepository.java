package com.example.devoir_surveille.dao.repositories;

import com.example.devoir_surveille.dao.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VoitureRepository extends JpaRepository<Voiture,Integer> {

    public List<Voiture> findByModel(String model);
}
