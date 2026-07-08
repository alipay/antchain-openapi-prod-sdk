// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class OpenCutpaymentsubAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 登录号，商户自定义，要求全局唯一，长度11位以上
    @NameInMap("login_no")
    @Validation(required = true)
    public String loginNo;

    // 邮箱
    @NameInMap("email")
    @Validation(required = true)
    public String email;

    // 是否个体户企业为 false个体户为 true
    @NameInMap("self_employed")
    @Validation(required = true)
    public Boolean selfEmployed;

    // 商户名称（营业执照上的名称）
    @NameInMap("license_name")
    @Validation(required = true)
    public String licenseName;

    // 营业执照号
    @NameInMap("license_no")
    @Validation(required = true)
    public String licenseNo;

    // 法人姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 法人身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 法人手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 公司所属行业
    @NameInMap("industry_id")
    @Validation(required = true)
    public String industryId;

    // 银行卡号
    @NameInMap("bank_card")
    @Validation(required = true)
    public String bankCard;

    // 银行名称
    @NameInMap("bank_name")
    @Validation(required = true)
    public String bankName;

    // 开户行省份
    @NameInMap("bank_province")
    @Validation(required = true)
    public String bankProvince;

    // 开户行城市
    @NameInMap("bank_city")
    @Validation(required = true)
    public String bankCity;

    // 开户支行名称
    @NameInMap("bank_branch_name")
    @Validation(required = true)
    public String bankBranchName;

    // 持卡人姓名
    // 当开个体户且绑定对私卡时需传此字段,否则默认绑定对公卡
    @NameInMap("card_user_name")
    public String cardUserName;

    // 一级商户商户号
    @NameInMap("first_level_memberid")
    @Validation(required = true)
    public String firstLevelMemberid;

    // 一级商户终端号
    @NameInMap("first_level_terminalid")
    @Validation(required = true)
    public String firstLevelTerminalid;

    // 扩展信息，预留字段
    @NameInMap("extern_param")
    public String externParam;

    public static OpenCutpaymentsubAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenCutpaymentsubAccountRequest self = new OpenCutpaymentsubAccountRequest();
        return TeaModel.build(map, self);
    }

    public OpenCutpaymentsubAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OpenCutpaymentsubAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OpenCutpaymentsubAccountRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public OpenCutpaymentsubAccountRequest setLoginNo(String loginNo) {
        this.loginNo = loginNo;
        return this;
    }
    public String getLoginNo() {
        return this.loginNo;
    }

    public OpenCutpaymentsubAccountRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public OpenCutpaymentsubAccountRequest setSelfEmployed(Boolean selfEmployed) {
        this.selfEmployed = selfEmployed;
        return this;
    }
    public Boolean getSelfEmployed() {
        return this.selfEmployed;
    }

    public OpenCutpaymentsubAccountRequest setLicenseName(String licenseName) {
        this.licenseName = licenseName;
        return this;
    }
    public String getLicenseName() {
        return this.licenseName;
    }

    public OpenCutpaymentsubAccountRequest setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }
    public String getLicenseNo() {
        return this.licenseNo;
    }

    public OpenCutpaymentsubAccountRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public OpenCutpaymentsubAccountRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public OpenCutpaymentsubAccountRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public OpenCutpaymentsubAccountRequest setIndustryId(String industryId) {
        this.industryId = industryId;
        return this;
    }
    public String getIndustryId() {
        return this.industryId;
    }

    public OpenCutpaymentsubAccountRequest setBankCard(String bankCard) {
        this.bankCard = bankCard;
        return this;
    }
    public String getBankCard() {
        return this.bankCard;
    }

    public OpenCutpaymentsubAccountRequest setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public OpenCutpaymentsubAccountRequest setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince;
        return this;
    }
    public String getBankProvince() {
        return this.bankProvince;
    }

    public OpenCutpaymentsubAccountRequest setBankCity(String bankCity) {
        this.bankCity = bankCity;
        return this;
    }
    public String getBankCity() {
        return this.bankCity;
    }

    public OpenCutpaymentsubAccountRequest setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
        return this;
    }
    public String getBankBranchName() {
        return this.bankBranchName;
    }

    public OpenCutpaymentsubAccountRequest setCardUserName(String cardUserName) {
        this.cardUserName = cardUserName;
        return this;
    }
    public String getCardUserName() {
        return this.cardUserName;
    }

    public OpenCutpaymentsubAccountRequest setFirstLevelMemberid(String firstLevelMemberid) {
        this.firstLevelMemberid = firstLevelMemberid;
        return this;
    }
    public String getFirstLevelMemberid() {
        return this.firstLevelMemberid;
    }

    public OpenCutpaymentsubAccountRequest setFirstLevelTerminalid(String firstLevelTerminalid) {
        this.firstLevelTerminalid = firstLevelTerminalid;
        return this;
    }
    public String getFirstLevelTerminalid() {
        return this.firstLevelTerminalid;
    }

    public OpenCutpaymentsubAccountRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
