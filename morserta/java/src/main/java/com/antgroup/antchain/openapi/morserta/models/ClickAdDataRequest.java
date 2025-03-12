// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.morserta.models;

import com.aliyun.tea.*;

public class ClickAdDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 广告主id
    @NameInMap("account_id")
    @Validation(required = true)
    public Long accountId;

    // 渠道，支持TENCENT
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 点击明细json string
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static ClickAdDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ClickAdDataRequest self = new ClickAdDataRequest();
        return TeaModel.build(map, self);
    }

    public ClickAdDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ClickAdDataRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public ClickAdDataRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ClickAdDataRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
