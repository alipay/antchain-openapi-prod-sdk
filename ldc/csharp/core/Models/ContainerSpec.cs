// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 容器配置。
    public class ContainerSpec : TeaModel {
        // 最大CPU限制，格式 1/1m。
        [NameInMap("cpu_limit")]
        [Validation(Required=true)]
        public string CpuLimit { get; set; }

        // 最少需要的CPU核数，格式 1/1m。
        [NameInMap("cpu_request")]
        [Validation(Required=true)]
        public string CpuRequest { get; set; }

        // 启动命令。
        [NameInMap("entry_points")]
        [Validation(Required=false)]
        public List<string> EntryPoints { get; set; }

        // 环境变量。
        [NameInMap("envs")]
        [Validation(Required=false)]
        public List<EnvVar> Envs { get; set; }

        // 容器环境变量配置覆盖。
        [NameInMap("env_overrides")]
        [Validation(Required=false)]
        public List<EnvVarOverride> EnvOverrides { get; set; }

        // 健康检查配置
        // 
        [NameInMap("health_check_config")]
        [Validation(Required=false)]
        public HealthCheckConfig HealthCheckConfig { get; set; }

        // 地址，格式形如 repository:tag。
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // 镜像构建名。
        [NameInMap("image_build_name")]
        [Validation(Required=false)]
        public string ImageBuildName { get; set; }

        // image pull secret
        [NameInMap("image_pull_secret")]
        [Validation(Required=false)]
        public string ImagePullSecret { get; set; }

        // 镜像来源，构建/普通镜像。
        [NameInMap("image_source")]
        [Validation(Required=true)]
        public string ImageSource { get; set; }

        // 生命周期钩子。
        [NameInMap("lifecycle_hook")]
        [Validation(Required=false)]
        public LifecycleHook LifecycleHook { get; set; }

        // 日志服务配置
        [NameInMap("log_configs")]
        [Validation(Required=false)]
        public List<LogConfigEntity> LogConfigs { get; set; }

        // 最大内存限制，单位 Byte/Ki/Mi/Gi/Ti/Pi。
        [NameInMap("memory_limit")]
        [Validation(Required=true)]
        public string MemoryLimit { get; set; }

        // 最小需要的内存大小，单位 Byte/Ki/Mi/Gi/Ti/Pi。
        [NameInMap("memory_request")]
        [Validation(Required=true)]
        public string MemoryRequest { get; set; }

        // 容器名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 重启策略。
        [NameInMap("restart_policy")]
        [Validation(Required=true)]
        public string RestartPolicy { get; set; }

        // 容器类型。
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 存储卷
        // 
        [NameInMap("volume_mounts")]
        [Validation(Required=false)]
        public List<VolumeMount> VolumeMounts { get; set; }

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
        [NameInMap("volume_mounts_str")]
        [Validation(Required=false)]
        public string VolumeMountsStr { get; set; }

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
        [NameInMap("volumes_str")]
        [Validation(Required=false)]
        public string VolumesStr { get; set; }

        // 基础字段覆盖
        [NameInMap("field_overrides")]
        [Validation(Required=false)]
        public List<FieldOverride> FieldOverrides { get; set; }

        // 容器yaml内容
        [NameInMap("yaml_content")]
        [Validation(Required=false)]
        public string YamlContent { get; set; }

    }

}
