// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractCreatorApplication extends TeaModel {
    // 邮箱地址
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:wutest@tsign.com">wutest@tsign.com</a></p>
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

    // 创建人ID
    /**
     * <strong>example:</strong>
     * <p>0178c086a740475caf516f37901352b3</p>
     */
    @NameInMap("creator_id")
    @Validation(required = true)
    public String creatorId;

    public static ContractCreatorApplication build(java.util.Map<String, ?> map) throws Exception {
        ContractCreatorApplication self = new ContractCreatorApplication();
        return TeaModel.build(map, self);
    }

    public ContractCreatorApplication setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ContractCreatorApplication setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public ContractCreatorApplication setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public ContractCreatorApplication setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public ContractCreatorApplication setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContractCreatorApplication setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

}
