// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class StartContractHandsignRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 代理商户账户
    @NameInMap("agent_account_id")
    public String agentAccountId;

    // 是否自动归档，默认为true
    @NameInMap("auto_archive")
    public Boolean autoArchive;

    // 合同文件主题
    @NameInMap("business_scene")
    @Validation(required = true)
    public String businessScene;

    // 文件到期前，提前多少小时回调提醒续签，小时（时间区间：1小时——15天），默认不提醒
    @NameInMap("contract_remind")
    public Long contractRemind;

    // 签署流程任务配置信息
    @NameInMap("contract_sign_flow_config")
    public ContractSignFlowConfig contractSignFlowConfig;

    // 文件有效截止日期,毫秒，默认不失效
    @NameInMap("contract_validity")
    public Long contractValidity;

    // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
    @NameInMap("initiator_account_id")
    public String initiatorAccountId;

    // 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
    // 
    // 
    @NameInMap("initiator_authorized_account_id")
    public String initiatorAuthorizedAccountId;

    // 代扣规则详情，不可为空
    @NameInMap("repayment_order_info")
    public java.util.List<RepaymentOrderRequest> repaymentOrderInfo;

    // 签署平台，ALIPAY（支付宝小程序）或H5，默认H5
    @NameInMap("sign_platform")
    public String signPlatform;

    // 签署有效截止日期,毫秒，默认不失效
    @NameInMap("sign_validity")
    public String signValidity;

    // 输入项填充内容，以key:value传入
    @NameInMap("simple_form_fields")
    @Validation(required = true)
    public String simpleFormFields;

    // 待签署的智能合同模板ID
    @NameInMap("template")
    @Validation(required = true)
    public String template;

    // 待签署客户的账户ID
    @NameInMap("user_account")
    @Validation(required = true)
    public String userAccount;

    // 是否需要短网址
    @NameInMap("short_url")
    public Boolean shortUrl;

    public static StartContractHandsignRequest build(java.util.Map<String, ?> map) throws Exception {
        StartContractHandsignRequest self = new StartContractHandsignRequest();
        return TeaModel.build(map, self);
    }

    public StartContractHandsignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartContractHandsignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartContractHandsignRequest setAgentAccountId(String agentAccountId) {
        this.agentAccountId = agentAccountId;
        return this;
    }
    public String getAgentAccountId() {
        return this.agentAccountId;
    }

    public StartContractHandsignRequest setAutoArchive(Boolean autoArchive) {
        this.autoArchive = autoArchive;
        return this;
    }
    public Boolean getAutoArchive() {
        return this.autoArchive;
    }

    public StartContractHandsignRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public StartContractHandsignRequest setContractRemind(Long contractRemind) {
        this.contractRemind = contractRemind;
        return this;
    }
    public Long getContractRemind() {
        return this.contractRemind;
    }

    public StartContractHandsignRequest setContractSignFlowConfig(ContractSignFlowConfig contractSignFlowConfig) {
        this.contractSignFlowConfig = contractSignFlowConfig;
        return this;
    }
    public ContractSignFlowConfig getContractSignFlowConfig() {
        return this.contractSignFlowConfig;
    }

    public StartContractHandsignRequest setContractValidity(Long contractValidity) {
        this.contractValidity = contractValidity;
        return this;
    }
    public Long getContractValidity() {
        return this.contractValidity;
    }

    public StartContractHandsignRequest setInitiatorAccountId(String initiatorAccountId) {
        this.initiatorAccountId = initiatorAccountId;
        return this;
    }
    public String getInitiatorAccountId() {
        return this.initiatorAccountId;
    }

    public StartContractHandsignRequest setInitiatorAuthorizedAccountId(String initiatorAuthorizedAccountId) {
        this.initiatorAuthorizedAccountId = initiatorAuthorizedAccountId;
        return this;
    }
    public String getInitiatorAuthorizedAccountId() {
        return this.initiatorAuthorizedAccountId;
    }

    public StartContractHandsignRequest setRepaymentOrderInfo(java.util.List<RepaymentOrderRequest> repaymentOrderInfo) {
        this.repaymentOrderInfo = repaymentOrderInfo;
        return this;
    }
    public java.util.List<RepaymentOrderRequest> getRepaymentOrderInfo() {
        return this.repaymentOrderInfo;
    }

    public StartContractHandsignRequest setSignPlatform(String signPlatform) {
        this.signPlatform = signPlatform;
        return this;
    }
    public String getSignPlatform() {
        return this.signPlatform;
    }

    public StartContractHandsignRequest setSignValidity(String signValidity) {
        this.signValidity = signValidity;
        return this;
    }
    public String getSignValidity() {
        return this.signValidity;
    }

    public StartContractHandsignRequest setSimpleFormFields(String simpleFormFields) {
        this.simpleFormFields = simpleFormFields;
        return this;
    }
    public String getSimpleFormFields() {
        return this.simpleFormFields;
    }

    public StartContractHandsignRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public StartContractHandsignRequest setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getUserAccount() {
        return this.userAccount;
    }

    public StartContractHandsignRequest setShortUrl(Boolean shortUrl) {
        this.shortUrl = shortUrl;
        return this;
    }
    public Boolean getShortUrl() {
        return this.shortUrl;
    }

}
