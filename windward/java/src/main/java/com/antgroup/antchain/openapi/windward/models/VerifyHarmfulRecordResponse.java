// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.windward.models;

import com.aliyun.tea.*;

public class VerifyHarmfulRecordResponse extends TeaModel {
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

    public static VerifyHarmfulRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyHarmfulRecordResponse self = new VerifyHarmfulRecordResponse();
        return TeaModel.build(map, self);
    }

    public VerifyHarmfulRecordResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyHarmfulRecordResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyHarmfulRecordResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyHarmfulRecordResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
