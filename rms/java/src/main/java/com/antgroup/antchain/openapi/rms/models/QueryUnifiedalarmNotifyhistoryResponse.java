// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUnifiedalarmNotifyhistoryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总记录数
    @NameInMap("total_count")
    public Long totalCount;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 页面尺寸
    @NameInMap("page_size")
    public Long pageSize;

    // 响应结果
    @NameInMap("alarm_notify_histories")
    public java.util.List<UnifiedAlarmNotifyHistoryVO> alarmNotifyHistories;

    // 告警通知历史中对应的通知对象
    @NameInMap("alarm_notify_subs")
    public java.util.List<UnifiedAlarmSubDTO> alarmNotifySubs;

    public static QueryUnifiedalarmNotifyhistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedalarmNotifyhistoryResponse self = new QueryUnifiedalarmNotifyhistoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedalarmNotifyhistoryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUnifiedalarmNotifyhistoryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUnifiedalarmNotifyhistoryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUnifiedalarmNotifyhistoryResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryUnifiedalarmNotifyhistoryResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryUnifiedalarmNotifyhistoryResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUnifiedalarmNotifyhistoryResponse setAlarmNotifyHistories(java.util.List<UnifiedAlarmNotifyHistoryVO> alarmNotifyHistories) {
        this.alarmNotifyHistories = alarmNotifyHistories;
        return this;
    }
    public java.util.List<UnifiedAlarmNotifyHistoryVO> getAlarmNotifyHistories() {
        return this.alarmNotifyHistories;
    }

    public QueryUnifiedalarmNotifyhistoryResponse setAlarmNotifySubs(java.util.List<UnifiedAlarmSubDTO> alarmNotifySubs) {
        this.alarmNotifySubs = alarmNotifySubs;
        return this;
    }
    public java.util.List<UnifiedAlarmSubDTO> getAlarmNotifySubs() {
        return this.alarmNotifySubs;
    }

}
