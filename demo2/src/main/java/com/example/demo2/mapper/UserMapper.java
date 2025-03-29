package com.example.demo2.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.example.demo2.dto.UserDto;
import com.example.demo2.model.User;

@Mapper
public interface UserMapper {
    
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    // Map Entity to DTO
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "email", target = "email")
    UserDto toDto(User user);

    // Map DTO to Entity
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "email", target = "email")
    UserDto toEntity(UserDto userdDto);
    
}
