// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ff57c3b0e36d40419ee97697bacb6c79.Models
{
    // 链的信息
    public class ChainInfo : TeaModel {
        // 块高
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public string BlockHeight { get; set; }

        // 交易时间
        [NameInMap("translate_date")]
        [Validation(Required=false)]
        public string TranslateDate { get; set; }

        // hash(64位)
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

    }

}
