// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryDnsRecordsetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // resource_type
    @NameInMap("resource_type")
    public String resourceType;

    // ip
    // 
    @NameInMap("ip")
    public String ip;

    // dns_recordset_name
    @NameInMap("dns_recordset_name")
    public String dnsRecordsetName;

    // resource_name
    @NameInMap("resource_name")
    public String resourceName;

    // resource_iaas_ids
    @NameInMap("resource_iaas_ids")
    public java.util.List<String> resourceIaasIds;

    // dns_recordset_ids
    @NameInMap("dns_recordset_ids")
    public java.util.List<String> dnsRecordsetIds;

    // page_size
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // current_page
    @NameInMap("current_page")
    @Validation(required = true)
    public Long currentPage;

    public static QueryDnsRecordsetRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDnsRecordsetRequest self = new QueryDnsRecordsetRequest();
        return TeaModel.build(map, self);
    }

    public QueryDnsRecordsetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDnsRecordsetRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public QueryDnsRecordsetRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public QueryDnsRecordsetRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public QueryDnsRecordsetRequest setDnsRecordsetName(String dnsRecordsetName) {
        this.dnsRecordsetName = dnsRecordsetName;
        return this;
    }
    public String getDnsRecordsetName() {
        return this.dnsRecordsetName;
    }

    public QueryDnsRecordsetRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public QueryDnsRecordsetRequest setResourceIaasIds(java.util.List<String> resourceIaasIds) {
        this.resourceIaasIds = resourceIaasIds;
        return this;
    }
    public java.util.List<String> getResourceIaasIds() {
        return this.resourceIaasIds;
    }

    public QueryDnsRecordsetRequest setDnsRecordsetIds(java.util.List<String> dnsRecordsetIds) {
        this.dnsRecordsetIds = dnsRecordsetIds;
        return this;
    }
    public java.util.List<String> getDnsRecordsetIds() {
        return this.dnsRecordsetIds;
    }

    public QueryDnsRecordsetRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDnsRecordsetRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

}
