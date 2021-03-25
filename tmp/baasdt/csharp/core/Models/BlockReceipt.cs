// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 交易收据
    public class BlockReceipt : TeaModel {
        // 使用的gas数量
        [NameInMap("gas_used")]
        [Validation(Required=true)]
        public long? GasUsed { get; set; }

        // 收据log信息
        [NameInMap("logs")]
        [Validation(Required=true)]
        public List<LogEntry> Logs { get; set; }

        // 交易输出
        [NameInMap("output")]
        [Validation(Required=true)]
        public string Output { get; set; }

        // 交易结果，0为成功
        [NameInMap("result")]
        [Validation(Required=true)]
        public long? Result { get; set; }

    }

}
