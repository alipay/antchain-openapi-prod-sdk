// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class NotifyInsuranceOspireportResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 案件同步唯一码
    @NameInMap("trade_no")
    public String tradeNo;

    // 案件通知状态
    @NameInMap("report_notify_status")
    public String reportNotifyStatus;

    public static NotifyInsuranceOspireportResponse build(java.util.Map<String, ?> map) throws Exception {
        NotifyInsuranceOspireportResponse self = new NotifyInsuranceOspireportResponse();
        return TeaModel.build(map, self);
    }

    public NotifyInsuranceOspireportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public NotifyInsuranceOspireportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public NotifyInsuranceOspireportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public NotifyInsuranceOspireportResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public NotifyInsuranceOspireportResponse setReportNotifyStatus(String reportNotifyStatus) {
        this.reportNotifyStatus = reportNotifyStatus;
        return this;
    }
    public String getReportNotifyStatus() {
        return this.reportNotifyStatus;
    }

}
