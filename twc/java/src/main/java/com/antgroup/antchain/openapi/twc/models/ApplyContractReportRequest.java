// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ApplyContractReportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签署文件存档阶段存证核验信息
    @NameInMap("document_info")
    public java.util.List<ContractNotaryDocumentInfo> documentInfo;

    // 签署结束阶段存证核验信息
    @NameInMap("finish_info")
    @Validation(required = true)
    public ContractNotaryFinishInfo finishInfo;

    // 签署流程ID
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 签署发起阶段存证核验信息
    @NameInMap("init_info")
    @Validation(required = true)
    public ContractNotaryInitInfo initInfo;

    // 签署过程阶段存证核验信息
    @NameInMap("sign_info")
    @Validation(required = true)
    public java.util.List<ContractNotarySignInfo> signInfo;

    // 存证事务ID
    @NameInMap("transaction_id")
    @Validation(required = true)
    public String transactionId;

    public static ApplyContractReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyContractReportRequest self = new ApplyContractReportRequest();
        return TeaModel.build(map, self);
    }

    public ApplyContractReportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyContractReportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyContractReportRequest setDocumentInfo(java.util.List<ContractNotaryDocumentInfo> documentInfo) {
        this.documentInfo = documentInfo;
        return this;
    }
    public java.util.List<ContractNotaryDocumentInfo> getDocumentInfo() {
        return this.documentInfo;
    }

    public ApplyContractReportRequest setFinishInfo(ContractNotaryFinishInfo finishInfo) {
        this.finishInfo = finishInfo;
        return this;
    }
    public ContractNotaryFinishInfo getFinishInfo() {
        return this.finishInfo;
    }

    public ApplyContractReportRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ApplyContractReportRequest setInitInfo(ContractNotaryInitInfo initInfo) {
        this.initInfo = initInfo;
        return this;
    }
    public ContractNotaryInitInfo getInitInfo() {
        return this.initInfo;
    }

    public ApplyContractReportRequest setSignInfo(java.util.List<ContractNotarySignInfo> signInfo) {
        this.signInfo = signInfo;
        return this;
    }
    public java.util.List<ContractNotarySignInfo> getSignInfo() {
        return this.signInfo;
    }

    public ApplyContractReportRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
