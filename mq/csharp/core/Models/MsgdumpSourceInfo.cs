// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 消息同步任务源端实例、topic、eventcode
    public class MsgdumpSourceInfo : TeaModel {
        // 源 instance id
        [NameInMap("source_instance_id")]
        [Validation(Required=true)]
        public string SourceInstanceId { get; set; }

        // 源端 topic 列表
        [NameInMap("source_topics")]
        [Validation(Required=true)]
        public List<SourceTopic> SourceTopics { get; set; }

    }

}
