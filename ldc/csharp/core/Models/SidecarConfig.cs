// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // SidecarConfig
    public class SidecarConfig : TeaModel {
        // Sidercar 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 表达是否修改feature
        [NameInMap("change_feature")]
        [Validation(Required=true)]
        public bool? ChangeFeature { get; set; }

        // FEATURE_GATES
        [NameInMap("feature_gates")]
        [Validation(Required=false)]
        public string FeatureGates { get; set; }

        // 镜像地址
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // 需要修改或自定义新增的sidecar环境变量。
        [NameInMap("change_envs")]
        [Validation(Required=false)]
        public string ChangeEnvs { get; set; }

        // sidecar的pvc挂载配置
        [NameInMap("volume_mounts")]
        [Validation(Required=false)]
        public List<VolumeMount> VolumeMounts { get; set; }

        // 扩展字段
        [NameInMap("ext")]
        [Validation(Required=false)]
        public string Ext { get; set; }

    }

}
