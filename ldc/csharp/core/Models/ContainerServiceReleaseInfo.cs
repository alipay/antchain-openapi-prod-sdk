// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 容器服务发布信息
    public class ContainerServiceReleaseInfo : TeaModel {
        // 发布单id
        [NameInMap("created_plan_id")]
        [Validation(Required=false)]
        public string CreatedPlanId { get; set; }

        // 发布开始时间
        [NameInMap("latest_deployment_start_time")]
        [Validation(Required=false)]
        public string LatestDeploymentStartTime { get; set; }

        // 发布完成时间
        [NameInMap("latest_deployment_end_time")]
        [Validation(Required=false)]
        public string LatestDeploymentEndTime { get; set; }

    }

}
