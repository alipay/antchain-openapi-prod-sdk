// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QueryMetricsOverviewResponse : TeaModel {
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

        // 消息堆积数量
        [NameInMap("backlog_num")]
        [Validation(Required=false)]
        public long? BacklogNum { get; set; }

        // 死信消息数量
        [NameInMap("dlq_num")]
        [Validation(Required=false)]
        public long? DlqNum { get; set; }

        // 当前租户消费组数量
        [NameInMap("group_num")]
        [Validation(Required=false)]
        public long? GroupNum { get; set; }

        // 订阅关系数量
        [NameInMap("subscription_num")]
        [Validation(Required=false)]
        public long? SubscriptionNum { get; set; }

        // 当前租户下的 Topic 数量
        [NameInMap("topic_num")]
        [Validation(Required=false)]
        public long? TopicNum { get; set; }

    }

}
