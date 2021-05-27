// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 用户对账单
    public class UserStatement : TeaModel {
        // 融资编号
        [NameInMap("financing_no")]
        [Validation(Required=true)]
        public string FinancingNo { get; set; }

        // 产品编号，有的话返回
        [NameInMap("product_no")]
        [Validation(Required=true)]
        public string ProductNo { get; set; }

        // 融资金额
        [NameInMap("financial_amount")]
        [Validation(Required=true)]
        public long? FinancialAmount { get; set; }

        // 分润比例，保留两位小数的百分比
        [NameInMap("profit_rate")]
        [Validation(Required=true)]
        public string ProfitRate { get; set; }

        // 总分润金额，乘过分润比例
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public long? TotalAmount { get; set; }

        // 角色名称，按上述角色名称约定
        [NameInMap("role_code")]
        [Validation(Required=true)]
        public string RoleCode { get; set; }

        // 角色对应的企业
        [NameInMap("company_no")]
        [Validation(Required=true)]
        public string CompanyNo { get; set; }

        // 记账日期 yyyy-MM-dd
        [NameInMap("account_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string AccountDate { get; set; }

    }

}
