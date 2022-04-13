// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ContainerSpec extends TeaModel {
    // 最大CPU限制，格式 1/1m。
    @NameInMap("cpu_limit")
    @Validation(required = true)
    public String cpuLimit;

    // 最少需要的CPU核数，格式 1/1m。
    @NameInMap("cpu_request")
    @Validation(required = true)
    public String cpuRequest;

    // 启动命令。
    @NameInMap("entry_points")
    public java.util.List<String> entryPoints;

    // 环境变量。
    @NameInMap("envs")
    public java.util.List<EnvVar> envs;

    // 容器环境变量配置覆盖。
    @NameInMap("env_overrides")
    public java.util.List<EnvVarOverride> envOverrides;

    // 健康检查配置
    // 
    @NameInMap("health_check_config")
    public HealthCheckConfig healthCheckConfig;

    // 地址，格式形如 repository:tag。
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // 镜像构建名。
    @NameInMap("image_build_name")
    public String imageBuildName;

    // image pull secret
    @NameInMap("image_pull_secret")
    public String imagePullSecret;

    // 镜像来源，构建/普通镜像。
    @NameInMap("image_source")
    @Validation(required = true)
    public String imageSource;

    // 生命周期钩子。
    @NameInMap("lifecycle_hook")
    public LifecycleHook lifecycleHook;

    // 日志服务配置
    @NameInMap("log_configs")
    public java.util.List<LogConfigEntity> logConfigs;

    // 最大内存限制，单位 Byte/Ki/Mi/Gi/Ti/Pi。
    @NameInMap("memory_limit")
    @Validation(required = true)
    public String memoryLimit;

    // 最小需要的内存大小，单位 Byte/Ki/Mi/Gi/Ti/Pi。
    @NameInMap("memory_request")
    @Validation(required = true)
    public String memoryRequest;

    // 容器名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 重启策略。
    @NameInMap("restart_policy")
    @Validation(required = true)
    public String restartPolicy;

    // 容器类型。
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 存储卷
    // 
    @NameInMap("volume_mounts")
    public java.util.List<VolumeMount> volumeMounts;

    // volumeMountV2, json格式，方便扩展, 与volumes_str搭配使用，启用后废弃volume_mount字段
    // {
    // 	"volumeMounts": [{
    // 		"mountPath": "/container/config",
    // 		"name": "aarm-base-configmap-volume",
    // 		"readOnly": true
    // 	}, {
    // 		"mountPath": "/container/scrt",
    // 		"name": "panling-secret-volume",
    // 		"readOnly": true
    // 	}, {
    // 		"mountPath": "/container/pvc",
    // 		"name": "afa-public-data-pv",
    // 		"readOnly": true
    // 	}, {
    // 		"mountPath": "/container/local",
    // 		"name": "container-local-host-volume",
    // 		"readOnly": true
    // 	}]
    // }
    // 这里会兼容原来OpenAPI传过来的volume_mount字段
    @NameInMap("volume_mounts_str")
    public String volumeMountsStr;

    // 与volume_mounts_str搭配使用，描述pod的volume部分
    // {
    // 	"volumes": [{
    // 			"configMap": {
    // 				"defaultMode": 256,
    // 				"name": "aarm-base"
    // 			},
    // 			"name": "aarm-base-configmap-volume"
    // 		},
    // 		{
    // 			"name": "panling-secret-volume",
    // 			"secret": {
    // 				"defaultMode": 256,
    // 				"secretName": "panling"
    // 			}
    // 		},
    // 		{
    // 			"name": "afa-public-data-pv",
    // 			"persistentVolumeClaim": {
    // 				"claimName": "afa-public-data"
    // 			}
    // 		},
    // 		{
    // 			"hostPath": {
    // 				"path": "/local"
    // 			},
    // 			"name": "container-local-host-volume"
    // 		}
    // 	]
    // }
    @NameInMap("volumes_str")
    public String volumesStr;

    // 基础字段覆盖
    @NameInMap("field_overrides")
    public java.util.List<FieldOverride> fieldOverrides;

    public static ContainerSpec build(java.util.Map<String, ?> map) throws Exception {
        ContainerSpec self = new ContainerSpec();
        return TeaModel.build(map, self);
    }

    public ContainerSpec setCpuLimit(String cpuLimit) {
        this.cpuLimit = cpuLimit;
        return this;
    }
    public String getCpuLimit() {
        return this.cpuLimit;
    }

    public ContainerSpec setCpuRequest(String cpuRequest) {
        this.cpuRequest = cpuRequest;
        return this;
    }
    public String getCpuRequest() {
        return this.cpuRequest;
    }

    public ContainerSpec setEntryPoints(java.util.List<String> entryPoints) {
        this.entryPoints = entryPoints;
        return this;
    }
    public java.util.List<String> getEntryPoints() {
        return this.entryPoints;
    }

    public ContainerSpec setEnvs(java.util.List<EnvVar> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.List<EnvVar> getEnvs() {
        return this.envs;
    }

    public ContainerSpec setEnvOverrides(java.util.List<EnvVarOverride> envOverrides) {
        this.envOverrides = envOverrides;
        return this;
    }
    public java.util.List<EnvVarOverride> getEnvOverrides() {
        return this.envOverrides;
    }

    public ContainerSpec setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
        return this;
    }
    public HealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    public ContainerSpec setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public ContainerSpec setImageBuildName(String imageBuildName) {
        this.imageBuildName = imageBuildName;
        return this;
    }
    public String getImageBuildName() {
        return this.imageBuildName;
    }

    public ContainerSpec setImagePullSecret(String imagePullSecret) {
        this.imagePullSecret = imagePullSecret;
        return this;
    }
    public String getImagePullSecret() {
        return this.imagePullSecret;
    }

    public ContainerSpec setImageSource(String imageSource) {
        this.imageSource = imageSource;
        return this;
    }
    public String getImageSource() {
        return this.imageSource;
    }

    public ContainerSpec setLifecycleHook(LifecycleHook lifecycleHook) {
        this.lifecycleHook = lifecycleHook;
        return this;
    }
    public LifecycleHook getLifecycleHook() {
        return this.lifecycleHook;
    }

    public ContainerSpec setLogConfigs(java.util.List<LogConfigEntity> logConfigs) {
        this.logConfigs = logConfigs;
        return this;
    }
    public java.util.List<LogConfigEntity> getLogConfigs() {
        return this.logConfigs;
    }

    public ContainerSpec setMemoryLimit(String memoryLimit) {
        this.memoryLimit = memoryLimit;
        return this;
    }
    public String getMemoryLimit() {
        return this.memoryLimit;
    }

    public ContainerSpec setMemoryRequest(String memoryRequest) {
        this.memoryRequest = memoryRequest;
        return this;
    }
    public String getMemoryRequest() {
        return this.memoryRequest;
    }

    public ContainerSpec setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContainerSpec setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }
    public String getRestartPolicy() {
        return this.restartPolicy;
    }

    public ContainerSpec setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ContainerSpec setVolumeMounts(java.util.List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }
    public java.util.List<VolumeMount> getVolumeMounts() {
        return this.volumeMounts;
    }

    public ContainerSpec setVolumeMountsStr(String volumeMountsStr) {
        this.volumeMountsStr = volumeMountsStr;
        return this;
    }
    public String getVolumeMountsStr() {
        return this.volumeMountsStr;
    }

    public ContainerSpec setVolumesStr(String volumesStr) {
        this.volumesStr = volumesStr;
        return this;
    }
    public String getVolumesStr() {
        return this.volumesStr;
    }

    public ContainerSpec setFieldOverrides(java.util.List<FieldOverride> fieldOverrides) {
        this.fieldOverrides = fieldOverrides;
        return this;
    }
    public java.util.List<FieldOverride> getFieldOverrides() {
        return this.fieldOverrides;
    }

}
