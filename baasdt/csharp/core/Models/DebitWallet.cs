// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 余额钱包信息
    public class DebitWallet : TeaModel {
        // 钱包余额(单位:元, 精确到小数点后4位)
        [NameInMap("balance")]
        [Validation(Required=true)]
        public string Balance { get; set; }

        // 开户名称
        [NameInMap("bank_account_name")]
        [Validation(Required=true)]
        public string BankAccountName { get; set; }

        // 开户地
        [NameInMap("bank_address")]
        [Validation(Required=true)]
        public string BankAddress { get; set; }

        // 开户银行分支机构名称
        [NameInMap("bank_branch_name")]
        [Validation(Required=true)]
        public string BankBranchName { get; set; }

        // 开户卡号
        [NameInMap("bank_card_id")]
        [Validation(Required=true)]
        public string BankCardId { get; set; }

        // 开户行名称
        [NameInMap("bank_name")]
        [Validation(Required=true)]
        public string BankName { get; set; }

        // 其他信息（例举：联行号）
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

        // 资金管理员
        [NameInMap("fund_manager_id")]
        [Validation(Required=true)]
        public string FundManagerId { get; set; }

        // 资金托管员
        [NameInMap("trustee_id")]
        [Validation(Required=true)]
        public string TrusteeId { get; set; }

        // 钱包类型（0:debit,1:credit）
        [NameInMap("wallet_type")]
        [Validation(Required=true)]
        public long? WalletType { get; set; }

    }

}
