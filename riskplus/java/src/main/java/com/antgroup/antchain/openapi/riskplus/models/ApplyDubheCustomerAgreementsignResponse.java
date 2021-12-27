// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubheCustomerAgreementsignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // sdkParams返回给商户app客户端，作为客户端唤起sdk的入参
    @NameInMap("sdk_params")
    public String sdkParams;

    public static ApplyDubheCustomerAgreementsignResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubheCustomerAgreementsignResponse self = new ApplyDubheCustomerAgreementsignResponse();
        return TeaModel.build(map, self);
    }

    public ApplyDubheCustomerAgreementsignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyDubheCustomerAgreementsignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyDubheCustomerAgreementsignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyDubheCustomerAgreementsignResponse setSdkParams(String sdkParams) {
        this.sdkParams = sdkParams;
        return this;
    }
    public String getSdkParams() {
        return this.sdkParams;
    }

}
