// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 用户绑定银行卡列表
    public class CustomerBankCardInfo : TeaModel {
        // 银行名称
        [NameInMap("bank_name")]
        [Validation(Required=true)]
        public string BankName { get; set; }

        // 银行编码
        [NameInMap("bank_code")]
        [Validation(Required=true)]
        public string BankCode { get; set; }

        // 银行卡号
        [NameInMap("bank_card_no")]
        [Validation(Required=true)]
        public string BankCardNo { get; set; }

        // 是否已签约
        [NameInMap("signed")]
        [Validation(Required=false)]
        public string Signed { get; set; }

        // 是否为账户代扣银行卡
        [NameInMap("acct_bank_card")]
        [Validation(Required=false)]
        public string AcctBankCard { get; set; }

    }

}
