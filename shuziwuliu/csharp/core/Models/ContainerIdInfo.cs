// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 航运集装箱ID信息
    public class ContainerIdInfo : TeaModel {
        // 箱子唯一标识
        [NameInMap("container_id")]
        [Validation(Required=false)]
        public string ContainerId { get; set; }

        // 箱号
        [NameInMap("container_no")]
        [Validation(Required=false)]
        public string ContainerNo { get; set; }

    }

}
