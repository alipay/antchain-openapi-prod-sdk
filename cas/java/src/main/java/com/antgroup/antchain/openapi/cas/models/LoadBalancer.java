// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class LoadBalancer extends TeaModel {
    // app_id
    @NameInMap("app_id")
    public String appId;

    // app_service_ids
    @NameInMap("app_service_ids")
    public java.util.List<String> appServiceIds;

    // assigned_app_ids
    @NameInMap("assigned_app_ids")
    public java.util.List<String> assignedAppIds;

    // assigned_app_service_ids
    @NameInMap("assigned_app_service_ids")
    public java.util.List<String> assignedAppServiceIds;

    // auto_renew
    @NameInMap("auto_renew")
    public Boolean autoRenew;

    // auto_renew_period
    @NameInMap("auto_renew_period")
    public Long autoRenewPeriod;

    // bandwidth
    @NameInMap("bandwidth")
    public Long bandwidth;

    // cluster_id
    @NameInMap("cluster_id")
    public String clusterId;

    // cluster_mode
    @NameInMap("cluster_mode")
    public Boolean clusterMode;

    // domains
    @NameInMap("domains")
    public java.util.List<String> domains;

    // iaas_id
    @NameInMap("iaas_id")
    public String iaasId;

    // iaas_type
    @NameInMap("iaas_type")
    public String iaasType;

    // lb id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // internet_charge_type
    @NameInMap("internet_charge_type")
    public String internetChargeType;

    // lb名称
    @NameInMap("name")
    public String name;

    // network_type
    @NameInMap("network_type")
    public String networkType;

    // provider_id
    @NameInMap("provider_id")
    public String providerId;

    // regionId
    @NameInMap("region_id")
    public String regionId;

    // scope
    @NameInMap("scope")
    public Scope scope;

    // share_mode
    @NameInMap("share_mode")
    public Boolean shareMode;

    // lb状态
    @NameInMap("status")
    public String status;

    // utc_create
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // utc_modified
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    // vip_addresses
    @NameInMap("vip_addresses")
    public java.util.List<String> vipAddresses;

    // vip_address_type
    @NameInMap("vip_address_type")
    public String vipAddressType;

    // vip_type
    @NameInMap("vip_type")
    public String vipType;

    // vpc_id
    @NameInMap("vpc_id")
    public String vpcId;

    // v_switch_iaas_id
    @NameInMap("v_switch_iaas_id")
    public String vSwitchIaasId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // zone_id
    @NameInMap("zone_id")
    public String zoneId;

    // options，扩展字段
    @NameInMap("options")
    public java.util.List<MapStringToStringEntity> options;

    // load_balancer_spec
    @NameInMap("load_balancer_spec")
    public String loadBalancerSpec;

    public static LoadBalancer build(java.util.Map<String, ?> map) throws Exception {
        LoadBalancer self = new LoadBalancer();
        return TeaModel.build(map, self);
    }

    public LoadBalancer setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public LoadBalancer setAppServiceIds(java.util.List<String> appServiceIds) {
        this.appServiceIds = appServiceIds;
        return this;
    }
    public java.util.List<String> getAppServiceIds() {
        return this.appServiceIds;
    }

    public LoadBalancer setAssignedAppIds(java.util.List<String> assignedAppIds) {
        this.assignedAppIds = assignedAppIds;
        return this;
    }
    public java.util.List<String> getAssignedAppIds() {
        return this.assignedAppIds;
    }

    public LoadBalancer setAssignedAppServiceIds(java.util.List<String> assignedAppServiceIds) {
        this.assignedAppServiceIds = assignedAppServiceIds;
        return this;
    }
    public java.util.List<String> getAssignedAppServiceIds() {
        return this.assignedAppServiceIds;
    }

    public LoadBalancer setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public LoadBalancer setAutoRenewPeriod(Long autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Long getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public LoadBalancer setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public LoadBalancer setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public LoadBalancer setClusterMode(Boolean clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }
    public Boolean getClusterMode() {
        return this.clusterMode;
    }

    public LoadBalancer setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

    public LoadBalancer setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public LoadBalancer setIaasType(String iaasType) {
        this.iaasType = iaasType;
        return this;
    }
    public String getIaasType() {
        return this.iaasType;
    }

    public LoadBalancer setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public LoadBalancer setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public LoadBalancer setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LoadBalancer setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public LoadBalancer setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public LoadBalancer setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public LoadBalancer setScope(Scope scope) {
        this.scope = scope;
        return this;
    }
    public Scope getScope() {
        return this.scope;
    }

    public LoadBalancer setShareMode(Boolean shareMode) {
        this.shareMode = shareMode;
        return this;
    }
    public Boolean getShareMode() {
        return this.shareMode;
    }

    public LoadBalancer setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public LoadBalancer setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public LoadBalancer setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public LoadBalancer setVipAddresses(java.util.List<String> vipAddresses) {
        this.vipAddresses = vipAddresses;
        return this;
    }
    public java.util.List<String> getVipAddresses() {
        return this.vipAddresses;
    }

    public LoadBalancer setVipAddressType(String vipAddressType) {
        this.vipAddressType = vipAddressType;
        return this;
    }
    public String getVipAddressType() {
        return this.vipAddressType;
    }

    public LoadBalancer setVipType(String vipType) {
        this.vipType = vipType;
        return this;
    }
    public String getVipType() {
        return this.vipType;
    }

    public LoadBalancer setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public LoadBalancer setVSwitchIaasId(String vSwitchIaasId) {
        this.vSwitchIaasId = vSwitchIaasId;
        return this;
    }
    public String getVSwitchIaasId() {
        return this.vSwitchIaasId;
    }

    public LoadBalancer setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public LoadBalancer setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public LoadBalancer setOptions(java.util.List<MapStringToStringEntity> options) {
        this.options = options;
        return this;
    }
    public java.util.List<MapStringToStringEntity> getOptions() {
        return this.options;
    }

    public LoadBalancer setLoadBalancerSpec(String loadBalancerSpec) {
        this.loadBalancerSpec = loadBalancerSpec;
        return this;
    }
    public String getLoadBalancerSpec() {
        return this.loadBalancerSpec;
    }

}
