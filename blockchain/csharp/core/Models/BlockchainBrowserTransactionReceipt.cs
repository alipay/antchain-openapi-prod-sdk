// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 蚂蚁链浏览器交易收据信息
    public class BlockchainBrowserTransactionReceipt : TeaModel {
        // data
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // gas_used
        [NameInMap("gas_used")]
        [Validation(Required=true)]
        public long? GasUsed { get; set; }

        // logs
        [NameInMap("logs")]
        [Validation(Required=true)]
        public List<string> Logs { get; set; }

        // result
        [NameInMap("result")]
        [Validation(Required=true)]
        public long? Result { get; set; }

    }

}
