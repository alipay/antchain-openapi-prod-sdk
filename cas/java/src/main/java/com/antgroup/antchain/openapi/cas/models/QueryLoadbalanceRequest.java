// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryLoadbalanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // app_ids
    @NameInMap("app_ids")
    public java.util.List<String> appIds;

    // app_service_ids
    @NameInMap("app_service_ids")
    public java.util.List<String> appServiceIds;

    // cluster_ids
    @NameInMap("cluster_ids")
    public java.util.List<String> clusterIds;

    // cluster_mode
    @NameInMap("cluster_mode")
    public Boolean clusterMode;

    // current_page
    @NameInMap("current_page")
    public Long currentPage;

    // domains
    @NameInMap("domains")
    public java.util.List<String> domains;

    // health_levels 
    @NameInMap("health_levels")
    public java.util.List<String> healthLevels;

    // iaas_ids
    @NameInMap("iaas_ids")
    public java.util.List<String> iaasIds;

    // name
    @NameInMap("name")
    public String name;

    // 网络类型
    @NameInMap("network_type")
    public String networkType;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // share_mode
    @NameInMap("share_mode")
    public Boolean shareMode;

    // lb状态
    @NameInMap("statuses")
    public java.util.List<String> statuses;

    // vip地址
    @NameInMap("vip_addresses")
    public java.util.List<String> vipAddresses;

    // vip地址类型
    @NameInMap("vip_address_type")
    public String vipAddressType;

    // vip类型
    @NameInMap("vip_type")
    public String vipType;

    // vpc_ids
    @NameInMap("vpc_ids")
    public java.util.List<String> vpcIds;

    // vswitch_iaas_ids
    @NameInMap("vswitch_iaas_ids")
    public java.util.List<String> vswitchIaasIds;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryLoadbalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLoadbalanceRequest self = new QueryLoadbalanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryLoadbalanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLoadbalanceRequest setAppIds(java.util.List<String> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    public QueryLoadbalanceRequest setAppServiceIds(java.util.List<String> appServiceIds) {
        this.appServiceIds = appServiceIds;
        return this;
    }
    public java.util.List<String> getAppServiceIds() {
        return this.appServiceIds;
    }

    public QueryLoadbalanceRequest setClusterIds(java.util.List<String> clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }
    public java.util.List<String> getClusterIds() {
        return this.clusterIds;
    }

    public QueryLoadbalanceRequest setClusterMode(Boolean clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }
    public Boolean getClusterMode() {
        return this.clusterMode;
    }

    public QueryLoadbalanceRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryLoadbalanceRequest setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

    public QueryLoadbalanceRequest setHealthLevels(java.util.List<String> healthLevels) {
        this.healthLevels = healthLevels;
        return this;
    }
    public java.util.List<String> getHealthLevels() {
        return this.healthLevels;
    }

    public QueryLoadbalanceRequest setIaasIds(java.util.List<String> iaasIds) {
        this.iaasIds = iaasIds;
        return this;
    }
    public java.util.List<String> getIaasIds() {
        return this.iaasIds;
    }

    public QueryLoadbalanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryLoadbalanceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public QueryLoadbalanceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLoadbalanceRequest setShareMode(Boolean shareMode) {
        this.shareMode = shareMode;
        return this;
    }
    public Boolean getShareMode() {
        return this.shareMode;
    }

    public QueryLoadbalanceRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public QueryLoadbalanceRequest setVipAddresses(java.util.List<String> vipAddresses) {
        this.vipAddresses = vipAddresses;
        return this;
    }
    public java.util.List<String> getVipAddresses() {
        return this.vipAddresses;
    }

    public QueryLoadbalanceRequest setVipAddressType(String vipAddressType) {
        this.vipAddressType = vipAddressType;
        return this;
    }
    public String getVipAddressType() {
        return this.vipAddressType;
    }

    public QueryLoadbalanceRequest setVipType(String vipType) {
        this.vipType = vipType;
        return this;
    }
    public String getVipType() {
        return this.vipType;
    }

    public QueryLoadbalanceRequest setVpcIds(java.util.List<String> vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }
    public java.util.List<String> getVpcIds() {
        return this.vpcIds;
    }

    public QueryLoadbalanceRequest setVswitchIaasIds(java.util.List<String> vswitchIaasIds) {
        this.vswitchIaasIds = vswitchIaasIds;
        return this;
    }
    public java.util.List<String> getVswitchIaasIds() {
        return this.vswitchIaasIds;
    }

    public QueryLoadbalanceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
