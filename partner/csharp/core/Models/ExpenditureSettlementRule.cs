// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 支出结算规则
    public class ExpenditureSettlementRule : TeaModel {
        // 支付方式
        //     Alipay("01","Alipay","ALIPAYACCOUNT", "企业支付宝账号"),
        //     BankCard("02","BankCard", "BANKCARD", "银行卡账号")
        [NameInMap("pay_type")]
        [Validation(Required=true)]
        public string PayType { get; set; }

        // 银行卡账号
        [NameInMap("bank_no")]
        [Validation(Required=false)]
        public string BankNo { get; set; }

        // 银行用户名称
        [NameInMap("bank_account_name")]
        [Validation(Required=false)]
        public string BankAccountName { get; set; }

        // 开户行支行名称
        [NameInMap("bank_branch_name")]
        [Validation(Required=false)]
        public string BankBranchName { get; set; }

        // 支付宝账号
        [NameInMap("alipay_account")]
        [Validation(Required=false)]
        public string AlipayAccount { get; set; }

    }

}
