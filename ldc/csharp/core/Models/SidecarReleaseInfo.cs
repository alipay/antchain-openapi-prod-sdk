// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 具体sidecar的服务配置，包含sidecar名称，版本，feature，image，env，releaseVersion等
    public class SidecarReleaseInfo : TeaModel {
        // sidecar类型名称
        [NameInMap("sidecar_name")]
        [Validation(Required=true)]
        public string SidecarName { get; set; }

        // sidecar的发布版本
        [NameInMap("sidecar_version")]
        [Validation(Required=true)]
        public string SidecarVersion { get; set; }

        // mosn对应打开的feature-gates配置。
        [NameInMap("feature_gates")]
        [Validation(Required=false)]
        public string FeatureGates { get; set; }

        // 所用的image
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // 应用基线当前所用的自定义env
        [NameInMap("change_envs")]
        [Validation(Required=false)]
        public string ChangeEnvs { get; set; }

        // sidecar的发布版本号
        [NameInMap("release_version")]
        [Validation(Required=true)]
        public string ReleaseVersion { get; set; }

        //  上一次的发布版本号
        [NameInMap("last_release_version")]
        [Validation(Required=false)]
        public string LastReleaseVersion { get; set; }

    }

}
