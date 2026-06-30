// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class NotaryUser extends TeaModel {
    // 用户类型
    /**
     * <strong>example:</strong>
     * <p>PERSON 或者 ENTERPRISE</p>
     */
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    // 用户名称
    /**
     * <strong>example:</strong>
     * <p>个人用户姓名、企业名称</p>
     */
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 用户账号
    /**
     * <strong>example:</strong>
     * <p>该用户为业务方注册用户时传入</p>
     */
    @NameInMap("user_account")
    public String userAccount;

    // 证件类型
    /**
     * <strong>example:</strong>
     * <p>个人证件类型： identity_card（身份证） 企业证件类型： unified _ social _ credit _ code（统一 社会信用代码） enterprise_registered_number（企 业工商注册号）</p>
     */
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 证件号
    /**
     * <strong>example:</strong>
     * <p>证件类型对应的证件号码</p>
     */
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 联系电话
    /**
     * <strong>example:</strong>
     * <p>个人手机号或企业联系人手机号码</p>
     */
    @NameInMap("phone")
    public String phone;

    // 法定代表人姓名,用户类型为机构时必填
    /**
     * <strong>example:</strong>
     * <p>用户类型为机构时必填</p>
     */
    @NameInMap("legal_person_name")
    public String legalPersonName;

    // 法定代表人证件号码,用户类型为机构时必填
    /**
     * <strong>example:</strong>
     * <p>法定代表人证件号码</p>
     */
    @NameInMap("legal_person_cert_no")
    public String legalPersonCertNo;

    // 法定代表人证件类型
    /**
     * <strong>example:</strong>
     * <p>证件类型： identity_card（身份证，默认） foreign_permanent_resident_id_ca rd(外国人永久居留身份证)</p>
     */
    @NameInMap("legal_person_cert_type")
    public String legalPersonCertType;

    // 身份证正面
    /**
     * <strong>example:</strong>
     * <p>类型为个人时，传入个人的证件照片；类型为企业时，传入法人的证件正面</p>
     */
    @NameInMap("cert_front_file")
    public String certFrontFile;

    // 身份证反面
    /**
     * <strong>example:</strong>
     * <p>类型为个人时，传入个人的证件照片；类型为企业时，传入法人的证件反面</p>
     */
    @NameInMap("cert_back_file")
    public String certBackFile;

    // 企业营业执照
    /**
     * <strong>example:</strong>
     * <p>用户类型为机构时必填</p>
     */
    @NameInMap("enterprise_cert_file")
    public String enterpriseCertFile;

    public static NotaryUser build(java.util.Map<String, ?> map) throws Exception {
        NotaryUser self = new NotaryUser();
        return TeaModel.build(map, self);
    }

    public NotaryUser setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public NotaryUser setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public NotaryUser setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getUserAccount() {
        return this.userAccount;
    }

    public NotaryUser setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public NotaryUser setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public NotaryUser setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public NotaryUser setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public NotaryUser setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public NotaryUser setLegalPersonCertType(String legalPersonCertType) {
        this.legalPersonCertType = legalPersonCertType;
        return this;
    }
    public String getLegalPersonCertType() {
        return this.legalPersonCertType;
    }

    public NotaryUser setCertFrontFile(String certFrontFile) {
        this.certFrontFile = certFrontFile;
        return this;
    }
    public String getCertFrontFile() {
        return this.certFrontFile;
    }

    public NotaryUser setCertBackFile(String certBackFile) {
        this.certBackFile = certBackFile;
        return this;
    }
    public String getCertBackFile() {
        return this.certBackFile;
    }

    public NotaryUser setEnterpriseCertFile(String enterpriseCertFile) {
        this.enterpriseCertFile = enterpriseCertFile;
        return this;
    }
    public String getEnterpriseCertFile() {
        return this.enterpriseCertFile;
    }

}
