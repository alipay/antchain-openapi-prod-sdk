// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetNotaryTextResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 存证信息
    @NameInMap("content")
    public String content;

    // 可信信息
    @NameInMap("tsr")
    public TsrResponse tsr;

    public static GetNotaryTextResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNotaryTextResponse self = new GetNotaryTextResponse();
        return TeaModel.build(map, self);
    }

    public GetNotaryTextResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetNotaryTextResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetNotaryTextResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetNotaryTextResponse setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetNotaryTextResponse setTsr(TsrResponse tsr) {
        this.tsr = tsr;
        return this;
    }
    public TsrResponse getTsr() {
        return this.tsr;
    }

}
