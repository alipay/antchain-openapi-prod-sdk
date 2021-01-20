// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryServiceRollbackversionRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // depth
    @NameInMap("depth")
    public Long depth;

    // gmt_create_end
    @NameInMap("gmt_create_end")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtCreateEnd;

    // gmt_create_start
    @NameInMap("gmt_create_start")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
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
    public String workspace;

    public static QueryServiceRollbackversionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryServiceRollbackversionRequest self = new QueryServiceRollbackversionRequest();
        return TeaModel.build(map, self);
    }

    public QueryServiceRollbackversionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryServiceRollbackversionRequest setDepth(Long depth) {
        this.depth = depth;
        return this;
    }
    public Long getDepth() {
        return this.depth;
    }

    public QueryServiceRollbackversionRequest setGmtCreateEnd(String gmtCreateEnd) {
        this.gmtCreateEnd = gmtCreateEnd;
        return this;
    }
    public String getGmtCreateEnd() {
        return this.gmtCreateEnd;
    }

    public QueryServiceRollbackversionRequest setGmtCreateStart(String gmtCreateStart) {
        this.gmtCreateStart = gmtCreateStart;
        return this;
    }
    public String getGmtCreateStart() {
        return this.gmtCreateStart;
    }

    public QueryServiceRollbackversionRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public QueryServiceRollbackversionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryServiceRollbackversionRequest setOpsTypes(java.util.List<String> opsTypes) {
        this.opsTypes = opsTypes;
        return this;
    }
    public java.util.List<String> getOpsTypes() {
        return this.opsTypes;
    }

    public QueryServiceRollbackversionRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryServiceRollbackversionRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryServiceRollbackversionRequest setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }
    public String getProcessDefinitionId() {
        return this.processDefinitionId;
    }

    public QueryServiceRollbackversionRequest setServiceGroupCollectionId(String serviceGroupCollectionId) {
        this.serviceGroupCollectionId = serviceGroupCollectionId;
        return this;
    }
    public String getServiceGroupCollectionId() {
        return this.serviceGroupCollectionId;
    }

    public QueryServiceRollbackversionRequest setServicePaasId(String servicePaasId) {
        this.servicePaasId = servicePaasId;
        return this;
    }
    public String getServicePaasId() {
        return this.servicePaasId;
    }

    public QueryServiceRollbackversionRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public QueryServiceRollbackversionRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
