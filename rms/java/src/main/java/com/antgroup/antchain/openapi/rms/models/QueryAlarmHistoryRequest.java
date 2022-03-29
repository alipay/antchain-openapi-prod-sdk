// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAlarmHistoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 开始时间
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    // 结束时间
    @NameInMap("end")
    @Validation(required = true)
    public Long end;

    // 是否查询所有告警类型
    @NameInMap("all_types")
    @Validation(required = true)
    public Boolean allTypes;

    // 告警类型数组
    @NameInMap("alarm_types")
    public java.util.List<String> alarmTypes;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    // dsid
    @NameInMap("dsid")
    public Long dsid;

    public static QueryAlarmHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmHistoryRequest self = new QueryAlarmHistoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryAlarmHistoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAlarmHistoryRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryAlarmHistoryRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public QueryAlarmHistoryRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public QueryAlarmHistoryRequest setAllTypes(Boolean allTypes) {
        this.allTypes = allTypes;
        return this;
    }
    public Boolean getAllTypes() {
        return this.allTypes;
    }

    public QueryAlarmHistoryRequest setAlarmTypes(java.util.List<String> alarmTypes) {
        this.alarmTypes = alarmTypes;
        return this;
    }
    public java.util.List<String> getAlarmTypes() {
        return this.alarmTypes;
    }

    public QueryAlarmHistoryRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAlarmHistoryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAlarmHistoryRequest setDsid(Long dsid) {
        this.dsid = dsid;
        return this;
    }
    public Long getDsid() {
        return this.dsid;
    }

}
