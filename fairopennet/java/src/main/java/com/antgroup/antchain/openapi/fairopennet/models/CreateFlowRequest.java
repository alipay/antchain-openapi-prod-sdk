// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class CreateFlowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    //  参与方的partyId
    @NameInMap("party_id")
    @Validation(required = true)
    public String partyId;

    // 静态工作流配置字符串
    @NameInMap("static_flow_config")
    @Validation(required = true)
    public String staticFlowConfig;

    public static CreateFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowRequest self = new CreateFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateFlowRequest setPartyId(String partyId) {
        this.partyId = partyId;
        return this;
    }
    public String getPartyId() {
        return this.partyId;
    }

    public CreateFlowRequest setStaticFlowConfig(String staticFlowConfig) {
        this.staticFlowConfig = staticFlowConfig;
        return this;
    }
    public String getStaticFlowConfig() {
        return this.staticFlowConfig;
    }

}
