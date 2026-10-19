// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 账户流水信息
    public class AccountDetail : TeaModel {
        // 商户号
        [NameInMap("merchant_no")]
        [Validation(Required=true)]
        public string MerchantNo { get; set; }

        // 交易时间
        [NameInMap("trade_time")]
        [Validation(Required=true)]
        public string TradeTime { get; set; }

        // 交易流水号
        [NameInMap("trade_no")]
        [Validation(Required=true)]
        public string TradeNo { get; set; }

        // 账号
        [NameInMap("account_no")]
        [Validation(Required=true)]
        public string AccountNo { get; set; }

        // 户名
        [NameInMap("account_name")]
        [Validation(Required=false)]
        public string AccountName { get; set; }

        // 交易金额
        [NameInMap("trade_amt")]
        [Validation(Required=true)]
        public string TradeAmt { get; set; }

        // 借贷标识	基础类型
        [NameInMap("dc_flag")]
        [Validation(Required=true)]
        public string DcFlag { get; set; }

        // 对手账号
        [NameInMap("oth_account_no")]
        [Validation(Required=true)]
        public string OthAccountNo { get; set; }

        // 对手户名
        [NameInMap("oth_account_name")]
        [Validation(Required=true)]
        public string OthAccountName { get; set; }

        // 对手行号
        [NameInMap("oth_bank_code")]
        [Validation(Required=true)]
        public string OthBankCode { get; set; }

        // 对手行名
        [NameInMap("oth_bank_name")]
        [Validation(Required=true)]
        public string OthBankName { get; set; }

        // 交易备注
        [NameInMap("trade_remark")]
        [Validation(Required=true)]
        public string TradeRemark { get; set; }

        // 交易后余额
        [NameInMap("actual_bal_amt")]
        [Validation(Required=false)]
        public string ActualBalAmt { get; set; }

    }

}
