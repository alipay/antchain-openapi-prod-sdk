// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    public class ApplyBillingcoreSpinvoiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 账单号，多个时逗号分隔
        [NameInMap("bill_nos")]
        [Validation(Required=true)]
        public string BillNos { get; set; }

        // 账单总金额
        [NameInMap("bill_amt")]
        [Validation(Required=true)]
        public string BillAmt { get; set; }

        // 币种
        [NameInMap("ccy")]
        [Validation(Required=true)]
        public string Ccy { get; set; }

        // 销售方信息
        [NameInMap("seller_info")]
        [Validation(Required=true)]
        public TaxInfo SellerInfo { get; set; }

        // 购买方信息
        [NameInMap("buyer_info")]
        [Validation(Required=true)]
        public TaxInfo BuyerInfo { get; set; }

        // 发票信息
        [NameInMap("invoice_infos")]
        [Validation(Required=true)]
        public List<InvoiceInfo> InvoiceInfos { get; set; }

    }

}
