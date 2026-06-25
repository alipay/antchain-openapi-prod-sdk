// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 账户信息列表
    public class PoiAccountInfo : TeaModel {
        // 账户ID
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        // 用户已支出金额
        [NameInMap("expense_amount")]
        [Validation(Required=false)]
        public string ExpenseAmount { get; set; }

        // 商城已消费金额
        [NameInMap("consume_amount")]
        [Validation(Required=false)]
        public string ConsumeAmount { get; set; }

        // 商城已冻结金额
        [NameInMap("frozen_amount")]
        [Validation(Required=false)]
        public string FrozenAmount { get; set; }

        // 是否逾期
        [NameInMap("overdue")]
        [Validation(Required=false)]
        public string Overdue { get; set; }

        // 已还金额
        [NameInMap("repay_amount")]
        [Validation(Required=false)]
        public string RepayAmount { get; set; }

        // 解约后剩余应还金额
        [NameInMap("remaining_amount")]
        [Validation(Required=false)]
        public string RemainingAmount { get; set; }

        // 解约后退还用户金额
        [NameInMap("refund_amount_to_user")]
        [Validation(Required=false)]
        public string RefundAmountToUser { get; set; }

    }

}
