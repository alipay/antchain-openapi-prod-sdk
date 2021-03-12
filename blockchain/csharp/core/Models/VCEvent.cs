// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 可验证声明相关的事件
    public class VCEvent : TeaModel {
        // 事件对应的合约方法
        [NameInMap("action")]
        [Validation(Required=true)]
        public string Action { get; set; }

        // 本次事件的触发者
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // 事件在区块的高度
        [NameInMap("height")]
        [Validation(Required=true)]
        public long? Height { get; set; }

        // 该VC的颁发者
        [NameInMap("issuer")]
        [Validation(Required=true)]
        public string Issuer { get; set; }

        // 有效，或者无效
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 该vc的接受者
        [NameInMap("subjec")]
        [Validation(Required=true)]
        public string Subjec { get; set; }

        // 交易hash
        // 
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 交易在区块中的index
        [NameInMap("tx_index")]
        [Validation(Required=true)]
        public long? TxIndex { get; set; }

        // 可验证声明Hash值
        [NameInMap("vc_hash")]
        [Validation(Required=true)]
        public string VcHash { get; set; }

        // vcid
        [NameInMap("vc_id")]
        [Validation(Required=true)]
        public string VcId { get; set; }

    }

}
