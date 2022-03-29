// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class CreateMsgdumpTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // cell
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

        // 对消息同步任务的描述
        [NameInMap("remark")]
        [Validation(Required=true)]
        public string Remark { get; set; }

        // 源端 event code
        [NameInMap("source_event_code")]
        [Validation(Required=true)]
        public string SourceEventCode { get; set; }

        // 源端实例 id
        [NameInMap("source_instance_id")]
        [Validation(Required=true)]
        public string SourceInstanceId { get; set; }

        // 源端 topic
        [NameInMap("source_topic")]
        [Validation(Required=true)]
        public string SourceTopic { get; set; }

        // 目标 tag
        [NameInMap("target_tag")]
        [Validation(Required=true)]
        public string TargetTag { get; set; }

        // 目标 topic
        [NameInMap("target_topic")]
        [Validation(Required=true)]
        public string TargetTopic { get; set; }

        // 目标 instance id 
        [NameInMap("target_instance_id")]
        [Validation(Required=true)]
        public string TargetInstanceId { get; set; }

    }

}
