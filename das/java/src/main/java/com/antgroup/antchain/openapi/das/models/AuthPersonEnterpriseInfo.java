// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class AuthPersonEnterpriseInfo extends TeaModel {
    // 企业名称
    @NameInMap("enterprise_name")
    @Validation(required = true)
    public String enterpriseName;

    // 企业统一社会信用码
    @NameInMap("enterprise_credit_num")
    @Validation(required = true)
    public String enterpriseCreditNum;

    // 企业法人姓名
    @NameInMap("enterprise_legal_person_name")
    @Validation(required = true)
    public String enterpriseLegalPersonName;

    // 企业法人身份证号
    @NameInMap("enterprise_legal_person_id")
    @Validation(required = true)
    public String enterpriseLegalPersonId;

    // 企业法人电话号码
    @NameInMap("enterprise_legal_person_phone_num")
    @Validation(required = true)
    public Long enterpriseLegalPersonPhoneNum;

    public static AuthPersonEnterpriseInfo build(java.util.Map<String, ?> map) throws Exception {
        AuthPersonEnterpriseInfo self = new AuthPersonEnterpriseInfo();
        return TeaModel.build(map, self);
    }

    public AuthPersonEnterpriseInfo setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public AuthPersonEnterpriseInfo setEnterpriseCreditNum(String enterpriseCreditNum) {
        this.enterpriseCreditNum = enterpriseCreditNum;
        return this;
    }
    public String getEnterpriseCreditNum() {
        return this.enterpriseCreditNum;
    }

    public AuthPersonEnterpriseInfo setEnterpriseLegalPersonName(String enterpriseLegalPersonName) {
        this.enterpriseLegalPersonName = enterpriseLegalPersonName;
        return this;
    }
    public String getEnterpriseLegalPersonName() {
        return this.enterpriseLegalPersonName;
    }

    public AuthPersonEnterpriseInfo setEnterpriseLegalPersonId(String enterpriseLegalPersonId) {
        this.enterpriseLegalPersonId = enterpriseLegalPersonId;
        return this;
    }
    public String getEnterpriseLegalPersonId() {
        return this.enterpriseLegalPersonId;
    }

    public AuthPersonEnterpriseInfo setEnterpriseLegalPersonPhoneNum(Long enterpriseLegalPersonPhoneNum) {
        this.enterpriseLegalPersonPhoneNum = enterpriseLegalPersonPhoneNum;
        return this;
    }
    public Long getEnterpriseLegalPersonPhoneNum() {
        return this.enterpriseLegalPersonPhoneNum;
    }

}
