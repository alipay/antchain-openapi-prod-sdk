// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ExecContractPayResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否触发成功
    @NameInMap("trigger_success")
    public Boolean triggerSuccess;

    // 结果code
    @NameInMap("code")
    public String code;

    // 结果描述
    @NameInMap("msg")
    public String msg;

    public static ExecContractPayResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecContractPayResponse self = new ExecContractPayResponse();
        return TeaModel.build(map, self);
    }

    public ExecContractPayResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecContractPayResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecContractPayResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecContractPayResponse setTriggerSuccess(Boolean triggerSuccess) {
        this.triggerSuccess = triggerSuccess;
        return this;
    }
    public Boolean getTriggerSuccess() {
        return this.triggerSuccess;
    }

    public ExecContractPayResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecContractPayResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
