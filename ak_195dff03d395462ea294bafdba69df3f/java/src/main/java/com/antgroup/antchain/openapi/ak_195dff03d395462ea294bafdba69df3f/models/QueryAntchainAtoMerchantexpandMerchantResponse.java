// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoMerchantexpandMerchantResponse extends TeaModel {
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

    public static QueryAntchainAtoMerchantexpandMerchantResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoMerchantexpandMerchantResponse self = new QueryAntchainAtoMerchantexpandMerchantResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoMerchantexpandMerchantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainAtoMerchantexpandMerchantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainAtoMerchantexpandMerchantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainAtoMerchantexpandMerchantResponse setEnrollmentStatus(String enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
        return this;
    }
    public String getEnrollmentStatus() {
        return this.enrollmentStatus;
    }

    public QueryAntchainAtoMerchantexpandMerchantResponse setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

    public QueryAntchainAtoMerchantexpandMerchantResponse setPendingEventLink(String pendingEventLink) {
        this.pendingEventLink = pendingEventLink;
        return this;
    }
    public String getPendingEventLink() {
        return this.pendingEventLink;
    }

    public QueryAntchainAtoMerchantexpandMerchantResponse setSubMerchantId(String subMerchantId) {
        this.subMerchantId = subMerchantId;
        return this;
    }
    public String getSubMerchantId() {
        return this.subMerchantId;
    }

}
