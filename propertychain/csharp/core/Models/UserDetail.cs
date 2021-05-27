// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 用户明细清单
    public class UserDetail : TeaModel {
        // 融资编号
        [NameInMap("financing_no")]
        [Validation(Required=true)]
        public string FinancingNo { get; set; }

        // 分润金额，乘过分润比例，到记账日的累计值
        [NameInMap("divided_amount")]
        [Validation(Required=true)]
        public long? DividedAmount { get; set; }

        // 分润比例，保留两位小数
        [NameInMap("divided_rate")]
        [Validation(Required=true)]
        public string DividedRate { get; set; }

        // 罚息金额
        [NameInMap("penalty_amount")]
        [Validation(Required=true)]
        public long? PenaltyAmount { get; set; }

        // 角色编码
        [NameInMap("role_code")]
        [Validation(Required=true)]
        public string RoleCode { get; set; }

        // 记账日期 yyyy-mm-dd
        [NameInMap("account_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string AccountDate { get; set; }

        // 当日还款金额
        [NameInMap("payment")]
        [Validation(Required=true)]
        public long? Payment { get; set; }

        // 其他利润(操作费还款日时写到各方记录)
        [NameInMap("other_profit")]
        [Validation(Required=true)]
        public long? OtherProfit { get; set; }

    }

}
