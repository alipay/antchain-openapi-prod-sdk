// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class LesseePerson extends TeaModel {
    // 承租人姓名
    /**
     * <strong>example:</strong>
     * <p>王一</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 承租人身份证号
    /**
     * <strong>example:</strong>
     * <p>11000000XXX</p>
     */
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 承租人手机号
    /**
     * <strong>example:</strong>
     * <p>130XXXX0123</p>
     */
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    public static LesseePerson build(java.util.Map<String, ?> map) throws Exception {
        LesseePerson self = new LesseePerson();
        return TeaModel.build(map, self);
    }

    public LesseePerson setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LesseePerson setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public LesseePerson setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

}
