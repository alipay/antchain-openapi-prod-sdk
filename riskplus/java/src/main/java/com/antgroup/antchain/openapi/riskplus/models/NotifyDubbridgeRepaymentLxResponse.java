// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class NotifyDubbridgeRepaymentLxResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 1、接口通知成功(仅代表收到请求,具体的还款结果以查询接口为准)
    // 2、接口通知失败(代表未收到请求,会重复发起还款申请)
    @NameInMap("notify_status")
    public Long notifyStatus;

    // 错误描述
    @NameInMap("msg")
    public String msg;

    public static NotifyDubbridgeRepaymentLxResponse build(java.util.Map<String, ?> map) throws Exception {
        NotifyDubbridgeRepaymentLxResponse self = new NotifyDubbridgeRepaymentLxResponse();
        return TeaModel.build(map, self);
    }

    public NotifyDubbridgeRepaymentLxResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public NotifyDubbridgeRepaymentLxResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public NotifyDubbridgeRepaymentLxResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public NotifyDubbridgeRepaymentLxResponse setNotifyStatus(Long notifyStatus) {
        this.notifyStatus = notifyStatus;
        return this;
    }
    public Long getNotifyStatus() {
        return this.notifyStatus;
    }

    public NotifyDubbridgeRepaymentLxResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
