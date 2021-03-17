// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 房屋抵押信息
    public class HouseMgInfo : TeaModel {
        // 债权金额，人民币默认单位元，保留两位小数点
        [NameInMap("debt_amount")]
        [Validation(Required=false)]
        public string DebtAmount { get; set; }

        // 债权金额货币类型，比如：CNY=人民币
        [NameInMap("debt_amount_currency")]
        [Validation(Required=false)]
        public string DebtAmountCurrency { get; set; }

        // 抵押权人证件号码
        [NameInMap("mortgagee_cert_no")]
        [Validation(Required=false)]
        public string MortgageeCertNo { get; set; }

        // 抵押权人证件类型,比如：UNIFIED_SOCIAL_CODE=统一社会信用代码
        [NameInMap("mortgagee_cert_type")]
        [Validation(Required=false)]
        public string MortgageeCertType { get; set; }

        // 抵押权人名称
        [NameInMap("mortgagee_name")]
        [Validation(Required=false)]
        public string MortgageeName { get; set; }

        // 履债结束日期
        [NameInMap("debt_end_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DebtEndDate { get; set; }

        // 履债起始日期
        [NameInMap("debt_start_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DebtStartDate { get; set; }

        // 登记时间
        [NameInMap("registered_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string RegisteredDate { get; set; }

        // 房产链内部房产编号
        [NameInMap("house_no")]
        [Validation(Required=false)]
        public string HouseNo { get; set; }

    }

}
