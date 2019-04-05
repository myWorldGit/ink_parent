package com.ink.deidei.commonutils.support.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class ResultNameValuePair {
    private String key;
    private Object value;
}
