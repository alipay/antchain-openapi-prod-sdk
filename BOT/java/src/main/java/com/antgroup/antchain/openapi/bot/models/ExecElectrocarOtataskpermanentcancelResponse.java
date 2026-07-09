// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ExecElectrocarOtataskpermanentcancelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否全部取消成功
    @NameInMap("success")
    public Boolean success;

    // 每个取消项的处理结果
    @NameInMap("results")
    public java.util.List<IotxOtaTaskPermanentCancelResult> results;

    public static ExecElectrocarOtataskpermanentcancelResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecElectrocarOtataskpermanentcancelResponse self = new ExecElectrocarOtataskpermanentcancelResponse();
        return TeaModel.build(map, self);
    }

    public ExecElectrocarOtataskpermanentcancelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecElectrocarOtataskpermanentcancelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecElectrocarOtataskpermanentcancelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecElectrocarOtataskpermanentcancelResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExecElectrocarOtataskpermanentcancelResponse setResults(java.util.List<IotxOtaTaskPermanentCancelResult> results) {
        this.results = results;
        return this;
    }
    public java.util.List<IotxOtaTaskPermanentCancelResult> getResults() {
        return this.results;
    }

}
