// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ApiaAntdigitalTestliuyzpCliCreateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果描述
    @NameInMap("msg")
    public String msg;

    // 结果码
    @NameInMap("status")
    public String status;

    public static ApiaAntdigitalTestliuyzpCliCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        ApiaAntdigitalTestliuyzpCliCreateResponse self = new ApiaAntdigitalTestliuyzpCliCreateResponse();
        return TeaModel.build(map, self);
    }

    public ApiaAntdigitalTestliuyzpCliCreateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApiaAntdigitalTestliuyzpCliCreateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApiaAntdigitalTestliuyzpCliCreateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApiaAntdigitalTestliuyzpCliCreateResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ApiaAntdigitalTestliuyzpCliCreateResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
