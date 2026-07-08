// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class ApplyCutpaymentPaymentRequest extends TeaModel {
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

    // 支付订单id
    @NameInMap("trans_id")
    @Validation(required = true)
    public String transId;

    // 签约协议号
    @NameInMap("protocol_no")
    @Validation(required = true)
    public String protocolNo;

    // 银行卡卡号
    @NameInMap("card_no")
    @Validation(required = true)
    public String cardNo;

    // 用户姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 交易金额，整数，单位:分
    @NameInMap("txn_amt")
    @Validation(required = true)
    public String txnAmt;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 安全码
    @NameInMap("security_code")
    public String securityCode;

    // 有效期
    @NameInMap("valid_date")
    public String validDate;

    // 分账信息
    @NameInMap("share_info")
    public String shareInfo;

    public static ApplyCutpaymentPaymentRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyCutpaymentPaymentRequest self = new ApplyCutpaymentPaymentRequest();
        return TeaModel.build(map, self);
    }

    public ApplyCutpaymentPaymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyCutpaymentPaymentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyCutpaymentPaymentRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public ApplyCutpaymentPaymentRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public ApplyCutpaymentPaymentRequest setEncryptToken(String encryptToken) {
        this.encryptToken = encryptToken;
        return this;
    }
    public String getEncryptToken() {
        return this.encryptToken;
    }

    public ApplyCutpaymentPaymentRequest setTransId(String transId) {
        this.transId = transId;
        return this;
    }
    public String getTransId() {
        return this.transId;
    }

    public ApplyCutpaymentPaymentRequest setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo;
        return this;
    }
    public String getProtocolNo() {
        return this.protocolNo;
    }

    public ApplyCutpaymentPaymentRequest setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public ApplyCutpaymentPaymentRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public ApplyCutpaymentPaymentRequest setTxnAmt(String txnAmt) {
        this.txnAmt = txnAmt;
        return this;
    }
    public String getTxnAmt() {
        return this.txnAmt;
    }

    public ApplyCutpaymentPaymentRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ApplyCutpaymentPaymentRequest setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
        return this;
    }
    public String getSecurityCode() {
        return this.securityCode;
    }

    public ApplyCutpaymentPaymentRequest setValidDate(String validDate) {
        this.validDate = validDate;
        return this;
    }
    public String getValidDate() {
        return this.validDate;
    }

    public ApplyCutpaymentPaymentRequest setShareInfo(String shareInfo) {
        this.shareInfo = shareInfo;
        return this;
    }
    public String getShareInfo() {
        return this.shareInfo;
    }

}
