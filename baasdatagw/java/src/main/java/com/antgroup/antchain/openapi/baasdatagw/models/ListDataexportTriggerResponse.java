// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ListDataexportTriggerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // -
    @NameInMap("triggers")
    public java.util.List<Trigger> triggers;

    public static ListDataexportTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataexportTriggerResponse self = new ListDataexportTriggerResponse();
        return TeaModel.build(map, self);
    }

    public ListDataexportTriggerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListDataexportTriggerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDataexportTriggerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListDataexportTriggerResponse setTriggers(java.util.List<Trigger> triggers) {
        this.triggers = triggers;
        return this;
    }
    public java.util.List<Trigger> getTriggers() {
        return this.triggers;
    }

}
