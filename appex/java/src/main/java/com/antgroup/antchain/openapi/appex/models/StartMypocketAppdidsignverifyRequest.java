// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class StartMypocketAppdidsignverifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签名
    @NameInMap("did_sign")
    @Validation(required = true)
    public String didSign;

    // 签名原文
    @NameInMap("payload")
    @Validation(required = true)
    public String payload;

    // 分配的dapp id，uuid v4格式
    @NameInMap("dapp_id")
    @Validation(required = true)
    public String dappId;

    // epoch时间，毫秒
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    public static StartMypocketAppdidsignverifyRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMypocketAppdidsignverifyRequest self = new StartMypocketAppdidsignverifyRequest();
        return TeaModel.build(map, self);
    }

    public StartMypocketAppdidsignverifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartMypocketAppdidsignverifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartMypocketAppdidsignverifyRequest setDidSign(String didSign) {
        this.didSign = didSign;
        return this;
    }
    public String getDidSign() {
        return this.didSign;
    }

    public StartMypocketAppdidsignverifyRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public StartMypocketAppdidsignverifyRequest setDappId(String dappId) {
        this.dappId = dappId;
        return this;
    }
    public String getDappId() {
        return this.dappId;
    }

    public StartMypocketAppdidsignverifyRequest setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
