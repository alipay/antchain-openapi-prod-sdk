// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateEcocontractTextRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签署结束信息，phase为FINISH时必选
    @NameInMap("finish_info")
    public ContractNotaryFinishInfo finishInfo;

    // 签署流程ID
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 签署发起信息，phase为INIT时必选
    @NameInMap("init_info")
    public ContractNotaryInitInfo initInfo;

    // 存证阶段，分为INIT(发起)，SIGN(签署)，FINISH(结束)
    @NameInMap("phase")
    @Validation(required = true)
    public String phase;

    // 签署过程信息，phase为SIGN时必选
    @NameInMap("sign_info")
    public ContractNotarySignInfo signInfo;

    // 存证事务ID
    @NameInMap("transaction_id")
    @Validation(required = true)
    public String transactionId;

    // 签署文件存档阶段存证核验信息
    @NameInMap("document_info")
    public ContractNotaryDocumentInfo documentInfo;

    public static CreateEcocontractTextRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEcocontractTextRequest self = new CreateEcocontractTextRequest();
        return TeaModel.build(map, self);
    }

    public CreateEcocontractTextRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateEcocontractTextRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateEcocontractTextRequest setFinishInfo(ContractNotaryFinishInfo finishInfo) {
        this.finishInfo = finishInfo;
        return this;
    }
    public ContractNotaryFinishInfo getFinishInfo() {
        return this.finishInfo;
    }

    public CreateEcocontractTextRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public CreateEcocontractTextRequest setInitInfo(ContractNotaryInitInfo initInfo) {
        this.initInfo = initInfo;
        return this;
    }
    public ContractNotaryInitInfo getInitInfo() {
        return this.initInfo;
    }

    public CreateEcocontractTextRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public CreateEcocontractTextRequest setSignInfo(ContractNotarySignInfo signInfo) {
        this.signInfo = signInfo;
        return this;
    }
    public ContractNotarySignInfo getSignInfo() {
        return this.signInfo;
    }

    public CreateEcocontractTextRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public CreateEcocontractTextRequest setDocumentInfo(ContractNotaryDocumentInfo documentInfo) {
        this.documentInfo = documentInfo;
        return this;
    }
    public ContractNotaryDocumentInfo getDocumentInfo() {
        return this.documentInfo;
    }

}
