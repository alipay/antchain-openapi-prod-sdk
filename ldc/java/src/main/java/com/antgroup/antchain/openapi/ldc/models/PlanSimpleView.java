// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PlanSimpleView extends TeaModel {
    // 发布单涉及的应用个数
    @NameInMap("app_count")
    @Validation(required = true)
    public Long appCount;

    // 创建时间
    @NameInMap("created_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    // 执行人
    @NameInMap("executor")
    @Validation(required = true)
    public String executor;

    // 结束时间
    @NameInMap("finished_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String finishedTime;

    // 发布单id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 运维单类型
    @NameInMap("mode")
    @Validation(required = true)
    public String mode;

    // 发布单标题
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 开始时间
    @NameInMap("started_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startedTime;

    // 发布单状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 发布单号
    @NameInMap("time_series_id")
    @Validation(required = true)
    public String timeSeriesId;

    // 发布单类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 工作空间组id
    @NameInMap("workspace_group_id")
    public String workspaceGroupId;

    // Pod 数量
    @NameInMap("pod_count")
    public Long podCount;

    public static PlanSimpleView build(java.util.Map<String, ?> map) throws Exception {
        PlanSimpleView self = new PlanSimpleView();
        return TeaModel.build(map, self);
    }

    public PlanSimpleView setAppCount(Long appCount) {
        this.appCount = appCount;
        return this;
    }
    public Long getAppCount() {
        return this.appCount;
    }

    public PlanSimpleView setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public PlanSimpleView setExecutor(String executor) {
        this.executor = executor;
        return this;
    }
    public String getExecutor() {
        return this.executor;
    }

    public PlanSimpleView setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

    public PlanSimpleView setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public PlanSimpleView setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public PlanSimpleView setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PlanSimpleView setStartedTime(String startedTime) {
        this.startedTime = startedTime;
        return this;
    }
    public String getStartedTime() {
        return this.startedTime;
    }

    public PlanSimpleView setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public PlanSimpleView setTimeSeriesId(String timeSeriesId) {
        this.timeSeriesId = timeSeriesId;
        return this;
    }
    public String getTimeSeriesId() {
        return this.timeSeriesId;
    }

    public PlanSimpleView setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PlanSimpleView setWorkspaceGroupId(String workspaceGroupId) {
        this.workspaceGroupId = workspaceGroupId;
        return this;
    }
    public String getWorkspaceGroupId() {
        return this.workspaceGroupId;
    }

    public PlanSimpleView setPodCount(Long podCount) {
        this.podCount = podCount;
        return this;
    }
    public Long getPodCount() {
        return this.podCount;
    }

}
