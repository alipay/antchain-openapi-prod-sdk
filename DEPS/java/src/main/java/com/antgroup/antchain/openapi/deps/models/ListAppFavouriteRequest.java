// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListAppFavouriteRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 排序规则数组，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
    @NameInMap("orders")
    public java.util.List<String> orders;

    public static ListAppFavouriteRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppFavouriteRequest self = new ListAppFavouriteRequest();
        return TeaModel.build(map, self);
    }

    public ListAppFavouriteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAppFavouriteRequest setOrders(java.util.List<String> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<String> getOrders() {
        return this.orders;
    }

}
