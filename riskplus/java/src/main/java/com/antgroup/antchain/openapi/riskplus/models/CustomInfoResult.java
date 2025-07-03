// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CustomInfoResult extends TeaModel {
    // 社会信用代码
    /**
     * <strong>example:</strong>
     * <p>923231293311125216</p>
     */
    @NameInMap("credit_code")
    @Validation(required = true)
    public String creditCode;

    // 公司名称
    /**
     * <strong>example:</strong>
     * <p>测试查询科技有限公司</p>
     */
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 法人姓名
    /**
     * <strong>example:</strong>
     * <p>王华</p>
     */
    @NameInMap("legal_name")
    @Validation(required = true)
    public String legalName;

    // 身份证号
    /**
     * <strong>example:</strong>
     * <p>320101111111111111</p>
     */
    @NameInMap("id_card")
    @Validation(required = true)
    public String idCard;

    // 手机号
    /**
     * <strong>example:</strong>
     * <p>15899998888</p>
     */
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 账号
    /**
     * <strong>example:</strong>
     * <p>111111111</p>
     */
    @NameInMap("account")
    @Validation(required = true)
    public String account;

    // 密码
    /**
     * <strong>example:</strong>
     * <p>1111111</p>
     */
    @NameInMap("password")
    @Validation(required = true)
    public String password;

    public static CustomInfoResult build(java.util.Map<String, ?> map) throws Exception {
        CustomInfoResult self = new CustomInfoResult();
        return TeaModel.build(map, self);
    }

    public CustomInfoResult setCreditCode(String creditCode) {
        this.creditCode = creditCode;
        return this;
    }
    public String getCreditCode() {
        return this.creditCode;
    }

    public CustomInfoResult setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public CustomInfoResult setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
    public String getLegalName() {
        return this.legalName;
    }

    public CustomInfoResult setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
    public String getIdCard() {
        return this.idCard;
    }

    public CustomInfoResult setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CustomInfoResult setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public CustomInfoResult setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
