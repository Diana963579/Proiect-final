package com.example.Proiectfinal.service;

import com.example.Proiectfinal.entity.Group;
import com.example.Proiectfinal.exceptions.GroupNotFoundException;
import com.example.Proiectfinal.repository.GroupRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GroupService {

    private final GroupRepository groupRepository;

    public GroupService(GroupRepository grupRepository) {
        this.groupRepository = grupRepository;
    }

    public Group gasesteGrupDupaId(Long id) {
        return groupRepository.findById(id)
                .orElseThrow(() -> new GroupNotFoundException("Grupul cu id-ul " + id + " nu a fost găsit"));
    }
    // Alte metode...
}