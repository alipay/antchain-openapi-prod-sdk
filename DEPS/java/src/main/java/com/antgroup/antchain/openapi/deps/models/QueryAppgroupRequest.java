// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryAppgroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用分组名称
    @NameInMap("name")
    public String name;

    // 当前页码，默认为1
    @NameInMap("page_num")
    public Integer pageNum;

    // 分页大小，默认10
    @NameInMap("page_size")
    public Integer pageSize;

    // 租户名称
    @NameInMap("tenant")
    public String tenant;

    public static QueryAppgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppgroupRequest self = new QueryAppgroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppgroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppgroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryAppgroupRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryAppgroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAppgroupRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
