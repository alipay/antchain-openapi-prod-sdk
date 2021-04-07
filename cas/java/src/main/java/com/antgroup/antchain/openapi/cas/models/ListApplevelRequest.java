// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListApplevelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 动态查询
    @NameInMap("dynamic_query")
    public DynamicQuery dynamicQuery;

    // 应用分级查询
    @NameInMap("query")
    public AppLevelQuery query;

    public static ListApplevelRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplevelRequest self = new ListApplevelRequest();
        return TeaModel.build(map, self);
    }

    public ListApplevelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListApplevelRequest setDynamicQuery(DynamicQuery dynamicQuery) {
        this.dynamicQuery = dynamicQuery;
        return this;
    }
    public DynamicQuery getDynamicQuery() {
        return this.dynamicQuery;
    }

    public ListApplevelRequest setQuery(AppLevelQuery query) {
        this.query = query;
        return this;
    }
    public AppLevelQuery getQuery() {
        return this.query;
    }

}
