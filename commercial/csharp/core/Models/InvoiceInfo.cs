// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    // 服务商开票信息
    public class InvoiceInfo : TeaModel {
        // 发票类型
        [NameInMap("invoice_type")]
        [Validation(Required=true)]
        public string InvoiceType { get; set; }

        // 发票编码
        [NameInMap("invoice_code")]
        [Validation(Required=true)]
        public string InvoiceCode { get; set; }

        // 开票日期
        [NameInMap("invoice_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string InvoiceDate { get; set; }

        // 发票信息槽
        [NameInMap("invoice_slots")]
        [Validation(Required=true)]
        public string InvoiceSlots { get; set; }

        // 税价合计
        [NameInMap("total_amt")]
        [Validation(Required=true)]
        public string TotalAmt { get; set; }

    }

}
