// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractEhandsignfieldRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 签署区列表数据
    @NameInMap("sign_fields")
    @Validation(required = true)
    public java.util.List<ContractEHandSignFieldApplication> signFields;

    public static CreateContractEhandsignfieldRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractEhandsignfieldRequest self = new CreateContractEhandsignfieldRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractEhandsignfieldRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractEhandsignfieldRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractEhandsignfieldRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public CreateContractEhandsignfieldRequest setSignFields(java.util.List<ContractEHandSignFieldApplication> signFields) {
        this.signFields = signFields;
        return this;
    }
    public java.util.List<ContractEHandSignFieldApplication> getSignFields() {
        return this.signFields;
    }

}
