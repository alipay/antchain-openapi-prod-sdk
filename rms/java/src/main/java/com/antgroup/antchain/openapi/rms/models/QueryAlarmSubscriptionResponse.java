// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAlarmSubscriptionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 告警订阅数组
    @NameInMap("alarm_subscriptions")
    public java.util.List<AlarmSubDTO> alarmSubscriptions;

    // 总记录数
    @NameInMap("total_count")
    public Long totalCount;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryAlarmSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmSubscriptionResponse self = new QueryAlarmSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public QueryAlarmSubscriptionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAlarmSubscriptionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAlarmSubscriptionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAlarmSubscriptionResponse setAlarmSubscriptions(java.util.List<AlarmSubDTO> alarmSubscriptions) {
        this.alarmSubscriptions = alarmSubscriptions;
        return this;
    }
    public java.util.List<AlarmSubDTO> getAlarmSubscriptions() {
        return this.alarmSubscriptions;
    }

    public QueryAlarmSubscriptionResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryAlarmSubscriptionResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAlarmSubscriptionResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
