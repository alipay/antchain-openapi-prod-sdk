// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dsg.models;

import com.aliyun.tea.*;

public class ExecDocumentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 识别并脱敏后的文本
    @NameInMap("result")
    public String result;

    public static ExecDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDocumentResponse self = new ExecDocumentResponse();
        return TeaModel.build(map, self);
    }

    public ExecDocumentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecDocumentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecDocumentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecDocumentResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
