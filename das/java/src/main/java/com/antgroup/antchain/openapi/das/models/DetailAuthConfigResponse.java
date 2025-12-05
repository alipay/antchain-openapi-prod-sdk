// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class DetailAuthConfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授权状态
    @NameInMap("auth_status")
    public Boolean authStatus;

    // 场景码
    @NameInMap("scene_code")
    public String sceneCode;

    // 发起授权页面的url链接
    @NameInMap("start_auth_url")
    public String startAuthUrl;

    // 数据源连接器空间id
    @NameInMap("source_space_id")
    public String sourceSpaceId;

    // 公钥
    @NameInMap("public_key")
    public String publicKey;

    // 被授权方企业信用代码
    @NameInMap("enterprise_code")
    public String enterpriseCode;

    // 主题颜色
    @NameInMap("background_color")
    public String backgroundColor;

    // 接入方企业名称
    @NameInMap("target_name")
    public String targetName;

    // 被授权应用名称
    @NameInMap("auth_app_name")
    public String authAppName;

    // 已授权数量
    @NameInMap("have_authed_count")
    public Long haveAuthedCount;

    // 公司logo
    @NameInMap("enterprise_logo")
    public String enterpriseLogo;

    // 已取消授权数量
    @NameInMap("cancel_auth_count")
    public Long cancelAuthCount;

    // 公司logo访问链接
    @NameInMap("enterprise_logo_url")
    public String enterpriseLogoUrl;

    // 用途说明
    @NameInMap("auth_purpose")
    public String authPurpose;

    // 场景描述
    @NameInMap("auth_desc")
    public String authDesc;

    // 授权类型
    @NameInMap("auth_type")
    public String authType;

    // 用户类型
    @NameInMap("user_type")
    public String userType;

    // 页面使用范围列表
    @NameInMap("use_scope_list")
    public java.util.List<String> useScopeList;

    // 授权内容列表
    @NameInMap("auth_content_list")
    public java.util.List<AuthContent> authContentList;

    // 协议列表
    @NameInMap("agreement_list")
    public java.util.List<Agreement> agreementList;

    // 是否使用人脸识别
    @NameInMap("use_facial_recognition")
    public Boolean useFacialRecognition;

    // C端是否显示凭证数据
    @NameInMap("enable_show_proof_vc")
    public Boolean enableShowProofVc;

    // C端是否显示授权记录
    @NameInMap("enable_show_auth_record")
    public Boolean enableShowAuthRecord;

    // 授权成功端内跳转地址
    @NameInMap("inner_success_callback_url")
    public String innerSuccessCallbackUrl;

    // 授权成功端外跳转地址
    @NameInMap("outside_success_callback_url")
    public String outsideSuccessCallbackUrl;

    public static DetailAuthConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailAuthConfigResponse self = new DetailAuthConfigResponse();
        return TeaModel.build(map, self);
    }

    public DetailAuthConfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailAuthConfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailAuthConfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailAuthConfigResponse setAuthStatus(Boolean authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public Boolean getAuthStatus() {
        return this.authStatus;
    }

    public DetailAuthConfigResponse setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public DetailAuthConfigResponse setStartAuthUrl(String startAuthUrl) {
        this.startAuthUrl = startAuthUrl;
        return this;
    }
    public String getStartAuthUrl() {
        return this.startAuthUrl;
    }

    public DetailAuthConfigResponse setSourceSpaceId(String sourceSpaceId) {
        this.sourceSpaceId = sourceSpaceId;
        return this;
    }
    public String getSourceSpaceId() {
        return this.sourceSpaceId;
    }

    public DetailAuthConfigResponse setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public DetailAuthConfigResponse setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
        return this;
    }
    public String getEnterpriseCode() {
        return this.enterpriseCode;
    }

    public DetailAuthConfigResponse setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public DetailAuthConfigResponse setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public DetailAuthConfigResponse setAuthAppName(String authAppName) {
        this.authAppName = authAppName;
        return this;
    }
    public String getAuthAppName() {
        return this.authAppName;
    }

    public DetailAuthConfigResponse setHaveAuthedCount(Long haveAuthedCount) {
        this.haveAuthedCount = haveAuthedCount;
        return this;
    }
    public Long getHaveAuthedCount() {
        return this.haveAuthedCount;
    }

    public DetailAuthConfigResponse setEnterpriseLogo(String enterpriseLogo) {
        this.enterpriseLogo = enterpriseLogo;
        return this;
    }
    public String getEnterpriseLogo() {
        return this.enterpriseLogo;
    }

    public DetailAuthConfigResponse setCancelAuthCount(Long cancelAuthCount) {
        this.cancelAuthCount = cancelAuthCount;
        return this;
    }
    public Long getCancelAuthCount() {
        return this.cancelAuthCount;
    }

    public DetailAuthConfigResponse setEnterpriseLogoUrl(String enterpriseLogoUrl) {
        this.enterpriseLogoUrl = enterpriseLogoUrl;
        return this;
    }
    public String getEnterpriseLogoUrl() {
        return this.enterpriseLogoUrl;
    }

    public DetailAuthConfigResponse setAuthPurpose(String authPurpose) {
        this.authPurpose = authPurpose;
        return this;
    }
    public String getAuthPurpose() {
        return this.authPurpose;
    }

    public DetailAuthConfigResponse setAuthDesc(String authDesc) {
        this.authDesc = authDesc;
        return this;
    }
    public String getAuthDesc() {
        return this.authDesc;
    }

    public DetailAuthConfigResponse setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public DetailAuthConfigResponse setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public DetailAuthConfigResponse setUseScopeList(java.util.List<String> useScopeList) {
        this.useScopeList = useScopeList;
        return this;
    }
    public java.util.List<String> getUseScopeList() {
        return this.useScopeList;
    }

    public DetailAuthConfigResponse setAuthContentList(java.util.List<AuthContent> authContentList) {
        this.authContentList = authContentList;
        return this;
    }
    public java.util.List<AuthContent> getAuthContentList() {
        return this.authContentList;
    }

    public DetailAuthConfigResponse setAgreementList(java.util.List<Agreement> agreementList) {
        this.agreementList = agreementList;
        return this;
    }
    public java.util.List<Agreement> getAgreementList() {
        return this.agreementList;
    }

    public DetailAuthConfigResponse setUseFacialRecognition(Boolean useFacialRecognition) {
        this.useFacialRecognition = useFacialRecognition;
        return this;
    }
    public Boolean getUseFacialRecognition() {
        return this.useFacialRecognition;
    }

    public DetailAuthConfigResponse setEnableShowProofVc(Boolean enableShowProofVc) {
        this.enableShowProofVc = enableShowProofVc;
        return this;
    }
    public Boolean getEnableShowProofVc() {
        return this.enableShowProofVc;
    }

    public DetailAuthConfigResponse setEnableShowAuthRecord(Boolean enableShowAuthRecord) {
        this.enableShowAuthRecord = enableShowAuthRecord;
        return this;
    }
    public Boolean getEnableShowAuthRecord() {
        return this.enableShowAuthRecord;
    }

    public DetailAuthConfigResponse setInnerSuccessCallbackUrl(String innerSuccessCallbackUrl) {
        this.innerSuccessCallbackUrl = innerSuccessCallbackUrl;
        return this;
    }
    public String getInnerSuccessCallbackUrl() {
        return this.innerSuccessCallbackUrl;
    }

    public DetailAuthConfigResponse setOutsideSuccessCallbackUrl(String outsideSuccessCallbackUrl) {
        this.outsideSuccessCallbackUrl = outsideSuccessCallbackUrl;
        return this;
    }
    public String getOutsideSuccessCallbackUrl() {
        return this.outsideSuccessCallbackUrl;
    }

}
