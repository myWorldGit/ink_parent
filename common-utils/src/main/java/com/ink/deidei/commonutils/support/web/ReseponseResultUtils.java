package com.ink.deidei.commonutils.support.web;

import java.util.Collection;
import java.util.Map;

public class ReseponseResultUtils {
    public static final String SUCCESS_CODE ="1000";
    public static final String TOKEN_EXCEPTION_CODE="2000";
    public static final String HYSTRIX_EXCEPTION_CODE="3000";
    public static final String PARAMS_ERROR_CODE="4000";
    public static final String AUTHORITY_ERROR_CODE="4003";
    public static final String NOT_FIND_ERROR_CODE="4004";
    public static final String SERVER_ERROR_CODE="5000";
    public static ReseponseResult buildSuccessfulResult(){
        return new ReseponseResult(SUCCESS_CODE,"当前请求成功");
    }
    public static ReseponseResult buildSuccessfulResult(String message){
        return new ReseponseResult(SUCCESS_CODE, message);
    }
    public static ReseponseResult buildSuccessfulResult(String message,String key,Object value){
        ReseponseResult reseponseResult = new ReseponseResult(SUCCESS_CODE, message);
        reseponseResult.addResult(key,value);
        return reseponseResult;
    }
    public static ReseponseResult buildSuccessfulResult(String message,String key,Object ...values){
        ReseponseResult reseponseResult = new ReseponseResult(SUCCESS_CODE, message);
        reseponseResult.addResult(key,values);
        return reseponseResult;
    }
    public static ReseponseResult buildSuccessfulResult(String message,ResultNameValuePair resultNameValuePair){
        ReseponseResult reseponseResult = new ReseponseResult(SUCCESS_CODE, message);
        reseponseResult.addResult(resultNameValuePair);
        return reseponseResult;
    }
    public static ReseponseResult buildSuccessfulResult(String message,ResultNameValuePair ...resultNameValuePairs){
        ReseponseResult reseponseResult = new ReseponseResult(SUCCESS_CODE, message);
        reseponseResult.addResult(resultNameValuePairs);
        return reseponseResult;
    }
    public static ReseponseResult buildSuccessfulResult(String message,Collection<ResultNameValuePair> collection){
        ReseponseResult reseponseResult = new ReseponseResult(SUCCESS_CODE, message);
        reseponseResult.addResult(collection);
        return reseponseResult;
    }
    public static ReseponseResult buildSuccessfulResult(String message,Map<String,Object> resultMap){
        ReseponseResult reseponseResult = new ReseponseResult(SUCCESS_CODE, message);
        reseponseResult.addResult(resultMap);
        return reseponseResult;
    }

    public static ReseponseResult buildTokenExceptionResult(){
        return new ReseponseResult(TOKEN_EXCEPTION_CODE,
                TOKEN_EXCEPTION_CODE+"信息:\"当前请求结果发生token异常\"");
    }
    public static ReseponseResult buildTokenExceptionResult(String message){
        return new ReseponseResult(TOKEN_EXCEPTION_CODE, message);
    }
    public static ReseponseResult buildHystrixExceptionResult(){
        return new ReseponseResult(HYSTRIX_EXCEPTION_CODE,
                HYSTRIX_EXCEPTION_CODE+"信息:\"当前请求触发熔断状态\"");
    }
    public static ReseponseResult buildHystrixExceptionResult(String message){
        return new ReseponseResult(HYSTRIX_EXCEPTION_CODE, message);
    }
    public static ReseponseResult buildParamsErrorResult(){
        return new ReseponseResult(PARAMS_ERROR_CODE,
                PARAMS_ERROR_CODE+"信息:\"当前请求发生的参数发生错误使得无法正常获取信息\"");
    }
    public static ReseponseResult buildParamsErrorResult(String message){
        return new ReseponseResult(PARAMS_ERROR_CODE, message);
    }
    public static ReseponseResult buildAuthorityErrorResult(){
        return new ReseponseResult(AUTHORITY_ERROR_CODE,
                AUTHORITY_ERROR_CODE+"信息:\"当前请求发生认证错误\"");
    }
    public static ReseponseResult buildAuthorityErrorResult(String message){
        return new ReseponseResult(PARAMS_ERROR_CODE,message);
    }
    public static ReseponseResult buildNotFindResult(){
        return new ReseponseResult(NOT_FIND_ERROR_CODE,
                NOT_FIND_ERROR_CODE+"信息:\"当前请求找不到目标源错误\"");
    }
    public static ReseponseResult buildNotFindResult(String message){
        return new ReseponseResult(NOT_FIND_ERROR_CODE,message);
    }
    public static ReseponseResult buildServerErrorResult(){
        return new ReseponseResult(SERVER_ERROR_CODE,
                SERVER_ERROR_CODE+"信息:\"当前请求发生服务器内部错误\"");
    }
    public static ReseponseResult buildServerErrorResult(String message){
        return new ReseponseResult(SERVER_ERROR_CODE,message);
    }


}
