// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class RefuseRcpNingboResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    public static RefuseRcpNingboResponse build(java.util.Map<String, ?> map) throws Exception {
        RefuseRcpNingboResponse self = new RefuseRcpNingboResponse();
        return TeaModel.build(map, self);
    }

    public RefuseRcpNingboResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RefuseRcpNingboResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RefuseRcpNingboResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}
