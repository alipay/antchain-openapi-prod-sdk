// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class JudicialPersonInfo extends TeaModel {
    // 姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 身份证号码
    @NameInMap("cert_number")
    public String certNumber;

    // 联系电话
    @NameInMap("phone")
    public String phone;

    // 民族
    @NameInMap("nationality")
    public String nationality;

    // 通讯地址
    @NameInMap("address")
    public String address;

    // 身份证明
    @NameInMap("identity_certification")
    public JudicialFileInfo identityCertification;

    // 职务
    @NameInMap("job_title")
    public String jobTitle;

    // 任职证明
    @NameInMap("job_certification")
    public JudicialFileInfo jobCertification;

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

}
