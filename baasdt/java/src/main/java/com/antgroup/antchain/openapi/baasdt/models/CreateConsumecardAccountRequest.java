// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateConsumecardAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权函地址
    @NameInMap("authorization_address")
    public String authorizationAddress;

    // 是否有采购/消费权限
    @NameInMap("auth_consumer")
    @Validation(required = true)
    public Boolean authConsumer;

    // 是否有供应权限
    @NameInMap("auth_provider")
    @Validation(required = true)
    public Boolean authProvider;

    // 业务系统幂等Id,防止同一笔交易重复发送(接入方传入)
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 认证方id(如: 支付宝的用户Id)
    @NameInMap("certification_id")
    @Validation(required = true)
    public String certificationId;

    // 支持多链多合约,该参数为指明需要操作哪个智能合约环境
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 手机号国家编码
    @NameInMap("country_code")
    @Validation(required = true)
    public String countryCode;

    // 账户描述
    @NameInMap("description")
    public String description;

    // 个人用户的身份证号码/机构的企业编号
    @NameInMap("id_number")
    @Validation(required = true)
    public String idNumber;

    // 证件类型：0 身份证, 1 护照, 2 军官证, 3 回乡证, 4 港澳证件, 5 营业执照, 6 港澳居民来往内地通行证, 7 台湾居民来往内地通行证, 8 港澳居民居住证, 9 台湾居民居住证, 10事业单位登记证书, 11 社会团体登记证书, 12 民办非企业单位证书, 13 党政机关批准设计文件, 14 全国组织机构代码证书, 15 其他证件
    @NameInMap("id_type")
    @Validation(required = true)
    public Long idType;

    // 开户影像信息（BASE64格式传入）
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // 外部系统传入的交易备注信息(必填)
    @NameInMap("memo")
    @Validation(required = true)
    public String memo;

    // 邮箱地址(机构注册必传)
    @NameInMap("email")
    public String email;

    // 个人用户的手机号码/机构用户的联系电话(必填)
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 场景码(需要申请)
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 平台归属机构的链上账户Id(账户可以归属在一个机构下)
    @NameInMap("relegation_account_id")
    public String relegationAccountId;

    // 角色(1 机构, 2 个人)
    @NameInMap("role_type")
    @Validation(required = true)
    public Long roleType;

    // 外部系统对该个人用户/机构的内部编号,用于唯一识别该用户
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 个人用户姓名/机构名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 提现银行卡
    @NameInMap("withdraw_bank_card_id")
    public String withdrawBankCardId;

    public static CreateConsumecardAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumecardAccountRequest self = new CreateConsumecardAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsumecardAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateConsumecardAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateConsumecardAccountRequest setAuthorizationAddress(String authorizationAddress) {
        this.authorizationAddress = authorizationAddress;
        return this;
    }
    public String getAuthorizationAddress() {
        return this.authorizationAddress;
    }

    public CreateConsumecardAccountRequest setAuthConsumer(Boolean authConsumer) {
        this.authConsumer = authConsumer;
        return this;
    }
    public Boolean getAuthConsumer() {
        return this.authConsumer;
    }

    public CreateConsumecardAccountRequest setAuthProvider(Boolean authProvider) {
        this.authProvider = authProvider;
        return this;
    }
    public Boolean getAuthProvider() {
        return this.authProvider;
    }

    public CreateConsumecardAccountRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateConsumecardAccountRequest setCertificationId(String certificationId) {
        this.certificationId = certificationId;
        return this;
    }
    public String getCertificationId() {
        return this.certificationId;
    }

    public CreateConsumecardAccountRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public CreateConsumecardAccountRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public CreateConsumecardAccountRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConsumecardAccountRequest setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public CreateConsumecardAccountRequest setIdType(Long idType) {
        this.idType = idType;
        return this;
    }
    public Long getIdType() {
        return this.idType;
    }

    public CreateConsumecardAccountRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public CreateConsumecardAccountRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CreateConsumecardAccountRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateConsumecardAccountRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CreateConsumecardAccountRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateConsumecardAccountRequest setRelegationAccountId(String relegationAccountId) {
        this.relegationAccountId = relegationAccountId;
        return this;
    }
    public String getRelegationAccountId() {
        return this.relegationAccountId;
    }

    public CreateConsumecardAccountRequest setRoleType(Long roleType) {
        this.roleType = roleType;
        return this;
    }
    public Long getRoleType() {
        return this.roleType;
    }

    public CreateConsumecardAccountRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateConsumecardAccountRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateConsumecardAccountRequest setWithdrawBankCardId(String withdrawBankCardId) {
        this.withdrawBankCardId = withdrawBankCardId;
        return this;
    }
    public String getWithdrawBankCardId() {
        return this.withdrawBankCardId;
    }

}
