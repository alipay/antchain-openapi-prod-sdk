// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 链状态
    public class ChainStatus : TeaModel {
        // 链ID
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 链名称
        [NameInMap("biz_id_name")]
        [Validation(Required=false)]
        public string BizIdName { get; set; }

        // 主链ID
        [NameInMap("parent_biz_id")]
        [Validation(Required=false)]
        public string ParentBizId { get; set; }

        // 当前区块高度
        [NameInMap("ledger_height")]
        [Validation(Required=false)]
        public long? LedgerHeight { get; set; }

        // 交易总量
        [NameInMap("tx_count")]
        [Validation(Required=false)]
        public long? TxCount { get; set; }

        // 链状态，ok, fail
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
