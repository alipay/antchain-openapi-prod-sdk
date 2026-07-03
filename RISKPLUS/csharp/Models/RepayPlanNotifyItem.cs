// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 流量方还款计划通知Object
    public class RepayPlanNotifyItem : TeaModel {
        // 当前期数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("loan_term")]
        [Validation(Required=true)]
        public long? LoanTerm { get; set; }

        // 应还日，yyyy-MM-dd
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyy-MM-dd</para>
        /// </summary>
        [NameInMap("expect_repay_date")]
        [Validation(Required=true)]
        public string ExpectRepayDate { get; set; }

        // 应还总额(元)
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("expect_repay_amount")]
        [Validation(Required=true)]
        public long? ExpectRepayAmount { get; set; }

        // 应还本金(元)
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("expect_repay_principal")]
        [Validation(Required=true)]
        public long? ExpectRepayPrincipal { get; set; }

        // 应还利息(元)
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("expect_repay_interest")]
        [Validation(Required=true)]
        public long? ExpectRepayInterest { get; set; }

        // 应还担保费(元)
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("expect_repay_guarantee")]
        [Validation(Required=false)]
        public long? ExpectRepayGuarantee { get; set; }

        // 起息日，格式 YYYY-MM-DD
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyy-MM-dd</para>
        /// </summary>
        [NameInMap("interest_start_date")]
        [Validation(Required=false)]
        public string InterestStartDate { get; set; }

        // 实还总额(元)，如未还则传0
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("repay_amount")]
        [Validation(Required=false)]
        public long? RepayAmount { get; set; }

        // 已还本金(元)，如未还则传0
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("repaid_principal")]
        [Validation(Required=false)]
        public long? RepaidPrincipal { get; set; }

        // 已还利息(元)，如未还则传0
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("repaid_interest")]
        [Validation(Required=false)]
        public long? RepaidInterest { get; set; }

        // 应还罚息(元)，
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("expect_repay_muclt")]
        [Validation(Required=false)]
        public long? ExpectRepayMuclt { get; set; }

        // 已还罚息(元)，如未还则传0
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("repaid_penalty")]
        [Validation(Required=false)]
        public long? RepaidPenalty { get; set; }

        // 状态标志 
        // 0-正常未到期 
        // 1-正常已还清 
        // 2-逾期
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("schedule_status")]
        [Validation(Required=false)]
        public string ScheduleStatus { get; set; }

    }

}
