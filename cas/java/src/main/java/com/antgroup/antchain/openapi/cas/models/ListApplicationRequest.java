// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListApplicationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 动态查询
    @NameInMap("dynamic_query")
    public DynamicQuery dynamicQuery;

    // 应用查询
    @NameInMap("query")
    public AppQuery query;

    public static ListApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationRequest self = new ListApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListApplicationRequest setDynamicQuery(DynamicQuery dynamicQuery) {
        this.dynamicQuery = dynamicQuery;
        return this;
    }
    public DynamicQuery getDynamicQuery() {
        return this.dynamicQuery;
    }

    public ListApplicationRequest setQuery(AppQuery query) {
        this.query = query;
        return this;
    }
    public AppQuery getQuery() {
        return this.query;
    }

}
