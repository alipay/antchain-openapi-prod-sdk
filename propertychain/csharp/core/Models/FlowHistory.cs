// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 历史操作信息
    public class FlowHistory : TeaModel {
        // 操作信息
        [NameInMap("flow_node_list")]
        [Validation(Required=false)]
        public List<FlowNode> FlowNodeList { get; set; }

    }

}
