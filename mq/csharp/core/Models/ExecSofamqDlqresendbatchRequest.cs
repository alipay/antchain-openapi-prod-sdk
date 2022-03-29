// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class ExecSofamqDlqresendbatchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需要查询的单元
        [NameInMap("cell")]
        [Validation(Required=false)]
        public string Cell { get; set; }

        // 需查询的消费端 Group ID
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // 需查询消息所对应的实例 ID。
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 需重发的消息的 ID，即 Message ID，多个消息使用英文逗号分隔
        [NameInMap("msg_ids")]
        [Validation(Required=true)]
        public string MsgIds { get; set; }

    }

}
