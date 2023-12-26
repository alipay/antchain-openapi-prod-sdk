// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 节点类型
    public class CrowdNodeTypeEnum : TeaModel {
        // 组合节点
        [NameInMap("group")]
        [Validation(Required=false)]
        public string Group { get; set; }

        // 条件节点
        [NameInMap("condition")]
        [Validation(Required=false)]
        public string Condition { get; set; }

    }

}
