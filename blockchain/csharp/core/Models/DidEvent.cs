// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // did更新事件
    public class DidEvent : TeaModel {
        // 事件对应的合约方法
        [NameInMap("action")]
        [Validation(Required=true)]
        public string Action { get; set; }

        // 对应did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // did对应doc
        [NameInMap("did_doc")]
        [Validation(Required=true)]
        public string DidDoc { get; set; }

        // 本次事件的触发者
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // 6500
        [NameInMap("height")]
        [Validation(Required=true)]
        public long? Height { get; set; }

        // 交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 交易在区块中的index
        [NameInMap("tx_index")]
        [Validation(Required=true)]
        public long? TxIndex { get; set; }

    }

}
