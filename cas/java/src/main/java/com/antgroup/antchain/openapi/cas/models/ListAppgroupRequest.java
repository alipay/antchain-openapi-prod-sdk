// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListAppgroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 动态查询
    @NameInMap("dynamic_query")
    public DynamicQuery dynamicQuery;

    // 应用分组查询
    @NameInMap("query")
    public AppDomainQuery query;

    public static ListAppgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppgroupRequest self = new ListAppgroupRequest();
        return TeaModel.build(map, self);
    }

    public ListAppgroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAppgroupRequest setDynamicQuery(DynamicQuery dynamicQuery) {
        this.dynamicQuery = dynamicQuery;
        return this;
    }
    public DynamicQuery getDynamicQuery() {
        return this.dynamicQuery;
    }

    public ListAppgroupRequest setQuery(AppDomainQuery query) {
        this.query = query;
        return this;
    }
    public AppDomainQuery getQuery() {
        return this.query;
    }

}
