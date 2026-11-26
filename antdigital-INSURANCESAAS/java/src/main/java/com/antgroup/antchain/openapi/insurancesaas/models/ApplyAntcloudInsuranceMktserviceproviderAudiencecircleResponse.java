// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurancesaas.models;

import com.aliyun.tea.*;

public class ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求id，每一次请求保持唯一；
    @NameInMap("request_id")
    public String requestId;

    // 批次号
    @NameInMap("batch_no")
    public String batchNo;

    public static ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse self = new ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse();
        return TeaModel.build(map, self);
    }

    public ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse setBatchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public String getBatchNo() {
        return this.batchNo;
    }

}
