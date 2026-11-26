// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurancesaas.models;

import com.aliyun.tea.*;

public class ReceiveAntcloudInsuranceLeadOpportunitiesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求id
    @NameInMap("request_id")
    public String requestId;

    // 受理号：FULL_PUSH 为蚂蚁生成的受理号；TRIGGER_PUSH 为原批次受理号
    @NameInMap("accept_no")
    public String acceptNo;

    public static ReceiveAntcloudInsuranceLeadOpportunitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ReceiveAntcloudInsuranceLeadOpportunitiesResponse self = new ReceiveAntcloudInsuranceLeadOpportunitiesResponse();
        return TeaModel.build(map, self);
    }

    public ReceiveAntcloudInsuranceLeadOpportunitiesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ReceiveAntcloudInsuranceLeadOpportunitiesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ReceiveAntcloudInsuranceLeadOpportunitiesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ReceiveAntcloudInsuranceLeadOpportunitiesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReceiveAntcloudInsuranceLeadOpportunitiesResponse setAcceptNo(String acceptNo) {
        this.acceptNo = acceptNo;
        return this;
    }
    public String getAcceptNo() {
        return this.acceptNo;
    }

}
