// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryMachinegroupSlbmountprogressRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 分组ID
    @NameInMap("machine_group_id")
    public String machineGroupId;

    // 请求 ID 列表
    @NameInMap("request_ids")
    public java.util.List<String> requestIds;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static QueryMachinegroupSlbmountprogressRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMachinegroupSlbmountprogressRequest self = new QueryMachinegroupSlbmountprogressRequest();
        return TeaModel.build(map, self);
    }

    public QueryMachinegroupSlbmountprogressRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMachinegroupSlbmountprogressRequest setMachineGroupId(String machineGroupId) {
        this.machineGroupId = machineGroupId;
        return this;
    }
    public String getMachineGroupId() {
        return this.machineGroupId;
    }

    public QueryMachinegroupSlbmountprogressRequest setRequestIds(java.util.List<String> requestIds) {
        this.requestIds = requestIds;
        return this;
    }
    public java.util.List<String> getRequestIds() {
        return this.requestIds;
    }

    public QueryMachinegroupSlbmountprogressRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
