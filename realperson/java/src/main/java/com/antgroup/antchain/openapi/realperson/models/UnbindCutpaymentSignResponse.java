// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class UnbindCutpaymentSignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 解绑流水号
    @NameInMap("unbind_sn")
    public String unbindSn;

    public static UnbindCutpaymentSignResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindCutpaymentSignResponse self = new UnbindCutpaymentSignResponse();
        return TeaModel.build(map, self);
    }

    public UnbindCutpaymentSignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UnbindCutpaymentSignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UnbindCutpaymentSignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UnbindCutpaymentSignResponse setUnbindSn(String unbindSn) {
        this.unbindSn = unbindSn;
        return this;
    }
    public String getUnbindSn() {
        return this.unbindSn;
    }

}
