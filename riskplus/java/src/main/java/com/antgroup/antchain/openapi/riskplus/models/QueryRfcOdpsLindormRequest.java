// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRfcOdpsLindormRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 服务编码
    @NameInMap("biz_code")
    @Validation(required = true)
    public String bizCode;

    // 加密后的唯一id
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    // 渠道code
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 授权码
    @NameInMap("auth_code")
    public String authCode;

    // 加密方式
    @NameInMap("encrypt_type")
    public String encryptType;

    public static QueryRfcOdpsLindormRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRfcOdpsLindormRequest self = new QueryRfcOdpsLindormRequest();
        return TeaModel.build(map, self);
    }

    public QueryRfcOdpsLindormRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRfcOdpsLindormRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRfcOdpsLindormRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public QueryRfcOdpsLindormRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public QueryRfcOdpsLindormRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public QueryRfcOdpsLindormRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public QueryRfcOdpsLindormRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

}
