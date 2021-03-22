// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ConsumeCardAccount extends TeaModel {
    // 授权函地址
    @NameInMap("authorization_address")
    @Validation(required = true)
    public String authorizationAddress;

    // 认证方id
    @NameInMap("certification_id")
    @Validation(required = true)
    public String certificationId;

    // 描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 分布式身份ID
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 是否有权限采购商品
    @NameInMap("auth_consumer")
    @Validation(required = true)
    public Boolean authConsumer;

    // 是否有权限发行商品
    @NameInMap("auth_provider")
    @Validation(required = true)
    public Boolean authProvider;

    // 个人用户的身份证号码/机构的企业编号
    @NameInMap("id_number")
    @Validation(required = true)
    public String idNumber;

    // 证件类型：0 身份证, 1 护照, 2 军官证, 3 回乡证, 4 港澳证件, 5 营业执照, 6 港澳居民来往内地通行证, 7 台湾居民来往内地通行证, 8 港澳居民居住证, 9 台湾居民居住证, 10事业单位登记证书, 11 社会团体登记证书, 12 民办非企业单位证书, 13 党政机关批准设计文件, 14 全国组织机构代码证书, 15 其他证件
    @NameInMap("id_type")
    @Validation(required = true)
    public Long idType;

    // 个人用户的手机号码/机构用户的联系电话或邮箱(必填)
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 商户状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 是否可以发行资产
    @NameInMap("token_issuer")
    @Validation(required = true)
    public Boolean tokenIssuer;

    // 账户创建类型（0:用户，1:商户）
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 账户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 账户名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 提现银行卡
    @NameInMap("withdraw_bank_card_id")
    @Validation(required = true)
    public String withdrawBankCardId;

    // 账户影响信息
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // 账户邮箱
    @NameInMap("email")
    @Validation(required = true)
    public String email;

    public static ConsumeCardAccount build(java.util.Map<String, ?> map) throws Exception {
        ConsumeCardAccount self = new ConsumeCardAccount();
        return TeaModel.build(map, self);
    }

    public ConsumeCardAccount setAuthorizationAddress(String authorizationAddress) {
        this.authorizationAddress = authorizationAddress;
        return this;
    }
    public String getAuthorizationAddress() {
        return this.authorizationAddress;
    }

    public ConsumeCardAccount setCertificationId(String certificationId) {
        this.certificationId = certificationId;
        return this;
    }
    public String getCertificationId() {
        return this.certificationId;
    }

    public ConsumeCardAccount setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ConsumeCardAccount setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public ConsumeCardAccount setAuthConsumer(Boolean authConsumer) {
        this.authConsumer = authConsumer;
        return this;
    }
    public Boolean getAuthConsumer() {
        return this.authConsumer;
    }

    public ConsumeCardAccount setAuthProvider(Boolean authProvider) {
        this.authProvider = authProvider;
        return this;
    }
    public Boolean getAuthProvider() {
        return this.authProvider;
    }

    public ConsumeCardAccount setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public ConsumeCardAccount setIdType(Long idType) {
        this.idType = idType;
        return this;
    }
    public Long getIdType() {
        return this.idType;
    }

    public ConsumeCardAccount setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ConsumeCardAccount setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public ConsumeCardAccount setTokenIssuer(Boolean tokenIssuer) {
        this.tokenIssuer = tokenIssuer;
        return this;
    }
    public Boolean getTokenIssuer() {
        return this.tokenIssuer;
    }

    public ConsumeCardAccount setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public ConsumeCardAccount setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ConsumeCardAccount setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ConsumeCardAccount setWithdrawBankCardId(String withdrawBankCardId) {
        this.withdrawBankCardId = withdrawBankCardId;
        return this;
    }
    public String getWithdrawBankCardId() {
        return this.withdrawBankCardId;
    }

    public ConsumeCardAccount setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public ConsumeCardAccount setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

}
