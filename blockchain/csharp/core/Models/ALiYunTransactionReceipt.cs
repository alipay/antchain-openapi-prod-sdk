// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云交易收据
    public class ALiYunTransactionReceipt : TeaModel {
        // data
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

        // gas_used
        [NameInMap("gas_used")]
        [Validation(Required=false)]
        public string GasUsed { get; set; }

        // result
        [NameInMap("result")]
        [Validation(Required=false)]
        public long? Result { get; set; }

        // logs
        [NameInMap("logs")]
        [Validation(Required=false)]
        public List<string> Logs { get; set; }

    }

}
