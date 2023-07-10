// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_8146025f0aa2474a88d81f508253e029.models;

import com.aliyun.tea.*;

public class SubmitHksecuritytechGatewayDeviceriskReportResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 1000
    @NameInMap("result_status")
    public Long resultStatus;

    // result
    @NameInMap("result")
    public DeviceRiskReportResult result;

    public static SubmitHksecuritytechGatewayDeviceriskReportResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitHksecuritytechGatewayDeviceriskReportResponse self = new SubmitHksecuritytechGatewayDeviceriskReportResponse();
        return TeaModel.build(map, self);
    }

    public SubmitHksecuritytechGatewayDeviceriskReportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitHksecuritytechGatewayDeviceriskReportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitHksecuritytechGatewayDeviceriskReportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitHksecuritytechGatewayDeviceriskReportResponse setResultStatus(Long resultStatus) {
        this.resultStatus = resultStatus;
        return this;
    }
    public Long getResultStatus() {
        return this.resultStatus;
    }

    public SubmitHksecuritytechGatewayDeviceriskReportResponse setResult(DeviceRiskReportResult result) {
        this.result = result;
        return this;
    }
    public DeviceRiskReportResult getResult() {
        return this.result;
    }

}
