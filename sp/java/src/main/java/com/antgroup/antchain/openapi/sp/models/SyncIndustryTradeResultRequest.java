// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class SyncIndustryTradeResultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_access_code")
    public String productAccessCode;

    // 外部商户订单号，不超过32位
    @NameInMap("merchant_order_no")
    @Validation(required = true)
    public String merchantOrderNo;

    // 原支付请求的商户订单号
    @NameInMap("out_trade_no")
    @Validation(required = true)
    public String outTradeNo;

    // 支付宝交易号
    @NameInMap("trade_no")
    @Validation(required = true)
    public String tradeNo;

    // 交易状态。
    // WAIT_BUYER_PAY	交易创建，等待买家付款。
    // TRADE_CLOSED	未付款交易超时关闭，或支付完成后全额退款。
    // TRADE_SUCCESS	交易支付成功。
    @NameInMap("trade_status")
    @Validation(required = true)
    public String tradeStatus;

    // 错误码。
    @NameInMap("error_code")
    public String errorCode;

    // 错误原因
    @NameInMap("error_msg")
    public String errorMsg;

    // 渠道 自营平台、第三方平台等
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    public static SyncIndustryTradeResultRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncIndustryTradeResultRequest self = new SyncIndustryTradeResultRequest();
        return TeaModel.build(map, self);
    }

    public SyncIndustryTradeResultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncIndustryTradeResultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncIndustryTradeResultRequest setProductAccessCode(String productAccessCode) {
        this.productAccessCode = productAccessCode;
        return this;
    }
    public String getProductAccessCode() {
        return this.productAccessCode;
    }

    public SyncIndustryTradeResultRequest setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
        return this;
    }
    public String getMerchantOrderNo() {
        return this.merchantOrderNo;
    }

    public SyncIndustryTradeResultRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public SyncIndustryTradeResultRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public SyncIndustryTradeResultRequest setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
        return this;
    }
    public String getTradeStatus() {
        return this.tradeStatus;
    }

    public SyncIndustryTradeResultRequest setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SyncIndustryTradeResultRequest setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SyncIndustryTradeResultRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

}
