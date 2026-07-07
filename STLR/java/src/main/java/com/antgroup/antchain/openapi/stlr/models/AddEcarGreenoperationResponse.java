// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AddEcarGreenoperationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回记录的多种绿色行为数据摘要信息
    @NameInMap("list")
    public java.util.List<GreenOperationRecordSummary> list;

    public static AddEcarGreenoperationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEcarGreenoperationResponse self = new AddEcarGreenoperationResponse();
        return TeaModel.build(map, self);
    }

    public AddEcarGreenoperationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddEcarGreenoperationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddEcarGreenoperationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddEcarGreenoperationResponse setList(java.util.List<GreenOperationRecordSummary> list) {
        this.list = list;
        return this;
    }
    public java.util.List<GreenOperationRecordSummary> getList() {
        return this.list;
    }

}
