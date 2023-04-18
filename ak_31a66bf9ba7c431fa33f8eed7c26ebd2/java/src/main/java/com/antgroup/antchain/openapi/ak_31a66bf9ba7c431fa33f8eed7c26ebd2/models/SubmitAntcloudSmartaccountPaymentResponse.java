// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_31a66bf9ba7c431fa33f8eed7c26ebd2.models;

import com.aliyun.tea.*;

public class SubmitAntcloudSmartaccountPaymentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务返回
    @NameInMap("biz_result")
    public BizResult bizResult;

    public static SubmitAntcloudSmartaccountPaymentResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAntcloudSmartaccountPaymentResponse self = new SubmitAntcloudSmartaccountPaymentResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAntcloudSmartaccountPaymentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitAntcloudSmartaccountPaymentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitAntcloudSmartaccountPaymentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitAntcloudSmartaccountPaymentResponse setBizResult(BizResult bizResult) {
        this.bizResult = bizResult;
        return this;
    }
    public BizResult getBizResult() {
        return this.bizResult;
    }

}
