// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractPlatformAccountApplication extends TeaModel {
    // 邮箱地址
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:xx@alipay.com">xx@alipay.com</a></p>
     */
    @NameInMap("email")
    public String email;

    // 证件号
    /**
     * <strong>example:</strong>
     * <p>311111111111111111</p>
     */
    @NameInMap("id_number")
    @Validation(required = true)
    public String idNumber;

    // 证件类型
    /**
     * <strong>example:</strong>
     * <p>CRED_PSN_CH_IDCARD</p>
     */
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    // 手机号码
    /**
     * <strong>example:</strong>
     * <p>15811111111</p>
     */
    @NameInMap("mobile")
    public String mobile;

    // 姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 用户唯一标识，可传入第三方平台的个人用户id等
    /**
     * <strong>example:</strong>
     * <p>A001</p>
     */
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static ContractPlatformAccountApplication build(java.util.Map<String, ?> map) throws Exception {
        ContractPlatformAccountApplication self = new ContractPlatformAccountApplication();
        return TeaModel.build(map, self);
    }

    public ContractPlatformAccountApplication setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ContractPlatformAccountApplication setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public ContractPlatformAccountApplication setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public ContractPlatformAccountApplication setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public ContractPlatformAccountApplication setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContractPlatformAccountApplication setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
