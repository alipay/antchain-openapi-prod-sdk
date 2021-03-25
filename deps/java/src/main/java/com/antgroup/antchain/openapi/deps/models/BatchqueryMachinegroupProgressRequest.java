// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BatchqueryMachinegroupProgressRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 当前页，默认 1
    @NameInMap("page_no")
    public Long pageNo;

    // 分页大小，默认 20
    @NameInMap("page_size")
    public Long pageSize;

    // 父节点 ID
    @NameInMap("parent_id")
    public String parentId;

    // 发布单 ID
    @NameInMap("plan_id")
    public String planId;

    // 发布进程 ID
    @NameInMap("process_definition_id")
    public String processDefinitionId;

    // 发布服务 ID
    @NameInMap("service_id")
    public String serviceId;

    // 状态
    @NameInMap("state")
    public String state;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static BatchqueryMachinegroupProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryMachinegroupProgressRequest self = new BatchqueryMachinegroupProgressRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryMachinegroupProgressRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryMachinegroupProgressRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public BatchqueryMachinegroupProgressRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public BatchqueryMachinegroupProgressRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public BatchqueryMachinegroupProgressRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public BatchqueryMachinegroupProgressRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public BatchqueryMachinegroupProgressRequest setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }
    public String getProcessDefinitionId() {
        return this.processDefinitionId;
    }

    public BatchqueryMachinegroupProgressRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public BatchqueryMachinegroupProgressRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public BatchqueryMachinegroupProgressRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
