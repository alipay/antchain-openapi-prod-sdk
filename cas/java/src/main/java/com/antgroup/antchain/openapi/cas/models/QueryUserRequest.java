// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 当前页码
    @NameInMap("current_page")
    public Long currentPage;

    // customer_id
    @NameInMap("customer_id")
    public String customerId;

    // 邮箱
    @NameInMap("email")
    public String email;

    // 用户ID
    @NameInMap("id")
    public String id;

    // is_locale_enabled
    @NameInMap("is_locale_enabled")
    public Boolean isLocaleEnabled;

    // local
    @NameInMap("local")
    public String local;

    // 登录名称
    @NameInMap("login_name")
    public String loginName;

    // 手机号
    @NameInMap("mobile")
    public String mobile;

    // 排序关键字列表
    @NameInMap("orders")
    public java.util.List<String> orders;

    // 每页个数
    @NameInMap("page_size")
    public Long pageSize;

    // 是否分页
    @NameInMap("paging")
    public Boolean paging;

    // 查询类型
    // 模糊查询 FUZZY
    // 精准查询 ACCURATE,
    //  前缀查询 START_WITH
    @NameInMap("query_type")
    public String queryType;

    // 实际名称
    @NameInMap("real_name")
    public String realName;

    // search
    @NameInMap("search")
    public Boolean search;

    // 账户类型
    // MASTER 主账号
    // OPERATOR 操作员
    // SERVICE 服务账号
    // STS_ACTOR 虚拟身份
    @NameInMap("type")
    public String type;

    // 账户类型列表
    @NameInMap("types")
    public java.util.List<String> types;

    public static QueryUserRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserRequest self = new QueryUserRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUserRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryUserRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public QueryUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public QueryUserRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryUserRequest setIsLocaleEnabled(Boolean isLocaleEnabled) {
        this.isLocaleEnabled = isLocaleEnabled;
        return this;
    }
    public Boolean getIsLocaleEnabled() {
        return this.isLocaleEnabled;
    }

    public QueryUserRequest setLocal(String local) {
        this.local = local;
        return this;
    }
    public String getLocal() {
        return this.local;
    }

    public QueryUserRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public QueryUserRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryUserRequest setOrders(java.util.List<String> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<String> getOrders() {
        return this.orders;
    }

    public QueryUserRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUserRequest setPaging(Boolean paging) {
        this.paging = paging;
        return this;
    }
    public Boolean getPaging() {
        return this.paging;
    }

    public QueryUserRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public QueryUserRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public QueryUserRequest setSearch(Boolean search) {
        this.search = search;
        return this;
    }
    public Boolean getSearch() {
        return this.search;
    }

    public QueryUserRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryUserRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

}
