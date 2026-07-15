// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class JudicialOrgInfo extends TeaModel {
    // 企业名称
    /**
     * <strong>example:</strong>
     * <p>某知名有限公司</p>
     */
    @NameInMap("org_name")
    @Validation(required = true)
    public String orgName;

    // 企业或机构社会统一信用代码
    /**
     * <strong>example:</strong>
     * <p>92XXX</p>
     */
    @NameInMap("org_cert_num")
    @Validation(required = true)
    public String orgCertNum;

    // 企业联系电话
    /**
     * <strong>example:</strong>
     * <p>15000000000</p>
     */
    @NameInMap("org_phone")
    @Validation(required = true)
    public String orgPhone;

    // 企业联系邮箱
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:email@org.com">email@org.com</a></p>
     */
    @NameInMap("org_email")
    public String orgEmail;

    // 企业通讯地址
    /**
     * <strong>example:</strong>
     * <p>上海市黄浦区外马路618号</p>
     */
    @NameInMap("org_address")
    public String orgAddress;

    // 企业营业执照地址
    /**
     * <strong>example:</strong>
     * <p>企业营业执照地址</p>
     */
    @NameInMap("residence_address")
    public String residenceAddress;

    // 企业或机构营业执照信息
    @NameInMap("org_biz_license_info")
    public JudicialFileInfo orgBizLicenseInfo;

    // 企业法人信息
    @NameInMap("org_legal_person_info")
    public JudicialPersonInfo orgLegalPersonInfo;

    // 企业或机构签章管理员信息
    @NameInMap("org_signature_manager_person_info")
    public JudicialPersonInfo orgSignatureManagerPersonInfo;

    // 企业或机构收款银行账户信息
    @NameInMap("org_bank_info")
    public JudicialBankInfo orgBankInfo;

    public static JudicialOrgInfo build(java.util.Map<String, ?> map) throws Exception {
        JudicialOrgInfo self = new JudicialOrgInfo();
        return TeaModel.build(map, self);
    }

    public JudicialOrgInfo setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public JudicialOrgInfo setOrgCertNum(String orgCertNum) {
        this.orgCertNum = orgCertNum;
        return this;
    }
    public String getOrgCertNum() {
        return this.orgCertNum;
    }

    public JudicialOrgInfo setOrgPhone(String orgPhone) {
        this.orgPhone = orgPhone;
        return this;
    }
    public String getOrgPhone() {
        return this.orgPhone;
    }

    public JudicialOrgInfo setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
        return this;
    }
    public String getOrgEmail() {
        return this.orgEmail;
    }

    public JudicialOrgInfo setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
        return this;
    }
    public String getOrgAddress() {
        return this.orgAddress;
    }

    public JudicialOrgInfo setResidenceAddress(String residenceAddress) {
        this.residenceAddress = residenceAddress;
        return this;
    }
    public String getResidenceAddress() {
        return this.residenceAddress;
    }

    public JudicialOrgInfo setOrgBizLicenseInfo(JudicialFileInfo orgBizLicenseInfo) {
        this.orgBizLicenseInfo = orgBizLicenseInfo;
        return this;
    }
    public JudicialFileInfo getOrgBizLicenseInfo() {
        return this.orgBizLicenseInfo;
    }

    public JudicialOrgInfo setOrgLegalPersonInfo(JudicialPersonInfo orgLegalPersonInfo) {
        this.orgLegalPersonInfo = orgLegalPersonInfo;
        return this;
    }
    public JudicialPersonInfo getOrgLegalPersonInfo() {
        return this.orgLegalPersonInfo;
    }

    public JudicialOrgInfo setOrgSignatureManagerPersonInfo(JudicialPersonInfo orgSignatureManagerPersonInfo) {
        this.orgSignatureManagerPersonInfo = orgSignatureManagerPersonInfo;
        return this;
    }
    public JudicialPersonInfo getOrgSignatureManagerPersonInfo() {
        return this.orgSignatureManagerPersonInfo;
    }

    public JudicialOrgInfo setOrgBankInfo(JudicialBankInfo orgBankInfo) {
        this.orgBankInfo = orgBankInfo;
        return this;
    }
    public JudicialBankInfo getOrgBankInfo() {
        return this.orgBankInfo;
    }

}
