// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUnifiedalarmEventdetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 总记录数
    @NameInMap("total_count")
    public Long totalCount;

    // 页面尺寸
    @NameInMap("page_size")
    public Long pageSize;

    // 告警消息列表
    @NameInMap("alarm_history_list")
    public java.util.List<UnifiedAlarmHistoryVO> alarmHistoryList;

    public static QueryUnifiedalarmEventdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedalarmEventdetailResponse self = new QueryUnifiedalarmEventdetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedalarmEventdetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUnifiedalarmEventdetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUnifiedalarmEventdetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUnifiedalarmEventdetailResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryUnifiedalarmEventdetailResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryUnifiedalarmEventdetailResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUnifiedalarmEventdetailResponse setAlarmHistoryList(java.util.List<UnifiedAlarmHistoryVO> alarmHistoryList) {
        this.alarmHistoryList = alarmHistoryList;
        return this;
    }
    public java.util.List<UnifiedAlarmHistoryVO> getAlarmHistoryList() {
        return this.alarmHistoryList;
    }

}
