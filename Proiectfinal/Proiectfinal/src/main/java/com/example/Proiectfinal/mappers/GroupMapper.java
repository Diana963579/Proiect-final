package com.example.Proiectfinal.mappers;

import com.example.Proiectfinal.dto.GroupDto;
import com.example.Proiectfinal.entity.Group;
import org.springframework.stereotype.Component;

@Component
public class GroupMapper {

    public GroupDto toDto(Group group) {
        GroupDto dto = new GroupDto();
        dto.setId(group.getId());
        dto.setNumeGrup(group.getNumeGrup());
        return dto;
    }

    public Group toEntity(GroupDto dto) {
        Group group = new Group();
        group.setId(dto.getId());
        group.setNumeGrup(dto.getNumeGrup());
        return group;
    }
}