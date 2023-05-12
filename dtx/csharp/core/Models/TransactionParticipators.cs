// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 组合对象，事务详情和参与者详情
    public class TransactionParticipators : TeaModel {
        // 参与者详情列表
        [NameInMap("participators")]
        [Validation(Required=true)]
        public List<TransactionsParticipator> Participators { get; set; }

        // 事务详情
        [NameInMap("transaction_info")]
        [Validation(Required=true)]
        public TransactionInfo TransactionInfo { get; set; }

    }

}
