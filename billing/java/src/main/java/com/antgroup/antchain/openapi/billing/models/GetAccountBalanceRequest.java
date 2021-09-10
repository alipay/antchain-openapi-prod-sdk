// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class GetAccountBalanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 渠道来源： DEFAULT 官网 ANT_OPEN_SERVICE_MARKET 开放平-服务市场台 
    @NameInMap("from_channel")
    @Validation(required = true)
    public String fromChannel;

    // 租户id,外部用户唯一id，如蚂蚁通行证id
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    public static GetAccountBalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountBalanceRequest self = new GetAccountBalanceRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountBalanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAccountBalanceRequest setFromChannel(String fromChannel) {
        this.fromChannel = fromChannel;
        return this;
    }
    public String getFromChannel() {
        return this.fromChannel;
    }

    public GetAccountBalanceRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
