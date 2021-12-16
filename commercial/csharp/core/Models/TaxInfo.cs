// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    // 纳税信息
    public class TaxInfo : TeaModel {
        // 纳税人名称
        [NameInMap("taxpayer_name")]
        [Validation(Required=true)]
        public string TaxpayerName { get; set; }

        // 纳税人识别号
        [NameInMap("taxpayer_no")]
        [Validation(Required=true)]
        public string TaxpayerNo { get; set; }

        // 开户行名称
        [NameInMap("bank_name")]
        [Validation(Required=false)]
        public string BankName { get; set; }

        // 开户行账号
        [NameInMap("bank_account")]
        [Validation(Required=false)]
        public string BankAccount { get; set; }

        // 开户行地址
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 开户行电话
        [NameInMap("telephone")]
        [Validation(Required=false)]
        public string Telephone { get; set; }

    }

}
