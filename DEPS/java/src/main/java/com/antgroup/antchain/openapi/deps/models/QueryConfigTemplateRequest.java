// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryConfigTemplateRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用名称
    @NameInMap("app_name")
    public String appName;

    // 排序规则数组，默认为 UTC_MODIFIED_DESC，即 根据修改时间降序排序
    @NameInMap("orders")
    public java.util.List<String> orders;

    // 当前页码，从1开始，默认为1
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小，默认为10
    @NameInMap("page_size")
    public Long pageSize;

    // 查询类型，支持精准查询、模糊查询、前缀模糊查询，这里默认为模糊查询；查询类型针对字段 app_name
    @NameInMap("query_type")
    public String queryType;

    // 模板状态，DRAFT 草稿，RELEASE 已发布，发布后才会生成 version，否则为空
    @NameInMap("state")
    public String state;

    // 版本
    @NameInMap("tpl_version")
    public String tplVersion;

    public static QueryConfigTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigTemplateRequest self = new QueryConfigTemplateRequest();
        return TeaModel.build(map, self);
    }

    public QueryConfigTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryConfigTemplateRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryConfigTemplateRequest setOrders(java.util.List<String> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<String> getOrders() {
        return this.orders;
    }

    public QueryConfigTemplateRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryConfigTemplateRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryConfigTemplateRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public QueryConfigTemplateRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public QueryConfigTemplateRequest setTplVersion(String tplVersion) {
        this.tplVersion = tplVersion;
        return this;
    }
    public String getTplVersion() {
        return this.tplVersion;
    }

}
