package com.example.ITBook.enums;

import lombok.Getter;

@Getter
public enum BoardType {
    notice("ęłľě??Ź?­"), free("?? ę˛ě?");

    private String value;

    BoardType(String value) {
        this.value = value;
    }
}
