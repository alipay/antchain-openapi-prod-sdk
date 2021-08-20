// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class AuthPersonIndividualInfo extends TeaModel {
    // 姓名
    @NameInMap("individual_name")
    @Validation(required = true)
    public String individualName;

    // 身份证号
    @NameInMap("individual_id")
    @Validation(required = true)
    public String individualId;

    // 电话号码
    @NameInMap("individual_phone_num")
    @Validation(required = true)
    public Long individualPhoneNum;

    public static AuthPersonIndividualInfo build(java.util.Map<String, ?> map) throws Exception {
        AuthPersonIndividualInfo self = new AuthPersonIndividualInfo();
        return TeaModel.build(map, self);
    }

    public AuthPersonIndividualInfo setIndividualName(String individualName) {
        this.individualName = individualName;
        return this;
    }
    public String getIndividualName() {
        return this.individualName;
    }

    public AuthPersonIndividualInfo setIndividualId(String individualId) {
        this.individualId = individualId;
        return this;
    }
    public String getIndividualId() {
        return this.individualId;
    }

    public AuthPersonIndividualInfo setIndividualPhoneNum(Long individualPhoneNum) {
        this.individualPhoneNum = individualPhoneNum;
        return this;
    }
    public Long getIndividualPhoneNum() {
        return this.individualPhoneNum;
    }

}
