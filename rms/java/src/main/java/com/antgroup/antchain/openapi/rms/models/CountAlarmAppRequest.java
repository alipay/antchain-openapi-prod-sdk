// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CountAlarmAppRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 开始时间 - 时间戳
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    // 结束时间 - 时间戳
    @NameInMap("end")
    @Validation(required = true)
    public Long end;

    // 应用名称模糊搜索
    @NameInMap("app_name")
    public String appName;

    public static CountAlarmAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CountAlarmAppRequest self = new CountAlarmAppRequest();
        return TeaModel.build(map, self);
    }

    public CountAlarmAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CountAlarmAppRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public CountAlarmAppRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public CountAlarmAppRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public CountAlarmAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
