// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class CountIssuerDatasummaryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总览统计数据项
    @NameInMap("data")
    public DataSummaryTotal data;

    public static CountIssuerDatasummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        CountIssuerDatasummaryResponse self = new CountIssuerDatasummaryResponse();
        return TeaModel.build(map, self);
    }

    public CountIssuerDatasummaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountIssuerDatasummaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountIssuerDatasummaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountIssuerDatasummaryResponse setData(DataSummaryTotal data) {
        this.data = data;
        return this;
    }
    public DataSummaryTotal getData() {
        return this.data;
    }

}
