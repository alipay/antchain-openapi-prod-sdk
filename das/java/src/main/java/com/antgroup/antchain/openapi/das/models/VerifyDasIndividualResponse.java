// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class VerifyDasIndividualResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 核验结果
    @NameInMap("success")
    public Boolean success;

    // 核验失败原因
    @NameInMap("failed_reason")
    public String failedReason;

    public static VerifyDasIndividualResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyDasIndividualResponse self = new VerifyDasIndividualResponse();
        return TeaModel.build(map, self);
    }

    public VerifyDasIndividualResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyDasIndividualResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyDasIndividualResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyDasIndividualResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public VerifyDasIndividualResponse setFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }
    public String getFailedReason() {
        return this.failedReason;
    }

}
