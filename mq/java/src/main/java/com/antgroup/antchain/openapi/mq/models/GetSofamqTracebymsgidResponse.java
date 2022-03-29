// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class GetSofamqTracebymsgidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    //  该查询任务的 ID。可根据该任务 ID，再调用 GetMqSofamqTraceResult 接口获取详细结果。
    @NameInMap("query_id")
    public String queryId;

    public static GetSofamqTracebymsgidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSofamqTracebymsgidResponse self = new GetSofamqTracebymsgidResponse();
        return TeaModel.build(map, self);
    }

    public GetSofamqTracebymsgidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetSofamqTracebymsgidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetSofamqTracebymsgidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetSofamqTracebymsgidResponse setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
