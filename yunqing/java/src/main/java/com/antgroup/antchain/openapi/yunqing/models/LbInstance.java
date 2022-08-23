// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class LbInstance extends TeaModel {
    // lb资源池
    @NameInMap("resource_pool_name")
    @Validation(required = true)
    public String resourcePoolName;

    // lb资源id
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // lb资源实例名称
    @NameInMap("resource_name")
    @Validation(required = true)
    public String resourceName;

    // lb路由信息：prodCode_appName
    @NameInMap("lb_router_name")
    @Validation(required = true)
    public String lbRouterName;

    // lb的vip
    @NameInMap("vip")
    @Validation(required = true)
    public String vip;

    // lb绑定的域名
    @NameInMap("domain_name")
    @Validation(required = true)
    public String domainName;

    // lb地址类型：INTENET公网，INTRANET内网
    @NameInMap("address_type")
    @Validation(required = true)
    public String addressType;

    // lb带宽
    @NameInMap("bandwidth")
    @Validation(required = true)
    public String bandwidth;

    // 是否是anytunnel lb
    @NameInMap("any_tunnel")
    @Validation(required = true)
    public Boolean anyTunnel;

    // 是否是办公网
    @NameInMap("official_only")
    @Validation(required = true)
    public Boolean officialOnly;

    // lb类型：SLB、ALB
    @NameInMap("provider")
    @Validation(required = true)
    public String provider;

    // lb状态，ACTIVE，FAILED
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 部署单元实例id
    @NameInMap("deployment_unit_instance_identity")
    @Validation(required = true)
    public String deploymentUnitInstanceIdentity;

    // 部署单元标识id
    @NameInMap("deployment_unit_identity")
    @Validation(required = true)
    public String deploymentUnitIdentity;

    public static LbInstance build(java.util.Map<String, ?> map) throws Exception {
        LbInstance self = new LbInstance();
        return TeaModel.build(map, self);
    }

    public LbInstance setResourcePoolName(String resourcePoolName) {
        this.resourcePoolName = resourcePoolName;
        return this;
    }
    public String getResourcePoolName() {
        return this.resourcePoolName;
    }

    public LbInstance setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public LbInstance setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public LbInstance setLbRouterName(String lbRouterName) {
        this.lbRouterName = lbRouterName;
        return this;
    }
    public String getLbRouterName() {
        return this.lbRouterName;
    }

    public LbInstance setVip(String vip) {
        this.vip = vip;
        return this;
    }
    public String getVip() {
        return this.vip;
    }

    public LbInstance setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public LbInstance setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public LbInstance setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

    public LbInstance setAnyTunnel(Boolean anyTunnel) {
        this.anyTunnel = anyTunnel;
        return this;
    }
    public Boolean getAnyTunnel() {
        return this.anyTunnel;
    }

    public LbInstance setOfficialOnly(Boolean officialOnly) {
        this.officialOnly = officialOnly;
        return this;
    }
    public Boolean getOfficialOnly() {
        return this.officialOnly;
    }

    public LbInstance setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public LbInstance setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public LbInstance setDeploymentUnitInstanceIdentity(String deploymentUnitInstanceIdentity) {
        this.deploymentUnitInstanceIdentity = deploymentUnitInstanceIdentity;
        return this;
    }
    public String getDeploymentUnitInstanceIdentity() {
        return this.deploymentUnitInstanceIdentity;
    }

    public LbInstance setDeploymentUnitIdentity(String deploymentUnitIdentity) {
        this.deploymentUnitIdentity = deploymentUnitIdentity;
        return this;
    }
    public String getDeploymentUnitIdentity() {
        return this.deploymentUnitIdentity;
    }

}
