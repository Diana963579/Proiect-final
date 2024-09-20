package com.example.Proiectfinal.repository;

import com.example.Proiectfinal.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
    List<Group> findByGrupId(Long grupId);
}