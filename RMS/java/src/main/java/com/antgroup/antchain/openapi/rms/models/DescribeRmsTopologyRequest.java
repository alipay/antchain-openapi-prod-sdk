// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DescribeRmsTopologyRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 结束毫秒时间戳
    @NameInMap("end_time")
    public Long endTime;

    // 开始毫秒时间戳
    @NameInMap("start_time")
    public Long startTime;

    // workspace_id或workspace_name二选一
    @NameInMap("workspace_id")
    public Long workspaceId;

    // workspace_id或workspace_name二选一
    @NameInMap("workspace_name")
    public String workspaceName;

    public static DescribeRmsTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRmsTopologyRequest self = new DescribeRmsTopologyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRmsTopologyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DescribeRmsTopologyRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeRmsTopologyRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeRmsTopologyRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public DescribeRmsTopologyRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
