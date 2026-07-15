// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class JudicialPersonInfo extends TeaModel {
    // 姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    public String name;

    // 身份证号码
    /**
     * <strong>example:</strong>
     * <p>310101199901010011</p>
     */
    @NameInMap("cert_number")
    public String certNumber;

    // 联系电话
    /**
     * <strong>example:</strong>
     * <p>1350000000</p>
     */
    @NameInMap("phone")
    public String phone;

    // 民族
    /**
     * <strong>example:</strong>
     * <p>汉</p>
     */
    @NameInMap("nationality")
    public String nationality;

    // 通讯地址
    /**
     * <strong>example:</strong>
     * <p>通讯地址</p>
     */
    @NameInMap("address")
    public String address;

    // 身份证明
    @NameInMap("identity_certification")
    public JudicialFileInfo identityCertification;

    // 职务
    /**
     * <strong>example:</strong>
     * <p>法人代表</p>
     */
    @NameInMap("job_title")
    public String jobTitle;

    // 任职证明
    @NameInMap("job_certification")
    public JudicialFileInfo jobCertification;

    // 性别， 0-男，1-女
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("sex")
    public Long sex;

    // 联系邮件地址
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:email@ali.com">email@ali.com</a></p>
     */
    @NameInMap("email")
    public String email;

    public static JudicialPersonInfo build(java.util.Map<String, ?> map) throws Exception {
        JudicialPersonInfo self = new JudicialPersonInfo();
        return TeaModel.build(map, self);
    }

    public JudicialPersonInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public JudicialPersonInfo setCertNumber(String certNumber) {
        this.certNumber = certNumber;
        return this;
    }
    public String getCertNumber() {
        return this.certNumber;
    }

    public JudicialPersonInfo setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public JudicialPersonInfo setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }
    public String getNationality() {
        return this.nationality;
    }

    public JudicialPersonInfo setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public JudicialPersonInfo setIdentityCertification(JudicialFileInfo identityCertification) {
        this.identityCertification = identityCertification;
        return this;
    }
    public JudicialFileInfo getIdentityCertification() {
        return this.identityCertification;
    }

    public JudicialPersonInfo setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }
    public String getJobTitle() {
        return this.jobTitle;
    }

    public JudicialPersonInfo setJobCertification(JudicialFileInfo jobCertification) {
        this.jobCertification = jobCertification;
        return this;
    }
    public JudicialFileInfo getJobCertification() {
        return this.jobCertification;
    }

    public JudicialPersonInfo setSex(Long sex) {
        this.sex = sex;
        return this;
    }
    public Long getSex() {
        return this.sex;
    }

    public JudicialPersonInfo setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

}
