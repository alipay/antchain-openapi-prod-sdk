// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 行程统计概览
    public class TripStatisticsView : TeaModel {
        // 过去七天内所有行驶记录的总里程	，单位km
        /// <summary>
        /// <b>Example:</b>
        /// <para>20km</para>
        /// </summary>
        [NameInMap("total_distance")]
        [Validation(Required=true)]
        public string TotalDistance { get; set; }

        // 行驶总用时
        /// <summary>
        /// <b>Example:</b>
        /// <para>3</para>
        /// </summary>
        [NameInMap("total_duration")]
        [Validation(Required=true)]
        public string TotalDuration { get; set; }

        // 骑行次数
        /// <summary>
        /// <b>Example:</b>
        /// <para>2</para>
        /// </summary>
        [NameInMap("trip_count")]
        [Validation(Required=true)]
        public string TripCount { get; set; }

        // 最近一次行驶的里程
        /// <summary>
        /// <b>Example:</b>
        /// <para>2</para>
        /// </summary>
        [NameInMap("last_trip_distance")]
        [Validation(Required=true)]
        public string LastTripDistance { get; set; }

        // 最近一次行驶的平均速度	，单位  km/h
        /// <summary>
        /// <b>Example:</b>
        /// <para>45</para>
        /// </summary>
        [NameInMap("last_trip_avg_speed")]
        [Validation(Required=true)]
        public string LastTripAvgSpeed { get; set; }

        // 最近一次行驶的最大速度	
        /// <summary>
        /// <b>Example:</b>
        /// <para>50</para>
        /// </summary>
        [NameInMap("last_trip_max_speed")]
        [Validation(Required=true)]
        public string LastTripMaxSpeed { get; set; }

        // 最后一次行驶用时
        /// <summary>
        /// <b>Example:</b>
        /// <para>8</para>
        /// </summary>
        [NameInMap("last_trip_spend_time")]
        [Validation(Required=true)]
        public string LastTripSpendTime { get; set; }

    }

}
