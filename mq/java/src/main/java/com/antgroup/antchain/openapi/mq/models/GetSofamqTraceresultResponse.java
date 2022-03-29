// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class GetSofamqTraceresultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 该查询任务的结果明细
    @NameInMap("data")
    public TraceMapResultDTO data;

    public static GetSofamqTraceresultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSofamqTraceresultResponse self = new GetSofamqTraceresultResponse();
        return TeaModel.build(map, self);
    }

    public GetSofamqTraceresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetSofamqTraceresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetSofamqTraceresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetSofamqTraceresultResponse setData(TraceMapResultDTO data) {
        this.data = data;
        return this;
    }
    public TraceMapResultDTO getData() {
        return this.data;
    }

}
