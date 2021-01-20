// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ExecConfigParseResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 渲染后的参数列表
    @NameInMap("data")
    public java.util.List<RenderParam> data;

    public static ExecConfigParseResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecConfigParseResponse self = new ExecConfigParseResponse();
        return TeaModel.build(map, self);
    }

    public ExecConfigParseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecConfigParseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecConfigParseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecConfigParseResponse setData(java.util.List<RenderParam> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RenderParam> getData() {
        return this.data;
    }

}
