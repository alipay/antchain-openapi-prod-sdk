// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    // 日前与实时价差预测数据
    public class AheadRealtimePriceDiffPredictionData : TeaModel {
        // 时间点位
        /// <summary>
        /// <b>Example:</b>
        /// <para>01:00</para>
        /// </summary>
        [NameInMap("period")]
        [Validation(Required=true)]
        public string Period { get; set; }

        // 实际价差方向
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("real_direction")]
        [Validation(Required=false)]
        public string RealDirection { get; set; }

        // 预测价差方向
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("pre_direction")]
        [Validation(Required=false)]
        public string PreDirection { get; set; }

        // 实际日前实时价差
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("real_day_ahead_diff")]
        [Validation(Required=false)]
        public string RealDayAheadDiff { get; set; }

        // 预测日前实时价差
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("pre_day_ahead_diff")]
        [Validation(Required=false)]
        public string PreDayAheadDiff { get; set; }

    }

}
