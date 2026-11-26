// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 额度消耗聚合项（I-0133）
    public class OpenApiQuotaConsumptionItem : TeaModel {
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-11-17T00:00:00+08:00</para>
        /// </summary>
        [NameInMap("period_start")]
        [Validation(Required=true)]
        public string PeriodStart { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-11-17T00:00:00+08:00</para>
        /// </summary>
        [NameInMap("period_end")]
        [Validation(Required=true)]
        public string PeriodEnd { get; set; }

        // 实际可靠统计区间起点；未覆盖为null
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("counted_from")]
        [Validation(Required=true)]
        public string CountedFrom { get; set; }

        // 实际可靠统计区间终点，不晚于asOf；未覆盖为null
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("counted_to")]
        [Validation(Required=true)]
        public string CountedTo { get; set; }

        // 整个周期的已提交扣款流水有可靠覆盖；不代表所有运行消费已发送结算
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("complete")]
        [Validation(Required=true)]
        public bool? Complete { get; set; }

        // CONSUME毛消费；部分覆盖仅统计countedFrom/to，无可靠覆盖为null，不补0
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("used")]
        [Validation(Required=true)]
        public long? Used { get; set; }

        // 枚举:QUOTA_POINT
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("unit")]
        [Validation(Required=true)]
        public string Unit { get; set; }

    }

}
