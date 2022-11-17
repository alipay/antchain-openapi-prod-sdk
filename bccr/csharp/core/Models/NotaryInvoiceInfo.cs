// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 出证开票信息
    public class NotaryInvoiceInfo : TeaModel {
        // 开票类型
        [NameInMap("billing_type")]
        [Validation(Required=true)]
        public string BillingType { get; set; }

        // 发票类型
        [NameInMap("invoice_type")]
        [Validation(Required=true)]
        public string InvoiceType { get; set; }

        // 主体类型
        [NameInMap("subject_type")]
        [Validation(Required=true)]
        public string SubjectType { get; set; }

        // 发票抬头
        [NameInMap("invoice_name")]
        [Validation(Required=true)]
        public string InvoiceName { get; set; }

        // 纳税人识别号
        [NameInMap("ratepayer_code")]
        [Validation(Required=false)]
        public string RatepayerCode { get; set; }

        // 开户行
        [NameInMap("bank_type")]
        [Validation(Required=false)]
        public string BankType { get; set; }

        // 开户行账号
        [NameInMap("bank_account")]
        [Validation(Required=false)]
        public string BankAccount { get; set; }

        // 单位地址
        [NameInMap("unit_address")]
        [Validation(Required=false)]
        public string UnitAddress { get; set; }

        // 单位电话
        [NameInMap("unit_phone")]
        [Validation(Required=false)]
        public string UnitPhone { get; set; }

        // 发票收件信息
        [NameInMap("delivery")]
        [Validation(Required=false)]
        public DeliveryInfo Delivery { get; set; }

    }

}
