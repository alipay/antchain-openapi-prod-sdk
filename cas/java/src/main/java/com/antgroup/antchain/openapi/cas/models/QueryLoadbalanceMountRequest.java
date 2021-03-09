// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryLoadbalanceMountRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // app_ids
    @NameInMap("app_ids")
    public java.util.List<String> appIds;

    // current_page
    @NameInMap("current_page")
    public Long currentPage;

    // domains
    @NameInMap("domains")
    public java.util.List<String> domains;

    // iaas_ids_exclude
    @NameInMap("iaas_ids_exclude")
    public java.util.List<String> iaasIdsExclude;

    // initialized
    @NameInMap("initialized")
    public Boolean initialized;

    // loadbalance_ids
    @NameInMap("loadbalance_ids")
    @Validation(required = true)
    public java.util.List<String> loadbalanceIds;

    // mounted
    @NameInMap("mounted")
    public Boolean mounted;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // statuses
    @NameInMap("statuses")
    public java.util.List<String> statuses;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // region_ids
    @NameInMap("region_ids")
    public java.util.List<String> regionIds;

    // zone_ids
    @NameInMap("zone_ids")
    public java.util.List<String> zoneIds;

    // name
    @NameInMap("name")
    public String name;

    public static QueryLoadbalanceMountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLoadbalanceMountRequest self = new QueryLoadbalanceMountRequest();
        return TeaModel.build(map, self);
    }

    public QueryLoadbalanceMountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLoadbalanceMountRequest setAppIds(java.util.List<String> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    public QueryLoadbalanceMountRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryLoadbalanceMountRequest setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

    public QueryLoadbalanceMountRequest setIaasIdsExclude(java.util.List<String> iaasIdsExclude) {
        this.iaasIdsExclude = iaasIdsExclude;
        return this;
    }
    public java.util.List<String> getIaasIdsExclude() {
        return this.iaasIdsExclude;
    }

    public QueryLoadbalanceMountRequest setInitialized(Boolean initialized) {
        this.initialized = initialized;
        return this;
    }
    public Boolean getInitialized() {
        return this.initialized;
    }

    public QueryLoadbalanceMountRequest setLoadbalanceIds(java.util.List<String> loadbalanceIds) {
        this.loadbalanceIds = loadbalanceIds;
        return this;
    }
    public java.util.List<String> getLoadbalanceIds() {
        return this.loadbalanceIds;
    }

    public QueryLoadbalanceMountRequest setMounted(Boolean mounted) {
        this.mounted = mounted;
        return this;
    }
    public Boolean getMounted() {
        return this.mounted;
    }

    public QueryLoadbalanceMountRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLoadbalanceMountRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public QueryLoadbalanceMountRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public QueryLoadbalanceMountRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public QueryLoadbalanceMountRequest setZoneIds(java.util.List<String> zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

    public QueryLoadbalanceMountRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
