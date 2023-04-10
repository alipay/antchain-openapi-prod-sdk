// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class RunFlowInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    //  
    @NameInMap("party_id")
    @Validation(required = true)
    public String partyId;

    //  
    @NameInMap("config")
    @Validation(required = true)
    public DynamicFlowConfig config;

    public static RunFlowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RunFlowInstanceRequest self = new RunFlowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RunFlowInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RunFlowInstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RunFlowInstanceRequest setPartyId(String partyId) {
        this.partyId = partyId;
        return this;
    }
    public String getPartyId() {
        return this.partyId;
    }

    public RunFlowInstanceRequest setConfig(DynamicFlowConfig config) {
        this.config = config;
        return this;
    }
    public DynamicFlowConfig getConfig() {
        return this.config;
    }

}
