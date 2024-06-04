// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PersonalInfo extends TeaModel {
    // 客户姓名
    @NameInMap("custom_name")
    @Validation(required = true)
    public String customName;

    // 身份证号码(18位)
    @NameInMap("card_no")
    @Validation(required = true)
    public String cardNo;

    // 1-身份证
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    // 证件开始日期(格式：YYYY-MM-DD)
    // 
    @NameInMap("cert_sign_date")
    @Validation(required = true)
    public String certSignDate;

    // 格式：YYYY-MM-DD，身份证有效期为长期的送: 9999-12-31
    @NameInMap("cert_validate")
    @Validation(required = true)
    public String certValidate;

    // 证件地址
    @NameInMap("cert_adr")
    @Validation(required = true)
    public String certAdr;

    // 手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 学历
    @NameInMap("education")
    public String education;

    // 所在省份 汉字
    @NameInMap("province")
    public String province;

    // 所在城市 汉字
    @NameInMap("city")
    public String city;

    // 地区名称 汉字
    @NameInMap("area")
    public String area;

    // 详细地址
    @NameInMap("address")
    public String address;

    // 性别M-男
    // F-女
    @NameInMap("sex")
    public String sex;

    // 民族
    @NameInMap("nation")
    public String nation;

    // 婚姻状态：00-未婚，01-已婚，02-离婚，03-丧偶，99-未知
    @NameInMap("marital_status")
    public String maritalStatus;

    public static PersonalInfo build(java.util.Map<String, ?> map) throws Exception {
        PersonalInfo self = new PersonalInfo();
        return TeaModel.build(map, self);
    }

    public PersonalInfo setCustomName(String customName) {
        this.customName = customName;
        return this;
    }
    public String getCustomName() {
        return this.customName;
    }

    public PersonalInfo setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public PersonalInfo setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public PersonalInfo setCertSignDate(String certSignDate) {
        this.certSignDate = certSignDate;
        return this;
    }
    public String getCertSignDate() {
        return this.certSignDate;
    }

    public PersonalInfo setCertValidate(String certValidate) {
        this.certValidate = certValidate;
        return this;
    }
    public String getCertValidate() {
        return this.certValidate;
    }

    public PersonalInfo setCertAdr(String certAdr) {
        this.certAdr = certAdr;
        return this;
    }
    public String getCertAdr() {
        return this.certAdr;
    }

    public PersonalInfo setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public PersonalInfo setEducation(String education) {
        this.education = education;
        return this;
    }
    public String getEducation() {
        return this.education;
    }

    public PersonalInfo setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public PersonalInfo setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public PersonalInfo setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public PersonalInfo setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public PersonalInfo setSex(String sex) {
        this.sex = sex;
        return this;
    }
    public String getSex() {
        return this.sex;
    }

    public PersonalInfo setNation(String nation) {
        this.nation = nation;
        return this;
    }
    public String getNation() {
        return this.nation;
    }

    public PersonalInfo setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }
    public String getMaritalStatus() {
        return this.maritalStatus;
    }

}
