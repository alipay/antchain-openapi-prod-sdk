// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryAppRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 根据应用分组查询，为空默认查询所有应用分组
    @NameInMap("app_group_name")
    public String appGroupName;

    // 根据应用名称查询，为空默认查询所有应用
    @NameInMap("app_name")
    public String appName;

    // 排序规则数组，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
    @NameInMap("orders")
    public java.util.List<String> orders;

    // 当前页码，从1开始，默认为1
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小，默认为10
    @NameInMap("page_size")
    public Long pageSize;

    // 查询类型，支持精准查询、模糊查询、前缀模糊查询，这里默认为模糊查询；查询类型针对字段 app_name, app_group_name
    @NameInMap("query_type")
    public String queryType;

    public static QueryAppRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppRequest self = new QueryAppRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppRequest setAppGroupName(String appGroupName) {
        this.appGroupName = appGroupName;
        return this;
    }
    public String getAppGroupName() {
        return this.appGroupName;
    }

    public QueryAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryAppRequest setOrders(java.util.List<String> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<String> getOrders() {
        return this.orders;
    }

    public QueryAppRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryAppRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAppRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

}
