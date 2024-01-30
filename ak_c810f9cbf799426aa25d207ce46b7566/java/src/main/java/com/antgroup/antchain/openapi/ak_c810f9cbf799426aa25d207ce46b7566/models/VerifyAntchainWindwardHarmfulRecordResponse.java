// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_c810f9cbf799426aa25d207ce46b7566.models;

import com.aliyun.tea.*;

public class VerifyAntchainWindwardHarmfulRecordResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 系统响应
    @NameInMap("status")
    public String status;

    public static VerifyAntchainWindwardHarmfulRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyAntchainWindwardHarmfulRecordResponse self = new VerifyAntchainWindwardHarmfulRecordResponse();
        return TeaModel.build(map, self);
    }

    public VerifyAntchainWindwardHarmfulRecordResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyAntchainWindwardHarmfulRecordResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyAntchainWindwardHarmfulRecordResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyAntchainWindwardHarmfulRecordResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
