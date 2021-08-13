// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class AddIpAccountsettlementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 版权方id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 要开通的渠道
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    public static AddIpAccountsettlementRequest build(java.util.Map<String, ?> map) throws Exception {
        AddIpAccountsettlementRequest self = new AddIpAccountsettlementRequest();
        return TeaModel.build(map, self);
    }

    public AddIpAccountsettlementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddIpAccountsettlementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddIpAccountsettlementRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public AddIpAccountsettlementRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public AddIpAccountsettlementRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

}
