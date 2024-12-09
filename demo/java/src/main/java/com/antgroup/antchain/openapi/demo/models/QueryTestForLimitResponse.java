// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryTestForLimitResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 1
    @NameInMap("exec_num_echo")
    public Long execNumEcho;

    public static QueryTestForLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTestForLimitResponse self = new QueryTestForLimitResponse();
        return TeaModel.build(map, self);
    }

    public QueryTestForLimitResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTestForLimitResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTestForLimitResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTestForLimitResponse setExecNumEcho(Long execNumEcho) {
        this.execNumEcho = execNumEcho;
        return this;
    }
    public Long getExecNumEcho() {
        return this.execNumEcho;
    }

}
