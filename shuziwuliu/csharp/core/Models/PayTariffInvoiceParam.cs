// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 资费项发票
    public class PayTariffInvoiceParam : TeaModel {
        // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        [NameInMap("action")]
        [Validation(Required=false)]
        public string Action { get; set; }

        // 发票金额 业务必填
        [NameInMap("invoice_amount")]
        [Validation(Required=false)]
        public string InvoiceAmount { get; set; }

        // 资费项金额 业务必填
        [NameInMap("pay_tariff_amount")]
        [Validation(Required=false)]
        public string PayTariffAmount { get; set; }

        // 资费单据编号 业务必填
        [NameInMap("pay_tariff_code")]
        [Validation(Required=false)]
        public string PayTariffCode { get; set; }

        // 资费项发票code
        [NameInMap("pay_tariff_invoice_code")]
        [Validation(Required=true)]
        public string PayTariffInvoiceCode { get; set; }

    }

}
