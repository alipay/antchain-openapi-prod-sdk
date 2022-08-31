// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class DeleteContractSignfieldRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签署流程id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 删除签署区id列表
    @NameInMap("delete_signfields")
    @Validation(required = true)
    public java.util.List<String> deleteSignfields;

    public static DeleteContractSignfieldRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContractSignfieldRequest self = new DeleteContractSignfieldRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContractSignfieldRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteContractSignfieldRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteContractSignfieldRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public DeleteContractSignfieldRequest setDeleteSignfields(java.util.List<String> deleteSignfields) {
        this.deleteSignfields = deleteSignfields;
        return this;
    }
    public java.util.List<String> getDeleteSignfields() {
        return this.deleteSignfields;
    }

}
