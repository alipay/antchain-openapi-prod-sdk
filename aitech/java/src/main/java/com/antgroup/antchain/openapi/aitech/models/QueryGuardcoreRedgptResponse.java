// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QueryGuardcoreRedgptResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // maya流式调用结果集
    @NameInMap("data")
    public MayaStreamResult data;

    public static QueryGuardcoreRedgptResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGuardcoreRedgptResponse self = new QueryGuardcoreRedgptResponse();
        return TeaModel.build(map, self);
    }

    public QueryGuardcoreRedgptResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryGuardcoreRedgptResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryGuardcoreRedgptResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryGuardcoreRedgptResponse setData(MayaStreamResult data) {
        this.data = data;
        return this;
    }
    public MayaStreamResult getData() {
        return this.data;
    }

}
