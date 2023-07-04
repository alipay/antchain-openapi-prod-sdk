// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // AAP 应用实例
    public class ApplicationInstance : TeaModel {
        // 应用实例的名字，一般为应用code的小写字母
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 应用版本
        [NameInMap("app_version")]
        [Validation(Required=true)]
        public string AppVersion { get; set; }

        // 应用实例的命名空间，一般：站点code-prodCode小写
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 一般为空，系统自动填充默认值
        [NameInMap("storage_class")]
        [Validation(Required=false)]
        public string StorageClass { get; set; }

        // 应用部署的拓扑约束，一般为：亲和性、反亲和性、sidecar等
        [NameInMap("topology_constraints")]
        [Validation(Required=false)]
        public TopologyConstraints TopologyConstraints { get; set; }

        // 健康检查、hook配置
        [NameInMap("lifecycle")]
        [Validation(Required=false)]
        public Lifecycle Lifecycle { get; set; }

        // 应用的环境变量
        [NameInMap("app_envs")]
        [Validation(Required=false)]
        public List<AppEnv> AppEnvs { get; set; }

        // 依赖的应用名列表
        [NameInMap("application_dependencies")]
        [Validation(Required=false)]
        public List<string> ApplicationDependencies { get; set; }

        // 应用的规格
        [NameInMap("resource_spec")]
        [Validation(Required=true)]
        public ResourceSpec ResourceSpec { get; set; }

        // 持久化存储，可为空数组
        [NameInMap("persistent_volume_configs")]
        [Validation(Required=true)]
        public List<PersistentVolumeConfig> PersistentVolumeConfigs { get; set; }

        // 运维策略
        [NameInMap("ops_spec")]
        [Validation(Required=true)]
        public OpsSpec OpsSpec { get; set; }

        // OrderedReady:顺序更新，Parallel：并行更新
        [NameInMap("pod_management_policy")]
        [Validation(Required=true)]
        public string PodManagementPolicy { get; set; }

        // 镜像
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

    }

}
