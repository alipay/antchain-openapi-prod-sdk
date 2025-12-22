// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractUserAccountApplication extends TeaModel {
    // 邮箱地址，默认不变
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:xx@alipay.com">xx@alipay.com</a></p>
     */
    @NameInMap("email")
    public String email;

    // 证件号，该字段只有为空才允许修改
    /**
     * <strong>example:</strong>
     * <p>311111111111111111</p>
     */
    @NameInMap("id_number")
    public String idNumber;

    // 证件类型，默认为身份证
    /**
     * <strong>example:</strong>
     * <p>CRED_PSN_CH_IDCARD</p>
     */
    @NameInMap("id_type")
    public String idType;

    // 手机号码，默认不变
    /**
     * <strong>example:</strong>
     * <p>15811111111</p>
     */
    @NameInMap("mobile")
    public String mobile;

    // 姓名，默认不变
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    public String name;

    // 用户/经办人账号id
    /**
     * <strong>example:</strong>
     * <p>ORGJC1CN1591674666666</p>
     */
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static ContractUserAccountApplication build(java.util.Map<String, ?> map) throws Exception {
        ContractUserAccountApplication self = new ContractUserAccountApplication();
        return TeaModel.build(map, self);
    }

    public ContractUserAccountApplication setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ContractUserAccountApplication setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public ContractUserAccountApplication setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public ContractUserAccountApplication setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public ContractUserAccountApplication setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContractUserAccountApplication setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
