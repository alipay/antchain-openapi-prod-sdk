// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class ListIssuerDatasummaryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 历史资产统计列表
    @NameInMap("data")
    public java.util.List<DataSummaryStatisticsItem> data;

    public static ListIssuerDatasummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIssuerDatasummaryResponse self = new ListIssuerDatasummaryResponse();
        return TeaModel.build(map, self);
    }

    public ListIssuerDatasummaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListIssuerDatasummaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListIssuerDatasummaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListIssuerDatasummaryResponse setData(java.util.List<DataSummaryStatisticsItem> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DataSummaryStatisticsItem> getData() {
        return this.data;
    }

}
