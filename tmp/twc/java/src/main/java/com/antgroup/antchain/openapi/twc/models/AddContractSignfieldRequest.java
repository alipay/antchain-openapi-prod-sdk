// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class AddContractSignfieldRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签署流程ID
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 签署区列表数据
    @NameInMap("signfields")
    @Validation(required = true)
    public java.util.List<ContractSignFieldApplication> signfields;

    public static AddContractSignfieldRequest build(java.util.Map<String, ?> map) throws Exception {
        AddContractSignfieldRequest self = new AddContractSignfieldRequest();
        return TeaModel.build(map, self);
    }

    public AddContractSignfieldRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddContractSignfieldRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddContractSignfieldRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public AddContractSignfieldRequest setSignfields(java.util.List<ContractSignFieldApplication> signfields) {
        this.signfields = signfields;
        return this;
    }
    public java.util.List<ContractSignFieldApplication> getSignfields() {
        return this.signfields;
    }

}
