// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerWithholdsignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 协议当前状态
    // 1. UNSIGNED：未签约
    // 2. SIGNED：已签约；
    // 3.APPLY_TERMINATE:申请解约
    // 4. TERMINATED：已解约
    // 5.TIMEOUT_CLOSE:超时关闭
    @NameInMap("status")
    public String status;

    // 支付宝代扣协议号
    @NameInMap("agreement_no")
    public String agreementNo;

    // 协议签署时间
    // yyyy-MM-dd HH:mm:ss 格式
    @NameInMap("sign_time")
    public String signTime;

    // 协议生效时间
    // yyyy-MM-dd HH:mm:ss 格式
    @NameInMap("valid_time")
    public String validTime;

    // 协议失效时间
    // yyyy-MM-dd HH:mm:ss 格式
    @NameInMap("invalid_time")
    public String invalidTime;

    public static QueryInnerWithholdsignResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerWithholdsignResponse self = new QueryInnerWithholdsignResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerWithholdsignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerWithholdsignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerWithholdsignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerWithholdsignResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryInnerWithholdsignResponse setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public QueryInnerWithholdsignResponse setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

    public QueryInnerWithholdsignResponse setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

    public QueryInnerWithholdsignResponse setInvalidTime(String invalidTime) {
        this.invalidTime = invalidTime;
        return this;
    }
    public String getInvalidTime() {
        return this.invalidTime;
    }

}
