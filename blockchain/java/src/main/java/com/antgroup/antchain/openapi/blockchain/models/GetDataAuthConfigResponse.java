// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetDataAuthConfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 场景码
    @NameInMap("scene_code")
    public String sceneCode;

    // 数据源连接器空间id
    @NameInMap("source_space_id")
    public String sourceSpaceId;

    // 被授权方企业信用代码
    @NameInMap("enterprise_code")
    public String enterpriseCode;

    // 接入方客户名称
    @NameInMap("target_name")
    public String targetName;

    // 被授权应用名称
    @NameInMap("auth_app_name")
    public String authAppName;

    // 客户应用logo
    @NameInMap("enterprise_logo")
    public String enterpriseLogo;

    // 客户应用logo访问链接
    @NameInMap("enterprise_logo_url")
    public String enterpriseLogoUrl;

    // 用途说明
    @NameInMap("auth_purpose")
    public String authPurpose;

    // 场景描述
    @NameInMap("auth_desc")
    public String authDesc;

    // 授权形式
    @NameInMap("auth_type")
    public String authType;

    // 用户表示类型
    @NameInMap("user_type")
    public String userType;

    // 使用刷脸识别
    @NameInMap("use_facial_recognition")
    public Boolean useFacialRecognition;

    // 授权服务产品列表
    @NameInMap("auth_product_list")
    public java.util.List<AuthProduct> authProductList;

    // 协议模板列表
    @NameInMap("agreement_list")
    public java.util.List<Agreement> agreementList;

    // 背景颜色
    @NameInMap("background_color")
    public String backgroundColor;

    // 授权页面使用范围
    @NameInMap("use_scope_list")
    public java.util.List<String> useScopeList;

    // 场景授权状态
    @NameInMap("auth_status")
    public Boolean authStatus;

    // c端发起授权页面的url链接
    @NameInMap("start_auth_url")
    public String startAuthUrl;

    // C端是否显示凭证数据
    @NameInMap("enable_show_proof_vc")
    public Boolean enableShowProofVc;

    // C端是否显示授权记录
    @NameInMap("enable_show_auth_record")
    public Boolean enableShowAuthRecord;

    // 授权成功端内跳回页的url链接
    @NameInMap("inner_success_callback_url")
    public String innerSuccessCallbackUrl;

    // 授权成功端外跳回页的url链接
    @NameInMap("outside_success_callback_url")
    public String outsideSuccessCallbackUrl;

    // 待授权数量
    @NameInMap("pending_auth_count")
    public Long pendingAuthCount;

    // 已授权数量
    @NameInMap("have_authed_count")
    public Long haveAuthedCount;

    // 已取消授权数量
    @NameInMap("cancel_auth_count")
    public Long cancelAuthCount;

    // 授权成功率
    @NameInMap("success_rate")
    public Long successRate;

    public static GetDataAuthConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataAuthConfigResponse self = new GetDataAuthConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetDataAuthConfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetDataAuthConfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDataAuthConfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetDataAuthConfigResponse setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public GetDataAuthConfigResponse setSourceSpaceId(String sourceSpaceId) {
        this.sourceSpaceId = sourceSpaceId;
        return this;
    }
    public String getSourceSpaceId() {
        return this.sourceSpaceId;
    }

    public GetDataAuthConfigResponse setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
        return this;
    }
    public String getEnterpriseCode() {
        return this.enterpriseCode;
    }

    public GetDataAuthConfigResponse setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public GetDataAuthConfigResponse setAuthAppName(String authAppName) {
        this.authAppName = authAppName;
        return this;
    }
    public String getAuthAppName() {
        return this.authAppName;
    }

    public GetDataAuthConfigResponse setEnterpriseLogo(String enterpriseLogo) {
        this.enterpriseLogo = enterpriseLogo;
        return this;
    }
    public String getEnterpriseLogo() {
        return this.enterpriseLogo;
    }

    public GetDataAuthConfigResponse setEnterpriseLogoUrl(String enterpriseLogoUrl) {
        this.enterpriseLogoUrl = enterpriseLogoUrl;
        return this;
    }
    public String getEnterpriseLogoUrl() {
        return this.enterpriseLogoUrl;
    }

    public GetDataAuthConfigResponse setAuthPurpose(String authPurpose) {
        this.authPurpose = authPurpose;
        return this;
    }
    public String getAuthPurpose() {
        return this.authPurpose;
    }

    public GetDataAuthConfigResponse setAuthDesc(String authDesc) {
        this.authDesc = authDesc;
        return this;
    }
    public String getAuthDesc() {
        return this.authDesc;
    }

    public GetDataAuthConfigResponse setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public GetDataAuthConfigResponse setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public GetDataAuthConfigResponse setUseFacialRecognition(Boolean useFacialRecognition) {
        this.useFacialRecognition = useFacialRecognition;
        return this;
    }
    public Boolean getUseFacialRecognition() {
        return this.useFacialRecognition;
    }

    public GetDataAuthConfigResponse setAuthProductList(java.util.List<AuthProduct> authProductList) {
        this.authProductList = authProductList;
        return this;
    }
    public java.util.List<AuthProduct> getAuthProductList() {
        return this.authProductList;
    }

    public GetDataAuthConfigResponse setAgreementList(java.util.List<Agreement> agreementList) {
        this.agreementList = agreementList;
        return this;
    }
    public java.util.List<Agreement> getAgreementList() {
        return this.agreementList;
    }

    public GetDataAuthConfigResponse setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public GetDataAuthConfigResponse setUseScopeList(java.util.List<String> useScopeList) {
        this.useScopeList = useScopeList;
        return this;
    }
    public java.util.List<String> getUseScopeList() {
        return this.useScopeList;
    }

    public GetDataAuthConfigResponse setAuthStatus(Boolean authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public Boolean getAuthStatus() {
        return this.authStatus;
    }

    public GetDataAuthConfigResponse setStartAuthUrl(String startAuthUrl) {
        this.startAuthUrl = startAuthUrl;
        return this;
    }
    public String getStartAuthUrl() {
        return this.startAuthUrl;
    }

    public GetDataAuthConfigResponse setEnableShowProofVc(Boolean enableShowProofVc) {
        this.enableShowProofVc = enableShowProofVc;
        return this;
    }
    public Boolean getEnableShowProofVc() {
        return this.enableShowProofVc;
    }

    public GetDataAuthConfigResponse setEnableShowAuthRecord(Boolean enableShowAuthRecord) {
        this.enableShowAuthRecord = enableShowAuthRecord;
        return this;
    }
    public Boolean getEnableShowAuthRecord() {
        return this.enableShowAuthRecord;
    }

    public GetDataAuthConfigResponse setInnerSuccessCallbackUrl(String innerSuccessCallbackUrl) {
        this.innerSuccessCallbackUrl = innerSuccessCallbackUrl;
        return this;
    }
    public String getInnerSuccessCallbackUrl() {
        return this.innerSuccessCallbackUrl;
    }

    public GetDataAuthConfigResponse setOutsideSuccessCallbackUrl(String outsideSuccessCallbackUrl) {
        this.outsideSuccessCallbackUrl = outsideSuccessCallbackUrl;
        return this;
    }
    public String getOutsideSuccessCallbackUrl() {
        return this.outsideSuccessCallbackUrl;
    }

    public GetDataAuthConfigResponse setPendingAuthCount(Long pendingAuthCount) {
        this.pendingAuthCount = pendingAuthCount;
        return this;
    }
    public Long getPendingAuthCount() {
        return this.pendingAuthCount;
    }

    public GetDataAuthConfigResponse setHaveAuthedCount(Long haveAuthedCount) {
        this.haveAuthedCount = haveAuthedCount;
        return this;
    }
    public Long getHaveAuthedCount() {
        return this.haveAuthedCount;
    }

    public GetDataAuthConfigResponse setCancelAuthCount(Long cancelAuthCount) {
        this.cancelAuthCount = cancelAuthCount;
        return this;
    }
    public Long getCancelAuthCount() {
        return this.cancelAuthCount;
    }

    public GetDataAuthConfigResponse setSuccessRate(Long successRate) {
        this.successRate = successRate;
        return this;
    }
    public Long getSuccessRate() {
        return this.successRate;
    }

}
