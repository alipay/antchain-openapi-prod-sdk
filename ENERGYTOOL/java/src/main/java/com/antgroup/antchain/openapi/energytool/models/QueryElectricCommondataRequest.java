// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryElectricCommondataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 主数据实体稳定编码
    @NameInMap("entity_code")
    @Validation(required = true)
    public String entityCode;

    // 实体结构版本
    @NameInMap("schema_version")
    @Validation(required = true)
    public String schemaVersion;

    // JSON 查询条件；无条件时传 {}
    @NameInMap("query_json")
    @Validation(required = true)
    public String queryJson;

    // 页码，默认1，最小1
    @NameInMap("page_no")
    public Long pageNo;

    // 每页数量，默认200，最大1000
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryElectricCommondataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectricCommondataRequest self = new QueryElectricCommondataRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectricCommondataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectricCommondataRequest setEntityCode(String entityCode) {
        this.entityCode = entityCode;
        return this;
    }
    public String getEntityCode() {
        return this.entityCode;
    }

    public QueryElectricCommondataRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public QueryElectricCommondataRequest setQueryJson(String queryJson) {
        this.queryJson = queryJson;
        return this;
    }
    public String getQueryJson() {
        return this.queryJson;
    }

    public QueryElectricCommondataRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryElectricCommondataRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
