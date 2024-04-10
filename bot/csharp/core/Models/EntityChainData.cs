// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 实体上链数据
    public class EntityChainData : TeaModel {
        // 实体ID
        [NameInMap("entity_id")]
        [Validation(Required=true)]
        public string EntityId { get; set; }

        // 数据原文
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 数据原文对应的签名
        [NameInMap("sign")]
        [Validation(Required=true)]
        public string Sign { get; set; }

        // 数据原文上链哈希
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

    }

}
