// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubbridgeCustomerAgreementsignResponse extends TeaModel {
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

    // 客户编号
    @NameInMap("custom_no")
    public String customNo;

    public static ApplyDubbridgeCustomerAgreementsignResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubbridgeCustomerAgreementsignResponse self = new ApplyDubbridgeCustomerAgreementsignResponse();
        return TeaModel.build(map, self);
    }

    public ApplyDubbridgeCustomerAgreementsignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyDubbridgeCustomerAgreementsignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyDubbridgeCustomerAgreementsignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyDubbridgeCustomerAgreementsignResponse setSdkParams(String sdkParams) {
        this.sdkParams = sdkParams;
        return this;
    }
    public String getSdkParams() {
        return this.sdkParams;
    }

    public ApplyDubbridgeCustomerAgreementsignResponse setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

}
