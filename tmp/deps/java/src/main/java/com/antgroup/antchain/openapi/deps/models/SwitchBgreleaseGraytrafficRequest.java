// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SwitchBgreleaseGraytrafficRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 应用ID
    @NameInMap("app_id")
    public String appId;

    // 执行人
    @NameInMap("executor_id")
    public String executorId;

    // 执行人
    @NameInMap("executor_name")
    public String executorName;

    // 来自阿里云用户
    @NameInMap("from_aliyun")
    public Boolean fromAliyun;

    // 发布单ID
    @NameInMap("plan_id")
    @Validation(required = true)
    public String planId;

    // 比率
    @NameInMap("proportion")
    @Validation(required = true)
    public Long proportion;

    // 目标ID
    @NameInMap("target_id")
    @Validation(required = true)
    public String targetId;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static SwitchBgreleaseGraytrafficRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchBgreleaseGraytrafficRequest self = new SwitchBgreleaseGraytrafficRequest();
        return TeaModel.build(map, self);
    }

    public SwitchBgreleaseGraytrafficRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SwitchBgreleaseGraytrafficRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public SwitchBgreleaseGraytrafficRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SwitchBgreleaseGraytrafficRequest setExecutorId(String executorId) {
        this.executorId = executorId;
        return this;
    }
    public String getExecutorId() {
        return this.executorId;
    }

    public SwitchBgreleaseGraytrafficRequest setExecutorName(String executorName) {
        this.executorName = executorName;
        return this;
    }
    public String getExecutorName() {
        return this.executorName;
    }

    public SwitchBgreleaseGraytrafficRequest setFromAliyun(Boolean fromAliyun) {
        this.fromAliyun = fromAliyun;
        return this;
    }
    public Boolean getFromAliyun() {
        return this.fromAliyun;
    }

    public SwitchBgreleaseGraytrafficRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public SwitchBgreleaseGraytrafficRequest setProportion(Long proportion) {
        this.proportion = proportion;
        return this;
    }
    public Long getProportion() {
        return this.proportion;
    }

    public SwitchBgreleaseGraytrafficRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public SwitchBgreleaseGraytrafficRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
