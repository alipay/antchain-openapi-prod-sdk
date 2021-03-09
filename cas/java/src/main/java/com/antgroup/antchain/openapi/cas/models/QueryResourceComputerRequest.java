// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryResourceComputerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // iaas id
    @NameInMap("iaas_id")
    public String iaasId;

    // 逗号分隔的实例ID，最多支持100个
    @NameInMap("instance_ids")
    public java.util.List<String> instanceIds;

    // 实例名称，支持使用通配符*进行模糊搜索。
    @NameInMap("instance_name")
    public String instanceName;

    // 实例的规格
    @NameInMap("instance_type")
    public String instanceType;

    // 主机的内网ip，取值可以由多个IP组成一个JSON数组，最多支持100个IP，IP之间用半角逗号（,）隔开。
    @NameInMap("private_ip_addresses")
    public java.util.List<String> privateIpAddresses;

    // 供应商id
    @NameInMap("provider_id")
    public String providerId;

    // 实例所属的地域ID
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // 实例所在的企业资源组ID。
    @NameInMap("resource_group_id")
    public String resourceGroupId;

    // 实例状态。取值范围：
    // 
    // Running：运行中
    // Starting：启动中
    // Stopping：停止中
    // Stopped：已停止
    @NameInMap("status")
    public String status;

    // 主机所在工作空间
    @NameInMap("workspace")
    public String workspace;

    public static QueryResourceComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceComputerRequest self = new QueryResourceComputerRequest();
        return TeaModel.build(map, self);
    }

    public QueryResourceComputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryResourceComputerRequest setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public QueryResourceComputerRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public QueryResourceComputerRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public QueryResourceComputerRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public QueryResourceComputerRequest setPrivateIpAddresses(java.util.List<String> privateIpAddresses) {
        this.privateIpAddresses = privateIpAddresses;
        return this;
    }
    public java.util.List<String> getPrivateIpAddresses() {
        return this.privateIpAddresses;
    }

    public QueryResourceComputerRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public QueryResourceComputerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryResourceComputerRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public QueryResourceComputerRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryResourceComputerRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
