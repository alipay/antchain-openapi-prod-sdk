// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class CheckPdataMarriageRequest extends TeaModel {
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
    @Validation(required = true)
    public String name;

    // 身份证
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 授权凭证
    @NameInMap("authorization_credential")
    @Validation(required = true)
    public String authorizationCredential;

    // 授权编号(同一机构内唯一)
    @NameInMap("authorization_no")
    @Validation(required = true)
    public String authorizationNo;

    // 授权格式
    @NameInMap("credential_type")
    @Validation(required = true)
    public String credentialType;

    // 授权有效期
    @NameInMap("authorization_expiration_time")
    public String authorizationExpirationTime;

    // 授权对象
    @NameInMap("authorization_type")
    public String authorizationType;

    public static CheckPdataMarriageRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckPdataMarriageRequest self = new CheckPdataMarriageRequest();
        return TeaModel.build(map, self);
    }

    public CheckPdataMarriageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckPdataMarriageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckPdataMarriageRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CheckPdataMarriageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CheckPdataMarriageRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CheckPdataMarriageRequest setAuthorizationCredential(String authorizationCredential) {
        this.authorizationCredential = authorizationCredential;
        return this;
    }
    public String getAuthorizationCredential() {
        return this.authorizationCredential;
    }

    public CheckPdataMarriageRequest setAuthorizationNo(String authorizationNo) {
        this.authorizationNo = authorizationNo;
        return this;
    }
    public String getAuthorizationNo() {
        return this.authorizationNo;
    }

    public CheckPdataMarriageRequest setCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }
    public String getCredentialType() {
        return this.credentialType;
    }

    public CheckPdataMarriageRequest setAuthorizationExpirationTime(String authorizationExpirationTime) {
        this.authorizationExpirationTime = authorizationExpirationTime;
        return this;
    }
    public String getAuthorizationExpirationTime() {
        return this.authorizationExpirationTime;
    }

    public CheckPdataMarriageRequest setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }
    public String getAuthorizationType() {
        return this.authorizationType;
    }

}
