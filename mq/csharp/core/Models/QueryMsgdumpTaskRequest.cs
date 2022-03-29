// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QueryMsgdumpTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 源 event code
        [NameInMap("source_event_code")]
        [Validation(Required=false)]
        public string SourceEventCode { get; set; }

        // 源实例 id
        [NameInMap("source_instance_id")]
        [Validation(Required=false)]
        public string SourceInstanceId { get; set; }

        // 源 topic
        [NameInMap("source_topic")]
        [Validation(Required=false)]
        public string SourceTopic { get; set; }

        // 任务状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 目标 instance id
        [NameInMap("target_instance_id")]
        [Validation(Required=false)]
        public string TargetInstanceId { get; set; }

        // 目标 tag
        [NameInMap("target_tag")]
        [Validation(Required=false)]
        public string TargetTag { get; set; }

        // 目标 topic
        [NameInMap("target_topic")]
        [Validation(Required=false)]
        public string TargetTopic { get; set; }

    }

}
