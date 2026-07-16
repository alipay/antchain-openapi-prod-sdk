// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 资产包创建履约计划参数
    public class AssetPackageCreatePromisePlanParams : TeaModel {
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

    }

}
