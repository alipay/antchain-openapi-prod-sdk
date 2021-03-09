// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateLoadbalanceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 负载均衡实例的网络类型。有 INTERNET 和 INTRANET
    @NameInMap("address_type")
    public String addressType;

    // app id
    @NameInMap("app_id")
    public String appId;

    // app service id
    @NameInMap("app_service_id")
    public String appServiceId;

    // cluster_mode
    @NameInMap("cluster_mode")
    public Boolean clusterMode;

    // 	
    // 创建的实例数量。默认为 1 台
    @NameInMap("instance_count")
    public Long instanceCount;

    // 公网类型实例的付费方式。取值：
    // PAY_BY_BANDWIDTH：按带宽计费。
    // PAY_BY_TRAFFIC：按流量计费（默认值）。
    @NameInMap("internet_charge_type")
    public String internetChargeType;

    // listener JSON Array
    @NameInMap("listeners")
    public java.util.List<String> listeners;

    // 名称
    @NameInMap("name")
    public String name;

    // 共享模式
    @NameInMap("share_mode")
    @Validation(required = true)
    public Boolean shareMode;

    // ALB模式专用
    @NameInMap("vip_type")
    public String vipType;

    // VPC类型的实例，需要指定虚拟交换机ID。
    @NameInMap("v_switch_id")
    public String vSwitchId;

    // 工作空间
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // 可用区
    @NameInMap("zone_id")
    public String zoneId;

    // 负载均衡实例的规格。取值：
    // 
    // slb.s1.small
    // slb.s2.small
    // slb.s2.medium
    // slb.s3.small
    // slb.s3.medium
    // slb.s3.large
    // 每个地域支持的规格不同。
    // 
    // 目前支持性能保障型实例的地域有：华北 1（青岛）、华北 2（北京）、华东 1（杭州）、华东 2（上海）、华南 1（深圳）、华北 3（张家口）、华北 5 （呼和浩特）、亚太东南 1（新加坡）、英国（伦敦）、欧洲中部 1（法兰克福）、亚太东南 2（悉尼）、亚太东南 3（吉隆坡）、中东东部 1（迪拜）、亚太东南 5（雅加达）、美西 1（硅谷）、亚太南部 1（孟买）、亚太东北 1（东京）、中国香港和美东 1（弗吉尼亚）
    @NameInMap("load_balancer_spec")
    public String loadBalancerSpec;

    public static CreateLoadbalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadbalanceRequest self = new CreateLoadbalanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadbalanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLoadbalanceRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public CreateLoadbalanceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateLoadbalanceRequest setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

    public CreateLoadbalanceRequest setClusterMode(Boolean clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }
    public Boolean getClusterMode() {
        return this.clusterMode;
    }

    public CreateLoadbalanceRequest setInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    public CreateLoadbalanceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateLoadbalanceRequest setListeners(java.util.List<String> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<String> getListeners() {
        return this.listeners;
    }

    public CreateLoadbalanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLoadbalanceRequest setShareMode(Boolean shareMode) {
        this.shareMode = shareMode;
        return this;
    }
    public Boolean getShareMode() {
        return this.shareMode;
    }

    public CreateLoadbalanceRequest setVipType(String vipType) {
        this.vipType = vipType;
        return this;
    }
    public String getVipType() {
        return this.vipType;
    }

    public CreateLoadbalanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateLoadbalanceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateLoadbalanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateLoadbalanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateLoadbalanceRequest setLoadBalancerSpec(String loadBalancerSpec) {
        this.loadBalancerSpec = loadBalancerSpec;
        return this;
    }
    public String getLoadBalancerSpec() {
        return this.loadBalancerSpec;
    }

}
