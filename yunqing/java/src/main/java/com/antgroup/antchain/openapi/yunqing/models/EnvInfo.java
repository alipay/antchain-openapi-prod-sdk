// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class EnvInfo extends TeaModel {
    // 站点名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 站点展示名称
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // IAM租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 站点类型：DEV、PROD、SIT
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 站点环境id
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    // 云环境站点类型
    @NameInMap("cloud_stack")
    @Validation(required = true)
    public String cloudStack;

    // 客户名
    @NameInMap("customer_name")
    @Validation(required = true)
    public String customerName;

    // 站点客户id
    @NameInMap("customer_id")
    @Validation(required = true)
    public String customerId;

    // 站点资源前缀，云环境名称
    @NameInMap("cloud_name")
    @Validation(required = true)
    public String cloudName;

    // global云环境id
    @NameInMap("cloud_id")
    @Validation(required = true)
    public String cloudId;

    // global云环境中文名称
    @NameInMap("real_cloud_name")
    @Validation(required = true)
    public String realCloudName;

    // rdb资源池名称
    @NameInMap("rdb_pool_name")
    @Validation(required = true)
    public String rdbPoolName;

    // 容器资源池ID
    @NameInMap("container_pool_name")
    @Validation(required = true)
    public String containerPoolName;

    // lb资源池名称
    @NameInMap("lb_pool_name")
    @Validation(required = true)
    public String lbPoolName;

    // 对象资源池名称
    @NameInMap("storage_pool_name")
    public String storagePoolName;

    // ecs资源池名称
    @NameInMap("ecs_pool_name")
    @Validation(required = true)
    public String ecsPoolName;

    // vpc资源池名称
    @NameInMap("vpc_pool_name")
    @Validation(required = true)
    public String vpcPoolName;

    // dns资源池名称
    @NameInMap("dns_pool_name")
    @Validation(required = true)
    public String dnsPoolName;

    // keystone资源池名称
    @NameInMap("keystone_pool_name")
    @Validation(required = true)
    public String keystonePoolName;

    // 底座配置
    @NameInMap("cloud_stack_config")
    @Validation(required = true)
    public CloudStackConfig cloudStackConfig;

    public static EnvInfo build(java.util.Map<String, ?> map) throws Exception {
        EnvInfo self = new EnvInfo();
        return TeaModel.build(map, self);
    }

    public EnvInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EnvInfo setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public EnvInfo setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public EnvInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public EnvInfo setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public EnvInfo setCloudStack(String cloudStack) {
        this.cloudStack = cloudStack;
        return this;
    }
    public String getCloudStack() {
        return this.cloudStack;
    }

    public EnvInfo setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public EnvInfo setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public EnvInfo setCloudName(String cloudName) {
        this.cloudName = cloudName;
        return this;
    }
    public String getCloudName() {
        return this.cloudName;
    }

    public EnvInfo setCloudId(String cloudId) {
        this.cloudId = cloudId;
        return this;
    }
    public String getCloudId() {
        return this.cloudId;
    }

    public EnvInfo setRealCloudName(String realCloudName) {
        this.realCloudName = realCloudName;
        return this;
    }
    public String getRealCloudName() {
        return this.realCloudName;
    }

    public EnvInfo setRdbPoolName(String rdbPoolName) {
        this.rdbPoolName = rdbPoolName;
        return this;
    }
    public String getRdbPoolName() {
        return this.rdbPoolName;
    }

    public EnvInfo setContainerPoolName(String containerPoolName) {
        this.containerPoolName = containerPoolName;
        return this;
    }
    public String getContainerPoolName() {
        return this.containerPoolName;
    }

    public EnvInfo setLbPoolName(String lbPoolName) {
        this.lbPoolName = lbPoolName;
        return this;
    }
    public String getLbPoolName() {
        return this.lbPoolName;
    }

    public EnvInfo setStoragePoolName(String storagePoolName) {
        this.storagePoolName = storagePoolName;
        return this;
    }
    public String getStoragePoolName() {
        return this.storagePoolName;
    }

    public EnvInfo setEcsPoolName(String ecsPoolName) {
        this.ecsPoolName = ecsPoolName;
        return this;
    }
    public String getEcsPoolName() {
        return this.ecsPoolName;
    }

    public EnvInfo setVpcPoolName(String vpcPoolName) {
        this.vpcPoolName = vpcPoolName;
        return this;
    }
    public String getVpcPoolName() {
        return this.vpcPoolName;
    }

    public EnvInfo setDnsPoolName(String dnsPoolName) {
        this.dnsPoolName = dnsPoolName;
        return this;
    }
    public String getDnsPoolName() {
        return this.dnsPoolName;
    }

    public EnvInfo setKeystonePoolName(String keystonePoolName) {
        this.keystonePoolName = keystonePoolName;
        return this;
    }
    public String getKeystonePoolName() {
        return this.keystonePoolName;
    }

    public EnvInfo setCloudStackConfig(CloudStackConfig cloudStackConfig) {
        this.cloudStackConfig = cloudStackConfig;
        return this;
    }
    public CloudStackConfig getCloudStackConfig() {
        return this.cloudStackConfig;
    }

}
