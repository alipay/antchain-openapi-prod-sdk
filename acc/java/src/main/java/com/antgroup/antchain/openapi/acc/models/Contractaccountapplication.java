// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class Contractaccountapplication extends TeaModel {
    // 邮箱
    @NameInMap("email")
    @Validation(required = true)
    public String email;

    // 身份证号码
    @NameInMap("id_number")
    @Validation(required = true)
    public String idNumber;

    // 身份证类型
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    // 电话号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static Contractaccountapplication build(java.util.Map<String, ?> map) throws Exception {
        Contractaccountapplication self = new Contractaccountapplication();
        return TeaModel.build(map, self);
    }

    public Contractaccountapplication setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public Contractaccountapplication setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public Contractaccountapplication setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public Contractaccountapplication setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public Contractaccountapplication setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Contractaccountapplication setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
