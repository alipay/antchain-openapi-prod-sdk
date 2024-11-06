// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class PushModelSamplefileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 轮训编码
    @NameInMap("loop_code")
    public String loopCode;

    public static PushModelSamplefileResponse build(java.util.Map<String, ?> map) throws Exception {
        PushModelSamplefileResponse self = new PushModelSamplefileResponse();
        return TeaModel.build(map, self);
    }

    public PushModelSamplefileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushModelSamplefileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushModelSamplefileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushModelSamplefileResponse setLoopCode(String loopCode) {
        this.loopCode = loopCode;
        return this;
    }
    public String getLoopCode() {
        return this.loopCode;
    }

}
