// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 运维变更对象
    public class OperationChangeInstance : TeaModel {
        // 主机名
        [NameInMap("hostname")]
        [Validation(Required=false)]
        public string Hostname { get; set; }

        // 部署单元
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

        // ip
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

        // 资源ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
