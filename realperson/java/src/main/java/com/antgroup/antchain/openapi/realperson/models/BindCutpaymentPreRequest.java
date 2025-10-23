// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class BindCutpaymentPreRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 入参加密模式：
    // "0"（默认值）：不加密；
    // "6"：AES加密
    // 默认为"0"
    @NameInMap("encrypt_type")
    public String encryptType;

    // 加密密钥
    @NameInMap("encrypt_token")
    public String encryptToken;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 银行卡类型
    // 0：借记卡
    // 1：信用卡
    @NameInMap("card_type")
    @Validation(required = true)
    public String cardType;

    // 银行卡属性
    // 0私人，1公司。不填时，默认为私人0
    @NameInMap("card_pro")
    public String cardPro;

    // 银行卡卡号
    @NameInMap("card_no")
    @Validation(required = true)
    public String cardNo;

    // 证件类型
    // 0：身份证
    // 1：港澳居民居住证
    // 2：台湾居民居住证
    // 3：外国人永久居住证
    @NameInMap("id_card_type")
    @Validation(required = true)
    public String idCardType;

    // 持卡人姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 证件号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 银行卡安全码
    @NameInMap("security_code")
    public String securityCode;

    // 银行卡有期（格式为：YYMM）
    @NameInMap("valid_date")
    public String validDate;

    public static BindCutpaymentPreRequest build(java.util.Map<String, ?> map) throws Exception {
        BindCutpaymentPreRequest self = new BindCutpaymentPreRequest();
        return TeaModel.build(map, self);
    }

    public BindCutpaymentPreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindCutpaymentPreRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindCutpaymentPreRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public BindCutpaymentPreRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public BindCutpaymentPreRequest setEncryptToken(String encryptToken) {
        this.encryptToken = encryptToken;
        return this;
    }
    public String getEncryptToken() {
        return this.encryptToken;
    }

    public BindCutpaymentPreRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public BindCutpaymentPreRequest setCardType(String cardType) {
        this.cardType = cardType;
        return this;
    }
    public String getCardType() {
        return this.cardType;
    }

    public BindCutpaymentPreRequest setCardPro(String cardPro) {
        this.cardPro = cardPro;
        return this;
    }
    public String getCardPro() {
        return this.cardPro;
    }

    public BindCutpaymentPreRequest setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public BindCutpaymentPreRequest setIdCardType(String idCardType) {
        this.idCardType = idCardType;
        return this;
    }
    public String getIdCardType() {
        return this.idCardType;
    }

    public BindCutpaymentPreRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public BindCutpaymentPreRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public BindCutpaymentPreRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public BindCutpaymentPreRequest setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
        return this;
    }
    public String getSecurityCode() {
        return this.securityCode;
    }

    public BindCutpaymentPreRequest setValidDate(String validDate) {
        this.validDate = validDate;
        return this;
    }
    public String getValidDate() {
        return this.validDate;
    }

}
