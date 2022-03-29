// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QueryMetricsTghistoryResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 结束时间
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public long? EndTime { get; set; }

        // 消息点之间的时间间隔（秒），默认为 1
        [NameInMap("interval")]
        [Validation(Required=false)]
        public long? Interval { get; set; }

        // 具体的统计值
        [NameInMap("metrics")]
        [Validation(Required=false)]
        public List<TopicGroupHistoryStatsItem> Metrics { get; set; }

        // 开始时间
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public long? StartTime { get; set; }

    }

}
