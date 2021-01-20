// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryOperationlogRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // event
    @NameInMap("event")
    public String event;

    // page_no
    @NameInMap("page_no")
    public Long pageNo;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // result
    @NameInMap("result")
    public Boolean result;

    // target_id
    @NameInMap("target_id")
    public String targetId;

    // target_type
    @NameInMap("target_type")
    public String targetType;

    // user_id
    @NameInMap("user_id")
    public String userId;

    public static QueryOperationlogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOperationlogRequest self = new QueryOperationlogRequest();
        return TeaModel.build(map, self);
    }

    public QueryOperationlogRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOperationlogRequest setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public QueryOperationlogRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryOperationlogRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryOperationlogRequest setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public QueryOperationlogRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public QueryOperationlogRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public QueryOperationlogRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
