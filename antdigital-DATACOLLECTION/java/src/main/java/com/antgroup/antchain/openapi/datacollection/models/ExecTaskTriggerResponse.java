// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.datacollection.models;

import com.aliyun.tea.*;

public class ExecTaskTriggerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // code码
    @NameInMap("code")
    public String code;

    // 描述
    @NameInMap("msg")
    public String msg;

    // inst触发 id
    @NameInMap("inst_id")
    public String instId;

    public static ExecTaskTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecTaskTriggerResponse self = new ExecTaskTriggerResponse();
        return TeaModel.build(map, self);
    }

    public ExecTaskTriggerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecTaskTriggerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecTaskTriggerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecTaskTriggerResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecTaskTriggerResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ExecTaskTriggerResponse setInstId(String instId) {
        this.instId = instId;
        return this;
    }
    public String getInstId() {
        return this.instId;
    }

}
