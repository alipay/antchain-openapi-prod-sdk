// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUnifiedalarmRuleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 告警规则列表
    @NameInMap("alarm_rules")
    public java.util.List<UnifiedAlarmRuleVO> alarmRules;

    // 总记录数
    @NameInMap("total_count")
    public Long totalCount;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 页面尺寸
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryUnifiedalarmRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedalarmRuleResponse self = new QueryUnifiedalarmRuleResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedalarmRuleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUnifiedalarmRuleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUnifiedalarmRuleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUnifiedalarmRuleResponse setAlarmRules(java.util.List<UnifiedAlarmRuleVO> alarmRules) {
        this.alarmRules = alarmRules;
        return this;
    }
    public java.util.List<UnifiedAlarmRuleVO> getAlarmRules() {
        return this.alarmRules;
    }

    public QueryUnifiedalarmRuleResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryUnifiedalarmRuleResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryUnifiedalarmRuleResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
