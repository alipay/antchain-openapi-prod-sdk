// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tftus.models;

import com.aliyun.tea.*;

public class UploadSpdbWtpResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果状态
    @NameInMap("result_status")
    public String resultStatus;

    // 结果信息
    @NameInMap("result_message")
    public String resultMessage;

    public static UploadSpdbWtpResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadSpdbWtpResponse self = new UploadSpdbWtpResponse();
        return TeaModel.build(map, self);
    }

    public UploadSpdbWtpResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadSpdbWtpResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadSpdbWtpResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadSpdbWtpResponse setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
        return this;
    }
    public String getResultStatus() {
        return this.resultStatus;
    }

    public UploadSpdbWtpResponse setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

}
