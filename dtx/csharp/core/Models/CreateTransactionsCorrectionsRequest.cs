// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class CreateTransactionsCorrectionsRequest : TeaModel {
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

        // PCREDITBILL_TRANS_TRANSFER_FOR_TRADE
        [NameInMap("action_name")]
        [Validation(Required=true)]
        public string ActionName { get; set; }

        // 操作类型；1、提交，2、回滚
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

        // 1：提交，2：回滚
        [NameInMap("is_commit")]
        [Validation(Required=true)]
        public long? IsCommit { get; set; }

        // 是否同步主账务；0、不同步，1、同步
        [NameInMap("sync_acctrans")]
        [Validation(Required=true)]
        public long? SyncAcctrans { get; set; }

        // 是否同步统一支付；0、不同步，1同步
        [NameInMap("sync_paycore")]
        [Validation(Required=true)]
        public long? SyncPaycore { get; set; }

        // 事务id
        [NameInMap("tx_id")]
        [Validation(Required=true)]
        public string TxId { get; set; }

        // tracer上下文
        [NameInMap("tracer_context")]
        [Validation(Required=false)]
        public string TracerContext { get; set; }

    }

}
