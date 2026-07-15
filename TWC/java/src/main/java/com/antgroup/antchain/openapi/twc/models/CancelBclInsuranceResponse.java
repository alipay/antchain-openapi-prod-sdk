// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CancelBclInsuranceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 退保保单号
    @NameInMap("cancel_insurance_id")
    public String cancelInsuranceId;

    public static CancelBclInsuranceResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelBclInsuranceResponse self = new CancelBclInsuranceResponse();
        return TeaModel.build(map, self);
    }

    public CancelBclInsuranceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CancelBclInsuranceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CancelBclInsuranceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CancelBclInsuranceResponse setCancelInsuranceId(String cancelInsuranceId) {
        this.cancelInsuranceId = cancelInsuranceId;
        return this;
    }
    public String getCancelInsuranceId() {
        return this.cancelInsuranceId;
    }

}
