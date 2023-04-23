// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 结算请求
    public class SettlementRequest : TeaModel {
        // 结算方式：
        // 企业支付宝账号 Alipay
        // 银行卡账号 BankCard
        [NameInMap("pay_type")]
        [Validation(Required=true)]
        public string PayType { get; set; }

        // 银行卡账号
        [NameInMap("bank_no")]
        [Validation(Required=false)]
        public string BankNo { get; set; }

        // 银行卡用户名称
        [NameInMap("bank_account_name")]
        [Validation(Required=false)]
        public string BankAccountName { get; set; }

        // 银行支行名称
        [NameInMap("bank_branch_name")]
        [Validation(Required=false)]
        public string BankBranchName { get; set; }

        // 支付宝账号
        [NameInMap("alipay_account")]
        [Validation(Required=false)]
        public string AlipayAccount { get; set; }

    }

}
