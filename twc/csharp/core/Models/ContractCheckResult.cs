// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 合约核验结果
    public class ContractCheckResult : TeaModel {
        // 交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 合约执行结果，Base64编码后的
        [NameInMap("content_base64")]
        [Validation(Required=false)]
        public string ContentBase64 { get; set; }

        // 块高
        [NameInMap("block_number")]
        [Validation(Required=false)]
        public long? BlockNumber { get; set; }

        // 消耗gas量
        [NameInMap("gas_used")]
        [Validation(Required=false)]
        public long? GasUsed { get; set; }

        // log信息
        [NameInMap("log_base64")]
        [Validation(Required=false)]
        public string LogBase64 { get; set; }

    }

}
