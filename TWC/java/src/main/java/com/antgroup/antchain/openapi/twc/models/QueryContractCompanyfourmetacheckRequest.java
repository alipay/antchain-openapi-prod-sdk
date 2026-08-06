// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractCompanyfourmetacheckRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业名称
    @NameInMap("company_cert_name")
    @Validation(required = true)
    public String companyCertName;

    // 企业证件号码
    @NameInMap("company_cert_no")
    @Validation(required = true)
    public String companyCertNo;

    // 认证类型:ENTERPRISE-企业, PERSON-个人
    @NameInMap("certify_type")
    public String certifyType;

    // 企业证件号码类型:统一社会信用代码:CRED_ORG_USCC,PERSON_CERT_TYPE:CRED_PSN_CH_IDCARD
    @NameInMap("company_cert_type")
    @Validation(required = true)
    public String companyCertType;

    // 企业法人名称
    @NameInMap("legal_person_cert_name")
    @Validation(required = true)
    public String legalPersonCertName;

    // 企业法人证件号
    @NameInMap("legal_person_cert_no")
    @Validation(required = true)
    public String legalPersonCertNo;

    // 企业法人证件类型:RESIDENT:居民身份证号,PASSPORT:护照,MILITARY:军官证
    @NameInMap("legal_person_cert_type")
    @Validation(required = true)
    public String legalPersonCertType;

    public static QueryContractCompanyfourmetacheckRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContractCompanyfourmetacheckRequest self = new QueryContractCompanyfourmetacheckRequest();
        return TeaModel.build(map, self);
    }

    public QueryContractCompanyfourmetacheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContractCompanyfourmetacheckRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContractCompanyfourmetacheckRequest setCompanyCertName(String companyCertName) {
        this.companyCertName = companyCertName;
        return this;
    }
    public String getCompanyCertName() {
        return this.companyCertName;
    }

    public QueryContractCompanyfourmetacheckRequest setCompanyCertNo(String companyCertNo) {
        this.companyCertNo = companyCertNo;
        return this;
    }
    public String getCompanyCertNo() {
        return this.companyCertNo;
    }

    public QueryContractCompanyfourmetacheckRequest setCertifyType(String certifyType) {
        this.certifyType = certifyType;
        return this;
    }
    public String getCertifyType() {
        return this.certifyType;
    }

    public QueryContractCompanyfourmetacheckRequest setCompanyCertType(String companyCertType) {
        this.companyCertType = companyCertType;
        return this;
    }
    public String getCompanyCertType() {
        return this.companyCertType;
    }

    public QueryContractCompanyfourmetacheckRequest setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public QueryContractCompanyfourmetacheckRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public QueryContractCompanyfourmetacheckRequest setLegalPersonCertType(String legalPersonCertType) {
        this.legalPersonCertType = legalPersonCertType;
        return this;
    }
    public String getLegalPersonCertType() {
        return this.legalPersonCertType;
    }

}
