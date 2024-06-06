// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class QuerySkyholdResRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 业务biz_code
    @NameInMap("biz_code")
    @Validation(required = true)
    public String bizCode;

    // 查询key
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    // 渠道code
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 客户id
    @NameInMap("customer_id")
    @Validation(required = true)
    public String customerId;

    // 授权码
    @NameInMap("auth_code")
    public String authCode;

    public static QuerySkyholdResRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySkyholdResRequest self = new QuerySkyholdResRequest();
        return TeaModel.build(map, self);
    }

    public QuerySkyholdResRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySkyholdResRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public QuerySkyholdResRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public QuerySkyholdResRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public QuerySkyholdResRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public QuerySkyholdResRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

}
