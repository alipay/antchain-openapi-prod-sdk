// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class PersonData extends TeaModel {
    // 姓名
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 待修复 sha256 加密身份证号
    @NameInMap("id_card")
    @Validation(required = true)
    public String idCard;

    // 手机号
    @NameInMap("phone")
    public String phone;

    public static PersonData build(java.util.Map<String, ?> map) throws Exception {
        PersonData self = new PersonData();
        return TeaModel.build(map, self);
    }

    public PersonData setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public PersonData setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
    public String getIdCard() {
        return this.idCard;
    }

    public PersonData setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

}
