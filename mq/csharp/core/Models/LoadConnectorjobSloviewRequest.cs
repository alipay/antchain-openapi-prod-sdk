// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class LoadConnectorjobSloviewRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // source类型
        [NameInMap("source_type")]
        [Validation(Required=true)]
        public string SourceType { get; set; }

        // 触发类型
        [NameInMap("trigger_type")]
        [Validation(Required=true)]
        public string TriggerType { get; set; }

        // cron表达式的值
        [NameInMap("trigger_value")]
        [Validation(Required=true)]
        public string TriggerValue { get; set; }

    }

}
