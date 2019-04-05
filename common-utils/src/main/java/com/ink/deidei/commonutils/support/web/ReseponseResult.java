package com.ink.deidei.commonutils.support.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

@Data
@NoArgsConstructor
public class ReseponseResult {
    private String code;
    private String message;
    private Map<String,Object> result;
    public ReseponseResult(String code,String message){
        this.code=code;
        this.message=message;
    }
    public Map<String,Object> addResult(String key,Object value){
        if(this.result==null ){
            this.result=new LinkedHashMap<String,Object>();
        }
        this.result.put(key,value);
        return this.result;
    }
    public Map<String,Object> addResult(ResultNameValuePair resultNameValuePair){
        if(resultNameValuePair==null){
            return this.result;
        }
        this.result.put(resultNameValuePair.getKey(),
                resultNameValuePair.getValue());
        return this.result;
    }
    public Map<String,Object> addResult(ResultNameValuePair ...resultNameValuePairs){
        if(resultNameValuePairs==null || resultNameValuePairs.length==0){
            return this.result;
        }
        for(ResultNameValuePair resultNameValuePair: resultNameValuePairs){
            this.addResult(resultNameValuePair);
        }
        return this.result;
    }
    public Map<String,Object> addResult(Map<String,Object> resultMap){
        if(resultMap!=null && !resultMap.isEmpty()){
            if(this.result==null){
                this.result=new LinkedHashMap<>(resultMap);
            }
        }
        return this.result;
    }
    public Map<String,Object> addResult(Collection<ResultNameValuePair>results){
        if(results==null || results.isEmpty()){
            return this.result;
        }
        Iterator<ResultNameValuePair> iterator = results.iterator();
        while (iterator.hasNext()){
            ResultNameValuePair resultNameValuePair = iterator.next();
            this.addResult(resultNameValuePair);
        }
        return this.result;
    }
    public ReseponseResult setCodeAndMessage(String code,String message){
        this.code=code;
        this.message=message;
        return this;
    }


}
