// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RepayDubheRepayCheckstandResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 收银台地址(成功就有值)
    @NameInMap("checkstand_address")
    public String checkstandAddress;

    public static RepayDubheRepayCheckstandResponse build(java.util.Map<String, ?> map) throws Exception {
        RepayDubheRepayCheckstandResponse self = new RepayDubheRepayCheckstandResponse();
        return TeaModel.build(map, self);
    }

    public RepayDubheRepayCheckstandResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RepayDubheRepayCheckstandResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RepayDubheRepayCheckstandResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RepayDubheRepayCheckstandResponse setCheckstandAddress(String checkstandAddress) {
        this.checkstandAddress = checkstandAddress;
        return this;
    }
    public String getCheckstandAddress() {
        return this.checkstandAddress;
    }

}
