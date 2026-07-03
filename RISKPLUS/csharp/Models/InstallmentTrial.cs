// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 期数费用
    public class InstallmentTrial : TeaModel {
        // 总期数
        /// <summary>
        /// <b>Example:</b>
        /// <para>12</para>
        /// </summary>
        [NameInMap("total_period")]
        [Validation(Required=true)]
        public string TotalPeriod { get; set; }

        // 分期应还总金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public long? TotalAmount { get; set; }

        // 总利息（分期产生的利息/手续费）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("total_fee")]
        [Validation(Required=true)]
        public long? TotalFee { get; set; }

        // 期费率，精确到小数点后四位0.1250，表示年利率为12.5%
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.1250</para>
        /// </summary>
        [NameInMap("fee_rate")]
        [Validation(Required=true)]
        public long? FeeRate { get; set; }

        // 年利率，精确到小数点后四位0.1250，表示年利率为12.5%
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.1250</para>
        /// </summary>
        [NameInMap("year_rate")]
        [Validation(Required=true)]
        public long? YearRate { get; set; }

        // 月供列表
        [NameInMap("term_detail_list")]
        [Validation(Required=true)]
        public List<TermDetail> TermDetailList { get; set; }

        // 是否最优标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("optimal")]
        [Validation(Required=false)]
        public bool? Optimal { get; set; }

        // 总罚息
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("total_penalty")]
        [Validation(Required=false)]
        public long? TotalPenalty { get; set; }

        // 总担保费
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("total_guarantee_fee")]
        [Validation(Required=false)]
        public long? TotalGuaranteeFee { get; set; }

        // 总违约金
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("total_liquidated_damages")]
        [Validation(Required=false)]
        public long? TotalLiquidatedDamages { get; set; }

        // 总服务费
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("total_server_fee")]
        [Validation(Required=false)]
        public long? TotalServerFee { get; set; }

        // 费率折扣，0.95：九五折；0：免息；1/null：不打折
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.95</para>
        /// </summary>
        [NameInMap("discount")]
        [Validation(Required=false)]
        public long? Discount { get; set; }

        // 总减免金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("total_deduct_amount")]
        [Validation(Required=false)]
        public long? TotalDeductAmount { get; set; }

    }

}
