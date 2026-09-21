// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryAppmarketCommondataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 实体编码：WeatherData、WeatherWarning、BiddingSpace
    @NameInMap("entity_code")
    @Validation(required = true)
    public String entityCode;

    // 实体数据结构版本
    @NameInMap("schema_version")
    @Validation(required = true)
    public String schemaVersion;

    // JSON 对象字符串，放实体自身的查询条件
    @NameInMap("query_json")
    @Validation(required = true)
    public String queryJson;

    // 页码，默认 1
    @NameInMap("page_no")
    public Long pageNo;

    // 每页条数，默认 200，最大建议 1000
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryAppmarketCommondataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppmarketCommondataRequest self = new QueryAppmarketCommondataRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppmarketCommondataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppmarketCommondataRequest setEntityCode(String entityCode) {
        this.entityCode = entityCode;
        return this;
    }
    public String getEntityCode() {
        return this.entityCode;
    }

    public QueryAppmarketCommondataRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public QueryAppmarketCommondataRequest setQueryJson(String queryJson) {
        this.queryJson = queryJson;
        return this;
    }
    public String getQueryJson() {
        return this.queryJson;
    }

    public QueryAppmarketCommondataRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryAppmarketCommondataRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
