// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UpdateConsumecardAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
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

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 认证方id
    @NameInMap("certification_id")
    @Validation(required = true)
    public String certificationId;

    // 商户描述
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

    // 账户映像资料
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // 邮箱地址(机构注册必传)
    @NameInMap("email")
    public String email;

    // 个人用户的手机号码/机构用户的联系电话(必填)
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 个人用户姓名/机构名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 提现银行卡
    @NameInMap("withdraw_bank_card_id")
    public String withdrawBankCardId;

    public static UpdateConsumecardAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConsumecardAccountRequest self = new UpdateConsumecardAccountRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConsumecardAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateConsumecardAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateConsumecardAccountRequest setAuthorizationAddress(String authorizationAddress) {
        this.authorizationAddress = authorizationAddress;
        return this;
    }
    public String getAuthorizationAddress() {
        return this.authorizationAddress;
    }

    public UpdateConsumecardAccountRequest setAuthConsumer(Boolean authConsumer) {
        this.authConsumer = authConsumer;
        return this;
    }
    public Boolean getAuthConsumer() {
        return this.authConsumer;
    }

    public UpdateConsumecardAccountRequest setAuthProvider(Boolean authProvider) {
        this.authProvider = authProvider;
        return this;
    }
    public Boolean getAuthProvider() {
        return this.authProvider;
    }

    public UpdateConsumecardAccountRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public UpdateConsumecardAccountRequest setCertificationId(String certificationId) {
        this.certificationId = certificationId;
        return this;
    }
    public String getCertificationId() {
        return this.certificationId;
    }

    public UpdateConsumecardAccountRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateConsumecardAccountRequest setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public UpdateConsumecardAccountRequest setIdType(Long idType) {
        this.idType = idType;
        return this;
    }
    public Long getIdType() {
        return this.idType;
    }

    public UpdateConsumecardAccountRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public UpdateConsumecardAccountRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateConsumecardAccountRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public UpdateConsumecardAccountRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public UpdateConsumecardAccountRequest setWithdrawBankCardId(String withdrawBankCardId) {
        this.withdrawBankCardId = withdrawBankCardId;
        return this;
    }
    public String getWithdrawBankCardId() {
        return this.withdrawBankCardId;
    }

}
