// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class CreateSofamqSchemaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 创建Schema时的instanceId
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // SOFAMQ的Topic
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // Topic的Schema内容
        [NameInMap("schema_content")]
        [Validation(Required=true)]
        public string SchemaContent { get; set; }

        // Schema的描述信息
        [NameInMap("schema_comment")]
        [Validation(Required=true)]
        public string SchemaComment { get; set; }

        // Schema的兼容性策略
        [NameInMap("schema_compatibility")]
        [Validation(Required=true)]
        public string SchemaCompatibility { get; set; }

        // schema的序列化方式
        [NameInMap("schema_serialization")]
        [Validation(Required=true)]
        public string SchemaSerialization { get; set; }

    }

}
