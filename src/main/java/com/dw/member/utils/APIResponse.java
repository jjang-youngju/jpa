package com.dw.member.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

//제네릭 <>
// List<>
public class APIResponse<T> {

    int total;
    T list;
}
