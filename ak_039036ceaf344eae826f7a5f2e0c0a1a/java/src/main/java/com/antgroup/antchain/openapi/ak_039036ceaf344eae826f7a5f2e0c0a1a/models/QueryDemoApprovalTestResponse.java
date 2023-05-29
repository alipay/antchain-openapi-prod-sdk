// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_039036ceaf344eae826f7a5f2e0c0a1a.models;

import com.aliyun.tea.*;

public class QueryDemoApprovalTestResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 回参
    @NameInMap("msg")
    public String msg;

    public static QueryDemoApprovalTestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoApprovalTestResponse self = new QueryDemoApprovalTestResponse();
        return TeaModel.build(map, self);
    }

    public QueryDemoApprovalTestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDemoApprovalTestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDemoApprovalTestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDemoApprovalTestResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
