// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class InitClientConfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    //  
    @NameInMap("config")
    @Validation(required = true)
    public FairComputeClientConfig config;

    //  
    @NameInMap("extra")
    public String extra;

    public static InitClientConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        InitClientConfigRequest self = new InitClientConfigRequest();
        return TeaModel.build(map, self);
    }

    public InitClientConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitClientConfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitClientConfigRequest setConfig(FairComputeClientConfig config) {
        this.config = config;
        return this;
    }
    public FairComputeClientConfig getConfig() {
        return this.config;
    }

    public InitClientConfigRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

}
