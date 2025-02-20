// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractOnestepflowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 是否自动归档，默认false。
    @NameInMap("auto_archive")
    public Boolean autoArchive;

    // 是否自动开启，默认false。
    @NameInMap("auto_initiate")
    public Boolean autoInitiate;

    // 文件主题
    @NameInMap("business_scene")
    @Validation(required = true)
    public String businessScene;

    // 流程备注
    @NameInMap("comment")
    public String comment;

    // 任务配置信息
    @NameInMap("contract_sign_flow_config")
    public ContractSignFlowConfig contractSignFlowConfig;

    // 待签文档信息
    @NameInMap("docs")
    public java.util.List<ContractDoc> docs;

    // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
    @NameInMap("initiator_account_id")
    public String initiatorAccountId;

    // 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
    @NameInMap("initiator_authorized_account_id")
    public String initiatorAuthorizedAccountId;

    // 流程中的签署区信息
    @NameInMap("sign_fields")
    public java.util.List<OneStepSignField> signFields;

    // 签署平台，ALIPAY（支付宝小程序）或H5，默认H5
    @NameInMap("sign_platform")
    public String signPlatform;

    // 签署有效截止日期，毫秒，默认3天失效
    @NameInMap("sign_validity")
    public Long signValidity;

    // 是否合并签署，默认不是（false）
    @NameInMap("combine_sign_model")
    public Boolean combineSignModel;

    // 合并签署是否开启人脸识别(默认true-开启),非合并签署无需设值
    // 
    @NameInMap("need_face")
    public Boolean needFace;

    public static CreateContractOnestepflowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractOnestepflowRequest self = new CreateContractOnestepflowRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractOnestepflowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractOnestepflowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractOnestepflowRequest setAutoArchive(Boolean autoArchive) {
        this.autoArchive = autoArchive;
        return this;
    }
    public Boolean getAutoArchive() {
        return this.autoArchive;
    }

    public CreateContractOnestepflowRequest setAutoInitiate(Boolean autoInitiate) {
        this.autoInitiate = autoInitiate;
        return this;
    }
    public Boolean getAutoInitiate() {
        return this.autoInitiate;
    }

    public CreateContractOnestepflowRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public CreateContractOnestepflowRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateContractOnestepflowRequest setContractSignFlowConfig(ContractSignFlowConfig contractSignFlowConfig) {
        this.contractSignFlowConfig = contractSignFlowConfig;
        return this;
    }
    public ContractSignFlowConfig getContractSignFlowConfig() {
        return this.contractSignFlowConfig;
    }

    public CreateContractOnestepflowRequest setDocs(java.util.List<ContractDoc> docs) {
        this.docs = docs;
        return this;
    }
    public java.util.List<ContractDoc> getDocs() {
        return this.docs;
    }

    public CreateContractOnestepflowRequest setInitiatorAccountId(String initiatorAccountId) {
        this.initiatorAccountId = initiatorAccountId;
        return this;
    }
    public String getInitiatorAccountId() {
        return this.initiatorAccountId;
    }

    public CreateContractOnestepflowRequest setInitiatorAuthorizedAccountId(String initiatorAuthorizedAccountId) {
        this.initiatorAuthorizedAccountId = initiatorAuthorizedAccountId;
        return this;
    }
    public String getInitiatorAuthorizedAccountId() {
        return this.initiatorAuthorizedAccountId;
    }

    public CreateContractOnestepflowRequest setSignFields(java.util.List<OneStepSignField> signFields) {
        this.signFields = signFields;
        return this;
    }
    public java.util.List<OneStepSignField> getSignFields() {
        return this.signFields;
    }

    public CreateContractOnestepflowRequest setSignPlatform(String signPlatform) {
        this.signPlatform = signPlatform;
        return this;
    }
    public String getSignPlatform() {
        return this.signPlatform;
    }

    public CreateContractOnestepflowRequest setSignValidity(Long signValidity) {
        this.signValidity = signValidity;
        return this;
    }
    public Long getSignValidity() {
        return this.signValidity;
    }

    public CreateContractOnestepflowRequest setCombineSignModel(Boolean combineSignModel) {
        this.combineSignModel = combineSignModel;
        return this;
    }
    public Boolean getCombineSignModel() {
        return this.combineSignModel;
    }

    public CreateContractOnestepflowRequest setNeedFace(Boolean needFace) {
        this.needFace = needFace;
        return this;
    }
    public Boolean getNeedFace() {
        return this.needFace;
    }

}
