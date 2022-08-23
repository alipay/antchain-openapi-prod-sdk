// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ContainerInstance extends TeaModel {
    // 资源id
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // 容器名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 容器挂载的阿里云anytunnel的资源id
    @NameInMap("anytunnel_resource_id")
    public String anytunnelResourceId;

    // 容器对应的index
    @NameInMap("index")
    @Validation(required = true)
    public String index;

    // 容器ip
    @NameInMap("ip")
    public String ip;

    // 集群节点ip
    @NameInMap("host_ip")
    public String hostIp;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 应用镜像名
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // cpu
    @NameInMap("cpu")
    @Validation(required = true)
    public String cpu;

    // 内存大小
    @NameInMap("memory")
    @Validation(required = true)
    public String memory;

    // 容器挂载的阿里云anytunnelIp
    @NameInMap("anytunnel_service_ip")
    public String anytunnelServiceIp;

    // 部署单元实例id
    @NameInMap("deployment_unit_instance_identity")
    @Validation(required = true)
    public String deploymentUnitInstanceIdentity;

    // 部署单元标识id
    @NameInMap("deployment_unit_identity")
    @Validation(required = true)
    public String deploymentUnitIdentity;

    public static ContainerInstance build(java.util.Map<String, ?> map) throws Exception {
        ContainerInstance self = new ContainerInstance();
        return TeaModel.build(map, self);
    }

    public ContainerInstance setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ContainerInstance setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContainerInstance setAnytunnelResourceId(String anytunnelResourceId) {
        this.anytunnelResourceId = anytunnelResourceId;
        return this;
    }
    public String getAnytunnelResourceId() {
        return this.anytunnelResourceId;
    }

    public ContainerInstance setIndex(String index) {
        this.index = index;
        return this;
    }
    public String getIndex() {
        return this.index;
    }

    public ContainerInstance setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ContainerInstance setHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }
    public String getHostIp() {
        return this.hostIp;
    }

    public ContainerInstance setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ContainerInstance setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ContainerInstance setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public ContainerInstance setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public ContainerInstance setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public ContainerInstance setAnytunnelServiceIp(String anytunnelServiceIp) {
        this.anytunnelServiceIp = anytunnelServiceIp;
        return this;
    }
    public String getAnytunnelServiceIp() {
        return this.anytunnelServiceIp;
    }

    public ContainerInstance setDeploymentUnitInstanceIdentity(String deploymentUnitInstanceIdentity) {
        this.deploymentUnitInstanceIdentity = deploymentUnitInstanceIdentity;
        return this;
    }
    public String getDeploymentUnitInstanceIdentity() {
        return this.deploymentUnitInstanceIdentity;
    }

    public ContainerInstance setDeploymentUnitIdentity(String deploymentUnitIdentity) {
        this.deploymentUnitIdentity = deploymentUnitIdentity;
        return this;
    }
    public String getDeploymentUnitIdentity() {
        return this.deploymentUnitIdentity;
    }

}
