// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class BindCutpaymentSignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签约协议号
    @NameInMap("protocol_no")
    public String protocolNo;

    // 签约流水号
    @NameInMap("sign_bind_sn")
    public String signBindSn;

    public static BindCutpaymentSignResponse build(java.util.Map<String, ?> map) throws Exception {
        BindCutpaymentSignResponse self = new BindCutpaymentSignResponse();
        return TeaModel.build(map, self);
    }

    public BindCutpaymentSignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BindCutpaymentSignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BindCutpaymentSignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BindCutpaymentSignResponse setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo;
        return this;
    }
    public String getProtocolNo() {
        return this.protocolNo;
    }

    public BindCutpaymentSignResponse setSignBindSn(String signBindSn) {
        this.signBindSn = signBindSn;
        return this;
    }
    public String getSignBindSn() {
        return this.signBindSn;
    }

}
