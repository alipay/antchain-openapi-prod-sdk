// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CancelContractFlowRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 撤销合同的流程id
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        // 区块链合同撤销理由
        [NameInMap("revoke_reason")]
        [Validation(Required=false)]
        public string RevokeReason { get; set; }

        // 用户ID
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 发起人账户id，如不传默认由对接平台发起
        [NameInMap("operator_id")]
        [Validation(Required=false)]
        public string OperatorId { get; set; }

    }

}
