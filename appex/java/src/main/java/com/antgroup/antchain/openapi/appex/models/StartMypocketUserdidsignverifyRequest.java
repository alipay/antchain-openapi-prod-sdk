// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class StartMypocketUserdidsignverifyRequest extends TeaModel {
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

    // mychain did信息
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    // epoch时间，毫秒
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    public static StartMypocketUserdidsignverifyRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMypocketUserdidsignverifyRequest self = new StartMypocketUserdidsignverifyRequest();
        return TeaModel.build(map, self);
    }

    public StartMypocketUserdidsignverifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartMypocketUserdidsignverifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartMypocketUserdidsignverifyRequest setDidSign(String didSign) {
        this.didSign = didSign;
        return this;
    }
    public String getDidSign() {
        return this.didSign;
    }

    public StartMypocketUserdidsignverifyRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public StartMypocketUserdidsignverifyRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public StartMypocketUserdidsignverifyRequest setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
