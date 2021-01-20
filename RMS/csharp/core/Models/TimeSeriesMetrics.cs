// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 时序指标数据, 相当于一条时间线
    public class TimeSeriesMetrics : TeaModel {
        // 开始时间, 毫秒时间戳
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public long? StartTime { get; set; }

        // 结束时间, 毫秒时间戳
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public long? EndTime { get; set; }

        // 标识 metrics，类似 sql 查询条件
        [NameInMap("tags")]
        [Validation(Required=false)]
        public List<KeyValuePair> Tags { get; set; }

        // 指标的分类
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // Metrics 多个 point 的集合
        [NameInMap("values")]
        [Validation(Required=false)]
        public List<TimeSeriesMetricsPoint> Values { get; set; }

    }

}
