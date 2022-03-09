// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class NotifyInsuranceReportresultResponse extends TeaModel {
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
    // 
    @NameInMap("trade_no")
    public String tradeNo;

    // 案件通知状态--SUCCESS、FAIL	
    // 
    @NameInMap("report_notify_status")
    public String reportNotifyStatus;

    public static NotifyInsuranceReportresultResponse build(java.util.Map<String, ?> map) throws Exception {
        NotifyInsuranceReportresultResponse self = new NotifyInsuranceReportresultResponse();
        return TeaModel.build(map, self);
    }

    public NotifyInsuranceReportresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public NotifyInsuranceReportresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public NotifyInsuranceReportresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public NotifyInsuranceReportresultResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public NotifyInsuranceReportresultResponse setReportNotifyStatus(String reportNotifyStatus) {
        this.reportNotifyStatus = reportNotifyStatus;
        return this;
    }
    public String getReportNotifyStatus() {
        return this.reportNotifyStatus;
    }

}
