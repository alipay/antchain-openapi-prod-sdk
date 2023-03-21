// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyInsurancePiprereportResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 预报案唯一码
    @NameInMap("trade_no")
    public String tradeNo;

    // 预报案编号
    @NameInMap("pre_report_no")
    public String preReportNo;

    public static ApplyInsurancePiprereportResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsurancePiprereportResponse self = new ApplyInsurancePiprereportResponse();
        return TeaModel.build(map, self);
    }

    public ApplyInsurancePiprereportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyInsurancePiprereportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyInsurancePiprereportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyInsurancePiprereportResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public ApplyInsurancePiprereportResponse setPreReportNo(String preReportNo) {
        this.preReportNo = preReportNo;
        return this;
    }
    public String getPreReportNo() {
        return this.preReportNo;
    }

}
