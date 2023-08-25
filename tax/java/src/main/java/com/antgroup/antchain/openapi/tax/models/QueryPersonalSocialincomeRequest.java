// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryPersonalSocialincomeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务流水号
    @NameInMap("biz_id")
    public String bizId;

    // 姓名
    @NameInMap("name")
    public String name;

    // 身份证
    @NameInMap("cert_no")
    public String certNo;

    // 手机号
    @NameInMap("phone_no")
    public String phoneNo;

    // 授权编号
    @NameInMap("authorization_code")
    public String authorizationCode;

    // 授权凭证
    @NameInMap("authorization_credential")
    public String authorizationCredential;

    // 凭证格式
    @NameInMap("credential_type")
    public String credentialType;

    public static QueryPersonalSocialincomeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPersonalSocialincomeRequest self = new QueryPersonalSocialincomeRequest();
        return TeaModel.build(map, self);
    }

    public QueryPersonalSocialincomeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPersonalSocialincomeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPersonalSocialincomeRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryPersonalSocialincomeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryPersonalSocialincomeRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryPersonalSocialincomeRequest setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public QueryPersonalSocialincomeRequest setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
        return this;
    }
    public String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public QueryPersonalSocialincomeRequest setAuthorizationCredential(String authorizationCredential) {
        this.authorizationCredential = authorizationCredential;
        return this;
    }
    public String getAuthorizationCredential() {
        return this.authorizationCredential;
    }

    public QueryPersonalSocialincomeRequest setCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }
    public String getCredentialType() {
        return this.credentialType;
    }

}
