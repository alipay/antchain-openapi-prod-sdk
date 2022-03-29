// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class ExportSofamqMessageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // sofamq的instance id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 消息的唯一ID
        [NameInMap("message_id")]
        [Validation(Required=true)]
        public string MessageId { get; set; }

        // 消息的Topic
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // 消息所属的ZONE
        [NameInMap("cell")]
        [Validation(Required=false)]
        public string Cell { get; set; }

    }

}
