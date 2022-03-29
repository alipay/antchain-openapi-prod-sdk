// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // SofamqTopicSubDetail接口返回的data信息
    public class TopicSubDetailDTO : TeaModel {
        // 最近发送时间
        [NameInMap("latest_send_time")]
        [Validation(Required=true)]
        public long? LatestSendTime { get; set; }

        // SubscriptionData 数组
        [NameInMap("subscription_data_list")]
        [Validation(Required=true)]
        public List<SubscriptionGroupDTO> SubscriptionDataList { get; set; }

        // Topic 名称
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

    }

}
