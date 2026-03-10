// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubbridgeRepaywithholdLxResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 还款状态，1、接口通知成功
    // 2、接口通知失败
    // (具体的结果都以查询接口为准)
    @NameInMap("status")
    public Long status;

    // 还款描述，失败时，需给出的错误描述
    @NameInMap("msg")
    public String msg;

    public static ApplyDubbridgeRepaywithholdLxResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubbridgeRepaywithholdLxResponse self = new ApplyDubbridgeRepaywithholdLxResponse();
        return TeaModel.build(map, self);
    }

    public ApplyDubbridgeRepaywithholdLxResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyDubbridgeRepaywithholdLxResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyDubbridgeRepaywithholdLxResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyDubbridgeRepaywithholdLxResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public ApplyDubbridgeRepaywithholdLxResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
