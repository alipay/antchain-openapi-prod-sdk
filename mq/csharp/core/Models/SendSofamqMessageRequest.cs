// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class SendSofamqMessageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 目标单元
        [NameInMap("cell")]
        [Validation(Required=false)]
        public string Cell { get; set; }

        // 实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 消息的 Message Key
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        //  消息内容
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // 消息 Tag
        [NameInMap("tag")]
        [Validation(Required=false)]
        public string Tag { get; set; }

        // 需要发送的 Topic 名称
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // 使用的Schema的版本号
        [NameInMap("schema_version")]
        [Validation(Required=false)]
        public long? SchemaVersion { get; set; }

        // 消息属性 key-value
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

    }

}
