// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // sidecar运维任务上下文
    public class SidecarOperationTaskContext : TeaModel {
        // sidecar开启特性
        [NameInMap("enabled_features")]
        [Validation(Required=false)]
        public string EnabledFeatures { get; set; }

        // sidecar类型
        [NameInMap("sidecar_types")]
        [Validation(Required=true)]
        public List<string> SidecarTypes { get; set; }

        // sidecar版本
        [NameInMap("sidecar_version_map")]
        [Validation(Required=true)]
        public string SidecarVersionMap { get; set; }

        // sidecar支持特性
        [NameInMap("supported_features")]
        [Validation(Required=false)]
        public string SupportedFeatures { get; set; }

        // 变更资源列表
        [NameInMap("change_instances")]
        [Validation(Required=true)]
        public List<OperationChangeInstance> ChangeInstances { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

    }

}
