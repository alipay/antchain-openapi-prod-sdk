// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryConfigAppRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用名称
    @NameInMap("app_name")
    public String appName;

    // 模板参数保密级别
    @NameInMap("data_level")
    public String dataLevel;

    // 参数名
    @NameInMap("key")
    public String key;

    // 排序规则数组，默认为 UTC_CREATED_DESC，即 根创建时间降序排序
    @NameInMap("orders")
    public java.util.List<String> orders;

    // 当前页码，从1开始，默认为1
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小，默认为10
    @NameInMap("page_size")
    public Long pageSize;

    // 根据参数类型进行查询
    @NameInMap("param_type")
    public String paramType;

    // 查询类型，支持精准查询、模糊查询、前缀模糊查询，这里默认为模糊查询；查询类型针对字段 app_name, key
    @NameInMap("query_type")
    public String queryType;

    // 该参数属于哪个 scope ，是个在多个 scope 中查询
    @NameInMap("scopes")
    public java.util.List<String> scopes;

    // 该参数在该 scope 中的 id
    @NameInMap("scope_id")
    public String scopeId;

    public static QueryConfigAppRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigAppRequest self = new QueryConfigAppRequest();
        return TeaModel.build(map, self);
    }

    public QueryConfigAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryConfigAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryConfigAppRequest setDataLevel(String dataLevel) {
        this.dataLevel = dataLevel;
        return this;
    }
    public String getDataLevel() {
        return this.dataLevel;
    }

    public QueryConfigAppRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public QueryConfigAppRequest setOrders(java.util.List<String> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<String> getOrders() {
        return this.orders;
    }

    public QueryConfigAppRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryConfigAppRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryConfigAppRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public QueryConfigAppRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public QueryConfigAppRequest setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
        return this;
    }
    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    public QueryConfigAppRequest setScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    public String getScopeId() {
        return this.scopeId;
    }

}
