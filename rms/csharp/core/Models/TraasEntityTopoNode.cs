// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 实体拓扑节点
    public class TraasEntityTopoNode : TeaModel {
        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // field
        [NameInMap("field")]
        [Validation(Required=true)]
        public string Field { get; set; }

    }

}
