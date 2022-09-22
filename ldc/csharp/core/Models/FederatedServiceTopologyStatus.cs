// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // topologyStatus
    public class FederatedServiceTopologyStatus : TeaModel {
        // 部署单元
        [NameInMap("topology_name")]
        [Validation(Required=true)]
        public string TopologyName { get; set; }

        // annotations
        [NameInMap("annotations")]
        [Validation(Required=false)]
        public List<Annotation> Annotations { get; set; }

        // 状态：succeed、updating、fail
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 错误信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
