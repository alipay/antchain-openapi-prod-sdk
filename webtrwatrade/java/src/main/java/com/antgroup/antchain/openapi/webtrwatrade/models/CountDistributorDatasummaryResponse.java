// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class CountDistributorDatasummaryResponse extends TeaModel {
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

    public static CountDistributorDatasummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        CountDistributorDatasummaryResponse self = new CountDistributorDatasummaryResponse();
        return TeaModel.build(map, self);
    }

    public CountDistributorDatasummaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountDistributorDatasummaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountDistributorDatasummaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountDistributorDatasummaryResponse setData(DataSummaryTotal data) {
        this.data = data;
        return this;
    }
    public DataSummaryTotal getData() {
        return this.data;
    }

}
