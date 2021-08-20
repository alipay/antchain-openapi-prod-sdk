// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class AuthDasSmsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 手机验证码
    @NameInMap("verification_code")
    @Validation(required = true)
    public String verificationCode;

    // 授权实例ID
    @NameInMap("auth_instance_id")
    @Validation(required = true)
    public String authInstanceId;

    // 被授权企业接入应用ID
    @NameInMap("be_authed_person_app_id")
    @Validation(required = true)
    public String beAuthedPersonAppId;

    // 授权企业信息
    @NameInMap("auth_person_enterprise_info")
    public AuthPersonEnterpriseInfo authPersonEnterpriseInfo;

    // 授权人个人信息
    @NameInMap("auth_person_individual_info")
    public AuthPersonIndividualInfo authPersonIndividualInfo;

    public static AuthDasSmsRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthDasSmsRequest self = new AuthDasSmsRequest();
        return TeaModel.build(map, self);
    }

    public AuthDasSmsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthDasSmsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthDasSmsRequest setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }
    public String getVerificationCode() {
        return this.verificationCode;
    }

    public AuthDasSmsRequest setAuthInstanceId(String authInstanceId) {
        this.authInstanceId = authInstanceId;
        return this;
    }
    public String getAuthInstanceId() {
        return this.authInstanceId;
    }

    public AuthDasSmsRequest setBeAuthedPersonAppId(String beAuthedPersonAppId) {
        this.beAuthedPersonAppId = beAuthedPersonAppId;
        return this;
    }
    public String getBeAuthedPersonAppId() {
        return this.beAuthedPersonAppId;
    }

    public AuthDasSmsRequest setAuthPersonEnterpriseInfo(AuthPersonEnterpriseInfo authPersonEnterpriseInfo) {
        this.authPersonEnterpriseInfo = authPersonEnterpriseInfo;
        return this;
    }
    public AuthPersonEnterpriseInfo getAuthPersonEnterpriseInfo() {
        return this.authPersonEnterpriseInfo;
    }

    public AuthDasSmsRequest setAuthPersonIndividualInfo(AuthPersonIndividualInfo authPersonIndividualInfo) {
        this.authPersonIndividualInfo = authPersonIndividualInfo;
        return this;
    }
    public AuthPersonIndividualInfo getAuthPersonIndividualInfo() {
        return this.authPersonIndividualInfo;
    }

}
