// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class CheckEasMdetectionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 检查结果
    @NameInMap("check_result")
    public Boolean checkResult;

    // 检查结果码
    @NameInMap("check_code")
    public String checkCode;

    // 检查消息
    @NameInMap("check_message")
    public String checkMessage;

    public static CheckEasMdetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckEasMdetectionResponse self = new CheckEasMdetectionResponse();
        return TeaModel.build(map, self);
    }

    public CheckEasMdetectionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckEasMdetectionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckEasMdetectionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckEasMdetectionResponse setCheckResult(Boolean checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public Boolean getCheckResult() {
        return this.checkResult;
    }

    public CheckEasMdetectionResponse setCheckCode(String checkCode) {
        this.checkCode = checkCode;
        return this;
    }
    public String getCheckCode() {
        return this.checkCode;
    }

    public CheckEasMdetectionResponse setCheckMessage(String checkMessage) {
        this.checkMessage = checkMessage;
        return this;
    }
    public String getCheckMessage() {
        return this.checkMessage;
    }

}
