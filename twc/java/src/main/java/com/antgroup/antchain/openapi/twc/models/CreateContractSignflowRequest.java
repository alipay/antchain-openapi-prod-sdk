// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractSignflowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 是否自动归档，默认false 如设置为true，则在流程开启后，当所有签署人签署完毕，系统自动将流程归档，状态变为“已完成”状态，在流程状态为“已完成”前，可随时添加签署人；如设置为false，则在调用流程开启后，需主动调用签署流程归档接口，将流程状态变更为“已完成”，归档前可随时添加签署人；已完成的流程才可下载签署后的文件
    @NameInMap("auto_archive")
    public Boolean autoArchive;

    // 是否强制代扣
    @NameInMap("auto_deduction_force")
    public Boolean autoDeductionForce;

    // 文件主题
    @NameInMap("business_scene")
    @Validation(required = true)
    public String businessScene;

    // 任务配置信息
    @NameInMap("contract_sign_flow_config")
    public ContractSignFlowConfig contractSignFlowConfig;

    // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
    @NameInMap("initiator_account_id")
    public String initiatorAccountId;

    // 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
    @NameInMap("initiator_authorized_account_id")
    public String initiatorAuthorizedAccountId;

    // 代扣规则详情
    @NameInMap("repayment_order_info")
    public java.util.List<RepaymentOrderRequest> repaymentOrderInfo;

    // 签署平台，ALIPAY（支付宝小程序）或H5
    @NameInMap("sign_platform")
    public String signPlatform;

    // 签署有效截止日期，毫秒，默认3天失效
    @NameInMap("sign_validity")
    public Long signValidity;

    //  付款方ID（个人）
    @NameInMap("payer_tuid")
    public String payerTuid;

    // 收款方ID(机构)
    @NameInMap("payee_tuid")
    public String payeeTuid;

    public static CreateContractSignflowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractSignflowRequest self = new CreateContractSignflowRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractSignflowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractSignflowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractSignflowRequest setAutoArchive(Boolean autoArchive) {
        this.autoArchive = autoArchive;
        return this;
    }
    public Boolean getAutoArchive() {
        return this.autoArchive;
    }

    public CreateContractSignflowRequest setAutoDeductionForce(Boolean autoDeductionForce) {
        this.autoDeductionForce = autoDeductionForce;
        return this;
    }
    public Boolean getAutoDeductionForce() {
        return this.autoDeductionForce;
    }

    public CreateContractSignflowRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public CreateContractSignflowRequest setContractSignFlowConfig(ContractSignFlowConfig contractSignFlowConfig) {
        this.contractSignFlowConfig = contractSignFlowConfig;
        return this;
    }
    public ContractSignFlowConfig getContractSignFlowConfig() {
        return this.contractSignFlowConfig;
    }

    public CreateContractSignflowRequest setInitiatorAccountId(String initiatorAccountId) {
        this.initiatorAccountId = initiatorAccountId;
        return this;
    }
    public String getInitiatorAccountId() {
        return this.initiatorAccountId;
    }

    public CreateContractSignflowRequest setInitiatorAuthorizedAccountId(String initiatorAuthorizedAccountId) {
        this.initiatorAuthorizedAccountId = initiatorAuthorizedAccountId;
        return this;
    }
    public String getInitiatorAuthorizedAccountId() {
        return this.initiatorAuthorizedAccountId;
    }

    public CreateContractSignflowRequest setRepaymentOrderInfo(java.util.List<RepaymentOrderRequest> repaymentOrderInfo) {
        this.repaymentOrderInfo = repaymentOrderInfo;
        return this;
    }
    public java.util.List<RepaymentOrderRequest> getRepaymentOrderInfo() {
        return this.repaymentOrderInfo;
    }

    public CreateContractSignflowRequest setSignPlatform(String signPlatform) {
        this.signPlatform = signPlatform;
        return this;
    }
    public String getSignPlatform() {
        return this.signPlatform;
    }

    public CreateContractSignflowRequest setSignValidity(Long signValidity) {
        this.signValidity = signValidity;
        return this;
    }
    public Long getSignValidity() {
        return this.signValidity;
    }

    public CreateContractSignflowRequest setPayerTuid(String payerTuid) {
        this.payerTuid = payerTuid;
        return this;
    }
    public String getPayerTuid() {
        return this.payerTuid;
    }

    public CreateContractSignflowRequest setPayeeTuid(String payeeTuid) {
        this.payeeTuid = payeeTuid;
        return this;
    }
    public String getPayeeTuid() {
        return this.payeeTuid;
    }

}
