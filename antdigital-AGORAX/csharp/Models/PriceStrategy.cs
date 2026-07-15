// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 定价策略
    public class PriceStrategy : TeaModel {
        // 定价策略类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>FIXED</para>
        /// </summary>
        [NameInMap("strategy_type")]
        [Validation(Required=false)]
        public string StrategyType { get; set; }

        // 策略值
        /// <summary>
        /// <b>Example:</b>
        /// <para>110000199001011234</para>
        /// </summary>
        [NameInMap("strategy_value")]
        [Validation(Required=false)]
        public string StrategyValue { get; set; }

        // 最小金额（单位：分）
        /// <summary>
        /// <b>Example:</b>
        /// <para>6.22</para>
        /// </summary>
        [NameInMap("min_price")]
        [Validation(Required=false)]
        public long? MinPrice { get; set; }

        // 最大金额（单位：分）
        /// <summary>
        /// <b>Example:</b>
        /// <para>45.22</para>
        /// </summary>
        [NameInMap("max_price")]
        [Validation(Required=false)]
        public long? MaxPrice { get; set; }

        // 门槛金额（单位：分）
        /// <summary>
        /// <b>Example:</b>
        /// <para>21.55</para>
        /// </summary>
        [NameInMap("threshold")]
        [Validation(Required=false)]
        public long? Threshold { get; set; }

        // 门槛类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5</para>
        /// </summary>
        [NameInMap("threshold_type")]
        [Validation(Required=false)]
        public string ThresholdType { get; set; }

    }

}
