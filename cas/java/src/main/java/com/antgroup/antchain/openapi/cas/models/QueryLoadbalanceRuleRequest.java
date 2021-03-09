// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryLoadbalanceRuleRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // app_ids
    @NameInMap("app_ids")
    public java.util.List<String> appIds;

    // cookies
    @NameInMap("cookies")
    public java.util.List<String> cookies;

    // current_page
    @NameInMap("current_page")
    public Long currentPage;

    // domains
    @NameInMap("domains")
    public java.util.List<String> domains;

    // domain_urls
    @NameInMap("domain_urls")
    public java.util.List<String> domainUrls;

    // health_monitor_ids
    @NameInMap("health_monitor_ids")
    public java.util.List<String> healthMonitorIds;

    // listener_ports
    @NameInMap("listener_ports")
    public java.util.List<Long> listenerPorts;

    // loadbalancer_ids
    @NameInMap("loadbalancer_ids")
    public java.util.List<String> loadbalancerIds;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // statuses
    @NameInMap("statuses")
    public java.util.List<String> statuses;

    // urls
    @NameInMap("urls")
    public java.util.List<String> urls;

    // vcomputer_group_ids
    @NameInMap("vcomputer_group_ids")
    public java.util.List<String> vcomputerGroupIds;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryLoadbalanceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLoadbalanceRuleRequest self = new QueryLoadbalanceRuleRequest();
        return TeaModel.build(map, self);
    }

    public QueryLoadbalanceRuleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLoadbalanceRuleRequest setAppIds(java.util.List<String> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    public QueryLoadbalanceRuleRequest setCookies(java.util.List<String> cookies) {
        this.cookies = cookies;
        return this;
    }
    public java.util.List<String> getCookies() {
        return this.cookies;
    }

    public QueryLoadbalanceRuleRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryLoadbalanceRuleRequest setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

    public QueryLoadbalanceRuleRequest setDomainUrls(java.util.List<String> domainUrls) {
        this.domainUrls = domainUrls;
        return this;
    }
    public java.util.List<String> getDomainUrls() {
        return this.domainUrls;
    }

    public QueryLoadbalanceRuleRequest setHealthMonitorIds(java.util.List<String> healthMonitorIds) {
        this.healthMonitorIds = healthMonitorIds;
        return this;
    }
    public java.util.List<String> getHealthMonitorIds() {
        return this.healthMonitorIds;
    }

    public QueryLoadbalanceRuleRequest setListenerPorts(java.util.List<Long> listenerPorts) {
        this.listenerPorts = listenerPorts;
        return this;
    }
    public java.util.List<Long> getListenerPorts() {
        return this.listenerPorts;
    }

    public QueryLoadbalanceRuleRequest setLoadbalancerIds(java.util.List<String> loadbalancerIds) {
        this.loadbalancerIds = loadbalancerIds;
        return this;
    }
    public java.util.List<String> getLoadbalancerIds() {
        return this.loadbalancerIds;
    }

    public QueryLoadbalanceRuleRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLoadbalanceRuleRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public QueryLoadbalanceRuleRequest setUrls(java.util.List<String> urls) {
        this.urls = urls;
        return this;
    }
    public java.util.List<String> getUrls() {
        return this.urls;
    }

    public QueryLoadbalanceRuleRequest setVcomputerGroupIds(java.util.List<String> vcomputerGroupIds) {
        this.vcomputerGroupIds = vcomputerGroupIds;
        return this;
    }
    public java.util.List<String> getVcomputerGroupIds() {
        return this.vcomputerGroupIds;
    }

    public QueryLoadbalanceRuleRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
