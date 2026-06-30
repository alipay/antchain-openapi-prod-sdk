// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class EnterpriseLegalPersonInfo extends TeaModel {
    // 法人姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("legal_person_cert_name")
    public String legalPersonCertName;

    // 法人证件类型
    /**
     * <strong>example:</strong>
     * <p>IDENTITY_CARD</p>
     */
    @NameInMap("legal_person_cert_type")
    public String legalPersonCertType;

    // 法人证件号
    /**
     * <strong>example:</strong>
     * <p>341227199711226752</p>
     */
    @NameInMap("legal_person_cert_no")
    public String legalPersonCertNo;

    public static EnterpriseLegalPersonInfo build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseLegalPersonInfo self = new EnterpriseLegalPersonInfo();
        return TeaModel.build(map, self);
    }

    public EnterpriseLegalPersonInfo setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public EnterpriseLegalPersonInfo setLegalPersonCertType(String legalPersonCertType) {
        this.legalPersonCertType = legalPersonCertType;
        return this;
    }
    public String getLegalPersonCertType() {
        return this.legalPersonCertType;
    }

    public EnterpriseLegalPersonInfo setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

}
