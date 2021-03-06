// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class InitCpfVerifyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 核身初始化返回信息
    @NameInMap("result_obj")
    public String resultObj;

    public static InitCpfVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        InitCpfVerifyResponse self = new InitCpfVerifyResponse();
        return TeaModel.build(map, self);
    }

    public InitCpfVerifyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitCpfVerifyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitCpfVerifyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitCpfVerifyResponse setResultObj(String resultObj) {
        this.resultObj = resultObj;
        return this;
    }
    public String getResultObj() {
        return this.resultObj;
    }

}
