// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 钱包信息
    public class WalletInfo : TeaModel {
        // 授信钱包信息
        [NameInMap("credit_wallet")]
        [Validation(Required=true)]
        public CreditWallet CreditWallet { get; set; }

        // 余额钱包信息
        [NameInMap("debit_wallet")]
        [Validation(Required=true)]
        public DebitWallet DebitWallet { get; set; }

        // 钱包统计信息
        [NameInMap("statistical_info")]
        [Validation(Required=true)]
        public StatisticalInfo StatisticalInfo { get; set; }

    }

}
