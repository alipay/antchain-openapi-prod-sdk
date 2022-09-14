// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class QueryHealthstatisticsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 日结统计数据
    @NameInMap("data_list")
    public java.util.List<HealthStatistics> dataList;

    public static QueryHealthstatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHealthstatisticsResponse self = new QueryHealthstatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryHealthstatisticsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryHealthstatisticsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHealthstatisticsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryHealthstatisticsResponse setDataList(java.util.List<HealthStatistics> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<HealthStatistics> getDataList() {
        return this.dataList;
    }

}
