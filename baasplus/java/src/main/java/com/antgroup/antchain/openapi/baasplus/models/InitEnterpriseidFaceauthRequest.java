// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class InitEnterpriseidFaceauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业名称
    @NameInMap("ep_cert_name")
    @Validation(required = true)
    public String epCertName;

    // 企业证件号
    @NameInMap("ep_cert_no")
    @Validation(required = true)
    public String epCertNo;

    // 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
    @NameInMap("ep_cert_type")
    @Validation(required = true)
    public String epCertType;

    // 企业法人姓名
    @NameInMap("legal_person_cert_name")
    @Validation(required = true)
    public String legalPersonCertName;

    // 企业法人身份证号（目前只支持身份证号）
    @NameInMap("legal_person_cert_no")
    @Validation(required = true)
    public String legalPersonCertNo;

    public static InitEnterpriseidFaceauthRequest build(java.util.Map<String, ?> map) throws Exception {
        InitEnterpriseidFaceauthRequest self = new InitEnterpriseidFaceauthRequest();
        return TeaModel.build(map, self);
    }

    public InitEnterpriseidFaceauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitEnterpriseidFaceauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitEnterpriseidFaceauthRequest setEpCertName(String epCertName) {
        this.epCertName = epCertName;
        return this;
    }
    public String getEpCertName() {
        return this.epCertName;
    }

    public InitEnterpriseidFaceauthRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public InitEnterpriseidFaceauthRequest setEpCertType(String epCertType) {
        this.epCertType = epCertType;
        return this;
    }
    public String getEpCertType() {
        return this.epCertType;
    }

    public InitEnterpriseidFaceauthRequest setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public InitEnterpriseidFaceauthRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

}
