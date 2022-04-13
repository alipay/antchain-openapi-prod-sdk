// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 集群部署单元状态
    public class ClusteCellStatus : TeaModel {
        // 集群名称
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

        // 部署单元名称
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

        // Cell资源状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 详细说明或错误信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
