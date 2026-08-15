// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class SaveOmngGenerationtaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 创建结果
    // 成功：success
    // 创建中：creating
    // 失败：fail
    @NameInMap("result")
    public String result;

    // 失败原因
    @NameInMap("fail_msg")
    public String failMsg;

    public static SaveOmngGenerationtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveOmngGenerationtaskResponse self = new SaveOmngGenerationtaskResponse();
        return TeaModel.build(map, self);
    }

    public SaveOmngGenerationtaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SaveOmngGenerationtaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveOmngGenerationtaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SaveOmngGenerationtaskResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public SaveOmngGenerationtaskResponse setFailMsg(String failMsg) {
        this.failMsg = failMsg;
        return this;
    }
    public String getFailMsg() {
        return this.failMsg;
    }

}
