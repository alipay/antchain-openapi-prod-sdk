// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class InsureEmployeeInfo extends TeaModel {
    // 姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 额外信息
    @NameInMap("extra_msg")
    @Validation(required = true)
    public String extraMsg;

    public static InsureEmployeeInfo build(java.util.Map<String, ?> map) throws Exception {
        InsureEmployeeInfo self = new InsureEmployeeInfo();
        return TeaModel.build(map, self);
    }

    public InsureEmployeeInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InsureEmployeeInfo setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public InsureEmployeeInfo setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public InsureEmployeeInfo setExtraMsg(String extraMsg) {
        this.extraMsg = extraMsg;
        return this;
    }
    public String getExtraMsg() {
        return this.extraMsg;
    }

}
