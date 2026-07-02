// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SignAccount extends TeaModel {
    // 公司统一社会信用代码（userType=ORGANIZATION必传）
    /**
     * <strong>example:</strong>
     * <p>91310101MA1FPCXA3G</p>
     */
    @NameInMap("company_id")
    public String companyId;

    // 公司角色（userType=ORGANIZATION必传） MERCHANT=商户;FINANCIER=资方
    /**
     * <strong>example:</strong>
     * <p>MERCHANT</p>
     */
    @NameInMap("company_role")
    public String companyRole;

    // 用户姓名（userType=PERSON必传，需要RSA加密）
    /**
     * <strong>example:</strong>
     * <p>RSA(用户姓名)</p>
     */
    @NameInMap("user_name")
    public String userName;

    // 用户身份证号（userType=PERSON必传，需要RSA加密）
    /**
     * <strong>example:</strong>
     * <p>RSA(用户身份证号)</p>
     */
    @NameInMap("user_id_number")
    public String userIdNumber;

    // 签署人类型，PERSON=个人;ORGANIZATION=机构
    /**
     * <strong>example:</strong>
     * <p>PERSON</p>
     */
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    // 用户邮箱（userType=PERSON必传，需要RSA加密）
    /**
     * <strong>example:</strong>
     * <p>RSA(用户邮箱)</p>
     */
    @NameInMap("user_email")
    public String userEmail;

    // 用户手机号（userType=PERSON必传，需要RSA加密）
    /**
     * <strong>example:</strong>
     * <p>RSA(用户手机号)</p>
     */
    @NameInMap("user_mobile")
    public String userMobile;

    // 签署标签（对应模版配置中的tag）
    /**
     * <strong>example:</strong>
     * <p>jiafang</p>
     */
    @NameInMap("tag")
    @Validation(required = true)
    public String tag;

    // 是否获取签署链接
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("get_sign_url")
    public Boolean getSignUrl;

    public static SignAccount build(java.util.Map<String, ?> map) throws Exception {
        SignAccount self = new SignAccount();
        return TeaModel.build(map, self);
    }

    public SignAccount setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

    public SignAccount setCompanyRole(String companyRole) {
        this.companyRole = companyRole;
        return this;
    }
    public String getCompanyRole() {
        return this.companyRole;
    }

    public SignAccount setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public SignAccount setUserIdNumber(String userIdNumber) {
        this.userIdNumber = userIdNumber;
        return this;
    }
    public String getUserIdNumber() {
        return this.userIdNumber;
    }

    public SignAccount setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public SignAccount setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }
    public String getUserEmail() {
        return this.userEmail;
    }

    public SignAccount setUserMobile(String userMobile) {
        this.userMobile = userMobile;
        return this;
    }
    public String getUserMobile() {
        return this.userMobile;
    }

    public SignAccount setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public SignAccount setGetSignUrl(Boolean getSignUrl) {
        this.getSignUrl = getSignUrl;
        return this;
    }
    public Boolean getGetSignUrl() {
        return this.getSignUrl;
    }

}
