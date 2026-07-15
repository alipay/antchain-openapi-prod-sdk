// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 结算详细信息
    public class SettleDetailInfo : TeaModel {
        // 结算收款方账户类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>userId</para>
        /// </summary>
        [NameInMap("trans_in_type")]
        [Validation(Required=true)]
        public string TransInType { get; set; }

        // 结算收款方
        /// <summary>
        /// <b>Example:</b>
        /// <para>1100001990</para>
        /// </summary>
        [NameInMap("trans_in")]
        [Validation(Required=true)]
        public string TransIn { get; set; }

        // 结算汇总维度
        /// <summary>
        /// <b>Example:</b>
        /// <para>A0001</para>
        /// </summary>
        [NameInMap("summary_dimension")]
        [Validation(Required=false)]
        public string SummaryDimension { get; set; }

        // 结算主体类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>SecondMerchant</para>
        /// </summary>
        [NameInMap("settle_entity_type")]
        [Validation(Required=false)]
        public string SettleEntityType { get; set; }

        // 结算主体标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088xxxxx</para>
        /// </summary>
        [NameInMap("settle_entity_id")]
        [Validation(Required=false)]
        public string SettleEntityId { get; set; }

    }

}
