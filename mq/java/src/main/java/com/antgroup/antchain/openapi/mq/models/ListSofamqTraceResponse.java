// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSofamqTraceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询返回的数据集合
    @NameInMap("data")
    public TracePageDTO data;

    public static ListSofamqTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSofamqTraceResponse self = new ListSofamqTraceResponse();
        return TeaModel.build(map, self);
    }

    public ListSofamqTraceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSofamqTraceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSofamqTraceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSofamqTraceResponse setData(TracePageDTO data) {
        this.data = data;
        return this;
    }
    public TracePageDTO getData() {
        return this.data;
    }

}
