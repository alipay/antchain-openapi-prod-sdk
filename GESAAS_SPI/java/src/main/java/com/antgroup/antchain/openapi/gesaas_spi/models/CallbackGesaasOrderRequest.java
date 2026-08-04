// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas_spi.models;

import com.aliyun.tea.*;

public class CallbackGesaasOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // PAY_RESULT_MSG：支付结果通知
    // SETTLE_SPLIT_RESULT_MSG ：分账结果通知
    // REFUND_SPLIT_RESULT_MSG：退款退分账结果通知
    @NameInMap("msg_type")
    @Validation(required = true)
    public String msgType;

    // 消息唯一性判断，失败重试msgId不变
    // 即使消息重投、该字段也不会变动
    @NameInMap("msg_id")
    @Validation(required = true)
    public String msgId;

    // traceId， 每一次投递生成唯一id
    // 消息重投后、该字段会变化
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 订单所属商户的社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 类型；JSONString字符串
    // 说明：根据不同的msgType类型，messageBody说明如下
    @NameInMap("message_body")
    @Validation(required = true)
    public String messageBody;

    public static CallbackGesaasOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackGesaasOrderRequest self = new CallbackGesaasOrderRequest();
        return TeaModel.build(map, self);
    }

    public CallbackGesaasOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackGesaasOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackGesaasOrderRequest setMsgType(String msgType) {
        this.msgType = msgType;
        return this;
    }
    public String getMsgType() {
        return this.msgType;
    }

    public CallbackGesaasOrderRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public CallbackGesaasOrderRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public CallbackGesaasOrderRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CallbackGesaasOrderRequest setMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }
    public String getMessageBody() {
        return this.messageBody;
    }

}
