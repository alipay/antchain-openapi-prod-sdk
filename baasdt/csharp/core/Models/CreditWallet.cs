// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 信用钱包信息
    public class CreditWallet : TeaModel {
        // 最大授信额度(单位:元,精确到小数点后4位)
        [NameInMap("max_balance")]
        [Validation(Required=true)]
        public string MaxBalance { get; set; }

        // 已经使用的授信额度(单位:元,精确到小数点后4位)
        [NameInMap("used_balance")]
        [Validation(Required=true)]
        public string UsedBalance { get; set; }

        // 钱包类型（0:debit,1:credit）
        [NameInMap("wallet_type")]
        [Validation(Required=true)]
        public long? WalletType { get; set; }

        // 资金管理员
        [NameInMap("fund_manager_id")]
        [Validation(Required=true)]
        public string FundManagerId { get; set; }

        // 资金托管员
        [NameInMap("trustee_id")]
        [Validation(Required=true)]
        public string TrusteeId { get; set; }

        // 其他信息（例举：联行号）
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

    }

}
