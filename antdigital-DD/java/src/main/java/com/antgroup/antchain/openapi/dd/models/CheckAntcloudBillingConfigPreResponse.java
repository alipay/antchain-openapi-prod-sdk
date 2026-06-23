// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class CheckAntcloudBillingConfigPreResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 对比对象
    @NameInMap("result")
    public FeeConfChangeVO result;

    public static CheckAntcloudBillingConfigPreResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAntcloudBillingConfigPreResponse self = new CheckAntcloudBillingConfigPreResponse();
        return TeaModel.build(map, self);
    }

    public CheckAntcloudBillingConfigPreResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckAntcloudBillingConfigPreResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckAntcloudBillingConfigPreResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckAntcloudBillingConfigPreResponse setResult(FeeConfChangeVO result) {
        this.result = result;
        return this;
    }
    public FeeConfChangeVO getResult() {
        return this.result;
    }

}
