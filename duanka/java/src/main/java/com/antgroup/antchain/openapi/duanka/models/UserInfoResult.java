// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class UserInfoResult extends TeaModel {
    // hr主数据接口调用结果
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 调用信息
    /**
     * <strong>example:</strong>
     * <p>workNoList:[] must not null</p>
     */
    @NameInMap("message")
    public String message;

    // 错误码
    /**
     * <strong>example:</strong>
     * <p>错误码</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    // 查询结果
    @NameInMap("query_result_list")
    @Validation(required = true)
    public java.util.List<QueryResult> queryResultList;

    public static UserInfoResult build(java.util.Map<String, ?> map) throws Exception {
        UserInfoResult self = new UserInfoResult();
        return TeaModel.build(map, self);
    }

    public UserInfoResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UserInfoResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UserInfoResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UserInfoResult setQueryResultList(java.util.List<QueryResult> queryResultList) {
        this.queryResultList = queryResultList;
        return this;
    }
    public java.util.List<QueryResult> getQueryResultList() {
        return this.queryResultList;
    }

}
