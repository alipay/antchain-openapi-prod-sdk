// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPContactInfo extends TeaModel {
    // 联系人姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 联系人手机号码
    @NameInMap("mobile")
    public String mobile;

    // 联系人电话号码
    @NameInMap("phone")
    public String phone;

    // 联系人类型, 1-法人；2-实际控制人；3-代理人；4-其他
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 联系人身份证号
    @NameInMap("certno")
    public String certno;

    public static IPContactInfo build(java.util.Map<String, ?> map) throws Exception {
        IPContactInfo self = new IPContactInfo();
        return TeaModel.build(map, self);
    }

    public IPContactInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IPContactInfo setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public IPContactInfo setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public IPContactInfo setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public IPContactInfo setCertno(String certno) {
        this.certno = certno;
        return this;
    }
    public String getCertno() {
        return this.certno;
    }

}
