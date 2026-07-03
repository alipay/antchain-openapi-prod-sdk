// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 行程详情
    public class TripDetail : TeaModel {
        // 行程id
        /// <summary>
        /// <b>Example:</b>
        /// <para>T20251210140000001</para>
        /// </summary>
        [NameInMap("trip_id")]
        [Validation(Required=true)]
        public string TripId { get; set; }

        // 开始时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1765794345159</para>
        /// </summary>
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public long? StartTime { get; set; }

        // 结束时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1765794345159</para>
        /// </summary>
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public long? EndTime { get; set; }

        // 行驶里程
        /// <summary>
        /// <b>Example:</b>
        /// <para>36.9</para>
        /// </summary>
        [NameInMap("mileage")]
        [Validation(Required=true)]
        public string Mileage { get; set; }

        // 单次用时
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;duration&quot;:{ &quot;value&quot;:&quot;79&quot;, &quot;unit&quot;:&quot;h&quot; },</para>
        /// </summary>
        [NameInMap("duration")]
        [Validation(Required=true)]
        public TripDuration Duration { get; set; }

        // 最高速度
        /// <summary>
        /// <b>Example:</b>
        /// <para>86</para>
        /// </summary>
        [NameInMap("max_speed")]
        [Validation(Required=true)]
        public string MaxSpeed { get; set; }

        // 平均速度
        /// <summary>
        /// <b>Example:</b>
        /// <para>32</para>
        /// </summary>
        [NameInMap("avg_speed")]
        [Validation(Required=true)]
        public string AvgSpeed { get; set; }

        // 开始地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>上海市浦东新区张江高科技园区博云路</para>
        /// </summary>
        [NameInMap("first_address")]
        [Validation(Required=true)]
        public string FirstAddress { get; set; }

        // 结束地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>上海市浦东新区张江高科技园区博云路</para>
        /// </summary>
        [NameInMap("last_address")]
        [Validation(Required=true)]
        public string LastAddress { get; set; }

        // 最开始定位时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1733841605000</para>
        /// </summary>
        [NameInMap("first_location_time")]
        [Validation(Required=true)]
        public long? FirstLocationTime { get; set; }

        // 最后结束定位时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1733845195000</para>
        /// </summary>
        [NameInMap("last_location_time")]
        [Validation(Required=true)]
        public long? LastLocationTime { get; set; }

    }

}
