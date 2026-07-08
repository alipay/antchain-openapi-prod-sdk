// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class ApplyCutpaymentRefundRequest extends TeaModel {
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

    // 原支付商户订单号
    @NameInMap("payment_trans_id")
    @Validation(required = true)
    public String paymentTransId;

    // 签约协议号
    @NameInMap("protocol_no")
    @Validation(required = true)
    public String protocolNo;

    // 退款商户订单号
    @NameInMap("refund_trans_id")
    @Validation(required = true)
    public String refundTransId;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 退款商户流水号
    @NameInMap("refund_serial_no")
    @Validation(required = true)
    public String refundSerialNo;

    // 退款原因
    @NameInMap("refund_reason")
    @Validation(required = true)
    public String refundReason;

    // 退款金额，整数，单位:分
    @NameInMap("refund_amt")
    @Validation(required = true)
    public String refundAmt;

    // 分账退款信息
    @NameInMap("share_refund_info")
    public String shareRefundInfo;

    public static ApplyCutpaymentRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyCutpaymentRefundRequest self = new ApplyCutpaymentRefundRequest();
        return TeaModel.build(map, self);
    }

    public ApplyCutpaymentRefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyCutpaymentRefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyCutpaymentRefundRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public ApplyCutpaymentRefundRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public ApplyCutpaymentRefundRequest setEncryptToken(String encryptToken) {
        this.encryptToken = encryptToken;
        return this;
    }
    public String getEncryptToken() {
        return this.encryptToken;
    }

    public ApplyCutpaymentRefundRequest setPaymentTransId(String paymentTransId) {
        this.paymentTransId = paymentTransId;
        return this;
    }
    public String getPaymentTransId() {
        return this.paymentTransId;
    }

    public ApplyCutpaymentRefundRequest setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo;
        return this;
    }
    public String getProtocolNo() {
        return this.protocolNo;
    }

    public ApplyCutpaymentRefundRequest setRefundTransId(String refundTransId) {
        this.refundTransId = refundTransId;
        return this;
    }
    public String getRefundTransId() {
        return this.refundTransId;
    }

    public ApplyCutpaymentRefundRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ApplyCutpaymentRefundRequest setRefundSerialNo(String refundSerialNo) {
        this.refundSerialNo = refundSerialNo;
        return this;
    }
    public String getRefundSerialNo() {
        return this.refundSerialNo;
    }

    public ApplyCutpaymentRefundRequest setRefundReason(String refundReason) {
        this.refundReason = refundReason;
        return this;
    }
    public String getRefundReason() {
        return this.refundReason;
    }

    public ApplyCutpaymentRefundRequest setRefundAmt(String refundAmt) {
        this.refundAmt = refundAmt;
        return this;
    }
    public String getRefundAmt() {
        return this.refundAmt;
    }

    public ApplyCutpaymentRefundRequest setShareRefundInfo(String shareRefundInfo) {
        this.shareRefundInfo = shareRefundInfo;
        return this;
    }
    public String getShareRefundInfo() {
        return this.shareRefundInfo;
    }

}
