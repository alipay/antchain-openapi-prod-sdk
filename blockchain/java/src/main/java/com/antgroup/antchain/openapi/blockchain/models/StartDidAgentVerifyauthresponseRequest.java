// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidAgentVerifyauthresponseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // { __challenge":xxxx, //待签名的明文
    //  “expired”：xxxx,//签名有效时间 
    // “sign”：xxxx，//对上述字段进行的签名
    // }
    @NameInMap("auth_response")
    @Validation(required = true)
    public String authResponse;

    // 待验证的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartDidAgentVerifyauthresponseRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidAgentVerifyauthresponseRequest self = new StartDidAgentVerifyauthresponseRequest();
        return TeaModel.build(map, self);
    }

    public StartDidAgentVerifyauthresponseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidAgentVerifyauthresponseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidAgentVerifyauthresponseRequest setAuthResponse(String authResponse) {
        this.authResponse = authResponse;
        return this;
    }
    public String getAuthResponse() {
        return this.authResponse;
    }

    public StartDidAgentVerifyauthresponseRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartDidAgentVerifyauthresponseRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
