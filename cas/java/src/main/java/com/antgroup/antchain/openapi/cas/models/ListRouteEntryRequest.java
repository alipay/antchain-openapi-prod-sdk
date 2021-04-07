// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListRouteEntryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 所属地域
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 要查询的路由条目所属路由表的所属路由器的ID。
    @NameInMap("router_id")
    @Validation(required = true)
    public String routerId;

    public static ListRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRouteEntryRequest self = new ListRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public ListRouteEntryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListRouteEntryRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListRouteEntryRequest setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

}
