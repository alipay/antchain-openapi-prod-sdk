// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 健康检查配置 
    public class HealthCheckConfig : TeaModel {
        // liveness 检查
        // 
        [NameInMap("liveness_probe")]
        [Validation(Required=false)]
        public HealthCheckProbe LivenessProbe { get; set; }

        // readiness 检查
        // 
        [NameInMap("readiness_probe")]
        [Validation(Required=false)]
        public HealthCheckProbe ReadinessProbe { get; set; }

    }

}
