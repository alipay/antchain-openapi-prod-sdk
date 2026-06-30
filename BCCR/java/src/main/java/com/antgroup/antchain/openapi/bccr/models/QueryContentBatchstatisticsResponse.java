// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryContentBatchstatisticsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 出海视频统计数据列表
    @NameInMap("oversea_content_statistics_list")
    public java.util.List<OverseaContentStatistics> overseaContentStatisticsList;

    public static QueryContentBatchstatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContentBatchstatisticsResponse self = new QueryContentBatchstatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryContentBatchstatisticsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContentBatchstatisticsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContentBatchstatisticsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContentBatchstatisticsResponse setOverseaContentStatisticsList(java.util.List<OverseaContentStatistics> overseaContentStatisticsList) {
        this.overseaContentStatisticsList = overseaContentStatisticsList;
        return this;
    }
    public java.util.List<OverseaContentStatistics> getOverseaContentStatisticsList() {
        return this.overseaContentStatisticsList;
    }

}
