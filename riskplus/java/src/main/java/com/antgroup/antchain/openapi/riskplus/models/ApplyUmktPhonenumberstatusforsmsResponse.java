// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyUmktPhonenumberstatusforsmsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 12345
    @NameInMap("customer_key")
    public String customerKey;

    // 用户凭证状态
    @NameInMap("status")
    public String status;

    // 号码当前归属的基础运营商
    @NameInMap("carrier")
    public String carrier;

    public static ApplyUmktPhonenumberstatusforsmsResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyUmktPhonenumberstatusforsmsResponse self = new ApplyUmktPhonenumberstatusforsmsResponse();
        return TeaModel.build(map, self);
    }

    public ApplyUmktPhonenumberstatusforsmsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyUmktPhonenumberstatusforsmsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyUmktPhonenumberstatusforsmsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyUmktPhonenumberstatusforsmsResponse setCustomerKey(String customerKey) {
        this.customerKey = customerKey;
        return this;
    }
    public String getCustomerKey() {
        return this.customerKey;
    }

    public ApplyUmktPhonenumberstatusforsmsResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ApplyUmktPhonenumberstatusforsmsResponse setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

}
