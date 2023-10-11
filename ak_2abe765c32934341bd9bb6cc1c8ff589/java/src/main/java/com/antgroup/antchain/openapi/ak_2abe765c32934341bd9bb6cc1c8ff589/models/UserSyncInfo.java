// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class UserSyncInfo extends TeaModel {
    // 外部同步的订单 id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String orderId;

    // 用户登录名，租赁平台会员ID/若支付宝ID必传
    @NameInMap("login_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String loginId;

    // 户登录名类型 1.商户会员2.支付宝3.其他
    @NameInMap("login_type")
    @Validation(required = true)
    public Long loginType;

    // 用户登录时间 格式为2019-08-31 12:00:00
    @NameInMap("login_time")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String loginTime;

    // 租赁人姓名，这里是用户通过公钥加密后的密文
    @NameInMap("user_name")
    @Validation(required = true, maxLength = 500, minLength = 1)
    public String userName;

    // 租赁人身份证，这里是用户通过公钥加密后的密文
    @NameInMap("user_id")
    @Validation(required = true, maxLength = 500, minLength = 1)
    public String userId;

    // 承租人手机号，这里是用户通过公钥加密后的密文
    @NameInMap("user_phone_number")
    @Validation(required = true, maxLength = 500, minLength = 1)
    public String userPhoneNumber;

    // 身份认证类型 1支付宝实人，2芝麻实人，3非蚂蚁实人
    @NameInMap("user_type")
    @Validation(required = true, maxLength = 2, minLength = 1)
    public String userType;

    // 支付宝账号信息
    @NameInMap("alipay_uid")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String alipayUid;

    // 出租企业名称
    @NameInMap("lease_corp_name")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String leaseCorpName;

    // 出租企业统一社会信用代码
    @NameInMap("lease_corp_id")
    @Validation(required = true, maxLength = 50)
    public String leaseCorpId;

    // 出租法定代表人姓名
    @NameInMap("lease_corp_owner_name")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String leaseCorpOwnerName;

    // 1.企业用户 2.个人用户
    @NameInMap("lessee_type")
    @Validation(required = true)
    public Long lesseeType;

    // 营业执照对应的名称
    @NameInMap("leased_enterprise")
    @Validation(maxLength = 50, minLength = 1)
    public String leasedEnterprise;

    // 租赁⼈身份证照⽚正⾯地址
    @NameInMap("user_image_url")
    @Validation(maxLength = 1000)
    public String userImageUrl;

    // 租赁⼈身份证照⽚反⾯地址
    @NameInMap("user_back_image_url")
    @Validation(maxLength = 1000)
    public String userBackImageUrl;

    // 平台注册的电话，这里是用户通过公钥加密后的密文
    @NameInMap("registered_telephone_number")
    @Validation(maxLength = 500)
    public String registeredTelephoneNumber;

    // 承租企业实际控制人（股东/法人）身份证号
    @NameInMap("actual_controller_id")
    @Validation(maxLength = 500)
    public String actualControllerId;

    // 承租企业实际控制人（股东/法人）手机号。若为企业类型必填，字段长度：不超过 500
    @NameInMap("actual_controller_number")
    public String actualControllerNumber;

    // 承租企业实际控制人（股东/法人）姓名，若为企业类型必填
    @NameInMap("actual_controller_name")
    @Validation(maxLength = 1000)
    public String actualControllerName;

    // 承租企业实际控制人（股东/法人）身份证正面地址，若为企业类型必填
    @NameInMap("actual_controller_image_url")
    @Validation(maxLength = 50)
    public String actualControllerImageUrl;

    // 承租企业实际控制人（股东/法人）身份证反面地址
    @NameInMap("actual_controller_back_image_url")
    @Validation(maxLength = 1000)
    public String actualControllerBackImageUrl;

    // 承租企业实际控制人（股东/法人）手机号
    @NameInMap("actual_controller_telephone_number")
    @Validation(maxLength = 12)
    public String actualControllerTelephoneNumber;

    // 承租企业统⼀社会信⽤代码
    @NameInMap("business_license_number")
    @Validation(maxLength = 50)
    public String businessLicenseNumber;

    // 承租企业统一社会信用代码
    @NameInMap("businesslicense_url")
    public String businesslicenseUrl;

    // 承租企业法定代表人姓名
    @NameInMap("legal_representative")
    @Validation(maxLength = 20)
    public String legalRepresentative;

    //  资方定义的其他额外字段，以json形式传递
    @NameInMap("extra_info")
    @Validation(maxLength = 2000)
    public String extraInfo;

    public static UserSyncInfo build(java.util.Map<String, ?> map) throws Exception {
        UserSyncInfo self = new UserSyncInfo();
        return TeaModel.build(map, self);
    }

    public UserSyncInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UserSyncInfo setLoginId(String loginId) {
        this.loginId = loginId;
        return this;
    }
    public String getLoginId() {
        return this.loginId;
    }

    public UserSyncInfo setLoginType(Long loginType) {
        this.loginType = loginType;
        return this;
    }
    public Long getLoginType() {
        return this.loginType;
    }

    public UserSyncInfo setLoginTime(String loginTime) {
        this.loginTime = loginTime;
        return this;
    }
    public String getLoginTime() {
        return this.loginTime;
    }

    public UserSyncInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public UserSyncInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UserSyncInfo setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
        return this;
    }
    public String getUserPhoneNumber() {
        return this.userPhoneNumber;
    }

    public UserSyncInfo setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public UserSyncInfo setAlipayUid(String alipayUid) {
        this.alipayUid = alipayUid;
        return this;
    }
    public String getAlipayUid() {
        return this.alipayUid;
    }

    public UserSyncInfo setLeaseCorpName(String leaseCorpName) {
        this.leaseCorpName = leaseCorpName;
        return this;
    }
    public String getLeaseCorpName() {
        return this.leaseCorpName;
    }

    public UserSyncInfo setLeaseCorpId(String leaseCorpId) {
        this.leaseCorpId = leaseCorpId;
        return this;
    }
    public String getLeaseCorpId() {
        return this.leaseCorpId;
    }

    public UserSyncInfo setLeaseCorpOwnerName(String leaseCorpOwnerName) {
        this.leaseCorpOwnerName = leaseCorpOwnerName;
        return this;
    }
    public String getLeaseCorpOwnerName() {
        return this.leaseCorpOwnerName;
    }

    public UserSyncInfo setLesseeType(Long lesseeType) {
        this.lesseeType = lesseeType;
        return this;
    }
    public Long getLesseeType() {
        return this.lesseeType;
    }

    public UserSyncInfo setLeasedEnterprise(String leasedEnterprise) {
        this.leasedEnterprise = leasedEnterprise;
        return this;
    }
    public String getLeasedEnterprise() {
        return this.leasedEnterprise;
    }

    public UserSyncInfo setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl;
        return this;
    }
    public String getUserImageUrl() {
        return this.userImageUrl;
    }

    public UserSyncInfo setUserBackImageUrl(String userBackImageUrl) {
        this.userBackImageUrl = userBackImageUrl;
        return this;
    }
    public String getUserBackImageUrl() {
        return this.userBackImageUrl;
    }

    public UserSyncInfo setRegisteredTelephoneNumber(String registeredTelephoneNumber) {
        this.registeredTelephoneNumber = registeredTelephoneNumber;
        return this;
    }
    public String getRegisteredTelephoneNumber() {
        return this.registeredTelephoneNumber;
    }

    public UserSyncInfo setActualControllerId(String actualControllerId) {
        this.actualControllerId = actualControllerId;
        return this;
    }
    public String getActualControllerId() {
        return this.actualControllerId;
    }

    public UserSyncInfo setActualControllerNumber(String actualControllerNumber) {
        this.actualControllerNumber = actualControllerNumber;
        return this;
    }
    public String getActualControllerNumber() {
        return this.actualControllerNumber;
    }

    public UserSyncInfo setActualControllerName(String actualControllerName) {
        this.actualControllerName = actualControllerName;
        return this;
    }
    public String getActualControllerName() {
        return this.actualControllerName;
    }

    public UserSyncInfo setActualControllerImageUrl(String actualControllerImageUrl) {
        this.actualControllerImageUrl = actualControllerImageUrl;
        return this;
    }
    public String getActualControllerImageUrl() {
        return this.actualControllerImageUrl;
    }

    public UserSyncInfo setActualControllerBackImageUrl(String actualControllerBackImageUrl) {
        this.actualControllerBackImageUrl = actualControllerBackImageUrl;
        return this;
    }
    public String getActualControllerBackImageUrl() {
        return this.actualControllerBackImageUrl;
    }

    public UserSyncInfo setActualControllerTelephoneNumber(String actualControllerTelephoneNumber) {
        this.actualControllerTelephoneNumber = actualControllerTelephoneNumber;
        return this;
    }
    public String getActualControllerTelephoneNumber() {
        return this.actualControllerTelephoneNumber;
    }

    public UserSyncInfo setBusinessLicenseNumber(String businessLicenseNumber) {
        this.businessLicenseNumber = businessLicenseNumber;
        return this;
    }
    public String getBusinessLicenseNumber() {
        return this.businessLicenseNumber;
    }

    public UserSyncInfo setBusinesslicenseUrl(String businesslicenseUrl) {
        this.businesslicenseUrl = businesslicenseUrl;
        return this;
    }
    public String getBusinesslicenseUrl() {
        return this.businesslicenseUrl;
    }

    public UserSyncInfo setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
        return this;
    }
    public String getLegalRepresentative() {
        return this.legalRepresentative;
    }

    public UserSyncInfo setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
