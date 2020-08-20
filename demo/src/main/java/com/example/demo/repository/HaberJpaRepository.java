package com.example.demo.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Haber;

public interface HaberJpaRepository extends JpaRepository<Haber,Integer> {

	Optional<Haber> findById(int id);

}
