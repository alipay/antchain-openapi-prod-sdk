// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 健康检查配置。
    public class HealthCheckConfigInfo : TeaModel {
        // 容器健康检查配置liveness probe。
        [NameInMap("liveness_probe")]
        [Validation(Required=false)]
        public LivenessProbe LivenessProbe { get; set; }

        // 容器健康检查配置readiness probe。
        [NameInMap("readiness_probe")]
        [Validation(Required=false)]
        public ReadinessProbe ReadinessProbe { get; set; }

    }

}
