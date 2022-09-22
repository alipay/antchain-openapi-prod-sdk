// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class AddContainerserviceLogpvRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // app名称
        [NameInMap("apps")]
        [Validation(Required=true)]
        public List<string> Apps { get; set; }

        // 环境信息
        [NameInMap("env")]
        [Validation(Required=true)]
        public string Env { get; set; }

        // PVC 名称
        [NameInMap("pvc_name")]
        [Validation(Required=true)]
        public string PvcName { get; set; }

        // StorageClass
        [NameInMap("storage_class")]
        [Validation(Required=true)]
        public string StorageClass { get; set; }

        // 存储大小
        [NameInMap("storage_size")]
        [Validation(Required=true)]
        public long? StorageSize { get; set; }

        // 挂载路径，默认/home/admin/logs
        [NameInMap("mount_path")]
        [Validation(Required=false)]
        public string MountPath { get; set; }

        // addDefaultInitContainer, 默认值false
        [NameInMap("disable_init_container")]
        [Validation(Required=false)]
        public bool? DisableInitContainer { get; set; }

        // Init Container名称
        [NameInMap("log_init_container_name")]
        [Validation(Required=false)]
        public string LogInitContainerName { get; set; }

        // 默认值添加Sidecar PV
        [NameInMap("disable_sidecar_pv")]
        [Validation(Required=false)]
        public bool? DisableSidecarPv { get; set; }

    }

}
