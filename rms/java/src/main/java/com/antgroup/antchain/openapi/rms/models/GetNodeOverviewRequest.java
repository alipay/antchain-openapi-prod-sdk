// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetNodeOverviewRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 查询开始时间，unix timestamp in ms
    @NameInMap("start_time")
    public Long startTime;

    // 	
    // 查询截止时间，unix timestamp in ms
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    public static GetNodeOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeOverviewRequest self = new GetNodeOverviewRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeOverviewRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetNodeOverviewRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetNodeOverviewRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetNodeOverviewRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
