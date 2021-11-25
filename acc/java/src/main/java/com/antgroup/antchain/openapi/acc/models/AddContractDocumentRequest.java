// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class AddContractDocumentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待签署文件
    @NameInMap("docs")
    @Validation(required = true)
    public java.util.List<ContractDocument> docs;

    // 流程ID
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    public static AddContractDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        AddContractDocumentRequest self = new AddContractDocumentRequest();
        return TeaModel.build(map, self);
    }

    public AddContractDocumentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddContractDocumentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddContractDocumentRequest setDocs(java.util.List<ContractDocument> docs) {
        this.docs = docs;
        return this;
    }
    public java.util.List<ContractDocument> getDocs() {
        return this.docs;
    }

    public AddContractDocumentRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
