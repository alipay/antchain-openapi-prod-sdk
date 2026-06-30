// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateEvidenceUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 取证主体证件名称
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 取证主体证件号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 用户类型（个人/企业）
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    // 法人姓名（企业用户必填）
    @NameInMap("legal_person_cert_name")
    public String legalPersonCertName;

    // 法人证件号（企业用户必填）
    @NameInMap("legal_person_cert_no")
    public String legalPersonCertNo;

    // 取证操作人证件姓名（企业用户必填）
    @NameInMap("operator_name")
    public String operatorName;

    // 取证操作人证件号（企业用户必填）
    @NameInMap("operator_cert_no")
    public String operatorCertNo;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    public static CreateEvidenceUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEvidenceUserRequest self = new CreateEvidenceUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateEvidenceUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateEvidenceUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateEvidenceUserRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CreateEvidenceUserRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateEvidenceUserRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public CreateEvidenceUserRequest setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public CreateEvidenceUserRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public CreateEvidenceUserRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public CreateEvidenceUserRequest setOperatorCertNo(String operatorCertNo) {
        this.operatorCertNo = operatorCertNo;
        return this;
    }
    public String getOperatorCertNo() {
        return this.operatorCertNo;
    }

    public CreateEvidenceUserRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
