// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 奖品基本信息
    public class PrizeBaseInfo : TeaModel {
        // 奖品ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>110000199001011234</para>
        /// </summary>
        [NameInMap("prize_id")]
        [Validation(Required=false)]
        public string PrizeId { get; set; }

        // 奖品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx面馆</para>
        /// </summary>
        [NameInMap("prize_name")]
        [Validation(Required=false)]
        public string PrizeName { get; set; }

        // 奖品类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>VIRTUAL_PRIZE</para>
        /// </summary>
        [NameInMap("prize_type")]
        [Validation(Required=false)]
        public string PrizeType { get; set; }

        // 奖品状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>PRIZE_CREATED</para>
        /// </summary>
        [NameInMap("prize_status")]
        [Validation(Required=false)]
        public string PrizeStatus { get; set; }

        // 预算金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>354.22</para>
        /// </summary>
        [NameInMap("budget_amount")]
        [Validation(Required=false)]
        public long? BudgetAmount { get; set; }

    }

}
