// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class MonitorResult extends TeaModel {
    // 监测任务ID
    // 
    @NameInMap("monitor_task_id")
    @Validation(required = true)
    public String monitorTaskId;

    // 监测结果ID
    // 
    @NameInMap("monitor_result_id")
    @Validation(required = true)
    public String monitorResultId;

    // 侵权网址
    // 
    // 
    @NameInMap("infr_url")
    public String infrUrl;

    // 侵权主体
    // 
    // 
    @NameInMap("infr_host")
    public String infrHost;

    // 侵权标题
    // 
    // 
    @NameInMap("infr_title")
    public String infrTitle;

    // 侵权内容上传时间
    // 
    // 
    @NameInMap("infr_time")
    public Long infrTime;

    // 侵权详情
    // 
    @NameInMap("detail")
    public String detail;

    public static MonitorResult build(java.util.Map<String, ?> map) throws Exception {
        MonitorResult self = new MonitorResult();
        return TeaModel.build(map, self);
    }

    public MonitorResult setMonitorTaskId(String monitorTaskId) {
        this.monitorTaskId = monitorTaskId;
        return this;
    }
    public String getMonitorTaskId() {
        return this.monitorTaskId;
    }

    public MonitorResult setMonitorResultId(String monitorResultId) {
        this.monitorResultId = monitorResultId;
        return this;
    }
    public String getMonitorResultId() {
        return this.monitorResultId;
    }

    public MonitorResult setInfrUrl(String infrUrl) {
        this.infrUrl = infrUrl;
        return this;
    }
    public String getInfrUrl() {
        return this.infrUrl;
    }

    public MonitorResult setInfrHost(String infrHost) {
        this.infrHost = infrHost;
        return this;
    }
    public String getInfrHost() {
        return this.infrHost;
    }

    public MonitorResult setInfrTitle(String infrTitle) {
        this.infrTitle = infrTitle;
        return this;
    }
    public String getInfrTitle() {
        return this.infrTitle;
    }

    public MonitorResult setInfrTime(Long infrTime) {
        this.infrTime = infrTime;
        return this;
    }
    public Long getInfrTime() {
        return this.infrTime;
    }

    public MonitorResult setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

}
