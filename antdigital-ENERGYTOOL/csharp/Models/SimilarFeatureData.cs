// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    // 相似特征数据
    public class SimilarFeatureData : TeaModel {
        // 时间点位
        /// <summary>
        /// <b>Example:</b>
        /// <para>时间点位</para>
        /// </summary>
        [NameInMap("period")]
        [Validation(Required=true)]
        public string Period { get; set; }

        // 运行日日前电价
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("run_day_ahead_price")]
        [Validation(Required=false)]
        public string RunDayAheadPrice { get; set; }

        // 相似日日前电价
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("similar_day_ahead_price")]
        [Validation(Required=false)]
        public string SimilarDayAheadPrice { get; set; }

        // 相似日实际电价
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("similar_realtime_price")]
        [Validation(Required=false)]
        public string SimilarRealtimePrice { get; set; }

        // 运行日预出清数据值
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("run_preclearing_data")]
        [Validation(Required=false)]
        public string RunPreclearingData { get; set; }

        // 相似日预出清数据值
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("similar_preclearing_data")]
        [Validation(Required=false)]
        public string SimilarPreclearingData { get; set; }

        // 相似日实际数据值
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("similar_realtime_data")]
        [Validation(Required=false)]
        public string SimilarRealtimeData { get; set; }

        // 预出清数据偏差值, =运行日预出清数据值-相似日预出清数据值
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.0</para>
        /// </summary>
        [NameInMap("deviation_data")]
        [Validation(Required=false)]
        public string DeviationData { get; set; }

    }

}
