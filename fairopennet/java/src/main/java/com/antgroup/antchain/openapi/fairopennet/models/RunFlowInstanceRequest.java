// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class RunFlowInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    //  参与方的partyId
    @NameInMap("party_id")
    @Validation(required = true)
    public String partyId;

    // 动态工作流配置字符串
    @NameInMap("dynamic_flow_config")
    @Validation(required = true)
    public String dynamicFlowConfig;

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

    public RunFlowInstanceRequest setDynamicFlowConfig(String dynamicFlowConfig) {
        this.dynamicFlowConfig = dynamicFlowConfig;
        return this;
    }
    public String getDynamicFlowConfig() {
        return this.dynamicFlowConfig;
    }

}
