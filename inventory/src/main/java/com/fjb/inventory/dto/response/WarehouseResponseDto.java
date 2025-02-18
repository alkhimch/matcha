package com.fjb.inventory.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WarehouseResponseDto {
    private Long id;
    private String name;
    private String location;
    private String description;
}
