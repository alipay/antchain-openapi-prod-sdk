// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateInternalContractRequest extends TeaModel {
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

    // 存证阶段，分为INIT(发起)，SIGN(签署)，FINISH(结束)，DOCUMENT(正式合同文件)，DEDUCT_CANCEL(代扣计划取消)，DEDUCT_EXECUTION(代扣计划执行)，DEDUCT_PLAN(代扣计划保存)，DEDUCT_REFUND(代扣计划退款)
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

    // 电子合同代扣计划取消操作信息
    @NameInMap("cancel_info")
    public ContractNotaryDeductCancelInfo cancelInfo;

    // 电子合同存证代扣计划执行操作信息
    @NameInMap("execution_info")
    public ContractNotaryDeductExecutionInfo executionInfo;

    // 电子合同存证代扣计划信息
    @NameInMap("plan_info")
    public ContractNotaryDeductPlanInfo planInfo;

    // 电子合同存证代扣计划退款信息
    @NameInMap("refund_info")
    public ContractNotaryDeductRefundInfo refundInfo;

    public static CreateInternalContractRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInternalContractRequest self = new CreateInternalContractRequest();
        return TeaModel.build(map, self);
    }

    public CreateInternalContractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateInternalContractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateInternalContractRequest setFinishInfo(ContractNotaryFinishInfo finishInfo) {
        this.finishInfo = finishInfo;
        return this;
    }
    public ContractNotaryFinishInfo getFinishInfo() {
        return this.finishInfo;
    }

    public CreateInternalContractRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public CreateInternalContractRequest setInitInfo(ContractNotaryInitInfo initInfo) {
        this.initInfo = initInfo;
        return this;
    }
    public ContractNotaryInitInfo getInitInfo() {
        return this.initInfo;
    }

    public CreateInternalContractRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public CreateInternalContractRequest setSignInfo(ContractNotarySignInfo signInfo) {
        this.signInfo = signInfo;
        return this;
    }
    public ContractNotarySignInfo getSignInfo() {
        return this.signInfo;
    }

    public CreateInternalContractRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public CreateInternalContractRequest setDocumentInfo(ContractNotaryDocumentInfo documentInfo) {
        this.documentInfo = documentInfo;
        return this;
    }
    public ContractNotaryDocumentInfo getDocumentInfo() {
        return this.documentInfo;
    }

    public CreateInternalContractRequest setCancelInfo(ContractNotaryDeductCancelInfo cancelInfo) {
        this.cancelInfo = cancelInfo;
        return this;
    }
    public ContractNotaryDeductCancelInfo getCancelInfo() {
        return this.cancelInfo;
    }

    public CreateInternalContractRequest setExecutionInfo(ContractNotaryDeductExecutionInfo executionInfo) {
        this.executionInfo = executionInfo;
        return this;
    }
    public ContractNotaryDeductExecutionInfo getExecutionInfo() {
        return this.executionInfo;
    }

    public CreateInternalContractRequest setPlanInfo(ContractNotaryDeductPlanInfo planInfo) {
        this.planInfo = planInfo;
        return this;
    }
    public ContractNotaryDeductPlanInfo getPlanInfo() {
        return this.planInfo;
    }

    public CreateInternalContractRequest setRefundInfo(ContractNotaryDeductRefundInfo refundInfo) {
        this.refundInfo = refundInfo;
        return this;
    }
    public ContractNotaryDeductRefundInfo getRefundInfo() {
        return this.refundInfo;
    }

}
