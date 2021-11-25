// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class CreateContractHandsignfieldRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程id
    // 
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 签名参数
    @NameInMap("sign_fields")
    @Validation(required = true)
    public java.util.List<ContractHandSignFieldApplication> signFields;

    public static CreateContractHandsignfieldRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractHandsignfieldRequest self = new CreateContractHandsignfieldRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractHandsignfieldRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractHandsignfieldRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractHandsignfieldRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public CreateContractHandsignfieldRequest setSignFields(java.util.List<ContractHandSignFieldApplication> signFields) {
        this.signFields = signFields;
        return this;
    }
    public java.util.List<ContractHandSignFieldApplication> getSignFields() {
        return this.signFields;
    }

}
