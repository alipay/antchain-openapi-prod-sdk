// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 见证流程审批数据
    public class WitnessApprovalData : TeaModel {
        // 审批流程id
        [NameInMap("approval_flow_id")]
        [Validation(Required=false)]
        public string ApprovalFlowId { get; set; }

        // 印章id列表
        [NameInMap("seal_ids")]
        [Validation(Required=false)]
        public List<string> SealIds { get; set; }

    }

}
