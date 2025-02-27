// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ApplyFundCreditutilizationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用信Id
    @NameInMap("utilization_id")
    public String utilizationId;

    // 用信授权id
    @NameInMap("utilization_auth_id")
    public String utilizationAuthId;

    public static ApplyFundCreditutilizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyFundCreditutilizationResponse self = new ApplyFundCreditutilizationResponse();
        return TeaModel.build(map, self);
    }

    public ApplyFundCreditutilizationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyFundCreditutilizationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyFundCreditutilizationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyFundCreditutilizationResponse setUtilizationId(String utilizationId) {
        this.utilizationId = utilizationId;
        return this;
    }
    public String getUtilizationId() {
        return this.utilizationId;
    }

    public ApplyFundCreditutilizationResponse setUtilizationAuthId(String utilizationAuthId) {
        this.utilizationAuthId = utilizationAuthId;
        return this;
    }
    public String getUtilizationAuthId() {
        return this.utilizationAuthId;
    }

}
