// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class LegalPersonInfo extends TeaModel {
    // 法人姓名
    @NameInMap("legal_person_cert_name")
    public String legalPersonCertName;

    // 法人证件类型
    @NameInMap("legal_person_cert_type")
    public String legalPersonCertType;

    // 法人证件号
    @NameInMap("legal_person_cert_no")
    public String legalPersonCertNo;

    public static LegalPersonInfo build(java.util.Map<String, ?> map) throws Exception {
        LegalPersonInfo self = new LegalPersonInfo();
        return TeaModel.build(map, self);
    }

    public LegalPersonInfo setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public LegalPersonInfo setLegalPersonCertType(String legalPersonCertType) {
        this.legalPersonCertType = legalPersonCertType;
        return this;
    }
    public String getLegalPersonCertType() {
        return this.legalPersonCertType;
    }

    public LegalPersonInfo setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

}
