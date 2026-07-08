// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCutpaymentPaymentRequest extends TeaModel {
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

    // 签约协议号
    @NameInMap("protocol_no")
    @Validation(required = true)
    public String protocolNo;

    // 支付交易商户订单号
    @NameInMap("trans_id")
    @Validation(required = true)
    public String transId;

    // 交易日期yyyy-MM-dd HH:mm:ss
    @NameInMap("orig_trade_date")
    @Validation(required = true)
    public String origTradeDate;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static QueryCutpaymentPaymentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCutpaymentPaymentRequest self = new QueryCutpaymentPaymentRequest();
        return TeaModel.build(map, self);
    }

    public QueryCutpaymentPaymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCutpaymentPaymentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCutpaymentPaymentRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryCutpaymentPaymentRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public QueryCutpaymentPaymentRequest setEncryptToken(String encryptToken) {
        this.encryptToken = encryptToken;
        return this;
    }
    public String getEncryptToken() {
        return this.encryptToken;
    }

    public QueryCutpaymentPaymentRequest setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo;
        return this;
    }
    public String getProtocolNo() {
        return this.protocolNo;
    }

    public QueryCutpaymentPaymentRequest setTransId(String transId) {
        this.transId = transId;
        return this;
    }
    public String getTransId() {
        return this.transId;
    }

    public QueryCutpaymentPaymentRequest setOrigTradeDate(String origTradeDate) {
        this.origTradeDate = origTradeDate;
        return this;
    }
    public String getOrigTradeDate() {
        return this.origTradeDate;
    }

    public QueryCutpaymentPaymentRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
