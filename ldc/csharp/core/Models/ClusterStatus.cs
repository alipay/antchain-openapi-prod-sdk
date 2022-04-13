// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 集群状态信息
    public class ClusterStatus : TeaModel {
        // 集群名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 集群资源概览
        [NameInMap("overview_info")]
        [Validation(Required=true)]
        public ClusterOverviewInfo OverviewInfo { get; set; }

    }

}
