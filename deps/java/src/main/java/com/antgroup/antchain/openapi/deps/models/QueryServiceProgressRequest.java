// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryServiceProgressRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // depth
    @NameInMap("depth")
    public Long depth;

    // gmt_create_end
    @NameInMap("gmt_create_end")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreateEnd;

    // gmt_create_start
    @NameInMap("gmt_create_start")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreateStart;

    // ids
    @NameInMap("ids")
    public java.util.List<String> ids;

    // name
    @NameInMap("name")
    public String name;

    // ops_types
    @NameInMap("ops_types")
    public java.util.List<String> opsTypes;

    // page_no
    @NameInMap("page_no")
    public Long pageNo;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // process_definition_id
    @NameInMap("process_definition_id")
    public String processDefinitionId;

    // service_group_collection_id
    @NameInMap("service_group_collection_id")
    public String serviceGroupCollectionId;

    // service_paas_id
    @NameInMap("service_paas_id")
    public String servicePaasId;

    // state
    @NameInMap("state")
    public String state;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryServiceProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryServiceProgressRequest self = new QueryServiceProgressRequest();
        return TeaModel.build(map, self);
    }

    public QueryServiceProgressRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryServiceProgressRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryServiceProgressRequest setDepth(Long depth) {
        this.depth = depth;
        return this;
    }
    public Long getDepth() {
        return this.depth;
    }

    public QueryServiceProgressRequest setGmtCreateEnd(String gmtCreateEnd) {
        this.gmtCreateEnd = gmtCreateEnd;
        return this;
    }
    public String getGmtCreateEnd() {
        return this.gmtCreateEnd;
    }

    public QueryServiceProgressRequest setGmtCreateStart(String gmtCreateStart) {
        this.gmtCreateStart = gmtCreateStart;
        return this;
    }
    public String getGmtCreateStart() {
        return this.gmtCreateStart;
    }

    public QueryServiceProgressRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public QueryServiceProgressRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryServiceProgressRequest setOpsTypes(java.util.List<String> opsTypes) {
        this.opsTypes = opsTypes;
        return this;
    }
    public java.util.List<String> getOpsTypes() {
        return this.opsTypes;
    }

    public QueryServiceProgressRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryServiceProgressRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryServiceProgressRequest setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }
    public String getProcessDefinitionId() {
        return this.processDefinitionId;
    }

    public QueryServiceProgressRequest setServiceGroupCollectionId(String serviceGroupCollectionId) {
        this.serviceGroupCollectionId = serviceGroupCollectionId;
        return this;
    }
    public String getServiceGroupCollectionId() {
        return this.serviceGroupCollectionId;
    }

    public QueryServiceProgressRequest setServicePaasId(String servicePaasId) {
        this.servicePaasId = servicePaasId;
        return this;
    }
    public String getServicePaasId() {
        return this.servicePaasId;
    }

    public QueryServiceProgressRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public QueryServiceProgressRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
