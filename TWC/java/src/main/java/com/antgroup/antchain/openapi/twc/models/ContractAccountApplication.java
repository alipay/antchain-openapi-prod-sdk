// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractAccountApplication extends TeaModel {
    // 邮箱地址，默认空
    @NameInMap("email")
    public String email;

    // 证件号
    @NameInMap("id_number")
    @Validation(required = true)
    public String idNumber;

    // 目前仅支持CRED_PSN_CH_IDCARD，即身份证号码
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    // 手机号码，默认空
    @NameInMap("mobile")
    public String mobile;

    // 姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 用户唯一标识，可传入第三方平台的个人用户id等
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static ContractAccountApplication build(java.util.Map<String, ?> map) throws Exception {
        ContractAccountApplication self = new ContractAccountApplication();
        return TeaModel.build(map, self);
    }

    public ContractAccountApplication setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ContractAccountApplication setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public ContractAccountApplication setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public ContractAccountApplication setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public ContractAccountApplication setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContractAccountApplication setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
