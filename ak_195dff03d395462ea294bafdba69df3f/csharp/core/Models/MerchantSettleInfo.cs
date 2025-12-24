// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    // 京东进件商家结算信息
    public class MerchantSettleInfo : TeaModel {
        // 结算银行卡账号
        [NameInMap("bank_num")]
        [Validation(Required=true)]
        public string BankNum { get; set; }

        // 联行号 
        [NameInMap("bank_cnap")]
        [Validation(Required=true)]
        public string BankCnap { get; set; }

        // 结算账户类型 
        // merchant_type=01企业时：ENTERPRISE
        // 03:民办非企业：ENTERPRISE
        // 07个体工商户时：PERSON或 ENTERPRISE
        [NameInMap("bank_account_type")]
        [Validation(Required=true)]
        public string BankAccountType { get; set; }

    }

}
