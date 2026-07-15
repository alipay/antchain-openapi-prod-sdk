// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateBclPayeeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业证件姓名
    @NameInMap("cert_name")
    @Validation(required = true, maxLength = 96)
    public String certName;

    // 企业证件号
    @NameInMap("cert_no")
    @Validation(required = true, maxLength = 32)
    public String certNo;

    // 企业证件类型
    // unified_social_credit_code（统一社会信用代码）
    // enterprise_registered_number（企业工商注册号）
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 企业法定代表人名称
    @NameInMap("legal_person_cert_name")
    @Validation(required = true, maxLength = 32)
    public String legalPersonCertName;

    // 企业法定代表人证件号
    @NameInMap("legal_person_cert_no")
    @Validation(required = true, maxLength = 32)
    public String legalPersonCertNo;

    public static CreateBclPayeeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBclPayeeRequest self = new CreateBclPayeeRequest();
        return TeaModel.build(map, self);
    }

    public CreateBclPayeeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBclPayeeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBclPayeeRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CreateBclPayeeRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateBclPayeeRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateBclPayeeRequest setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public CreateBclPayeeRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

}
