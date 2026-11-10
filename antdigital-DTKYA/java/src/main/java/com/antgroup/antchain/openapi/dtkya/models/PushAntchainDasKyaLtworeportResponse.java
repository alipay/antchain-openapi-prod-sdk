// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class PushAntchainDasKyaLtworeportResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 已受理的报告 ID
    @NameInMap("report_id")
    public String reportId;

    // 报告受理状态
    @NameInMap("status")
    public String status;

    // 平台受理时间
    @NameInMap("received_at")
    public String receivedAt;

    public static PushAntchainDasKyaLtworeportResponse build(java.util.Map<String, ?> map) throws Exception {
        PushAntchainDasKyaLtworeportResponse self = new PushAntchainDasKyaLtworeportResponse();
        return TeaModel.build(map, self);
    }

    public PushAntchainDasKyaLtworeportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushAntchainDasKyaLtworeportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushAntchainDasKyaLtworeportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushAntchainDasKyaLtworeportResponse setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public PushAntchainDasKyaLtworeportResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PushAntchainDasKyaLtworeportResponse setReceivedAt(String receivedAt) {
        this.receivedAt = receivedAt;
        return this;
    }
    public String getReceivedAt() {
        return this.receivedAt;
    }

}
