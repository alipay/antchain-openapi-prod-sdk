// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUnifiedalarmEventResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 告警事件列表
    @NameInMap("unified_alarm_event_list")
    public java.util.List<UnifiedAlarmEventVO> unifiedAlarmEventList;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 页面尺寸
    @NameInMap("page_size")
    public Long pageSize;

    // 总记录数
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryUnifiedalarmEventResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedalarmEventResponse self = new QueryUnifiedalarmEventResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedalarmEventResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUnifiedalarmEventResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUnifiedalarmEventResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUnifiedalarmEventResponse setUnifiedAlarmEventList(java.util.List<UnifiedAlarmEventVO> unifiedAlarmEventList) {
        this.unifiedAlarmEventList = unifiedAlarmEventList;
        return this;
    }
    public java.util.List<UnifiedAlarmEventVO> getUnifiedAlarmEventList() {
        return this.unifiedAlarmEventList;
    }

    public QueryUnifiedalarmEventResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryUnifiedalarmEventResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUnifiedalarmEventResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
