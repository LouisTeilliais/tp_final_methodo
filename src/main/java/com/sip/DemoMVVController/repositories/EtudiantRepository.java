package com.sip.DemoMVVController.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sip.DemoMVVController.entities.Etudiant;

@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant, Integer> {
     
    public Etudiant findByName(String name);
}