// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryStatsTopicResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // Topic 统计详情
    @NameInMap("metrics")
    public java.util.List<TopicStatsItem> metrics;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 每页显示条数
    @NameInMap("page_size")
    public Long pageSize;

    // 总条数
    @NameInMap("total_count")
    public Long totalCount;

    // 报表数据更新的 Unix 时间戳
    @NameInMap("updated_at")
    public Long updatedAt;

    public static QueryStatsTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStatsTopicResponse self = new QueryStatsTopicResponse();
        return TeaModel.build(map, self);
    }

    public QueryStatsTopicResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryStatsTopicResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryStatsTopicResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryStatsTopicResponse setMetrics(java.util.List<TopicStatsItem> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<TopicStatsItem> getMetrics() {
        return this.metrics;
    }

    public QueryStatsTopicResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryStatsTopicResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryStatsTopicResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryStatsTopicResponse setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
