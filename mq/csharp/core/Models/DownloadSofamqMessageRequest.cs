// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class DownloadSofamqMessageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需配置的 Group ID 所对应的实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // topic名
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        //  需查询的消息的 ID，即 Message ID
        [NameInMap("msg_id")]
        [Validation(Required=true)]
        public string MsgId { get; set; }

        // 需要查询的Cell名
        [NameInMap("cell")]
        [Validation(Required=false)]
        public string Cell { get; set; }

    }

}
