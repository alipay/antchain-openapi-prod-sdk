// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 应付账单发票关联项
    public class PayBillInvoiceParam : TeaModel {
        // 账单发票code
        [NameInMap("pay_bill_invoice_code")]
        [Validation(Required=true)]
        public string PayBillInvoiceCode { get; set; }

        // 账单编号
        [NameInMap("pay_bill_order_code")]
        [Validation(Required=true)]
        public string PayBillOrderCode { get; set; }

        // 账单金额
        [NameInMap("pay_bill_amount")]
        [Validation(Required=true)]
        public string PayBillAmount { get; set; }

        // 发票金额
        [NameInMap("invoice_amount")]
        [Validation(Required=true)]
        public string InvoiceAmount { get; set; }

        // 操作动作
        [NameInMap("action")]
        [Validation(Required=false)]
        public string Action { get; set; }

    }

}
