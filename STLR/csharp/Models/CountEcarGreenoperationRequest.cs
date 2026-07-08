// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class CountEcarGreenoperationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 绿色行为统计频率，可选值：
        // Monthly(分月统计),
        // Daily(按每日统计) 
        // 
        [NameInMap("statistic_frequence")]
        [Validation(Required=true)]
        public string StatisticFrequence { get; set; }

        // 统计数据的发生起始时间，格式应如：2021-07-21 12:11:11
        [NameInMap("occurrence_start_time")]
        [Validation(Required=false)]
        public string OccurrenceStartTime { get; set; }

        // 统计数据的发生结束时间，格式应如：2021-07-21 12:11:11，不传为当日最近时间
        [NameInMap("occurrence_end_time")]
        [Validation(Required=false)]
        public string OccurrenceEndTime { get; set; }

    }

}
