// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ApplyConsumecardBillrefundResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    public static ApplyConsumecardBillrefundResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyConsumecardBillrefundResponse self = new ApplyConsumecardBillrefundResponse();
        return TeaModel.build(map, self);
    }

    public ApplyConsumecardBillrefundResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyConsumecardBillrefundResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyConsumecardBillrefundResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}
