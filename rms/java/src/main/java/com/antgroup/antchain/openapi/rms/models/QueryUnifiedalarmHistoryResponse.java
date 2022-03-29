// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUnifiedalarmHistoryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 告警历史列表
    @NameInMap("alarm_histories")
    public java.util.List<UnifiedAlarmHistoryVO> alarmHistories;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 每页大小
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryUnifiedalarmHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedalarmHistoryResponse self = new QueryUnifiedalarmHistoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedalarmHistoryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUnifiedalarmHistoryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUnifiedalarmHistoryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUnifiedalarmHistoryResponse setAlarmHistories(java.util.List<UnifiedAlarmHistoryVO> alarmHistories) {
        this.alarmHistories = alarmHistories;
        return this;
    }
    public java.util.List<UnifiedAlarmHistoryVO> getAlarmHistories() {
        return this.alarmHistories;
    }

    public QueryUnifiedalarmHistoryResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryUnifiedalarmHistoryResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryUnifiedalarmHistoryResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
