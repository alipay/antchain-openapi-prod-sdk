// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class BindCutpaymentPreResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 预签约唯一码
    @NameInMap("pre_bind_sn")
    public String preBindSn;

    public static BindCutpaymentPreResponse build(java.util.Map<String, ?> map) throws Exception {
        BindCutpaymentPreResponse self = new BindCutpaymentPreResponse();
        return TeaModel.build(map, self);
    }

    public BindCutpaymentPreResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BindCutpaymentPreResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BindCutpaymentPreResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BindCutpaymentPreResponse setPreBindSn(String preBindSn) {
        this.preBindSn = preBindSn;
        return this;
    }
    public String getPreBindSn() {
        return this.preBindSn;
    }

}
