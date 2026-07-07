// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class ListEcarGreenoperationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 最近发生的绿色行为数据列表
    @NameInMap("list")
    public java.util.List<GreenOperationRecordSummary> list;

    public static ListEcarGreenoperationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEcarGreenoperationResponse self = new ListEcarGreenoperationResponse();
        return TeaModel.build(map, self);
    }

    public ListEcarGreenoperationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListEcarGreenoperationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListEcarGreenoperationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListEcarGreenoperationResponse setList(java.util.List<GreenOperationRecordSummary> list) {
        this.list = list;
        return this;
    }
    public java.util.List<GreenOperationRecordSummary> getList() {
        return this.list;
    }

}
