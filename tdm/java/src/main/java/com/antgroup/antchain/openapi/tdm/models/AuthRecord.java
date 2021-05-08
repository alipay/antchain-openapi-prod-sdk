// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class AuthRecord extends TeaModel {
    // 被授权租户名称：
    // 身份证号/统一社会组织机构信用码
    @NameInMap("authorized_name")
    @Validation(required = true)
    public String authorizedName;

    // 授权协议规则
    @NameInMap("auth_agreement")
    @Validation(required = true)
    public AuthAgreement authAgreement;

    // 授权码
    // 
    // 
    @NameInMap("auth_code")
    @Validation(required = true)
    public String authCode;

    // 授权时间	
    // 
    @NameInMap("auth_date")
    @Validation(required = true)
    public String authDate;

    // 授权有效状态：
    // 1、生效中、
    // 0、失效
    // 
    // 
    @NameInMap("auth_status")
    @Validation(required = true)
    public String authStatus;

    // 链的信息
    @NameInMap("chain_info")
    @Validation(required = true)
    public ChainInfo chainInfo;

    // 授权租户身份ID：
    // 身份证号/统一社会组织机构信用码
    @NameInMap("data_owner_identity")
    @Validation(required = true)
    public String dataOwnerIdentity;

    // 授权用户名称
    @NameInMap("data_owner_name")
    @Validation(required = true)
    public String dataOwnerName;

    // 扩展字段，与target_name拼成可见的授权详情name
    // 
    // 
    @NameInMap("extend_params")
    @Validation(required = true)
    public String extendParams;

    // 标的物名称
    // 
    // 
    @NameInMap("target_name")
    @Validation(required = true)
    public String targetName;

    // 授权可信数据
    @NameInMap("tee_data")
    public String teeData;

    public static AuthRecord build(java.util.Map<String, ?> map) throws Exception {
        AuthRecord self = new AuthRecord();
        return TeaModel.build(map, self);
    }

    public AuthRecord setAuthorizedName(String authorizedName) {
        this.authorizedName = authorizedName;
        return this;
    }
    public String getAuthorizedName() {
        return this.authorizedName;
    }

    public AuthRecord setAuthAgreement(AuthAgreement authAgreement) {
        this.authAgreement = authAgreement;
        return this;
    }
    public AuthAgreement getAuthAgreement() {
        return this.authAgreement;
    }

    public AuthRecord setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public AuthRecord setAuthDate(String authDate) {
        this.authDate = authDate;
        return this;
    }
    public String getAuthDate() {
        return this.authDate;
    }

    public AuthRecord setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public String getAuthStatus() {
        return this.authStatus;
    }

    public AuthRecord setChainInfo(ChainInfo chainInfo) {
        this.chainInfo = chainInfo;
        return this;
    }
    public ChainInfo getChainInfo() {
        return this.chainInfo;
    }

    public AuthRecord setDataOwnerIdentity(String dataOwnerIdentity) {
        this.dataOwnerIdentity = dataOwnerIdentity;
        return this;
    }
    public String getDataOwnerIdentity() {
        return this.dataOwnerIdentity;
    }

    public AuthRecord setDataOwnerName(String dataOwnerName) {
        this.dataOwnerName = dataOwnerName;
        return this;
    }
    public String getDataOwnerName() {
        return this.dataOwnerName;
    }

    public AuthRecord setExtendParams(String extendParams) {
        this.extendParams = extendParams;
        return this;
    }
    public String getExtendParams() {
        return this.extendParams;
    }

    public AuthRecord setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public AuthRecord setTeeData(String teeData) {
        this.teeData = teeData;
        return this;
    }
    public String getTeeData() {
        return this.teeData;
    }

}
