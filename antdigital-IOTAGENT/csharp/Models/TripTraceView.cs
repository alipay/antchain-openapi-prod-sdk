// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 行程统计详情
    public class TripTraceView : TeaModel {
        // 开始时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("begin_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string BeginTime { get; set; }

        // 结束时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 平均速度
        [NameInMap("avg_speed")]
        [Validation(Required=true)]
        public long? AvgSpeed { get; set; }

        // 最大速度
        [NameInMap("max_speed")]
        [Validation(Required=true)]
        public long? MaxSpeed { get; set; }

        // 最后定位时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("last_location_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LastLocationTime { get; set; }

        // 最后定位地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>河南省郑州市</para>
        /// </summary>
        [NameInMap("last_location")]
        [Validation(Required=true)]
        public string LastLocation { get; set; }

    }

}
