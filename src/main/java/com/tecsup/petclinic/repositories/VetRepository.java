package com.tecsup.petclinic.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tecsup.petclinic.entities.Vet;

@Repository
public interface VetRepository extends CrudRepository<Vet, Integer> {
    // Fetch vets by Id
    Optional<Vet> findById(Integer id);
    // Fetch vets by first name
    List<Vet> findByFirstName(String firstName);

    // Fetch vets by last name
    List<Vet> findByLastName(String lastName);

    // Fetch all vets
    @Override
    List<Vet> findAll();
}
