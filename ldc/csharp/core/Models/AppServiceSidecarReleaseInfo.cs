// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 应用服务的sidecar配置
    public class AppServiceSidecarReleaseInfo : TeaModel {
        // 服务所属app名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 应用服务名
        [NameInMap("container_service_name")]
        [Validation(Required=true)]
        public string ContainerServiceName { get; set; }

        // 应用服务所包含的sidecar配置信息，可以有mosn，odp等等不同sidecar类型的配置
        [NameInMap("release_infos")]
        [Validation(Required=true)]
        public List<SidecarReleaseInfo> ReleaseInfos { get; set; }

    }

}
