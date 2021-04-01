// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartMydidcommunAgencyProcessauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 处理人did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 处理授权的原始请求流
    @NameInMap("request_raw")
    @Validation(required = true)
    public String requestRaw;

    public static StartMydidcommunAgencyProcessauthRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMydidcommunAgencyProcessauthRequest self = new StartMydidcommunAgencyProcessauthRequest();
        return TeaModel.build(map, self);
    }

    public StartMydidcommunAgencyProcessauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartMydidcommunAgencyProcessauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartMydidcommunAgencyProcessauthRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartMydidcommunAgencyProcessauthRequest setRequestRaw(String requestRaw) {
        this.requestRaw = requestRaw;
        return this;
    }
    public String getRequestRaw() {
        return this.requestRaw;
    }

}
