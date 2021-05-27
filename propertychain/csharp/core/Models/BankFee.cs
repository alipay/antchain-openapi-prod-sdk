// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 还款利息
    public class BankFee : TeaModel {
        // 融资编号
        [NameInMap("financial_no")]
        [Validation(Required=true)]
        public string FinancialNo { get; set; }

        // 产品编号
        [NameInMap("product_no")]
        [Validation(Required=true)]
        public string ProductNo { get; set; }

        // 应付银行本金
        [NameInMap("capital_amount")]
        [Validation(Required=true)]
        public long? CapitalAmount { get; set; }

        // 应付银行利息
        [NameInMap("interest_amount")]
        [Validation(Required=true)]
        public long? InterestAmount { get; set; }

        // 应付总金额
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public long? TotalAmount { get; set; }

        // 记账日期 yyyy-MM-dd
        [NameInMap("account_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string AccountDate { get; set; }

    }

}
