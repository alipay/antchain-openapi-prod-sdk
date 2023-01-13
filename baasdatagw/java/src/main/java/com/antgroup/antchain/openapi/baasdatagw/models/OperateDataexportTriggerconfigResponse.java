// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class OperateDataexportTriggerconfigResponse extends TeaModel {
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
    @NameInMap("trigger")
    public Trigger trigger;

    public static OperateDataexportTriggerconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateDataexportTriggerconfigResponse self = new OperateDataexportTriggerconfigResponse();
        return TeaModel.build(map, self);
    }

    public OperateDataexportTriggerconfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OperateDataexportTriggerconfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OperateDataexportTriggerconfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OperateDataexportTriggerconfigResponse setTrigger(Trigger trigger) {
        this.trigger = trigger;
        return this;
    }
    public Trigger getTrigger() {
        return this.trigger;
    }

}
