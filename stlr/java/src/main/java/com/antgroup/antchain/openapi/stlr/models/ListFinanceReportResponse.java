// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class ListFinanceReportResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 报告列表
    @NameInMap("list")
    public java.util.List<FinanceReportDetail> list;

    public static ListFinanceReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFinanceReportResponse self = new ListFinanceReportResponse();
        return TeaModel.build(map, self);
    }

    public ListFinanceReportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListFinanceReportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListFinanceReportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListFinanceReportResponse setList(java.util.List<FinanceReportDetail> list) {
        this.list = list;
        return this;
    }
    public java.util.List<FinanceReportDetail> getList() {
        return this.list;
    }

}
