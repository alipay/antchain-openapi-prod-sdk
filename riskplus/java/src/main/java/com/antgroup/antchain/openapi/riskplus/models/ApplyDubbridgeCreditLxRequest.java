// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubbridgeCreditLxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授信申请编号
    @NameInMap("credit_apply_id")
    @Validation(required = true)
    public String creditApplyId;

    // 合作方代码
    @NameInMap("partner_code")
    public String partnerCode;

    // 申请人姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 授信金额，单位:元
    @NameInMap("credit_amount")
    @Validation(required = true)
    public Long creditAmount;

    // 婚姻状况，
    // 0-未婚
    // 1-已婚
    // 3-离异
    // 4-未知
    // 5-丧偶
    @NameInMap("marital_status")
    @Validation(required = true)
    public String maritalStatus;

    // 学历，
    // 0未知，1本科，2大专，3硕士，4博士，7初中，10大专(老)，11中专，12高中，13小学
    @NameInMap("education")
    @Validation(required = true)
    public String education;

    // 年龄
    @NameInMap("age")
    @Validation(required = true)
    public Long age;

    // 性别，
    // 1-男
    // 2-女
    // 0-未知
    @NameInMap("sex")
    @Validation(required = true)
    public String sex;

    // 证件类型，
    // 1、身份证
    @NameInMap("identi_type")
    @Validation(required = true)
    public String identiType;

    // 证件号码
    @NameInMap("identi_no")
    @Validation(required = true)
    public String identiNo;

    // 身份证有效期止，如果是长期用20991231
    @NameInMap("id_card_expire_date")
    @Validation(required = true)
    public String idCardExpireDate;

    // 身份证有效期起
    @NameInMap("id_card_valid_date")
    @Validation(required = true)
    public String idCardValidDate;

    // 身份证省
    @NameInMap("id_province")
    @Validation(required = true)
    public String idProvince;

    // 身份证市
    @NameInMap("id_city")
    @Validation(required = true)
    public String idCity;

    // 身份证地址
    @NameInMap("id_addr")
    @Validation(required = true)
    public String idAddr;

    // 身份证签发机关
    @NameInMap("issued_agency")
    @Validation(required = true)
    public String issuedAgency;

    // 出生日期，yyyy-MM-dd
    @NameInMap("birthday")
    @Validation(required = true)
    public String birthday;

    // 国籍
    @NameInMap("nationality")
    @Validation(required = true)
    public String nationality;

    // 民族
    @NameInMap("nation")
    @Validation(required = true)
    public String nation;

    // 客户手机号
    @NameInMap("mobile_no")
    @Validation(required = true)
    public String mobileNo;

    // 用户银行卡号
    @NameInMap("user_bank_card_no")
    @Validation(required = true)
    public String userBankCardNo;

    // 第一联系人姓名
    @NameInMap("contact_name")
    @Validation(required = true)
    public String contactName;

    // 第一联系人手机
    @NameInMap("contact_mobile")
    @Validation(required = true)
    public String contactMobile;

    // 第一联系人关系，
    // 1 父母
    // 2 配偶
    // 3 亲戚
    // 4 家人
    // 5 子女
    // 6 朋友
    // 7 同事
    // 8 兄弟姐妹
    // 9 同学
    // 99 其他
    @NameInMap("contact_rel")
    @Validation(required = true)
    public String contactRel;

    // 居住地址对应的省，若为空则上送身份证地址对应的省
    @NameInMap("living_province")
    @Validation(required = true)
    public String livingProvince;

    // 居住地址对应的市，若为空则上送身份证地址对应的市
    @NameInMap("living_city")
    @Validation(required = true)
    public String livingCity;

    // 居住地对应的区
    @NameInMap("living_county")
    public String livingCounty;

    // 居住地址
    @NameInMap("living_address")
    @Validation(required = true)
    public String livingAddress;

    // 客户职业，
    // 0 未知（空值默认按0提供）
    // 1 国家机关、党群组织、企业、事业单位负责人
    // 2 专业技术人员
    // 3 办事人员和有关人员
    // 4 商业、服务业人员
    // 5 农、林、牧、渔、水利业生产人员
    // 6 生产、运输设备操作人员及有关人员
    // 7 军人
    // 8 不便分类的其他从业人员
    @NameInMap("user_occupation")
    @Validation(required = true)
    public String userOccupation;

    // 客户行业，
    // 0 未知（空值默认按0提供）
    // 1 信息传输、软件和信息技术服务业
    // 2 金融业
    // 3 制造业
    // 4 卫生和社会工作
    // 5 建筑业
    // 6 文化、体育和娱乐业
    // 7 租赁和商务服务业
    // 8 住宿和餐饮业
    // 9 交通运输、仓储和邮政业
    // 10 采矿业
    // 11 电力、热力、燃气及水生产和供应业
    // 12 科学研究和技术服务业
    // 13 农、林、牧、渔业
    // 14 水利、环境和公共设施管理业
    // 15 其他
    // 77 批发和零售业
    // 78 居民服务、修理和其他服务业
    // 79 房地产业
    // 81 教育
    // 82 公共管理、社会保障和社会组织
    // 80 国际组织
    @NameInMap("user_industry_category")
    @Validation(required = true)
    public String userIndustryCategory;

    public static ApplyDubbridgeCreditLxRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubbridgeCreditLxRequest self = new ApplyDubbridgeCreditLxRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDubbridgeCreditLxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyDubbridgeCreditLxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyDubbridgeCreditLxRequest setCreditApplyId(String creditApplyId) {
        this.creditApplyId = creditApplyId;
        return this;
    }
    public String getCreditApplyId() {
        return this.creditApplyId;
    }

    public ApplyDubbridgeCreditLxRequest setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

    public ApplyDubbridgeCreditLxRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApplyDubbridgeCreditLxRequest setCreditAmount(Long creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }
    public Long getCreditAmount() {
        return this.creditAmount;
    }

    public ApplyDubbridgeCreditLxRequest setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }
    public String getMaritalStatus() {
        return this.maritalStatus;
    }

    public ApplyDubbridgeCreditLxRequest setEducation(String education) {
        this.education = education;
        return this;
    }
    public String getEducation() {
        return this.education;
    }

    public ApplyDubbridgeCreditLxRequest setAge(Long age) {
        this.age = age;
        return this;
    }
    public Long getAge() {
        return this.age;
    }

    public ApplyDubbridgeCreditLxRequest setSex(String sex) {
        this.sex = sex;
        return this;
    }
    public String getSex() {
        return this.sex;
    }

    public ApplyDubbridgeCreditLxRequest setIdentiType(String identiType) {
        this.identiType = identiType;
        return this;
    }
    public String getIdentiType() {
        return this.identiType;
    }

    public ApplyDubbridgeCreditLxRequest setIdentiNo(String identiNo) {
        this.identiNo = identiNo;
        return this;
    }
    public String getIdentiNo() {
        return this.identiNo;
    }

    public ApplyDubbridgeCreditLxRequest setIdCardExpireDate(String idCardExpireDate) {
        this.idCardExpireDate = idCardExpireDate;
        return this;
    }
    public String getIdCardExpireDate() {
        return this.idCardExpireDate;
    }

    public ApplyDubbridgeCreditLxRequest setIdCardValidDate(String idCardValidDate) {
        this.idCardValidDate = idCardValidDate;
        return this;
    }
    public String getIdCardValidDate() {
        return this.idCardValidDate;
    }

    public ApplyDubbridgeCreditLxRequest setIdProvince(String idProvince) {
        this.idProvince = idProvince;
        return this;
    }
    public String getIdProvince() {
        return this.idProvince;
    }

    public ApplyDubbridgeCreditLxRequest setIdCity(String idCity) {
        this.idCity = idCity;
        return this;
    }
    public String getIdCity() {
        return this.idCity;
    }

    public ApplyDubbridgeCreditLxRequest setIdAddr(String idAddr) {
        this.idAddr = idAddr;
        return this;
    }
    public String getIdAddr() {
        return this.idAddr;
    }

    public ApplyDubbridgeCreditLxRequest setIssuedAgency(String issuedAgency) {
        this.issuedAgency = issuedAgency;
        return this;
    }
    public String getIssuedAgency() {
        return this.issuedAgency;
    }

    public ApplyDubbridgeCreditLxRequest setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }
    public String getBirthday() {
        return this.birthday;
    }

    public ApplyDubbridgeCreditLxRequest setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }
    public String getNationality() {
        return this.nationality;
    }

    public ApplyDubbridgeCreditLxRequest setNation(String nation) {
        this.nation = nation;
        return this;
    }
    public String getNation() {
        return this.nation;
    }

    public ApplyDubbridgeCreditLxRequest setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }
    public String getMobileNo() {
        return this.mobileNo;
    }

    public ApplyDubbridgeCreditLxRequest setUserBankCardNo(String userBankCardNo) {
        this.userBankCardNo = userBankCardNo;
        return this;
    }
    public String getUserBankCardNo() {
        return this.userBankCardNo;
    }

    public ApplyDubbridgeCreditLxRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public ApplyDubbridgeCreditLxRequest setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
        return this;
    }
    public String getContactMobile() {
        return this.contactMobile;
    }

    public ApplyDubbridgeCreditLxRequest setContactRel(String contactRel) {
        this.contactRel = contactRel;
        return this;
    }
    public String getContactRel() {
        return this.contactRel;
    }

    public ApplyDubbridgeCreditLxRequest setLivingProvince(String livingProvince) {
        this.livingProvince = livingProvince;
        return this;
    }
    public String getLivingProvince() {
        return this.livingProvince;
    }

    public ApplyDubbridgeCreditLxRequest setLivingCity(String livingCity) {
        this.livingCity = livingCity;
        return this;
    }
    public String getLivingCity() {
        return this.livingCity;
    }

    public ApplyDubbridgeCreditLxRequest setLivingCounty(String livingCounty) {
        this.livingCounty = livingCounty;
        return this;
    }
    public String getLivingCounty() {
        return this.livingCounty;
    }

    public ApplyDubbridgeCreditLxRequest setLivingAddress(String livingAddress) {
        this.livingAddress = livingAddress;
        return this;
    }
    public String getLivingAddress() {
        return this.livingAddress;
    }

    public ApplyDubbridgeCreditLxRequest setUserOccupation(String userOccupation) {
        this.userOccupation = userOccupation;
        return this;
    }
    public String getUserOccupation() {
        return this.userOccupation;
    }

    public ApplyDubbridgeCreditLxRequest setUserIndustryCategory(String userIndustryCategory) {
        this.userIndustryCategory = userIndustryCategory;
        return this;
    }
    public String getUserIndustryCategory() {
        return this.userIndustryCategory;
    }

}
