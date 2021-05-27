// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 总对账单
    public class TotalStatement : TeaModel {
        // 企业编号
        [NameInMap("company_no")]
        [Validation(Required=true)]
        public string CompanyNo { get; set; }

        // 记账日期 yyyy-mm-dd
        [NameInMap("account_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string AccountDate { get; set; }

        // 总分润金额
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 风险承担方金额
        [NameInMap("risk_taker")]
        [Validation(Required=true)]
        public long? RiskTaker { get; set; }

        // 货物监管方金额
        [NameInMap("cargo_supervision")]
        [Validation(Required=true)]
        public long? CargoSupervision { get; set; }

        // 资金推荐方金额
        [NameInMap("capital_recommend")]
        [Validation(Required=true)]
        public long? CapitalRecommend { get; set; }

        // 融资推荐方金额
        [NameInMap("funder_recommend")]
        [Validation(Required=true)]
        public long? FunderRecommend { get; set; }

        // 运营管理方金额
        [NameInMap("management")]
        [Validation(Required=true)]
        public long? Management { get; set; }

        // 技术支持方金额
        [NameInMap("technical")]
        [Validation(Required=true)]
        public long? Technical { get; set; }

    }

}
