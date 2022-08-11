// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_4b3196fa612148cd8407b20f4e5ed132.Models
{
    // 房产限制信息
    public class HouseRestrictionInfo : TeaModel {
        // 申请人
        // 
        [NameInMap("applicant")]
        [Validation(Required=false)]
        public string Applicant { get; set; }

        // 限制结束日期
        [NameInMap("restriction_end_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string RestrictionEndDate { get; set; }

        // 限制起始日期
        [NameInMap("restriction_start_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string RestrictionStartDate { get; set; }

        // 来文单位
        [NameInMap("from_org_name")]
        [Validation(Required=false)]
        public string FromOrgName { get; set; }

        // 登记时间
        [NameInMap("register_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string RegisterTime { get; set; }

        // 限制金额，人民币默认单位元，保留两位小数点
        [NameInMap("restricted_amount")]
        [Validation(Required=false)]
        public string RestrictedAmount { get; set; }

        // 限制金额货币类型，比如：CNY=人民币
        [NameInMap("restricted_amount_currency")]
        [Validation(Required=false)]
        public string RestrictedAmountCurrency { get; set; }

        // 限制文号
        [NameInMap("restriction_no")]
        [Validation(Required=false)]
        public string RestrictionNo { get; set; }

        // 房产链内部房产编号
        [NameInMap("house_no")]
        [Validation(Required=false)]
        public string HouseNo { get; set; }

    }

}
