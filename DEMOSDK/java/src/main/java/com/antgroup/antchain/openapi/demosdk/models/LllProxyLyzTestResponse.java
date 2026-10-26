// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class LllProxyLyzTestResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // aa
    @NameInMap("param_b")
    public DemoClass paramB;

    public static LllProxyLyzTestResponse build(java.util.Map<String, ?> map) throws Exception {
        LllProxyLyzTestResponse self = new LllProxyLyzTestResponse();
        return TeaModel.build(map, self);
    }

    public LllProxyLyzTestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public LllProxyLyzTestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public LllProxyLyzTestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public LllProxyLyzTestResponse setParamB(DemoClass paramB) {
        this.paramB = paramB;
        return this;
    }
    public DemoClass getParamB() {
        return this.paramB;
    }

}
