// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractFlowRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 是否自动归档，默认false。如设置为true，则在调用签署流程开启(twc.notary.contract.flow.start)后，当所有签署人签署完毕，系统自动将流程归档，状态变为“已完成”状态，在流程状态为“已完成”前，可随时添加签署人；如设置为false，则在调用签署流程开启后，需主动调用签署流程归档接口，将流程状态变更为“已完成”，归档前可随时添加签署人；已完成的流程才可下载签署后的文件
    @NameInMap("auto_archive")
    public Boolean autoArchive;

    // 文件主题
    @NameInMap("business_scene")
    @Validation(required = true)
    public String businessScene;

    // 任务配置信息
    @NameInMap("config_info")
    public ContractSignFlowConfig configInfo;

    // 文件到期前，提前多久回调提醒续签，单位为小时，时间区间：1小时——15天（360小时），默认不提醒
    @NameInMap("contract_remind")
    public Long contractRemind;

    // 文件有效截止日期,毫秒，默认不失效
    @NameInMap("contract_validity")
    public Long contractValidity;

    // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
    @NameInMap("initiator_account_id")
    public String initiatorAccountId;

    // 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
    @NameInMap("initiator_authorized_account_id")
    public String initiatorAuthorizedAccountId;

    // 签署有效截止日期,毫秒，默认不失效
    @NameInMap("sign_validity")
    public Long signValidity;

    public static CreateContractFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractFlowRequest self = new CreateContractFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractFlowRequest setAutoArchive(Boolean autoArchive) {
        this.autoArchive = autoArchive;
        return this;
    }
    public Boolean getAutoArchive() {
        return this.autoArchive;
    }

    public CreateContractFlowRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public CreateContractFlowRequest setConfigInfo(ContractSignFlowConfig configInfo) {
        this.configInfo = configInfo;
        return this;
    }
    public ContractSignFlowConfig getConfigInfo() {
        return this.configInfo;
    }

    public CreateContractFlowRequest setContractRemind(Long contractRemind) {
        this.contractRemind = contractRemind;
        return this;
    }
    public Long getContractRemind() {
        return this.contractRemind;
    }

    public CreateContractFlowRequest setContractValidity(Long contractValidity) {
        this.contractValidity = contractValidity;
        return this;
    }
    public Long getContractValidity() {
        return this.contractValidity;
    }

    public CreateContractFlowRequest setInitiatorAccountId(String initiatorAccountId) {
        this.initiatorAccountId = initiatorAccountId;
        return this;
    }
    public String getInitiatorAccountId() {
        return this.initiatorAccountId;
    }

    public CreateContractFlowRequest setInitiatorAuthorizedAccountId(String initiatorAuthorizedAccountId) {
        this.initiatorAuthorizedAccountId = initiatorAuthorizedAccountId;
        return this;
    }
    public String getInitiatorAuthorizedAccountId() {
        return this.initiatorAuthorizedAccountId;
    }

    public CreateContractFlowRequest setSignValidity(Long signValidity) {
        this.signValidity = signValidity;
        return this;
    }
    public Long getSignValidity() {
        return this.signValidity;
    }

}
