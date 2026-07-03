// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 月供
    public class TermDetail : TeaModel {
        // 期数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("term")]
        [Validation(Required=true)]
        public string Term { get; set; }

        // 期供金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("term_amount")]
        [Validation(Required=true)]
        public long? TermAmount { get; set; }

        // 当期本金
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("term_principal")]
        [Validation(Required=true)]
        public long? TermPrincipal { get; set; }

        // 当期利息（分期产生的利息/手续费）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("term_fee")]
        [Validation(Required=true)]
        public long? TermFee { get; set; }

        // 应还款日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyy-MM-dd</para>
        /// </summary>
        [NameInMap("settle_date")]
        [Validation(Required=true)]
        public string SettleDate { get; set; }

        // 罚息
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("penalty")]
        [Validation(Required=false)]
        public long? Penalty { get; set; }

        // 担保费
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("guarantee_fee")]
        [Validation(Required=false)]
        public long? GuaranteeFee { get; set; }

        // 违约金
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("liquidated_damages")]
        [Validation(Required=false)]
        public long? LiquidatedDamages { get; set; }

        // 服务费
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("server_fee")]
        [Validation(Required=false)]
        public long? ServerFee { get; set; }

        // 减免金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999.98</para>
        /// </summary>
        [NameInMap("deduct_amount")]
        [Validation(Required=false)]
        public long? DeductAmount { get; set; }

    }

}
