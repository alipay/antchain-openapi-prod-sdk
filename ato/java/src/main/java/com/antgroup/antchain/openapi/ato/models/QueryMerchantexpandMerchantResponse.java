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
    @NameInMap("enrollment_status")
    public String enrollmentStatus;

    // 入驻失败原因
    @NameInMap("fail_reason")
    public String failReason;

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

}
