// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class DebugParticipatorsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 分支事务上下文
        [NameInMap("action_context")]
        [Validation(Required=true)]
        public string ActionContext { get; set; }

        // 分支事务id
        [NameInMap("action_id")]
        [Validation(Required=true)]
        public string ActionId { get; set; }

        // 参与者名称
        [NameInMap("action_name")]
        [Validation(Required=true)]
        public string ActionName { get; set; }

        // 操作类型，提交或回滚
        [NameInMap("action_type")]
        [Validation(Required=true)]
        public long? ActionType { get; set; }

        // 主事务上下文
        [NameInMap("activity_context")]
        [Validation(Required=true)]
        public string ActivityContext { get; set; }

        // 环境唯一标识
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 主事务id
        [NameInMap("tx_id")]
        [Validation(Required=true)]
        public string TxId { get; set; }

    }

}
