// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 联邦资源在某个部署单元（cell）中的分发状态
    public class ClusteCellStatus : TeaModel {
        // 部署单元所在集群名称
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

        // 部署单元名称
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

        // 联邦资源的分发状态，空字符串代表成功，否则为错误码
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 详细错误信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
