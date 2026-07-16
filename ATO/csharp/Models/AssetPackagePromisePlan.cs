// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 资产包履约计划
    public class AssetPackagePromisePlan : TeaModel {
        // 账期
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("period_num")]
        [Validation(Required=false)]
        public long? PeriodNum { get; set; }

        // 还款时间yyyy-MM-dd
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-03-16</para>
        /// </summary>
        [NameInMap("pay_day")]
        [Validation(Required=false)]
        public string PayDay { get; set; }

        // 计划还款总额，单位为分
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("total_amount")]
        [Validation(Required=false)]
        public long? TotalAmount { get; set; }

        // 本金，单位为分
        /// <summary>
        /// <b>Example:</b>
        /// <para>80</para>
        /// </summary>
        [NameInMap("principal_amount")]
        [Validation(Required=false)]
        public long? PrincipalAmount { get; set; }

        // 利息，单位为分
        /// <summary>
        /// <b>Example:</b>
        /// <para>20</para>
        /// </summary>
        [NameInMap("interest_amount")]
        [Validation(Required=false)]
        public long? InterestAmount { get; set; }

        // 构成订单数
        /// <summary>
        /// <b>Example:</b>
        /// <para>200</para>
        /// </summary>
        [NameInMap("order_count")]
        [Validation(Required=false)]
        public long? OrderCount { get; set; }

        // 还款状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>WAIT_PAY/PART_SUCCESS/FINISH</para>
        /// </summary>
        [NameInMap("repayment_status")]
        [Validation(Required=false)]
        public string RepaymentStatus { get; set; }

        // 已还本金，单位为分
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("paid_principal")]
        [Validation(Required=false)]
        public long? PaidPrincipal { get; set; }

        // 已还利息，单位为分
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("paid_interest")]
        [Validation(Required=false)]
        public long? PaidInterest { get; set; }

        // 已还总额，单位为分
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("paid_total")]
        [Validation(Required=false)]
        public long? PaidTotal { get; set; }

    }

}
