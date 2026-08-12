// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class QueryDocChildRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 文档id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 目录id
    @NameInMap("site_id")
    @Validation(required = true)
    public String siteId;

    public static QueryDocChildRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDocChildRequest self = new QueryDocChildRequest();
        return TeaModel.build(map, self);
    }

    public QueryDocChildRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDocChildRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryDocChildRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

}
