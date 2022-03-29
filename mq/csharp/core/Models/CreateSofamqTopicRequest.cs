// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class CreateSofamqTopicRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需创建的 Topic 所对应的实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 消息类型。取值说明如下：0：普通消息；1：分区顺序消息；2：全局顺序消息；4：事务消息；5：定时/延时消息。
        [NameInMap("message_type")]
        [Validation(Required=true)]
        public long? MessageType { get; set; }

        // Topic 的备注信息
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 需创建的 Topic 的名称
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // Topic对应Schema的兼容性策略
        [NameInMap("schema_compatibility")]
        [Validation(Required=false)]
        public string SchemaCompatibility { get; set; }

        // Topic对应Schema的序列化方式
        [NameInMap("schema_serialization")]
        [Validation(Required=false)]
        public string SchemaSerialization { get; set; }

        // Topic 所属的应用名称，要求 app name 在 zappinfo 上可查
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

    }

}
