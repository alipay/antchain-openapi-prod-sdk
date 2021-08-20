// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class BeAuthedPersonInfo extends TeaModel {
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

    public static BeAuthedPersonInfo build(java.util.Map<String, ?> map) throws Exception {
        BeAuthedPersonInfo self = new BeAuthedPersonInfo();
        return TeaModel.build(map, self);
    }

    public BeAuthedPersonInfo setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public BeAuthedPersonInfo setEnterpriseCreditNum(String enterpriseCreditNum) {
        this.enterpriseCreditNum = enterpriseCreditNum;
        return this;
    }
    public String getEnterpriseCreditNum() {
        return this.enterpriseCreditNum;
    }

    public BeAuthedPersonInfo setEnterpriseLegalPersonName(String enterpriseLegalPersonName) {
        this.enterpriseLegalPersonName = enterpriseLegalPersonName;
        return this;
    }
    public String getEnterpriseLegalPersonName() {
        return this.enterpriseLegalPersonName;
    }

    public BeAuthedPersonInfo setEnterpriseLegalPersonId(String enterpriseLegalPersonId) {
        this.enterpriseLegalPersonId = enterpriseLegalPersonId;
        return this;
    }
    public String getEnterpriseLegalPersonId() {
        return this.enterpriseLegalPersonId;
    }

}
