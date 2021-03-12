// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云区块链小程序交易查询信息
    public class ALiYunChainMiniAppTransaction : TeaModel {
        // authorized
        [NameInMap("authorized")]
        [Validation(Required=false)]
        public bool? Authorized { get; set; }

        // transaction_response
        [NameInMap("transaction_response")]
        [Validation(Required=false)]
        public string TransactionResponse { get; set; }

        // transaction_receipt
        [NameInMap("transaction_receipt")]
        [Validation(Required=false)]
        public string TransactionReceipt { get; set; }

    }

}
