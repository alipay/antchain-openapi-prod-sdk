// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CompanyFourMetaInfo extends TeaModel {
    // 企业证件名称
    /**
     * <strong>example:</strong>
     * <p>XX公司</p>
     */
    @NameInMap("company_cert_name")
    @Validation(required = true)
    public String companyCertName;

    // 企业证件号码
    /**
     * <strong>example:</strong>
     * <p>9111011421316034XK</p>
     */
    @NameInMap("company_cert_no")
    @Validation(required = true)
    public String companyCertNo;

    // 证件类型, 默认社会统一信用代码  NATIONAL_LEGAL_MERGE:统一社会信用代码，NATIONAL_LEGAL：营业执照号码
    /**
     * <strong>example:</strong>
     * <p>NATIONAL_LEGAL_MERGE</p>
     */
    @NameInMap("company_cert_type")
    public String companyCertType;

    // 法人证件名称
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("legal_person_cert_name")
    @Validation(required = true)
    public String legalPersonCertName;

    // 法人证件号码
    /**
     * <strong>example:</strong>
     * <p>110103202110131593</p>
     */
    @NameInMap("legal_person_cert_no")
    @Validation(required = true)
    public String legalPersonCertNo;

    // 法人证件类型 RESIDENT：居民身份证号，PASSPORT：护照，MILITARY：军官证
    /**
     * <strong>example:</strong>
     * <p>RESIDENT</p>
     */
    @NameInMap("legal_person_cert_type")
    public String legalPersonCertType;

    public static CompanyFourMetaInfo build(java.util.Map<String, ?> map) throws Exception {
        CompanyFourMetaInfo self = new CompanyFourMetaInfo();
        return TeaModel.build(map, self);
    }

    public CompanyFourMetaInfo setCompanyCertName(String companyCertName) {
        this.companyCertName = companyCertName;
        return this;
    }
    public String getCompanyCertName() {
        return this.companyCertName;
    }

    public CompanyFourMetaInfo setCompanyCertNo(String companyCertNo) {
        this.companyCertNo = companyCertNo;
        return this;
    }
    public String getCompanyCertNo() {
        return this.companyCertNo;
    }

    public CompanyFourMetaInfo setCompanyCertType(String companyCertType) {
        this.companyCertType = companyCertType;
        return this;
    }
    public String getCompanyCertType() {
        return this.companyCertType;
    }

    public CompanyFourMetaInfo setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public CompanyFourMetaInfo setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public CompanyFourMetaInfo setLegalPersonCertType(String legalPersonCertType) {
        this.legalPersonCertType = legalPersonCertType;
        return this;
    }
    public String getLegalPersonCertType() {
        return this.legalPersonCertType;
    }

}
