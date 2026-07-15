// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    // 竞价空间分析数据
    public class BiddingAnalysisData : TeaModel {
        // 时间点位
        /// <summary>
        /// <b>Example:</b>
        /// <para>01:00</para>
        /// </summary>
        [NameInMap("period")]
        [Validation(Required=true)]
        public string Period { get; set; }

        // 实时数据
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("realtime_data")]
        [Validation(Required=false)]
        public string RealtimeData { get; set; }

        // 日前数据
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("day_ahead_data")]
        [Validation(Required=false)]
        public string DayAheadData { get; set; }

        // 预出清数据
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("preclearing_data")]
        [Validation(Required=false)]
        public string PreclearingData { get; set; }

        // 实际数据
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("actual_data")]
        [Validation(Required=false)]
        public string ActualData { get; set; }

        // 实时预测数据
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("realtime_prediction_data")]
        [Validation(Required=false)]
        public string RealtimePredictionData { get; set; }

        // 日前预测数据
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("day_ahead_prediction_data")]
        [Validation(Required=false)]
        public string DayAheadPredictionData { get; set; }

        // 偏差值
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("deviation_data")]
        [Validation(Required=false)]
        public string DeviationData { get; set; }

    }

}
