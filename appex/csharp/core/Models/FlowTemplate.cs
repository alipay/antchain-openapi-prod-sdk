// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    // 自定义流程入参DTO
    public class FlowTemplate : TeaModel {
        // 业务单据类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 起始状态
        [NameInMap("from_status")]
        [Validation(Required=true)]
        public string FromStatus { get; set; }

        // 目标状态
        [NameInMap("to_status")]
        [Validation(Required=true)]
        public string ToStatus { get; set; }

        // 是否为状态流起始节点
        [NameInMap("start_node")]
        [Validation(Required=true)]
        public bool? StartNode { get; set; }

    }

}
