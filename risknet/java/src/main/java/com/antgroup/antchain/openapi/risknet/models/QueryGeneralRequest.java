// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.risknet.models;

import com.aliyun.tea.*;

public class QueryGeneralRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用服务名
    @NameInMap("service")
    @Validation(required = true)
    public String service;

    // 服务模式
    @NameInMap("service_mode")
    @Validation(required = true)
    public String serviceMode;

    // 用于标记是否获得用户授权  1:获得授权（默认）
    // 0:未获得授权
    @NameInMap("user_authorization")
    @Validation(required = true)
    public String userAuthorization;

    // 经过RSA加密的用于AES加密的随机数密钥
    @NameInMap("encrypted_random_no")
    public String encryptedRandomNo;

    // 记录外部调用ISV
    @NameInMap("external_id")
    public String externalId;

    // 银行卡号
    @NameInMap("bank_card_no")
    public String bankCardNo;

    // 支付宝id	用于输入用户支付宝的 2088 账号
    @NameInMap("user_id")
    public String userId;

    // 电话号码
    @NameInMap("mobile_no")
    public String mobileNo;

    // 证件号码
    @NameInMap("cert_no")
    public String certNo;

    // 用于输入用户产生交易时的地理位置信息
    @NameInMap("lbs")
    public String lbs;

    // 用户购买或使用服务时产生的具体金额
    @NameInMap("sales_amount")
    public String salesAmount;

    // 证件类型
    @NameInMap("cert_type")
    public String certType;

    // 企业工商注册ID
    @NameInMap("guid")
    public String guid;

    // 统一信用代码
    @NameInMap("biz_license_no")
    public String bizLicenseNo;

    // 压测标
    @NameInMap("sec_load_test")
    public String secLoadTest;

    // 场景ID
    @NameInMap("scene_id")
    public String sceneId;

    public static QueryGeneralRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGeneralRequest self = new QueryGeneralRequest();
        return TeaModel.build(map, self);
    }

    public QueryGeneralRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGeneralRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGeneralRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public QueryGeneralRequest setServiceMode(String serviceMode) {
        this.serviceMode = serviceMode;
        return this;
    }
    public String getServiceMode() {
        return this.serviceMode;
    }

    public QueryGeneralRequest setUserAuthorization(String userAuthorization) {
        this.userAuthorization = userAuthorization;
        return this;
    }
    public String getUserAuthorization() {
        return this.userAuthorization;
    }

    public QueryGeneralRequest setEncryptedRandomNo(String encryptedRandomNo) {
        this.encryptedRandomNo = encryptedRandomNo;
        return this;
    }
    public String getEncryptedRandomNo() {
        return this.encryptedRandomNo;
    }

    public QueryGeneralRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public QueryGeneralRequest setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public QueryGeneralRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryGeneralRequest setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }
    public String getMobileNo() {
        return this.mobileNo;
    }

    public QueryGeneralRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryGeneralRequest setLbs(String lbs) {
        this.lbs = lbs;
        return this;
    }
    public String getLbs() {
        return this.lbs;
    }

    public QueryGeneralRequest setSalesAmount(String salesAmount) {
        this.salesAmount = salesAmount;
        return this;
    }
    public String getSalesAmount() {
        return this.salesAmount;
    }

    public QueryGeneralRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public QueryGeneralRequest setGuid(String guid) {
        this.guid = guid;
        return this;
    }
    public String getGuid() {
        return this.guid;
    }

    public QueryGeneralRequest setBizLicenseNo(String bizLicenseNo) {
        this.bizLicenseNo = bizLicenseNo;
        return this;
    }
    public String getBizLicenseNo() {
        return this.bizLicenseNo;
    }

    public QueryGeneralRequest setSecLoadTest(String secLoadTest) {
        this.secLoadTest = secLoadTest;
        return this;
    }
    public String getSecLoadTest() {
        return this.secLoadTest;
    }

    public QueryGeneralRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
