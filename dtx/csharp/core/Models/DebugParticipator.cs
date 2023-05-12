// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 联调记录中的参与者信息
    public class DebugParticipator : TeaModel {
        // 主事务id
        [NameInMap("tx_id")]
        [Validation(Required=true)]
        public string TxId { get; set; }

        // 分支事务id
        [NameInMap("action_id")]
        [Validation(Required=true)]
        public string ActionId { get; set; }

        // 参与者名称
        [NameInMap("action_name")]
        [Validation(Required=true)]
        public string ActionName { get; set; }

        // 1：提交，2：回滚
        [NameInMap("action_type")]
        [Validation(Required=true)]
        public long? ActionType { get; set; }

        // 主事务上下文
        [NameInMap("activity_context")]
        [Validation(Required=true)]
        public string ActivityContext { get; set; }

        // 分支事务上下文
        [NameInMap("action_context")]
        [Validation(Required=true)]
        public string ActionContext { get; set; }

    }

}
