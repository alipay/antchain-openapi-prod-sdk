// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ApplicationInstance extends TeaModel {
    // 应用实例的名字，一般为应用code的小写字母
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 应用版本
    @NameInMap("app_version")
    @Validation(required = true)
    public String appVersion;

    // 应用实例的命名空间，一般：站点code-prodCode小写
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 一般为空，系统自动填充默认值
    @NameInMap("storage_class")
    public String storageClass;

    // 应用部署的拓扑约束，一般为：亲和性、反亲和性、sidecar等
    @NameInMap("topology_constraints")
    public TopologyConstraints topologyConstraints;

    // 健康检查、hook配置
    @NameInMap("lifecycle")
    public Lifecycle lifecycle;

    // 应用的环境变量
    @NameInMap("app_envs")
    public java.util.List<AppEnv> appEnvs;

    // 依赖的应用名列表
    @NameInMap("application_dependencies")
    public java.util.List<String> applicationDependencies;

    // 应用的规格
    @NameInMap("resource_spec")
    @Validation(required = true)
    public ResourceSpec resourceSpec;

    // 持久化存储，可为空数组
    @NameInMap("persistent_volume_configs")
    @Validation(required = true)
    public java.util.List<PersistentVolumeConfig> persistentVolumeConfigs;

    // 运维策略
    @NameInMap("ops_spec")
    @Validation(required = true)
    public OpsSpec opsSpec;

    // OrderedReady:顺序更新，Parallel：并行更新
    @NameInMap("pod_management_policy")
    @Validation(required = true)
    public String podManagementPolicy;

    // 镜像
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    public static ApplicationInstance build(java.util.Map<String, ?> map) throws Exception {
        ApplicationInstance self = new ApplicationInstance();
        return TeaModel.build(map, self);
    }

    public ApplicationInstance setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApplicationInstance setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public ApplicationInstance setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ApplicationInstance setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

    public ApplicationInstance setTopologyConstraints(TopologyConstraints topologyConstraints) {
        this.topologyConstraints = topologyConstraints;
        return this;
    }
    public TopologyConstraints getTopologyConstraints() {
        return this.topologyConstraints;
    }

    public ApplicationInstance setLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    public ApplicationInstance setAppEnvs(java.util.List<AppEnv> appEnvs) {
        this.appEnvs = appEnvs;
        return this;
    }
    public java.util.List<AppEnv> getAppEnvs() {
        return this.appEnvs;
    }

    public ApplicationInstance setApplicationDependencies(java.util.List<String> applicationDependencies) {
        this.applicationDependencies = applicationDependencies;
        return this;
    }
    public java.util.List<String> getApplicationDependencies() {
        return this.applicationDependencies;
    }

    public ApplicationInstance setResourceSpec(ResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }
    public ResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    public ApplicationInstance setPersistentVolumeConfigs(java.util.List<PersistentVolumeConfig> persistentVolumeConfigs) {
        this.persistentVolumeConfigs = persistentVolumeConfigs;
        return this;
    }
    public java.util.List<PersistentVolumeConfig> getPersistentVolumeConfigs() {
        return this.persistentVolumeConfigs;
    }

    public ApplicationInstance setOpsSpec(OpsSpec opsSpec) {
        this.opsSpec = opsSpec;
        return this;
    }
    public OpsSpec getOpsSpec() {
        return this.opsSpec;
    }

    public ApplicationInstance setPodManagementPolicy(String podManagementPolicy) {
        this.podManagementPolicy = podManagementPolicy;
        return this;
    }
    public String getPodManagementPolicy() {
        return this.podManagementPolicy;
    }

    public ApplicationInstance setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

}
