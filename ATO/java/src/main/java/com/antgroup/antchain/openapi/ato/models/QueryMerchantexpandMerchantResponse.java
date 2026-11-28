// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryMerchantexpandMerchantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商户入驻状态
    // INIT 入驻中
    // SUCCESS 入驻成功
    // FAIL 入驻失败
    // MERCHANT_CONFIRM 待商户B站确认
    // SUB_MERCHANT_CREDIT 二级户商户签约中
    @NameInMap("enrollment_status")
    public String enrollmentStatus;

    // 入驻失败原因
    @NameInMap("fail_reason")
    public String failReason;

    // 商户进件流程待办事件跳转链接
    @NameInMap("pending_event_link")
    public String pendingEventLink;

    // 京东进件成功二级商户id
    @NameInMap("sub_merchant_id")
    public String subMerchantId;

    // 京东支付类型
    // PROTOCOL_PAY	协议支付	
    // AGGREGATE_PAY	聚合支付
    @NameInMap("product_service")
    public String productService;

    // 京东支付工具码
    // EXPR	快捷
    // WECHAT	微信
    // ALIPAY	支付宝
    @NameInMap("pay_tool_code")
    public String payToolCode;

    public static QueryMerchantexpandMerchantResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantexpandMerchantResponse self = new QueryMerchantexpandMerchantResponse();
        return TeaModel.build(map, self);
    }

    public QueryMerchantexpandMerchantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMerchantexpandMerchantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMerchantexpandMerchantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMerchantexpandMerchantResponse setEnrollmentStatus(String enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
        return this;
    }
    public String getEnrollmentStatus() {
        return this.enrollmentStatus;
    }

    public QueryMerchantexpandMerchantResponse setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

    public QueryMerchantexpandMerchantResponse setPendingEventLink(String pendingEventLink) {
        this.pendingEventLink = pendingEventLink;
        return this;
    }
    public String getPendingEventLink() {
        return this.pendingEventLink;
    }

    public QueryMerchantexpandMerchantResponse setSubMerchantId(String subMerchantId) {
        this.subMerchantId = subMerchantId;
        return this;
    }
    public String getSubMerchantId() {
        return this.subMerchantId;
    }

    public QueryMerchantexpandMerchantResponse setProductService(String productService) {
        this.productService = productService;
        return this;
    }
    public String getProductService() {
        return this.productService;
    }

    public QueryMerchantexpandMerchantResponse setPayToolCode(String payToolCode) {
        this.payToolCode = payToolCode;
        return this;
    }
    public String getPayToolCode() {
        return this.payToolCode;
    }

}
