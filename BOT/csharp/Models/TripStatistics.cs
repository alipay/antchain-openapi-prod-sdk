// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iotx行程统计
    public class TripStatistics : TeaModel {
        // 总里程
        /// <summary>
        /// <b>Example:</b>
        /// <para>23</para>
        /// </summary>
        [NameInMap("total_mileage")]
        [Validation(Required=true)]
        public string TotalMileage { get; set; }

        // 时间体
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;totalDuration&quot;:{ &quot;value&quot;:&quot;79&quot;, &quot;unit&quot;:&quot;h&quot; }</para>
        /// </summary>
        [NameInMap("total_duration")]
        [Validation(Required=true)]
        public TripDuration TotalDuration { get; set; }

        // 总次数
        /// <summary>
        /// <b>Example:</b>
        /// <para>12</para>
        /// </summary>
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public long? TotalCount { get; set; }

        // 时期码
        /// <summary>
        /// <b>Example:</b>
        /// <para>2</para>
        /// </summary>
        [NameInMap("period_code")]
        [Validation(Required=true)]
        public long? PeriodCode { get; set; }

    }

}
