package com.bsi.walled.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.bsi.walled.dto.UserRequest;
import com.bsi.walled.dto.UserResponse;
import com.bsi.walled.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = 
    Mappers.getMapper(UserMapper.class);

    User toEntity(UserRequest request);
    UserResponse toResponse(User user);
}
