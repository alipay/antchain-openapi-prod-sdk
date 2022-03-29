// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryStatsGroupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前实例的所有 Group 统计信息
    @NameInMap("metrics")
    public java.util.List<GroupStatsItem> metrics;

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

    public static QueryStatsGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStatsGroupResponse self = new QueryStatsGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryStatsGroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryStatsGroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryStatsGroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryStatsGroupResponse setMetrics(java.util.List<GroupStatsItem> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<GroupStatsItem> getMetrics() {
        return this.metrics;
    }

    public QueryStatsGroupResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryStatsGroupResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryStatsGroupResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryStatsGroupResponse setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
