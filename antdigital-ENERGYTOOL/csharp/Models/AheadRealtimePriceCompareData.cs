// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    // 日前实时电价对比信息
    public class AheadRealtimePriceCompareData : TeaModel {
        // 时间点位
        /// <summary>
        /// <b>Example:</b>
        /// <para>01:00</para>
        /// </summary>
        [NameInMap("period")]
        [Validation(Required=true)]
        public string Period { get; set; }

        // 日前大于实时占比
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("realtime_rate")]
        [Validation(Required=false)]
        public string RealtimeRate { get; set; }

        // 日前等于实时占比
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("dayahead_rate")]
        [Validation(Required=false)]
        public string DayaheadRate { get; set; }

        // 日前小于实时占比
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("equal_rate")]
        [Validation(Required=false)]
        public string EqualRate { get; set; }

        // 偏差值
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("deviation_data")]
        [Validation(Required=false)]
        public string DeviationData { get; set; }

        // 实时电价均值
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("realtime_avg")]
        [Validation(Required=false)]
        public string RealtimeAvg { get; set; }

        // 日前电价均值
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("day_ahead_avg")]
        [Validation(Required=false)]
        public string DayAheadAvg { get; set; }

        // 偏差均值
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("deviation_avg")]
        [Validation(Required=false)]
        public string DeviationAvg { get; set; }

        // 差价数值
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("price_diff")]
        [Validation(Required=false)]
        public string PriceDiff { get; set; }

        // 价差均值
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("price_diff_avg")]
        [Validation(Required=false)]
        public string PriceDiffAvg { get; set; }

    }

}
