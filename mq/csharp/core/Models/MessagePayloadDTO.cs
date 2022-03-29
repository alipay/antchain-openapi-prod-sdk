// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 消息体内容的DTO对象，包含SchemaID和消息体内容反序列化后的字符串
    public class MessagePayloadDTO : TeaModel {
        // 消息对应的Schema的唯一ID
        [NameInMap("schema_id")]
        [Validation(Required=true)]
        public string SchemaId { get; set; }

        // 消息体内容的展现
        [NameInMap("payload")]
        [Validation(Required=true)]
        public string Payload { get; set; }

    }

}
