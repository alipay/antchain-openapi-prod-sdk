// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    public class ApplyBillingcoreMerchantinvoiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 发票信息
        [NameInMap("invoice")]
        [Validation(Required=true)]
        public Invoice Invoice { get; set; }

        // 发票寄送地址
        [NameInMap("invoice_address")]
        [Validation(Required=false)]
        public InvoiceAddress InvoiceAddress { get; set; }

        // 发票电子邮箱
        [NameInMap("invoice_email")]
        [Validation(Required=false)]
        public InvoiceEmail InvoiceEmail { get; set; }

    }

}
