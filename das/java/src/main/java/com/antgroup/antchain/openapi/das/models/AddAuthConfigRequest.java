// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class AddAuthConfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 复用的场景码
    @NameInMap("parent_scene_code")
    public String parentSceneCode;

    // 数据源连接器空间id
    @NameInMap("source_space_id")
    @Validation(required = true)
    public String sourceSpaceId;

    // 被授权方企业信用代码
    @NameInMap("auth_enterprise_code")
    @Validation(required = true)
    public String authEnterpriseCode;

    // 被授权方名称
    @NameInMap("target_name")
    @Validation(required = true)
    public String targetName;

    // 业务应用名称
    @NameInMap("auth_app_name")
    @Validation(required = true)
    public String authAppName;

    // 客户应用logo的oss key
    @NameInMap("enterprise_logo")
    @Validation(required = true)
    public String enterpriseLogo;

    // 用途说明
    @NameInMap("auth_purpose")
    @Validation(required = true)
    public String authPurpose;

    // 授权描述
    @NameInMap("auth_desc")
    public String authDesc;

    // 授权形式
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // C端是否显示凭证数据
    @NameInMap("enable_show_proof_vc")
    public Boolean enableShowProofVc;

    // C端是否显示授权记录
    @NameInMap("enable_show_auth_record")
    public Boolean enableShowAuthRecord;

    // 授权服务产品列表
    @NameInMap("product_group_list")
    public java.util.List<AuthProductGroup> productGroupList;

    // 用户类型
    @NameInMap("user_type")
    public String userType;

    // 授权协议
    @NameInMap("agreement_list")
    public java.util.List<Agreement> agreementList;

    // 主题颜色
    @NameInMap("background_color")
    public String backgroundColor;

    // 使用刷脸识别
    @NameInMap("use_facial_recognition")
    public Boolean useFacialRecognition;

    // 页面使用范围列表
    @NameInMap("use_scope_list")
    public java.util.List<String> useScopeList;

    // 授权成功端内跳转地址
    @NameInMap("inner_success_callback_url")
    public String innerSuccessCallbackUrl;

    // 授权成功端外跳转地址
    @NameInMap("outside_success_callback_url")
    public String outsideSuccessCallbackUrl;

    // 公钥
    @NameInMap("public_key")
    public String publicKey;

    // 发起授权页面的链接
    @NameInMap("start_auth_url")
    public String startAuthUrl;

    public static AddAuthConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAuthConfigRequest self = new AddAuthConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddAuthConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddAuthConfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddAuthConfigRequest setParentSceneCode(String parentSceneCode) {
        this.parentSceneCode = parentSceneCode;
        return this;
    }
    public String getParentSceneCode() {
        return this.parentSceneCode;
    }

    public AddAuthConfigRequest setSourceSpaceId(String sourceSpaceId) {
        this.sourceSpaceId = sourceSpaceId;
        return this;
    }
    public String getSourceSpaceId() {
        return this.sourceSpaceId;
    }

    public AddAuthConfigRequest setAuthEnterpriseCode(String authEnterpriseCode) {
        this.authEnterpriseCode = authEnterpriseCode;
        return this;
    }
    public String getAuthEnterpriseCode() {
        return this.authEnterpriseCode;
    }

    public AddAuthConfigRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public AddAuthConfigRequest setAuthAppName(String authAppName) {
        this.authAppName = authAppName;
        return this;
    }
    public String getAuthAppName() {
        return this.authAppName;
    }

    public AddAuthConfigRequest setEnterpriseLogo(String enterpriseLogo) {
        this.enterpriseLogo = enterpriseLogo;
        return this;
    }
    public String getEnterpriseLogo() {
        return this.enterpriseLogo;
    }

    public AddAuthConfigRequest setAuthPurpose(String authPurpose) {
        this.authPurpose = authPurpose;
        return this;
    }
    public String getAuthPurpose() {
        return this.authPurpose;
    }

    public AddAuthConfigRequest setAuthDesc(String authDesc) {
        this.authDesc = authDesc;
        return this;
    }
    public String getAuthDesc() {
        return this.authDesc;
    }

    public AddAuthConfigRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public AddAuthConfigRequest setEnableShowProofVc(Boolean enableShowProofVc) {
        this.enableShowProofVc = enableShowProofVc;
        return this;
    }
    public Boolean getEnableShowProofVc() {
        return this.enableShowProofVc;
    }

    public AddAuthConfigRequest setEnableShowAuthRecord(Boolean enableShowAuthRecord) {
        this.enableShowAuthRecord = enableShowAuthRecord;
        return this;
    }
    public Boolean getEnableShowAuthRecord() {
        return this.enableShowAuthRecord;
    }

    public AddAuthConfigRequest setProductGroupList(java.util.List<AuthProductGroup> productGroupList) {
        this.productGroupList = productGroupList;
        return this;
    }
    public java.util.List<AuthProductGroup> getProductGroupList() {
        return this.productGroupList;
    }

    public AddAuthConfigRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public AddAuthConfigRequest setAgreementList(java.util.List<Agreement> agreementList) {
        this.agreementList = agreementList;
        return this;
    }
    public java.util.List<Agreement> getAgreementList() {
        return this.agreementList;
    }

    public AddAuthConfigRequest setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public AddAuthConfigRequest setUseFacialRecognition(Boolean useFacialRecognition) {
        this.useFacialRecognition = useFacialRecognition;
        return this;
    }
    public Boolean getUseFacialRecognition() {
        return this.useFacialRecognition;
    }

    public AddAuthConfigRequest setUseScopeList(java.util.List<String> useScopeList) {
        this.useScopeList = useScopeList;
        return this;
    }
    public java.util.List<String> getUseScopeList() {
        return this.useScopeList;
    }

    public AddAuthConfigRequest setInnerSuccessCallbackUrl(String innerSuccessCallbackUrl) {
        this.innerSuccessCallbackUrl = innerSuccessCallbackUrl;
        return this;
    }
    public String getInnerSuccessCallbackUrl() {
        return this.innerSuccessCallbackUrl;
    }

    public AddAuthConfigRequest setOutsideSuccessCallbackUrl(String outsideSuccessCallbackUrl) {
        this.outsideSuccessCallbackUrl = outsideSuccessCallbackUrl;
        return this;
    }
    public String getOutsideSuccessCallbackUrl() {
        return this.outsideSuccessCallbackUrl;
    }

    public AddAuthConfigRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public AddAuthConfigRequest setStartAuthUrl(String startAuthUrl) {
        this.startAuthUrl = startAuthUrl;
        return this;
    }
    public String getStartAuthUrl() {
        return this.startAuthUrl;
    }

}
