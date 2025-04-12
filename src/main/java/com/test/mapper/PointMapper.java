package com.test.mapper;

import com.test.dto.request.PointRequestDto;
import com.test.dto.response.PointResponseDto;
import com.test.entity.Point;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PointMapper {

    Point toEntity(PointRequestDto dto);

    PointResponseDto toResponseDto(Point point);
}