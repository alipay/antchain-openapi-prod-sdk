// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class AddContractPlatformsignfieldsRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 签署区列表数据
    @NameInMap("signfields")
    @Validation(required = true)
    public ContractPlatformSignFieldApplication signfields;

    public static AddContractPlatformsignfieldsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddContractPlatformsignfieldsRequest self = new AddContractPlatformsignfieldsRequest();
        return TeaModel.build(map, self);
    }

    public AddContractPlatformsignfieldsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddContractPlatformsignfieldsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddContractPlatformsignfieldsRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public AddContractPlatformsignfieldsRequest setSignfields(ContractPlatformSignFieldApplication signfields) {
        this.signfields = signfields;
        return this;
    }
    public ContractPlatformSignFieldApplication getSignfields() {
        return this.signfields;
    }

}
