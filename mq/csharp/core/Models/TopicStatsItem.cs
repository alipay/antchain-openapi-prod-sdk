// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // topic 统计列表详情
    public class TopicStatsItem : TeaModel {
        // 该 Topic 每分钟发送的消息大小（byte）
        [NameInMap("bpm")]
        [Validation(Required=true)]
        public long? Bpm { get; set; }

        // Topic 名称
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // 该 Topic 每分钟发送的消息数量
        [NameInMap("tpm")]
        [Validation(Required=true)]
        public long? Tpm { get; set; }

        // 该 Topic 每天发送的消息数量	
        // 
        [NameInMap("tpd")]
        [Validation(Required=true)]
        public long? Tpd { get; set; }

        // 该 Topic 每天发送的消息大小（byte）	
        // 
        [NameInMap("bpd")]
        [Validation(Required=true)]
        public long? Bpd { get; set; }

    }

}
