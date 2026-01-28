// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class GetComsumeJdResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 状态码：SUCCESS/FAIL
    @NameInMap("code")
    public String code;

    // 结果描述：成功或失败原因
    @NameInMap("message")
    public String message;

    public static GetComsumeJdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetComsumeJdResponse self = new GetComsumeJdResponse();
        return TeaModel.build(map, self);
    }

    public GetComsumeJdResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetComsumeJdResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetComsumeJdResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetComsumeJdResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetComsumeJdResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
