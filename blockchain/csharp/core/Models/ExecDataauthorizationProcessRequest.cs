// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ExecDataauthorizationProcessRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 审批操作意见
        [NameInMap("comment")]
        [Validation(Required=true)]
        public string Comment { get; set; }

        // 扩展参数
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 新节点ID列表
        [NameInMap("forward_node_ids")]
        [Validation(Required=false)]
        public List<string> ForwardNodeIds { get; set; }

        // 审批操作结果
        [NameInMap("operate_result")]
        [Validation(Required=true)]
        public string OperateResult { get; set; }

        // 审批操作时间
        [NameInMap("operate_time")]
        [Validation(Required=true)]
        public long? OperateTime { get; set; }

        // 审批操作人ID
        [NameInMap("operator_id")]
        [Validation(Required=true)]
        public string OperatorId { get; set; }

        // 流程ID
        [NameInMap("process_id")]
        [Validation(Required=true)]
        public string ProcessId { get; set; }

    }

}
