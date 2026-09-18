// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 积分账户信息
    public class AccountInfo : TeaModel {
        // STRING	账户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 已消费金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("consume_amount")]
        [Validation(Required=false)]
        public string ConsumeAmount { get; set; }

        // 已还金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("repay_amount")]
        [Validation(Required=false)]
        public string RepayAmount { get; set; }

        // 解约后剩余应还金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("remaining_amount")]
        [Validation(Required=false)]
        public string RemainingAmount { get; set; }

        // 可退还用户金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("refund_amount_to_user")]
        [Validation(Required=false)]
        public string RefundAmountToUser { get; set; }

        // 可退还资方金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("refund_amount_to_investor")]
        [Validation(Required=false)]
        public string RefundAmountToInvestor { get; set; }

    }

}
