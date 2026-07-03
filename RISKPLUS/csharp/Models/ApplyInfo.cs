// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 授信信息
    public class ApplyInfo : TeaModel {
        // 授信编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("apply_no")]
        [Validation(Required=false)]
        public string ApplyNo { get; set; }

        // 资金方编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("fund_code")]
        [Validation(Required=false)]
        public string FundCode { get; set; }

        // 资金方名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("fund_name")]
        [Validation(Required=false)]
        public string FundName { get; set; }

        // 贷款利率
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("rate_value")]
        [Validation(Required=false)]
        public long? RateValue { get; set; }

        // 贷款日利率
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("rate_value_day")]
        [Validation(Required=false)]
        public long? RateValueDay { get; set; }

        // 年天数
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("days_num_year")]
        [Validation(Required=false)]
        public long? DaysNumYear { get; set; }

        // 总授信额度
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("total_amount")]
        [Validation(Required=false)]
        public long? TotalAmount { get; set; }

        // 可用额度
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("balance_amount")]
        [Validation(Required=false)]
        public long? BalanceAmount { get; set; }

    }

}
