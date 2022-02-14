// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CheckContractCourtdeductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 付款账户人姓名
        [NameInMap("payer_name")]
        [Validation(Required=true)]
        public string PayerName { get; set; }

        // 付款人银行账户
        [NameInMap("payer_account")]
        [Validation(Required=true)]
        public string PayerAccount { get; set; }

        // 银行类型：icbc(工行)
        [NameInMap("bank_type")]
        [Validation(Required=true)]
        public string BankType { get; set; }

    }

}
