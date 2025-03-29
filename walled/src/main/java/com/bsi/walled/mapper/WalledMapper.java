package com.bsi.walled.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.bsi.walled.dto.WalletResponse;
import com.bsi.walled.model.Walled;

@Mapper(componentModel = "spring")
public interface WalledMapper {
    WalledMapper INSTANCE = 
    Mappers.getMapper(WalledMapper.class);

    @Mapping(source = "user.id", target = "userId")
    WalletResponse toResponse(Walled wallet);
    
}
